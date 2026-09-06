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
        boolean boolean18 = pricingRequest7.seasonalSale();
        int int19 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str16, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType12, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType12, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) ' ', customerType12, false, "PricingRequest[basePrice=97.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=true, loyaltyPoints=-1]", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) '4', customerType12, true, "PricingRequest[basePrice=-1.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", false, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest37 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) (short) 0, customerType12, false, "hi!", true, (int) (short) 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest42 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 10, 100, customerType12, false, "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]", false, (int) '4');
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (-1), customerType4, false, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", true, (-1));
        int int10 = pricingRequest9.quantity();
        int int11 = pricingRequest9.loyaltyPoints();
        java.lang.String str12 = pricingRequest9.toString();
        java.lang.String str13 = pricingRequest9.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, (int) '#', customerType14, false, "PricingRequest[basePrice=907.99, quantity=10, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=-1.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=false, loyaltyPoints=1]", true, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=97.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=97.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=97.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=true, loyaltyPoints=-1]" + "'", str13, "PricingRequest[basePrice=97.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType8, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType8, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) ' ', customerType8, false, "PricingRequest[basePrice=97.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=true, loyaltyPoints=-1]", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) '4', customerType8, true, "PricingRequest[basePrice=-1.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", false, (int) (byte) -1);
        boolean boolean29 = pricingRequest28.firstOrder();
        java.lang.String str30 = pricingRequest28.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType31 = pricingRequest28.customerType();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "PricingRequest[basePrice=10.0, quantity=52, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=-1.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=false, loyaltyPoints=-1]" + "'", str30, "PricingRequest[basePrice=10.0, quantity=52, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=-1.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType31 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType31.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType2, false, "", false, (int) ' ');
        double double8 = pricingRequest7.basePrice();
        int int9 = pricingRequest7.quantity();
        double double10 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        java.lang.String str12 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str12, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType2, false, "", false, (int) ' ');
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.seasonalSale();
        java.lang.String str10 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType17, false, "", false, (int) ' ');
        boolean boolean24 = pricingRequest22.equals((java.lang.Object) (-1.0f));
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = pricingRequest22.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) (byte) 100, customerType25, false, "", false, (int) (short) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 10, (int) (byte) 0, customerType25, false, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]", true, 52);
        boolean boolean36 = pricingRequest7.equals((java.lang.Object) (byte) 0);
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str10, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType6, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType6, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) -1, customerType6, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, 0);
        double double22 = pricingRequest21.basePrice();
        int int23 = pricingRequest21.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType26, false, "hi!", true, (int) (byte) 0);
        boolean boolean32 = pricingRequest31.seasonalSale();
        int int33 = pricingRequest31.quantity();
        int int34 = pricingRequest31.quantity();
        boolean boolean35 = pricingRequest31.seasonalSale();
        boolean boolean36 = pricingRequest21.equals((java.lang.Object) pricingRequest31);
        boolean boolean37 = pricingRequest21.seasonalSale();
        boolean boolean38 = pricingRequest21.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType2, false, "", false, (int) ' ');
        double double8 = pricingRequest7.basePrice();
        java.lang.String str9 = pricingRequest7.couponCode();
        double double10 = pricingRequest7.basePrice();
        java.lang.String str11 = pricingRequest7.couponCode();
        boolean boolean12 = pricingRequest7.seasonalSale();
        int int13 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType6, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 10, (int) (byte) 10, customerType6, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1L), (int) (short) -1, customerType6, true, "PricingRequest[basePrice=-1.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", false, (int) (byte) 10);
        boolean boolean22 = pricingRequest21.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = pricingRequest21.customerType();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType10, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType10, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) -1, customerType10, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, 0);
        int int26 = pricingRequest25.loyaltyPoints();
        java.lang.String str27 = pricingRequest25.couponCode();
        java.lang.String str28 = pricingRequest25.couponCode();
        java.lang.String str29 = pricingRequest25.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType30 = pricingRequest25.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (byte) -1, customerType30, true, "PricingRequest[basePrice=-1.0, quantity=100, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=10]", true, (int) (short) 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest40 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) 'a', customerType30, true, "", false, 0);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]" + "'", str27, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]" + "'", str28, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]" + "'", str29, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType30 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType30.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType8, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType8, false, "", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1L), (int) (byte) 100, customerType8, false, "", false, 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = pricingRequest23.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) (short) 10, customerType24, true, "PricingRequest[basePrice=100.0, quantity=100, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32], firstOrder=true, loyaltyPoints=32]", false, (-1));
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType24 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType24.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType6, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType6, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) -1, customerType6, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, 0);
        int int22 = pricingRequest21.loyaltyPoints();
        int int23 = pricingRequest21.quantity();
        java.lang.String str24 = pricingRequest21.couponCode();
        int int25 = pricingRequest21.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType28, false, "", false, (int) ' ');
        double double34 = pricingRequest33.basePrice();
        java.lang.String str35 = pricingRequest33.couponCode();
        boolean boolean36 = pricingRequest33.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType37 = pricingRequest33.customerType();
        boolean boolean38 = pricingRequest21.equals((java.lang.Object) pricingRequest33);
        com.viktor.lab4.PricingEngine.CustomerType customerType43 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest48 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType43, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest53 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType43, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        int int54 = pricingRequest53.loyaltyPoints();
        boolean boolean55 = pricingRequest53.firstOrder();
        java.lang.String str56 = pricingRequest53.toString();
        java.lang.String str57 = pricingRequest53.couponCode();
        java.lang.String str58 = pricingRequest53.couponCode();
        double double59 = pricingRequest53.basePrice();
        boolean boolean60 = pricingRequest21.equals((java.lang.Object) double59);
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]" + "'", str24, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 97.0d + "'", double34 == 97.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + customerType37 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType37.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + customerType43 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType43.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]" + "'", str56, "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str57, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str58, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType6, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType6, false, "", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 52, (int) (short) 10, customerType6, false, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", true, (int) (short) 100);
        int int22 = pricingRequest21.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType27, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest37 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType27, false, "", true, (int) '4');
        java.lang.String str38 = pricingRequest37.couponCode();
        boolean boolean39 = pricingRequest37.firstOrder();
        double double40 = pricingRequest37.basePrice();
        java.lang.String str41 = pricingRequest37.toString();
        boolean boolean42 = pricingRequest21.equals((java.lang.Object) str41);
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + customerType27 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType27.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 100.0d + "'", double40 == 100.0d);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=52]" + "'", str41, "PricingRequest[basePrice=100.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=52]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType3, false, "", false, (int) ' ');
        int int9 = pricingRequest8.quantity();
        boolean boolean10 = pricingRequest8.firstOrder();
        int int11 = pricingRequest8.quantity();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = pricingEngine0.calculateFinalPrice(pricingRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 0, customerType6, true, "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]", true, (int) (byte) 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, 1, customerType6, false, "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", false, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) (byte) 10, customerType6, false, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]", true, (int) (byte) 0);
        int int22 = pricingRequest21.loyaltyPoints();
        int int23 = pricingRequest21.loyaltyPoints();
        java.lang.Class<?> wildcardClass24 = pricingRequest21.getClass();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
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
        com.viktor.lab4.PricingEngine.CustomerType customerType59 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest64 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType59, false, "hi!", true, (int) (byte) 0);
        boolean boolean65 = pricingRequest64.seasonalSale();
        int int66 = pricingRequest64.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType67 = pricingRequest64.customerType();
        java.lang.String str68 = pricingRequest64.couponCode();
        java.lang.String str69 = pricingRequest64.toString();
        java.lang.String str70 = pricingRequest64.couponCode();
        int int71 = pricingRequest64.loyaltyPoints();
        boolean boolean72 = pricingRequest7.equals((java.lang.Object) int71);
        java.lang.String str73 = pricingRequest7.toString();
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
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertNull(customerType67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str69, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str73, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType10, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType10, false, "", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (byte) 0, customerType10, false, "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=0]", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10, 52, customerType10, false, "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0], firstOrder=false, loyaltyPoints=0], firstOrder=true, loyaltyPoints=0]", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, 100, customerType10, false, "", true, 0);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
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
        int int18 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType6, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType6, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) -1, customerType6, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, 0);
        double double22 = pricingRequest21.basePrice();
        int int23 = pricingRequest21.quantity();
        int int24 = pricingRequest21.loyaltyPoints();
        int int25 = pricingRequest21.quantity();
        int int26 = pricingRequest21.loyaltyPoints();
        java.lang.String str27 = pricingRequest21.couponCode();
        int int28 = pricingRequest21.quantity();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]" + "'", str27, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType2, false, "", false, (int) ' ');
        int int8 = pricingRequest7.quantity();
        boolean boolean9 = pricingRequest7.firstOrder();
        double double10 = pricingRequest7.basePrice();
        java.lang.String str11 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType14, false, "hi!", true, (int) (byte) 0);
        java.lang.String str20 = pricingRequest19.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType27, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest37 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType27, false, "", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest42 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1L), (int) (byte) 100, customerType27, false, "", false, 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType43 = pricingRequest42.customerType();
        double double44 = pricingRequest42.basePrice();
        boolean boolean45 = pricingRequest19.equals((java.lang.Object) pricingRequest42);
        int int46 = pricingRequest19.loyaltyPoints();
        java.lang.String str47 = pricingRequest19.toString();
        boolean boolean48 = pricingRequest7.equals((java.lang.Object) pricingRequest19);
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str11, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + customerType27 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType27.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType43 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType43.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-1.0d) + "'", double44 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str47, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
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
        int int42 = pricingRequest16.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType45 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest50 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType45, false, "hi!", true, (int) (byte) 0);
        boolean boolean51 = pricingRequest50.seasonalSale();
        int int52 = pricingRequest50.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType53 = pricingRequest50.customerType();
        int int54 = pricingRequest50.loyaltyPoints();
        java.lang.String str55 = pricingRequest50.couponCode();
        boolean boolean57 = pricingRequest50.equals((java.lang.Object) '4');
        com.viktor.lab4.PricingEngine.CustomerType customerType68 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest73 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType68, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest78 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType68, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest83 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, 1, customerType68, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest88 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType68, false, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]", false, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest93 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10, (int) (short) 1, customerType68, false, "hi!", false, (int) (byte) 0);
        boolean boolean94 = pricingRequest50.equals((java.lang.Object) "hi!");
        boolean boolean95 = pricingRequest50.seasonalSale();
        java.lang.String str96 = pricingRequest50.toString();
        java.lang.Class<?> wildcardClass97 = pricingRequest50.getClass();
        boolean boolean98 = pricingRequest16.equals((java.lang.Object) pricingRequest50);
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 32 + "'", int42 == 32);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNull(customerType53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + customerType68 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType68.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str96, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertNotNull(wildcardClass97);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType2, false, "", false, (int) ' ');
        double double8 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest7.customerType();
        java.lang.String str10 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType17, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType17, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) -1, customerType17, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, 0);
        boolean boolean33 = pricingRequest7.equals((java.lang.Object) pricingRequest32);
        java.lang.String str34 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + customerType9 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType9.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
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
        int int25 = pricingRequest19.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = pricingRequest19.customerType();
        java.lang.Class<?> wildcardClass27 = pricingRequest19.getClass();
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + customerType26 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType26.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (int) 'a', customerType3, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, (int) ' ');
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.firstOrder();
        double double11 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType14, false, "hi!", true, (int) (byte) 0);
        boolean boolean20 = pricingRequest19.seasonalSale();
        boolean boolean21 = pricingRequest19.firstOrder();
        java.lang.String str22 = pricingRequest19.toString();
        double double23 = pricingRequest19.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (-1), customerType26, false, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", true, (-1));
        int int32 = pricingRequest31.quantity();
        java.lang.String str33 = pricingRequest31.couponCode();
        boolean boolean34 = pricingRequest31.firstOrder();
        boolean boolean35 = pricingRequest19.equals((java.lang.Object) pricingRequest31);
        java.lang.String str36 = pricingRequest19.toString();
        double double37 = pricingRequest19.basePrice();
        java.lang.String str38 = pricingRequest19.couponCode();
        // The following exception was thrown during execution in test generation
        try {
            double double39 = pricingEngine0.calculateFinalPrice(pricingRequest19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: customerType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 7.99d + "'", double11 == 7.99d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str22, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType26 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType26.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str33, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str36, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 1.0d + "'", double37 == 1.0d);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType6, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType6, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        int int17 = pricingRequest16.loyaltyPoints();
        double double18 = pricingRequest16.basePrice();
        java.lang.String str19 = pricingRequest16.couponCode();
        java.lang.String str20 = pricingRequest16.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = pricingRequest16.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest26 = new com.viktor.lab4.PricingEngine.PricingRequest((-1.0d), (int) (short) 100, customerType21, true, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]", false, 10);
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str19, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str20, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertTrue("'" + customerType21 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType21.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        double double9 = pricingRequest7.basePrice();
        boolean boolean10 = pricingRequest7.firstOrder();
        boolean boolean11 = pricingRequest7.seasonalSale();
        boolean boolean12 = pricingRequest7.firstOrder();
        double double13 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        int int10 = pricingRequest7.quantity();
        boolean boolean11 = pricingRequest7.seasonalSale();
        boolean boolean12 = pricingRequest7.firstOrder();
        int int13 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
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
        com.viktor.lab4.PricingEngine.CustomerType customerType44 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest49 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType44, false, "hi!", true, (int) (byte) 0);
        boolean boolean50 = pricingRequest49.seasonalSale();
        boolean boolean51 = pricingRequest49.firstOrder();
        java.lang.String str52 = pricingRequest49.toString();
        double double53 = pricingRequest49.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType56 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest61 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (-1), customerType56, false, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", true, (-1));
        int int62 = pricingRequest61.quantity();
        java.lang.String str63 = pricingRequest61.couponCode();
        boolean boolean64 = pricingRequest61.firstOrder();
        boolean boolean65 = pricingRequest49.equals((java.lang.Object) pricingRequest61);
        java.lang.String str66 = pricingRequest61.couponCode();
        int int67 = pricingRequest61.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType68 = pricingRequest61.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest73 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) '#', customerType68, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) 1);
        int int74 = pricingRequest73.quantity();
        double double75 = pricingEngine0.calculateFinalPrice(pricingRequest73);
        com.viktor.lab4.PricingEngine.CustomerType customerType78 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest83 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType78, false, "hi!", true, (int) (byte) 0);
        boolean boolean84 = pricingRequest83.seasonalSale();
        int int85 = pricingRequest83.quantity();
        boolean boolean86 = pricingRequest83.firstOrder();
        double double87 = pricingRequest83.basePrice();
        double double88 = pricingRequest83.basePrice();
        int int89 = pricingRequest83.quantity();
        // The following exception was thrown during execution in test generation
        try {
            double double90 = pricingEngine0.calculateFinalPrice(pricingRequest83);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: customerType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType7 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType7.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 295.99d + "'", double23 == 295.99d);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 77.99d + "'", double39 == 77.99d);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str52, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 1.0d + "'", double53 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType56 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType56.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str63, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str66, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + customerType68 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType68.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 35 + "'", int74 == 35);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 37.74d + "'", double75 == 37.74d);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 1 + "'", int85 == 1);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 1.0d + "'", double87 == 1.0d);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 1.0d + "'", double88 == 1.0d);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 1 + "'", int89 == 1);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
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
        boolean boolean43 = pricingRequest16.firstOrder();
        int int44 = pricingRequest16.loyaltyPoints();
        double double45 = pricingRequest16.basePrice();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + customerType42 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType42.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 100.0d + "'", double45 == 100.0d);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType2, false, "", false, (int) ' ');
        double double8 = pricingRequest7.basePrice();
        int int9 = pricingRequest7.quantity();
        double double10 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest7.customerType();
        double double13 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType13, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType13, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, 1, customerType13, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType13, false, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]", false, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest38 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10, (int) (short) 1, customerType13, false, "hi!", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest43 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) (short) 100, customerType13, false, "", false, (int) ' ');
        java.lang.String str44 = pricingRequest43.toString();
        double double45 = pricingEngine0.calculateFinalPrice(pricingRequest43);
        com.viktor.lab4.PricingEngine.CustomerType customerType48 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest53 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType48, false, "", false, (int) ' ');
        double double54 = pricingRequest53.basePrice();
        int int55 = pricingRequest53.quantity();
        // The following exception was thrown during execution in test generation
        try {
            double double56 = pricingEngine0.calculateFinalPrice(pricingRequest53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "PricingRequest[basePrice=10.0, quantity=100, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str44, "PricingRequest[basePrice=10.0, quantity=100, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 907.99d + "'", double45 == 907.99d);
        org.junit.Assert.assertTrue("'" + customerType48 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType48.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 97.0d + "'", double54 == 97.0d);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType6, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType6, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        int int17 = pricingRequest16.loyaltyPoints();
        double double18 = pricingRequest16.basePrice();
        java.lang.String str19 = pricingRequest16.couponCode();
        java.lang.String str20 = pricingRequest16.couponCode();
        int int21 = pricingRequest16.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest16.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) ' ', customerType22, true, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=true, couponCode=PricingRequest[basePrice=0.0, quantity=100, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32], firstOrder=true, loyaltyPoints=10], firstOrder=true, loyaltyPoints=32]", false, (int) ' ');
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str19, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str20, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType6, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType6, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, 1, customerType6, false, "hi!", false, (int) '#');
        double double22 = pricingRequest21.basePrice();
        double double23 = pricingRequest21.basePrice();
        int int24 = pricingRequest21.quantity();
        int int25 = pricingRequest21.loyaltyPoints();
        int int26 = pricingRequest21.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType33 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest38 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType33, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest43 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType33, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest48 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) -1, customerType33, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, 0);
        double double49 = pricingRequest48.basePrice();
        int int50 = pricingRequest48.quantity();
        int int51 = pricingRequest48.loyaltyPoints();
        int int52 = pricingRequest48.quantity();
        java.lang.String str53 = pricingRequest48.couponCode();
        boolean boolean54 = pricingRequest21.equals((java.lang.Object) str53);
        int int55 = pricingRequest21.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 35 + "'", int25 == 35);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
        org.junit.Assert.assertTrue("'" + customerType33 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType33.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]" + "'", str53, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 35 + "'", int55 == 35);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType3, false, "hi!", true, (int) (byte) 0);
        boolean boolean9 = pricingRequest8.seasonalSale();
        int int10 = pricingRequest8.quantity();
        double double11 = pricingRequest8.basePrice();
        double double12 = pricingRequest8.basePrice();
        boolean boolean13 = pricingRequest8.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest8.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType17, false, "hi!", true, (int) (byte) 0);
        boolean boolean23 = pricingRequest22.seasonalSale();
        int int24 = pricingRequest22.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = pricingRequest22.customerType();
        boolean boolean26 = pricingRequest8.equals((java.lang.Object) pricingRequest22);
        // The following exception was thrown during execution in test generation
        try {
            double double27 = pricingEngine0.calculateFinalPrice(pricingRequest22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: customerType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(customerType14);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNull(customerType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
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
        java.lang.Class<?> wildcardClass17 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str12, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 0, customerType4, true, "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]", true, (int) (byte) 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, 1, customerType4, false, "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", false, 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest14.customerType();
        java.lang.String str16 = pricingRequest14.couponCode();
        java.lang.Class<?> wildcardClass17 = pricingRequest14.getClass();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]" + "'", str16, "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        int int10 = pricingRequest7.quantity();
        boolean boolean11 = pricingRequest7.seasonalSale();
        java.lang.String str12 = pricingRequest7.toString();
        java.lang.String str13 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType16, false, "hi!", true, (int) (byte) 0);
        boolean boolean22 = pricingRequest21.seasonalSale();
        int int23 = pricingRequest21.quantity();
        double double24 = pricingRequest21.basePrice();
        double double25 = pricingRequest21.basePrice();
        double double26 = pricingRequest21.basePrice();
        java.lang.Class<?> wildcardClass27 = pricingRequest21.getClass();
        boolean boolean28 = pricingRequest7.equals((java.lang.Object) wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str12, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str13, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, (int) (byte) 100, customerType2, false, "hi!", false, (int) ' ');
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        java.lang.String str9 = pricingRequest7.toString();
        java.lang.String str10 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType17, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType17, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, 1, customerType17, false, "hi!", false, (int) '#');
        boolean boolean33 = pricingRequest32.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = pricingRequest32.customerType();
        boolean boolean35 = pricingRequest7.equals((java.lang.Object) customerType34);
        com.viktor.lab4.PricingEngine.CustomerType customerType36 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType39 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest44 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType39, false, "hi!", true, (int) (byte) 0);
        boolean boolean45 = pricingRequest44.seasonalSale();
        boolean boolean46 = pricingRequest44.firstOrder();
        java.lang.String str47 = pricingRequest44.toString();
        double double48 = pricingRequest44.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType51 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest56 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (-1), customerType51, false, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", true, (-1));
        int int57 = pricingRequest56.quantity();
        java.lang.String str58 = pricingRequest56.couponCode();
        boolean boolean59 = pricingRequest56.firstOrder();
        boolean boolean60 = pricingRequest44.equals((java.lang.Object) pricingRequest56);
        java.lang.String str61 = pricingRequest56.couponCode();
        int int62 = pricingRequest56.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType63 = pricingRequest56.customerType();
        java.lang.String str64 = pricingRequest56.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType65 = pricingRequest56.customerType();
        boolean boolean66 = pricingRequest7.equals((java.lang.Object) customerType65);
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]" + "'", str9, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]" + "'", str10, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + customerType34 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType34.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(customerType36);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str47, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 1.0d + "'", double48 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType51 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType51.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str58, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str61, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + customerType63 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType63.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str64, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertTrue("'" + customerType65 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType65.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType12, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType12, false, "", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (byte) 10, customerType12, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", true, (int) (short) 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10L, (int) (byte) 0, customerType12, false, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", true, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest37 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 32, (int) (short) 100, customerType12, true, "PricingRequest[basePrice=100.0, quantity=100, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32], firstOrder=true, loyaltyPoints=32]", true, (int) (byte) 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest42 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) '4', customerType12, true, "PricingRequest[basePrice=0.0, quantity=100, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32], firstOrder=true, loyaltyPoints=10]", true, 10);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (int) 'a', customerType3, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, (int) ' ');
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.firstOrder();
        double double11 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 0, customerType20, true, "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]", true, (int) (byte) 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, 1, customerType20, false, "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", false, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) (byte) 10, customerType20, false, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest40 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (byte) 10, customerType20, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", true, (int) (byte) 100);
        int int41 = pricingRequest40.quantity();
        java.lang.String str42 = pricingRequest40.couponCode();
        double double43 = pricingEngine0.calculateFinalPrice(pricingRequest40);
        com.viktor.lab4.PricingEngine.CustomerType customerType50 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest55 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType50, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest60 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType50, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest65 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, 1, customerType50, false, "hi!", false, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            double double66 = pricingEngine0.calculateFinalPrice(pricingRequest65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: basePrice must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 7.99d + "'", double11 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]" + "'", str42, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 7.99d + "'", double43 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType50 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType50.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
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
        boolean boolean18 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest26 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1L), 10, customerType21, true, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]", true, (int) '4');
        int int27 = pricingRequest26.quantity();
        boolean boolean28 = pricingRequest7.equals((java.lang.Object) pricingRequest26);
        java.lang.String str29 = pricingRequest26.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str16, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + customerType21 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType21.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PricingRequest[basePrice=-1.0, quantity=10, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32], firstOrder=true, loyaltyPoints=52]" + "'", str29, "PricingRequest[basePrice=-1.0, quantity=10, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32], firstOrder=true, loyaltyPoints=52]");
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        java.lang.String str11 = pricingRequest7.couponCode();
        java.lang.String str12 = pricingRequest7.toString();
        java.lang.String str13 = pricingRequest7.couponCode();
        boolean boolean14 = pricingRequest7.seasonalSale();
        int int15 = pricingRequest7.loyaltyPoints();
        boolean boolean16 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str12, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (-1), customerType4, false, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, false, "PricingRequest[basePrice=-1.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=1]", true, 100);
        java.lang.String str15 = pricingRequest14.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest14.customerType();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=-1.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=1], firstOrder=true, loyaltyPoints=100]" + "'", str15, "PricingRequest[basePrice=35.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=-1.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=1], firstOrder=true, loyaltyPoints=100]");
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1L), 10, customerType2, true, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]", true, (int) '4');
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType14, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType14, false, "", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest((-1.0d), 1, customerType14, false, "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]", true, 0);
        boolean boolean30 = pricingRequest7.equals((java.lang.Object) "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]");
        com.viktor.lab4.PricingEngine.CustomerType customerType31 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType38 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest43 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType38, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest48 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType38, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest53 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) -1, customerType38, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, 0);
        double double54 = pricingRequest53.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType55 = pricingRequest53.customerType();
        java.lang.String str56 = pricingRequest53.toString();
        java.lang.Object obj57 = new java.lang.Object();
        boolean boolean58 = pricingRequest53.equals(obj57);
        com.viktor.lab4.PricingEngine.CustomerType customerType61 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest66 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType61, false, "hi!", true, (int) (byte) 0);
        boolean boolean67 = pricingRequest66.seasonalSale();
        boolean boolean68 = pricingRequest66.firstOrder();
        java.lang.String str69 = pricingRequest66.toString();
        int int70 = pricingRequest66.quantity();
        int int71 = pricingRequest66.quantity();
        boolean boolean72 = pricingRequest66.seasonalSale();
        boolean boolean73 = pricingRequest53.equals((java.lang.Object) pricingRequest66);
        boolean boolean74 = pricingRequest7.equals((java.lang.Object) pricingRequest53);
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + customerType31 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType31.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType38 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType38.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue("'" + customerType55 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType55.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]" + "'", str56, "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str69, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType6, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType6, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) -1, customerType6, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, 0);
        boolean boolean22 = pricingRequest21.seasonalSale();
        boolean boolean23 = pricingRequest21.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = pricingRequest21.customerType();
        boolean boolean25 = pricingRequest21.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + customerType24 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType24.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        java.lang.String str8 = pricingRequest7.couponCode();
        boolean boolean9 = pricingRequest7.seasonalSale();
        java.lang.String str10 = pricingRequest7.couponCode();
        java.lang.String str11 = pricingRequest7.toString();
        int int12 = pricingRequest7.quantity();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str11, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType8, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 10, (int) (byte) 10, customerType8, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1L), (int) (short) -1, customerType8, true, "PricingRequest[basePrice=-1.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", false, (int) (byte) 10);
        double double24 = pricingRequest23.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = pricingRequest23.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest(97.0d, (int) (byte) 10, customerType25, false, "PricingRequest[basePrice=0.0, quantity=10, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=true, loyaltyPoints=100]", true, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
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
        int int43 = pricingRequest16.quantity();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + customerType42 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType42.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 32 + "'", int43 == 32);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (int) 'a', customerType6, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, (int) ' ');
        int int12 = pricingRequest11.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) (short) 10, customerType13, false, "", false, (int) (byte) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, (int) (byte) 10, customerType13, false, "PricingRequest[basePrice=907.99, quantity=10, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=-1.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=false, loyaltyPoints=1]", true, (int) ' ');
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType2, false, "", false, (int) ' ');
        double double8 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest7.customerType();
        java.lang.String str10 = pricingRequest7.couponCode();
        java.lang.String str11 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + customerType9 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType9.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (int) 'a', customerType3, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, (int) ' ');
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.firstOrder();
        double double11 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType16, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest26 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType16, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        int int27 = pricingRequest26.loyaltyPoints();
        boolean boolean28 = pricingRequest26.firstOrder();
        java.lang.String str29 = pricingRequest26.toString();
        java.lang.String str30 = pricingRequest26.couponCode();
        // The following exception was thrown during execution in test generation
        try {
            double double31 = pricingEngine0.calculateFinalPrice(pricingRequest26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 7.99d + "'", double11 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]" + "'", str29, "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str30, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType4, false, "", false, (int) ' ');
        double double10 = pricingRequest9.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 32, customerType11, false, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", true, (int) (short) -1);
        java.lang.String str17 = pricingRequest16.couponCode();
        boolean boolean18 = pricingRequest16.firstOrder();
        java.lang.String str19 = pricingRequest16.couponCode();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]" + "'", str17, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]" + "'", str19, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
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
        com.viktor.lab4.PricingEngine.CustomerType customerType44 = pricingRequest16.customerType();
        java.lang.Class<?> wildcardClass45 = pricingRequest16.getClass();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]" + "'", str42, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 32 + "'", int43 == 32);
        org.junit.Assert.assertTrue("'" + customerType44 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType44.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (int) (short) 0, customerType2, false, "PricingRequest[basePrice=97.0, quantity=100, customerType=null, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=1]", true, 52);
        boolean boolean8 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType13, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType13, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        int int24 = pricingRequest23.quantity();
        int int25 = pricingRequest23.loyaltyPoints();
        boolean boolean26 = pricingRequest23.firstOrder();
        boolean boolean27 = pricingRequest7.equals((java.lang.Object) boolean26);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType6, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType6, false, "", true, (int) '4');
        java.lang.String str17 = pricingRequest16.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = pricingRequest16.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) (short) 100, customerType18, false, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]", true, (int) (short) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = pricingRequest23.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, (int) (byte) 100, customerType27, false, "hi!", false, (int) ' ');
        boolean boolean33 = pricingRequest23.equals((java.lang.Object) "hi!");
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType24 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType24.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType10, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType10, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, 1, customerType10, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (short) 0, customerType10, true, "PricingRequest[basePrice=-1.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, (int) (short) 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1L), 0, customerType10, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        double double36 = pricingRequest35.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType37 = pricingRequest35.customerType();
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-1.0d) + "'", double36 == (-1.0d));
        org.junit.Assert.assertTrue("'" + customerType37 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType37.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType6, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType6, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, 1, customerType6, false, "hi!", false, (int) '#');
        boolean boolean22 = pricingRequest21.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = pricingRequest21.customerType();
        java.lang.String str24 = pricingRequest21.toString();
        double double25 = pricingRequest21.basePrice();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PricingRequest[basePrice=-1.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str24, "PricingRequest[basePrice=-1.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType2, false, "", false, (int) ' ');
        boolean boolean9 = pricingRequest7.equals((java.lang.Object) (-1.0f));
        int int10 = pricingRequest7.quantity();
        boolean boolean11 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType2, false, "", false, (int) ' ');
        double double8 = pricingRequest7.basePrice();
        java.lang.String str9 = pricingRequest7.couponCode();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.firstOrder();
        boolean boolean12 = pricingRequest7.firstOrder();
        java.lang.String str13 = pricingRequest7.couponCode();
        java.lang.String str14 = pricingRequest7.couponCode();
        java.lang.Class<?> wildcardClass15 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        int int11 = pricingRequest7.loyaltyPoints();
        boolean boolean12 = pricingRequest7.firstOrder();
        java.lang.String str13 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str13, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType4, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType4, false, "", true, (int) '4');
        java.lang.String str15 = pricingRequest14.couponCode();
        boolean boolean16 = pricingRequest14.seasonalSale();
        java.lang.String str17 = pricingRequest14.couponCode();
        boolean boolean18 = pricingRequest14.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType10, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType10, false, "", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (byte) 10, customerType10, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", true, (int) (short) 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10L, (int) (byte) 0, customerType10, false, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", true, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((-1.0d), 10, customerType10, true, "PricingRequest[basePrice=1.0, quantity=10, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=-1.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=true, loyaltyPoints=10]", true, (int) (byte) 10);
        boolean boolean36 = pricingRequest35.seasonalSale();
        double double37 = pricingRequest35.basePrice();
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-1.0d) + "'", double37 == (-1.0d));
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
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
        boolean boolean28 = pricingRequest21.firstOrder();
        int int29 = pricingRequest21.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]" + "'", str24, "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]" + "'", str27, "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
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
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType19, false, "hi!", true, (int) (byte) 0);
        boolean boolean25 = pricingRequest24.seasonalSale();
        boolean boolean26 = pricingRequest24.firstOrder();
        java.lang.String str27 = pricingRequest24.toString();
        int int28 = pricingRequest24.quantity();
        int int29 = pricingRequest24.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType30 = pricingRequest24.customerType();
        boolean boolean31 = pricingRequest7.equals((java.lang.Object) customerType30);
        int int32 = pricingRequest7.quantity();
        double double33 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str27, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(customerType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 1.0d + "'", double33 == 1.0d);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (-1), customerType4, false, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, (int) (short) -1, customerType4, true, "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]", true, (int) '4');
        int int15 = pricingRequest14.quantity();
        int int16 = pricingRequest14.loyaltyPoints();
        int int17 = pricingRequest14.quantity();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType4, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType4, false, "", true, (int) '4');
        java.lang.String str15 = pricingRequest14.couponCode();
        boolean boolean17 = pricingRequest14.equals((java.lang.Object) 10);
        int int18 = pricingRequest14.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = pricingRequest14.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, (int) (byte) 100, customerType22, false, "hi!", false, (int) ' ');
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = pricingRequest27.customerType();
        java.lang.String str29 = pricingRequest27.couponCode();
        int int30 = pricingRequest27.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType37 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest42 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType37, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest47 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType37, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest52 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) -1, customerType37, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, 0);
        double double53 = pricingRequest52.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType54 = pricingRequest52.customerType();
        java.lang.String str55 = pricingRequest52.toString();
        boolean boolean56 = pricingRequest27.equals((java.lang.Object) str55);
        boolean boolean57 = pricingRequest14.equals((java.lang.Object) boolean56);
        int int58 = pricingRequest14.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertNull(customerType28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 32 + "'", int30 == 32);
        org.junit.Assert.assertTrue("'" + customerType37 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType37.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + customerType54 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType54.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]" + "'", str55, "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 52 + "'", int58 == 52);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType6, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType6, false, "", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1L), (int) (byte) 100, customerType6, false, "", false, 10);
        boolean boolean22 = pricingRequest21.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType25, false, "", false, (int) ' ');
        double double31 = pricingRequest30.basePrice();
        java.lang.String str32 = pricingRequest30.couponCode();
        double double33 = pricingRequest30.basePrice();
        int int34 = pricingRequest30.loyaltyPoints();
        boolean boolean36 = pricingRequest30.equals((java.lang.Object) ' ');
        com.viktor.lab4.PricingEngine.CustomerType customerType39 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest44 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType39, false, "hi!", true, (int) (byte) 0);
        boolean boolean45 = pricingRequest44.seasonalSale();
        int int46 = pricingRequest44.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType47 = pricingRequest44.customerType();
        java.lang.String str48 = pricingRequest44.couponCode();
        boolean boolean49 = pricingRequest44.seasonalSale();
        boolean boolean50 = pricingRequest30.equals((java.lang.Object) boolean49);
        boolean boolean51 = pricingRequest21.equals((java.lang.Object) pricingRequest30);
        java.lang.Class<?> wildcardClass52 = pricingRequest21.getClass();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 97.0d + "'", double31 == 97.0d);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 97.0d + "'", double33 == 97.0d);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 32 + "'", int34 == 32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNull(customerType47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType6, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType6, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) -1, customerType6, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, 0);
        int int22 = pricingRequest21.loyaltyPoints();
        java.lang.String str23 = pricingRequest21.couponCode();
        java.lang.String str24 = pricingRequest21.couponCode();
        int int25 = pricingRequest21.loyaltyPoints();
        java.lang.String str26 = pricingRequest21.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = pricingRequest21.customerType();
        int int28 = pricingRequest21.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]" + "'", str23, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]" + "'", str24, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]" + "'", str26, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType27 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType27.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType10, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType10, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, 1, customerType10, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType10, false, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]", false, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10, (int) (short) 1, customerType10, false, "hi!", false, (int) (byte) 0);
        java.lang.String str36 = pricingRequest35.toString();
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "PricingRequest[basePrice=10.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=0]" + "'", str36, "PricingRequest[basePrice=10.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=0]");
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType8, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType8, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, 1, customerType8, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType8, false, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]", false, 0);
        java.lang.String str29 = pricingRequest28.couponCode();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]" + "'", str29, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]");
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        boolean boolean10 = pricingRequest7.firstOrder();
        double double11 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType22, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType22, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest37 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) ' ', customerType22, false, "PricingRequest[basePrice=97.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=true, loyaltyPoints=-1]", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest42 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) '4', customerType22, true, "PricingRequest[basePrice=-1.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", false, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest47 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) (short) 0, customerType22, false, "hi!", true, (int) (short) 10);
        boolean boolean48 = pricingRequest7.equals((java.lang.Object) false);
        boolean boolean49 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType2, false, "", false, (int) ' ');
        double double8 = pricingRequest7.basePrice();
        int int9 = pricingRequest7.quantity();
        boolean boolean10 = pricingRequest7.firstOrder();
        boolean boolean11 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType18, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType18, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) -1, customerType18, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, 0);
        double double34 = pricingRequest33.basePrice();
        double double35 = pricingRequest33.basePrice();
        boolean boolean36 = pricingRequest7.equals((java.lang.Object) pricingRequest33);
        com.viktor.lab4.PricingEngine.CustomerType customerType37 = pricingRequest33.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType38 = pricingRequest33.customerType();
        int int39 = pricingRequest33.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + customerType37 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType37.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType38 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType38.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
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
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = pricingRequest19.customerType();
        java.lang.String str25 = pricingRequest19.toString();
        boolean boolean26 = pricingRequest19.firstOrder();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str10, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str21, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + customerType24 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType24.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PricingRequest[basePrice=97.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=true, loyaltyPoints=-1]" + "'", str25, "PricingRequest[basePrice=97.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType5 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest10 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType5, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        java.lang.String str11 = pricingRequest10.toString();
        java.lang.String str12 = pricingRequest10.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest10.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest10.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 10, (int) '#', customerType14, true, "PricingRequest[basePrice=-1.0, quantity=100, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=10]", false, (int) ' ');
        double double20 = pricingEngine0.calculateFinalPrice(pricingRequest19);
        org.junit.Assert.assertTrue("'" + customerType5 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType5.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]" + "'", str11, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 270.49d + "'", double20 == 270.49d);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
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
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType27, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest37 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType27, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        int int38 = pricingRequest37.loyaltyPoints();
        double double39 = pricingRequest37.basePrice();
        java.lang.String str40 = pricingRequest37.couponCode();
        java.lang.String str41 = pricingRequest37.couponCode();
        int int42 = pricingRequest37.quantity();
        java.lang.String str43 = pricingRequest37.toString();
        boolean boolean44 = pricingRequest7.equals((java.lang.Object) str43);
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]" + "'", str18, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]" + "'", str19, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + customerType27 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType27.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str40, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str41, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]" + "'", str43, "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType6, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType6, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, 1, customerType6, false, "hi!", false, (int) '#');
        boolean boolean22 = pricingRequest21.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = pricingRequest21.customerType();
        java.lang.String str24 = pricingRequest21.toString();
        java.lang.String str25 = pricingRequest21.toString();
        java.lang.String str26 = pricingRequest21.toString();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PricingRequest[basePrice=-1.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str24, "PricingRequest[basePrice=-1.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PricingRequest[basePrice=-1.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str25, "PricingRequest[basePrice=-1.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PricingRequest[basePrice=-1.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str26, "PricingRequest[basePrice=-1.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
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
        com.viktor.lab4.PricingEngine.CustomerType customerType81 = pricingRequest19.customerType();
        int int82 = pricingRequest19.quantity();
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
        org.junit.Assert.assertTrue("'" + customerType81 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType81.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
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
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = pricingRequest31.customerType();
        java.lang.Class<?> wildcardClass35 = customerType34.getClass();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + customerType21 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType21.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + customerType34 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType34.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType10, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType10, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) ' ', customerType10, false, "PricingRequest[basePrice=97.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=true, loyaltyPoints=-1]", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) '4', customerType10, true, "PricingRequest[basePrice=-1.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", false, (int) (byte) -1);
        int int31 = pricingRequest30.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType32 = pricingRequest30.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest37 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 35, 10, customerType32, false, "PricingRequest[basePrice=-1.0, quantity=10, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32], firstOrder=true, loyaltyPoints=52]", true, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + customerType32 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType32.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        int int11 = pricingRequest7.loyaltyPoints();
        java.lang.String str12 = pricingRequest7.toString();
        int int13 = pricingRequest7.quantity();
        boolean boolean14 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str12, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(customerType15);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType6, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType6, false, "", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) (byte) 100, customerType6, true, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]", true, (int) ' ');
        int int22 = pricingRequest21.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType4, false, "", false, (int) ' ');
        double double10 = pricingRequest9.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 32, customerType11, false, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", true, (int) (short) -1);
        int int17 = pricingRequest16.loyaltyPoints();
        int int18 = pricingRequest16.quantity();
        int int19 = pricingRequest16.loyaltyPoints();
        java.lang.String str20 = pricingRequest16.couponCode();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]" + "'", str20, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
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
        com.viktor.lab4.PricingEngine.CustomerType customerType49 = pricingRequest43.customerType();
        double double50 = pricingRequest43.basePrice();
        double double51 = pricingRequest43.basePrice();
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
        org.junit.Assert.assertTrue("'" + customerType49 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType49.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 97.0d + "'", double50 == 97.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 97.0d + "'", double51 == 97.0d);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType6, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType6, false, "", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1L), (int) (byte) 100, customerType6, false, "", false, 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest21.customerType();
        int int23 = pricingRequest21.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest(7.99d, (int) '#', customerType4, true, "PricingRequest[basePrice=1.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0], firstOrder=false, loyaltyPoints=0]", false, (int) 'a');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 1, customerType4, false, "PricingRequest[basePrice=1.0, quantity=10, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=-1.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=true, loyaltyPoints=10]", false, (int) 'a');
        java.lang.String str15 = pricingRequest14.toString();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=10, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=-1.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=true, loyaltyPoints=10], firstOrder=false, loyaltyPoints=97]" + "'", str15, "PricingRequest[basePrice=0.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=10, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=-1.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=true, loyaltyPoints=10], firstOrder=false, loyaltyPoints=97]");
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
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
        java.lang.String str23 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType26, false, "", false, (int) ' ');
        boolean boolean33 = pricingRequest31.equals((java.lang.Object) (-1.0f));
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = pricingRequest31.customerType();
        boolean boolean35 = pricingRequest7.equals((java.lang.Object) pricingRequest31);
        int int36 = pricingRequest31.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]" + "'", str18, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]" + "'", str19, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str23, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertTrue("'" + customerType26 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType26.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + customerType34 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType34.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 32 + "'", int36 == 32);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
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
        java.lang.String str16 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str12, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str15, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str16, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType4, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType4, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        int int15 = pricingRequest14.loyaltyPoints();
        int int16 = pricingRequest14.loyaltyPoints();
        java.lang.Class<?> wildcardClass17 = pricingRequest14.getClass();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType4, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType4, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        int int15 = pricingRequest14.quantity();
        int int16 = pricingRequest14.loyaltyPoints();
        double double17 = pricingRequest14.basePrice();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType2, false, "", false, (int) ' ');
        double double8 = pricingRequest7.basePrice();
        java.lang.String str9 = pricingRequest7.couponCode();
        double double10 = pricingRequest7.basePrice();
        int int11 = pricingRequest7.loyaltyPoints();
        java.lang.String str12 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType19, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType19, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest34 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) ' ', customerType19, false, "PricingRequest[basePrice=97.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=true, loyaltyPoints=-1]", true, (-1));
        java.lang.String str35 = pricingRequest34.couponCode();
        boolean boolean36 = pricingRequest7.equals((java.lang.Object) str35);
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str12, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "PricingRequest[basePrice=97.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=true, loyaltyPoints=-1]" + "'", str35, "PricingRequest[basePrice=97.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType2, false, "", false, (int) ' ');
        double double8 = pricingRequest7.basePrice();
        java.lang.String str9 = pricingRequest7.couponCode();
        boolean boolean10 = pricingRequest7.seasonalSale();
        java.lang.String str11 = pricingRequest7.toString();
        double double12 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str11, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType12, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType12, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) ' ', customerType12, false, "PricingRequest[basePrice=97.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=true, loyaltyPoints=-1]", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) '4', customerType12, true, "PricingRequest[basePrice=-1.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", false, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest37 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) (short) 0, customerType12, false, "hi!", true, (int) (short) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest45 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType40, false, "", false, (int) ' ');
        boolean boolean47 = pricingRequest45.equals((java.lang.Object) (-1.0f));
        com.viktor.lab4.PricingEngine.CustomerType customerType48 = pricingRequest45.customerType();
        boolean boolean49 = pricingRequest37.equals((java.lang.Object) customerType48);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest54 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, 10, customerType48, false, "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", true, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + customerType48 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType48.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType7 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest12 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType7, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType7, false, "", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', (int) (byte) 10, customerType7, false, "", false, (int) (byte) 0);
        double double23 = pricingEngine0.calculateFinalPrice(pricingRequest22);
        com.viktor.lab4.PricingEngine.CustomerType customerType32 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest37 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType32, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest42 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType32, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest47 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) -1, customerType32, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, 0);
        int int48 = pricingRequest47.loyaltyPoints();
        java.lang.String str49 = pricingRequest47.couponCode();
        java.lang.String str50 = pricingRequest47.couponCode();
        java.lang.String str51 = pricingRequest47.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType52 = pricingRequest47.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest57 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) -1, (int) (byte) 100, customerType52, false, "", false, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            double double58 = pricingEngine0.calculateFinalPrice(pricingRequest57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: basePrice must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType7 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType7.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 295.99d + "'", double23 == 295.99d);
        org.junit.Assert.assertTrue("'" + customerType32 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType32.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]" + "'", str49, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]" + "'", str50, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]" + "'", str51, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType52 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType52.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
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
        int int24 = pricingRequest17.loyaltyPoints();
        int int25 = pricingRequest17.loyaltyPoints();
        boolean boolean26 = pricingRequest17.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = pricingRequest17.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest45 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType40, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest50 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType40, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest55 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, 1, customerType40, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest60 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType40, false, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]", false, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest65 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10, (int) (short) 1, customerType40, false, "hi!", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest70 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) (short) 100, customerType40, false, "", false, (int) ' ');
        java.lang.String str71 = pricingRequest70.couponCode();
        boolean boolean72 = pricingRequest17.equals((java.lang.Object) pricingRequest70);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + customerType27 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType27.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (int) 'a', customerType3, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, (int) ' ');
        int int9 = pricingRequest8.loyaltyPoints();
        boolean boolean10 = pricingRequest8.firstOrder();
        double double11 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 0, customerType20, true, "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]", true, (int) (byte) 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, 1, customerType20, false, "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", false, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) (byte) 10, customerType20, false, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest40 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (byte) 10, customerType20, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", true, (int) (byte) 100);
        int int41 = pricingRequest40.quantity();
        java.lang.String str42 = pricingRequest40.couponCode();
        double double43 = pricingEngine0.calculateFinalPrice(pricingRequest40);
        com.viktor.lab4.PricingEngine.CustomerType customerType50 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest55 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType50, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest60 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType50, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest65 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) -1, customerType50, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, 0);
        int int66 = pricingRequest65.loyaltyPoints();
        boolean boolean67 = pricingRequest65.firstOrder();
        boolean boolean68 = pricingRequest65.seasonalSale();
        java.lang.String str69 = pricingRequest65.couponCode();
        // The following exception was thrown during execution in test generation
        try {
            double double70 = pricingEngine0.calculateFinalPrice(pricingRequest65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 7.99d + "'", double11 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]" + "'", str42, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 7.99d + "'", double43 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType50 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType50.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]" + "'", str69, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType2, false, "", false, (int) ' ');
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.seasonalSale();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.firstOrder();
        int int12 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
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
        boolean boolean34 = pricingRequest33.firstOrder();
        double double35 = pricingRequest33.basePrice();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]" + "'", str27, "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (-1), customerType6, false, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, (int) (short) -1, customerType6, true, "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest(37.74d, (int) '4', customerType6, false, "PricingRequest[basePrice=907.99, quantity=10, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=-1.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=false, loyaltyPoints=1]", true, 0);
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType10, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType10, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) ' ', customerType10, false, "PricingRequest[basePrice=97.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=true, loyaltyPoints=-1]", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) '4', customerType10, true, "PricingRequest[basePrice=-1.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", false, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, (int) (byte) 10, customerType10, true, "PricingRequest[basePrice=-1.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, 10);
        double double36 = pricingRequest35.basePrice();
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 1.0d + "'", double36 == 1.0d);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType14, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType14, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, 1, customerType14, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest34 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType14, false, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]", false, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest39 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10, (int) (short) 1, customerType14, false, "hi!", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest44 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) (short) 100, customerType14, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest49 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (short) 100, customerType14, false, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]", true, (int) (byte) 10);
        java.lang.String str50 = pricingRequest49.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType57 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest62 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType57, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest67 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType57, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest72 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) -1, customerType57, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, 0);
        double double73 = pricingRequest72.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType74 = pricingRequest72.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType77 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest82 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType77, false, "hi!", true, (int) (byte) 0);
        boolean boolean83 = pricingRequest82.seasonalSale();
        int int84 = pricingRequest82.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType85 = pricingRequest82.customerType();
        int int86 = pricingRequest82.loyaltyPoints();
        java.lang.String str87 = pricingRequest82.couponCode();
        boolean boolean89 = pricingRequest82.equals((java.lang.Object) '4');
        double double90 = pricingRequest82.basePrice();
        boolean boolean91 = pricingRequest72.equals((java.lang.Object) pricingRequest82);
        int int92 = pricingRequest82.loyaltyPoints();
        double double93 = pricingRequest82.basePrice();
        double double94 = pricingRequest82.basePrice();
        boolean boolean95 = pricingRequest49.equals((java.lang.Object) double94);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]" + "'", str50, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertTrue("'" + customerType57 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType57.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.0d + "'", double73 == 0.0d);
        org.junit.Assert.assertTrue("'" + customerType74 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType74.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1 + "'", int84 == 1);
        org.junit.Assert.assertNull(customerType85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "hi!" + "'", str87, "hi!");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 1.0d + "'", double90 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 1.0d + "'", double93 == 1.0d);
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 1.0d + "'", double94 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType6, false, "hi!", true, (int) (byte) 0);
        boolean boolean12 = pricingRequest11.seasonalSale();
        boolean boolean13 = pricingRequest11.firstOrder();
        java.lang.String str14 = pricingRequest11.toString();
        double double15 = pricingRequest11.basePrice();
        boolean boolean16 = pricingRequest11.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        boolean boolean18 = pricingRequest11.equals((java.lang.Object) customerType17);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, 32, customerType17, true, "PricingRequest[basePrice=32.0, quantity=10, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=0]", true, 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', (-1), customerType17, true, "PricingRequest[basePrice=-1.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=-1.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=false, loyaltyPoints=10]", false, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType29 = pricingRequest28.customerType();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str14, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + customerType29 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType29.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 0, customerType14, true, "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]", true, (int) (byte) 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, 1, customerType14, false, "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", false, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) (byte) 10, customerType14, false, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest34 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (byte) 10, customerType14, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", true, (int) (byte) 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest39 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, (int) '#', customerType14, false, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]", false, (int) 'a');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest44 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100L, 100, customerType14, true, "PricingRequest[basePrice=1.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0], firstOrder=false, loyaltyPoints=0]", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest49 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 10, 52, customerType14, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0], firstOrder=false, loyaltyPoints=0]", true, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType7 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest12 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) ' ', customerType7, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) 0, customerType7, false, "", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', (int) (byte) 10, customerType7, false, "", false, (int) (byte) 0);
        double double23 = pricingEngine0.calculateFinalPrice(pricingRequest22);
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType26, false, "hi!", true, (int) (byte) 0);
        boolean boolean32 = pricingRequest31.seasonalSale();
        boolean boolean33 = pricingRequest31.firstOrder();
        double double34 = pricingRequest31.basePrice();
        // The following exception was thrown during execution in test generation
        try {
            double double35 = pricingEngine0.calculateFinalPrice(pricingRequest31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: customerType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType7 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType7.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 295.99d + "'", double23 == 295.99d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0d + "'", double34 == 1.0d);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType10, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType10, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, 1, customerType10, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (short) 0, customerType10, true, "PricingRequest[basePrice=-1.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, (int) (short) 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100L, 10, customerType10, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0], firstOrder=false, loyaltyPoints=0]", true, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType2, false, "", false, (int) ' ');
        java.lang.String str8 = pricingRequest7.toString();
        double double9 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        java.lang.String str12 = pricingRequest7.toString();
        boolean boolean13 = pricingRequest7.seasonalSale();
        boolean boolean14 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str8, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str12, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
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
        int int26 = pricingRequest7.quantity();
        double double27 = pricingRequest7.basePrice();
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, (int) (byte) 100, customerType2, false, "hi!", false, (int) ' ');
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        java.lang.String str9 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        java.lang.Object obj11 = null;
        boolean boolean12 = pricingRequest7.equals(obj11);
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest7.customerType();
        java.lang.String str14 = pricingRequest7.couponCode();
        java.lang.String str15 = pricingRequest7.toString();
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]" + "'", str9, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(customerType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]" + "'", str15, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]");
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
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
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType19, false, "hi!", true, (int) (byte) 0);
        boolean boolean25 = pricingRequest24.seasonalSale();
        boolean boolean26 = pricingRequest24.firstOrder();
        java.lang.String str27 = pricingRequest24.toString();
        int int28 = pricingRequest24.quantity();
        int int29 = pricingRequest24.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType30 = pricingRequest24.customerType();
        boolean boolean31 = pricingRequest7.equals((java.lang.Object) customerType30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass32 = customerType30.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str27, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(customerType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType2, false, "hi!", true, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        double double10 = pricingRequest7.basePrice();
        double double11 = pricingRequest7.basePrice();
        boolean boolean12 = pricingRequest7.seasonalSale();
        java.lang.String str13 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(customerType14);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, (int) (byte) 100, customerType2, false, "hi!", false, (int) ' ');
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        java.lang.String str9 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        java.lang.Object obj11 = null;
        boolean boolean12 = pricingRequest7.equals(obj11);
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest7.customerType();
        boolean boolean14 = pricingRequest7.seasonalSale();
        int int15 = pricingRequest7.quantity();
        int int16 = pricingRequest7.quantity();
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]" + "'", str9, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(customerType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
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
        java.lang.String str43 = pricingRequest34.toString();
        java.lang.String str44 = pricingRequest34.couponCode();
        int int45 = pricingRequest34.loyaltyPoints();
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
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str43, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType6, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType6, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) -1, customerType6, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, 0);
        int int22 = pricingRequest21.loyaltyPoints();
        boolean boolean23 = pricingRequest21.firstOrder();
        boolean boolean24 = pricingRequest21.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType6, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType6, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        int int17 = pricingRequest16.loyaltyPoints();
        boolean boolean18 = pricingRequest16.firstOrder();
        java.lang.String str19 = pricingRequest16.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = pricingRequest16.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest(3647.99d, (int) 'a', customerType20, false, "", true, 0);
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]" + "'", str19, "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100L, (int) (short) 100, customerType2, true, "PricingRequest[basePrice=0.0, quantity=100, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32], firstOrder=true, loyaltyPoints=10]", true, 32);
        int int8 = pricingRequest7.loyaltyPoints();
        java.lang.Object obj9 = null;
        boolean boolean10 = pricingRequest7.equals(obj9);
        int int11 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType6, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType6, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) -1, customerType6, true, "PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, 0);
        double double22 = pricingRequest21.basePrice();
        int int23 = pricingRequest21.quantity();
        int int24 = pricingRequest21.loyaltyPoints();
        int int25 = pricingRequest21.loyaltyPoints();
        int int26 = pricingRequest21.quantity();
        int int27 = pricingRequest21.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType13, false, "", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType13, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]", false, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, 1, customerType13, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType13, false, "PricingRequest[basePrice=100.0, quantity=100, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=32]", false, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest38 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10, (int) (short) 1, customerType13, false, "hi!", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest43 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) (short) 100, customerType13, false, "", false, (int) ' ');
        java.lang.String str44 = pricingRequest43.toString();
        double double45 = pricingEngine0.calculateFinalPrice(pricingRequest43);
        com.viktor.lab4.PricingEngine.CustomerType customerType48 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest53 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 1, customerType48, false, "hi!", true, (int) (byte) 0);
        boolean boolean54 = pricingRequest53.seasonalSale();
        boolean boolean55 = pricingRequest53.firstOrder();
        java.lang.String str56 = pricingRequest53.toString();
        java.lang.String str57 = pricingRequest53.toString();
        java.lang.String str58 = pricingRequest53.couponCode();
        int int59 = pricingRequest53.quantity();
        boolean boolean60 = pricingRequest53.firstOrder();
        java.lang.String str61 = pricingRequest53.couponCode();
        int int62 = pricingRequest53.quantity();
        // The following exception was thrown during execution in test generation
        try {
            double double63 = pricingEngine0.calculateFinalPrice(pricingRequest53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: customerType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "PricingRequest[basePrice=10.0, quantity=100, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str44, "PricingRequest[basePrice=10.0, quantity=100, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 907.99d + "'", double45 == 907.99d);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str56, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str57, "PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
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
        java.lang.String str30 = pricingRequest22.couponCode();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 97.0d + "'", double23 == 97.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]" + "'", str26, "PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 0, customerType8, true, "PricingRequest[basePrice=0.0, quantity=0, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=32], firstOrder=false, loyaltyPoints=-1]", true, (int) (byte) 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, 1, customerType8, false, "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=32, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=null, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", false, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest(907.99d, (int) (short) 10, customerType8, true, "hi!", true, 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) (byte) 0, customerType8, false, "", false, (int) (byte) 10);
        double double29 = pricingRequest28.basePrice();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
    }
}

