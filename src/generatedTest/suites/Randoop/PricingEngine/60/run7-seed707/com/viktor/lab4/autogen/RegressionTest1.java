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
        java.lang.String str23 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str18, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 35.0d + "'", double21 == 35.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 35.0d + "'", double22 == 35.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
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
        java.lang.String str16 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType25, true, "hi!", true, (int) (short) -1);
        boolean boolean31 = pricingRequest30.seasonalSale();
        boolean boolean33 = pricingRequest30.equals((java.lang.Object) 100.0d);
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = pricingRequest30.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest39 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, 0, customerType34, true, "hi!", true, (int) (byte) 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest44 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) (byte) 1, customerType34, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", true, (int) 'a');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest49 = new com.viktor.lab4.PricingEngine.PricingRequest(52.0d, (int) ' ', customerType34, false, "", true, 1);
        int int50 = pricingRequest49.quantity();
        boolean boolean51 = pricingRequest7.equals((java.lang.Object) pricingRequest49);
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str16, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + customerType34 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType34.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 32 + "'", int50 == 32);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType3, true, "hi!", true, (int) (short) -1);
        int int9 = pricingRequest8.loyaltyPoints();
        java.lang.Object obj10 = new java.lang.Object();
        boolean boolean11 = pricingRequest8.equals(obj10);
        int int12 = pricingRequest8.loyaltyPoints();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = pricingEngine0.calculateFinalPrice(pricingRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        int int10 = pricingRequest9.quantity();
        int int11 = pricingRequest9.quantity();
        int int12 = pricingRequest9.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) '#', customerType13, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) '#');
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = pricingRequest18.customerType();
        boolean boolean20 = pricingRequest18.firstOrder();
        double double21 = pricingRequest18.basePrice();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        int int10 = pricingRequest9.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, 100, customerType11, false, "", true, (int) (short) -1);
        int int17 = pricingRequest16.quantity();
        int int18 = pricingRequest16.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = pricingRequest16.customerType();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType12, true, "hi!", true, (int) (short) -1);
        int int18 = pricingRequest17.quantity();
        int int19 = pricingRequest17.quantity();
        int int20 = pricingRequest17.quantity();
        double double21 = pricingRequest17.basePrice();
        boolean boolean22 = pricingRequest7.equals((java.lang.Object) pricingRequest17);
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType27, true, "hi!", true, (int) (short) -1);
        int int33 = pricingRequest32.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = pricingRequest32.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest39 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, 100, customerType34, false, "", true, (int) (short) -1);
        java.lang.String str40 = pricingRequest39.couponCode();
        int int41 = pricingRequest39.loyaltyPoints();
        boolean boolean42 = pricingRequest7.equals((java.lang.Object) pricingRequest39);
        boolean boolean43 = pricingRequest39.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 35.0d + "'", double21 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + customerType27 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType27.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + customerType34 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType34.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, 0, customerType2, false, "", true, (int) (byte) 100);
        int int8 = pricingRequest7.loyaltyPoints();
        boolean boolean9 = pricingRequest7.firstOrder();
        boolean boolean10 = pricingRequest7.firstOrder();
        boolean boolean11 = pricingRequest7.firstOrder();
        java.lang.String str12 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.loyaltyPoints();
        boolean boolean10 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType16, true, "hi!", true, (int) (short) -1);
        int int22 = pricingRequest21.quantity();
        int int23 = pricingRequest21.quantity();
        int int24 = pricingRequest21.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = pricingRequest21.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '4', (int) ' ', customerType25, false, "hi!", false, (int) '#');
        double double31 = pricingRequest30.basePrice();
        boolean boolean32 = pricingRequest30.seasonalSale();
        boolean boolean33 = pricingRequest7.equals((java.lang.Object) boolean32);
        com.viktor.lab4.PricingEngine.CustomerType customerType36 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest41 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType36, true, "hi!", true, (int) (short) -1);
        boolean boolean42 = pricingRequest41.seasonalSale();
        boolean boolean43 = pricingRequest41.firstOrder();
        int int44 = pricingRequest41.loyaltyPoints();
        java.lang.String str45 = pricingRequest41.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType46 = pricingRequest41.customerType();
        java.lang.Object obj47 = null;
        boolean boolean48 = pricingRequest41.equals(obj47);
        java.lang.String str49 = pricingRequest41.couponCode();
        java.lang.String str50 = pricingRequest41.toString();
        boolean boolean51 = pricingRequest7.equals((java.lang.Object) pricingRequest41);
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 52.0d + "'", double31 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + customerType36 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType36.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str45, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType46 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType46.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str50, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (short) 100, customerType2, false, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100]", true, (int) (short) 1);
        double double8 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType11, true, "hi!", true, (int) (short) -1);
        int int17 = pricingRequest16.quantity();
        int int18 = pricingRequest16.quantity();
        int int19 = pricingRequest16.quantity();
        boolean boolean20 = pricingRequest16.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = pricingRequest16.customerType();
        java.lang.String str22 = pricingRequest16.toString();
        boolean boolean23 = pricingRequest7.equals((java.lang.Object) str22);
        int int24 = pricingRequest7.quantity();
        int int25 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + customerType21 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType21.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str22, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
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
        int int34 = pricingRequest21.loyaltyPoints();
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, 0, customerType4, false, "", true, (int) (byte) 100);
        int int10 = pricingRequest9.loyaltyPoints();
        double double11 = pricingRequest9.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest(15.29d, 100, customerType13, true, "PricingRequest[basePrice=52.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100], firstOrder=true, loyaltyPoints=0]", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest26 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (short) 1, customerType21, true, "PricingRequest[basePrice=52.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100], firstOrder=true, loyaltyPoints=0]", true, (int) '4');
        boolean boolean27 = pricingRequest18.equals((java.lang.Object) (byte) 100);
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        boolean boolean10 = pricingRequest9.seasonalSale();
        boolean boolean12 = pricingRequest9.equals((java.lang.Object) 100.0d);
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest9.customerType();
        java.lang.String str14 = pricingRequest9.toString();
        double double15 = pricingRequest9.basePrice();
        java.lang.String str16 = pricingRequest9.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest26 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType21, true, "hi!", true, (int) (short) -1);
        int int27 = pricingRequest26.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = pricingRequest26.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, 100, customerType28, false, "", true, (int) (short) -1);
        int int34 = pricingRequest33.loyaltyPoints();
        java.lang.String str35 = pricingRequest33.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType36 = pricingRequest33.customerType();
        boolean boolean37 = pricingRequest9.equals((java.lang.Object) customerType36);
        com.viktor.lab4.PricingEngine.CustomerType customerType38 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest43 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) -1, 32, customerType38, false, "PricingRequest[basePrice=52.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100], firstOrder=true, loyaltyPoints=0]", true, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str14, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 35.0d + "'", double15 == 35.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + customerType21 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType21.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "PricingRequest[basePrice=0.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str35, "PricingRequest[basePrice=0.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType36 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType36.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + customerType38 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType38.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        int int10 = pricingRequest9.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, (int) (byte) -1, customerType11, false, "", false, 97);
        int int17 = pricingRequest16.quantity();
        boolean boolean18 = pricingRequest16.seasonalSale();
        int int19 = pricingRequest16.quantity();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType6, true, "hi!", true, (int) (short) -1);
        int int12 = pricingRequest11.quantity();
        int int13 = pricingRequest11.quantity();
        int int14 = pricingRequest11.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) '#', customerType15, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest(7.99d, (int) (short) 0, customerType15, true, "hi!", false, (int) (byte) 100);
        java.lang.String str26 = pricingRequest25.toString();
        boolean boolean27 = pricingRequest25.firstOrder();
        boolean boolean28 = pricingRequest25.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType31 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest36 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType31, true, "hi!", true, (int) (short) -1);
        int int37 = pricingRequest36.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest45 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType40, true, "hi!", true, (int) (short) -1);
        java.lang.String str46 = pricingRequest45.couponCode();
        java.lang.String str47 = pricingRequest45.toString();
        boolean boolean48 = pricingRequest36.equals((java.lang.Object) str47);
        com.viktor.lab4.PricingEngine.CustomerType customerType49 = pricingRequest36.customerType();
        double double50 = pricingRequest36.basePrice();
        double double51 = pricingRequest36.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType52 = pricingRequest36.customerType();
        boolean boolean53 = pricingRequest25.equals((java.lang.Object) customerType52);
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PricingRequest[basePrice=7.99, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=100]" + "'", str26, "PricingRequest[basePrice=7.99, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=100]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + customerType31 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType31.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str47, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + customerType49 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType49.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 35.0d + "'", double50 == 35.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 35.0d + "'", double51 == 35.0d);
        org.junit.Assert.assertTrue("'" + customerType52 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType52.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean9 = pricingRequest7.equals((java.lang.Object) 10);
        boolean boolean10 = pricingRequest7.seasonalSale();
        int int11 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100L, (int) ' ', customerType15, false, "hi!", false, (int) '4');
        boolean boolean21 = pricingRequest7.equals((java.lang.Object) "hi!");
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType10, true, "hi!", true, (int) (short) -1);
        boolean boolean16 = pricingRequest15.seasonalSale();
        boolean boolean18 = pricingRequest15.equals((java.lang.Object) 100.0d);
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = pricingRequest15.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, 0, customerType19, true, "hi!", true, (int) (byte) 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) (byte) 1, customerType19, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", true, (int) 'a');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest34 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) (byte) 10, customerType19, true, "PricingRequest[basePrice=52.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100], firstOrder=true, loyaltyPoints=0]", false, (int) (byte) 1);
        double double35 = pricingRequest34.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType36 = pricingRequest34.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest41 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) -1, 100, customerType36, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", true, 1);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1.0d) + "'", double35 == (-1.0d));
        org.junit.Assert.assertTrue("'" + customerType36 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType36.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        java.lang.String str8 = pricingRequest7.couponCode();
        int int9 = pricingRequest7.loyaltyPoints();
        java.lang.String str10 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        int int12 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
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
        boolean boolean30 = pricingRequest19.seasonalSale();
        boolean boolean31 = pricingRequest19.firstOrder();
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.firstOrder();
        java.lang.String str12 = pricingRequest7.toString();
        java.lang.String str13 = pricingRequest7.toString();
        double double14 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType17, true, "hi!", true, (int) (short) -1);
        boolean boolean23 = pricingRequest22.seasonalSale();
        boolean boolean25 = pricingRequest22.equals((java.lang.Object) 100.0d);
        boolean boolean26 = pricingRequest22.firstOrder();
        boolean boolean27 = pricingRequest22.firstOrder();
        java.lang.String str28 = pricingRequest22.toString();
        boolean boolean29 = pricingRequest22.firstOrder();
        java.lang.String str30 = pricingRequest22.couponCode();
        double double31 = pricingRequest22.basePrice();
        double double32 = pricingRequest22.basePrice();
        boolean boolean33 = pricingRequest7.equals((java.lang.Object) pricingRequest22);
        int int34 = pricingRequest22.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str13, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str28, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 35.0d + "'", double31 == 35.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 35.0d + "'", double32 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        java.lang.String str8 = pricingRequest7.couponCode();
        double double9 = pricingRequest7.basePrice();
        java.lang.String str10 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType11, true, "hi!", true, (int) (short) -1);
        java.lang.String str17 = pricingRequest16.couponCode();
        java.lang.String str18 = pricingRequest16.toString();
        boolean boolean19 = pricingRequest7.equals((java.lang.Object) str18);
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str18, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType21 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType21.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
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
        java.lang.Class<?> wildcardClass22 = pricingRequest20.getClass();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean10 = pricingRequest7.equals((java.lang.Object) 100.0d);
        boolean boolean11 = pricingRequest7.seasonalSale();
        int int12 = pricingRequest7.quantity();
        boolean boolean13 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType16, true, "hi!", true, (int) (short) -1);
        boolean boolean22 = pricingRequest21.seasonalSale();
        int int23 = pricingRequest21.quantity();
        double double24 = pricingRequest21.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = pricingRequest21.customerType();
        boolean boolean26 = pricingRequest21.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType29 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest34 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType29, true, "hi!", true, (int) (short) -1);
        boolean boolean35 = pricingRequest34.seasonalSale();
        int int36 = pricingRequest34.quantity();
        double double37 = pricingRequest34.basePrice();
        boolean boolean38 = pricingRequest34.seasonalSale();
        boolean boolean39 = pricingRequest21.equals((java.lang.Object) boolean38);
        boolean boolean40 = pricingRequest21.firstOrder();
        int int41 = pricingRequest21.loyaltyPoints();
        boolean boolean42 = pricingRequest7.equals((java.lang.Object) pricingRequest21);
        boolean boolean43 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 35.0d + "'", double24 == 35.0d);
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + customerType29 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType29.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 35.0d + "'", double37 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType8, true, "hi!", true, (int) (short) -1);
        int int14 = pricingRequest13.quantity();
        int int15 = pricingRequest13.quantity();
        int int16 = pricingRequest13.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest13.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) '#', customerType17, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) 10, customerType17, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, 0, customerType17, false, "PricingRequest[basePrice=-1.0, quantity=97, customerType=null, seasonalSale=false, couponCode=PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=97]", true, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, 0, customerType4, true, "hi!", true, 100);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest14.customerType();
        java.lang.String str16 = pricingRequest14.toString();
        java.lang.String str17 = pricingRequest14.toString();
        boolean boolean18 = pricingRequest14.seasonalSale();
        int int19 = pricingRequest14.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100]" + "'", str16, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100]" + "'", str17, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, 0, customerType2, false, "", true, (int) (byte) 100);
        int int8 = pricingRequest7.loyaltyPoints();
        int int9 = pricingRequest7.loyaltyPoints();
        int int10 = pricingRequest7.quantity();
        int int11 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.firstOrder();
        java.lang.String str12 = pricingRequest7.couponCode();
        boolean boolean13 = pricingRequest7.seasonalSale();
        boolean boolean14 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
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
        int int39 = pricingRequest33.quantity();
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        boolean boolean10 = pricingRequest9.seasonalSale();
        boolean boolean12 = pricingRequest9.equals((java.lang.Object) 100.0d);
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, 0, customerType13, true, "hi!", true, (int) (byte) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = pricingRequest18.customerType();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, 0, customerType4, true, "hi!", true, 100);
        int int15 = pricingRequest14.loyaltyPoints();
        double double16 = pricingRequest14.basePrice();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
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
        java.lang.String str29 = pricingRequest17.couponCode();
        int int30 = pricingRequest17.quantity();
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) 'a', customerType2, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) 'a');
        boolean boolean8 = pricingRequest7.firstOrder();
        double double9 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
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
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType25, true, "hi!", true, (int) (short) -1);
        java.lang.String str31 = pricingRequest30.couponCode();
        java.lang.String str32 = pricingRequest30.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType33 = pricingRequest30.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType36 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest41 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType36, true, "hi!", true, (int) (short) -1);
        boolean boolean42 = pricingRequest41.seasonalSale();
        int int43 = pricingRequest41.quantity();
        double double44 = pricingRequest41.basePrice();
        boolean boolean45 = pricingRequest41.seasonalSale();
        boolean boolean46 = pricingRequest41.seasonalSale();
        boolean boolean47 = pricingRequest30.equals((java.lang.Object) pricingRequest41);
        int int48 = pricingRequest30.quantity();
        boolean boolean49 = pricingRequest18.equals((java.lang.Object) int48);
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str32, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType33 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType33.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType36 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType36.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 35.0d + "'", double44 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        int int10 = pricingRequest9.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, 100, customerType11, false, "", true, (int) (short) -1);
        int int17 = pricingRequest16.loyaltyPoints();
        java.lang.String str18 = pricingRequest16.toString();
        int int19 = pricingRequest16.quantity();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PricingRequest[basePrice=0.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str18, "PricingRequest[basePrice=0.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        int int10 = pricingRequest7.quantity();
        java.lang.String str11 = pricingRequest7.couponCode();
        java.lang.String str12 = pricingRequest7.couponCode();
        boolean boolean13 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (short) 100, customerType2, false, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100]", true, (int) (short) 1);
        double double8 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType11, true, "hi!", true, (int) (short) -1);
        int int17 = pricingRequest16.quantity();
        int int18 = pricingRequest16.quantity();
        int int19 = pricingRequest16.quantity();
        boolean boolean20 = pricingRequest16.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = pricingRequest16.customerType();
        java.lang.String str22 = pricingRequest16.toString();
        boolean boolean23 = pricingRequest7.equals((java.lang.Object) str22);
        java.lang.String str24 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + customerType21 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType21.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str22, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PricingRequest[basePrice=0.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100], firstOrder=true, loyaltyPoints=1]" + "'", str24, "PricingRequest[basePrice=0.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100], firstOrder=true, loyaltyPoints=1]");
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean10 = pricingRequest7.equals((java.lang.Object) 100.0d);
        boolean boolean11 = pricingRequest7.seasonalSale();
        int int12 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType15, true, "hi!", true, (int) (short) -1);
        boolean boolean22 = pricingRequest20.equals((java.lang.Object) 10);
        boolean boolean23 = pricingRequest20.seasonalSale();
        int int24 = pricingRequest20.loyaltyPoints();
        double double25 = pricingRequest20.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType28, true, "hi!", true, (int) (short) -1);
        boolean boolean34 = pricingRequest33.seasonalSale();
        int int35 = pricingRequest33.quantity();
        double double36 = pricingRequest33.basePrice();
        boolean boolean37 = pricingRequest33.seasonalSale();
        boolean boolean38 = pricingRequest20.equals((java.lang.Object) pricingRequest33);
        boolean boolean39 = pricingRequest7.equals((java.lang.Object) pricingRequest33);
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 35.0d + "'", double25 == 35.0d);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 35.0d + "'", double36 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
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
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = pricingRequest21.customerType();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100]" + "'", str22, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100]");
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, 0, customerType2, false, "", true, (int) (byte) 100);
        int int8 = pricingRequest7.loyaltyPoints();
        int int9 = pricingRequest7.loyaltyPoints();
        int int10 = pricingRequest7.quantity();
        boolean boolean11 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
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
        boolean boolean41 = pricingRequest39.firstOrder();
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
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
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
        java.lang.Class<?> wildcardClass38 = pricingRequest7.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.loyaltyPoints();
        int int10 = pricingRequest7.quantity();
        boolean boolean11 = pricingRequest7.firstOrder();
        boolean boolean12 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.seasonalSale();
        boolean boolean12 = pricingRequest7.seasonalSale();
        int int13 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean10 = pricingRequest7.equals((java.lang.Object) 100.0d);
        boolean boolean11 = pricingRequest7.firstOrder();
        boolean boolean12 = pricingRequest7.firstOrder();
        java.lang.String str13 = pricingRequest7.toString();
        boolean boolean14 = pricingRequest7.firstOrder();
        int int15 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str13, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        boolean boolean10 = pricingRequest9.seasonalSale();
        boolean boolean12 = pricingRequest9.equals((java.lang.Object) 100.0d);
        boolean boolean13 = pricingRequest9.firstOrder();
        boolean boolean14 = pricingRequest9.firstOrder();
        java.lang.String str15 = pricingRequest9.couponCode();
        int int16 = pricingRequest9.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1), (int) (byte) 1, customerType17, true, "PricingRequest[basePrice=-1.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]", true, (int) (byte) 1);
        java.lang.Class<?> wildcardClass23 = customerType17.getClass();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        int int10 = pricingRequest9.quantity();
        int int11 = pricingRequest9.quantity();
        java.lang.String str12 = pricingRequest9.toString();
        int int13 = pricingRequest9.loyaltyPoints();
        java.lang.String str14 = pricingRequest9.toString();
        boolean boolean15 = pricingRequest9.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest9.customerType();
        int int17 = pricingRequest9.quantity();
        int int18 = pricingRequest9.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest(1336.59d, (int) (short) 1, customerType19, false, "hi!", true, 35);
        double double25 = pricingRequest24.basePrice();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str14, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1336.59d + "'", double25 == 1336.59d);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
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
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest75 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (short) 100, customerType70, false, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100]", true, (int) (short) 1);
        double double76 = pricingEngine0.calculateFinalPrice(pricingRequest75);
        com.viktor.lab4.PricingEngine.CustomerType customerType79 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest84 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType79, true, "hi!", true, (int) (short) -1);
        java.lang.String str85 = pricingRequest84.couponCode();
        double double86 = pricingRequest84.basePrice();
        boolean boolean87 = pricingRequest84.seasonalSale();
        // The following exception was thrown during execution in test generation
        try {
            double double88 = pricingEngine0.calculateFinalPrice(pricingRequest84);
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
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 7.99d + "'", double76 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType79 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType79.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "hi!" + "'", str85, "hi!");
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 35.0d + "'", double86 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        int int10 = pricingRequest7.quantity();
        java.lang.String str11 = pricingRequest7.couponCode();
        java.lang.String str12 = pricingRequest7.couponCode();
        double double13 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType6, true, "hi!", true, (int) (short) -1);
        int int12 = pricingRequest11.quantity();
        int int13 = pricingRequest11.quantity();
        int int14 = pricingRequest11.quantity();
        int int15 = pricingRequest11.loyaltyPoints();
        int int16 = pricingRequest11.quantity();
        int int17 = pricingRequest11.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', 100, customerType18, false, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100]", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1L), (int) (short) -1, customerType18, false, "PricingRequest[basePrice=0.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) '#');
        java.lang.String str29 = pricingRequest28.couponCode();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PricingRequest[basePrice=0.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str29, "PricingRequest[basePrice=0.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean10 = pricingRequest7.equals((java.lang.Object) 100.0d);
        boolean boolean11 = pricingRequest7.seasonalSale();
        boolean boolean12 = pricingRequest7.firstOrder();
        java.lang.String str13 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType16, true, "hi!", true, (int) (short) -1);
        java.lang.String str22 = pricingRequest21.couponCode();
        java.lang.String str23 = pricingRequest21.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = pricingRequest21.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType27, true, "hi!", true, (int) (short) -1);
        boolean boolean33 = pricingRequest32.seasonalSale();
        int int34 = pricingRequest32.quantity();
        double double35 = pricingRequest32.basePrice();
        boolean boolean36 = pricingRequest32.seasonalSale();
        boolean boolean37 = pricingRequest32.seasonalSale();
        boolean boolean38 = pricingRequest21.equals((java.lang.Object) pricingRequest32);
        com.viktor.lab4.PricingEngine.CustomerType customerType41 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest46 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType41, true, "hi!", true, (int) (short) -1);
        boolean boolean47 = pricingRequest46.seasonalSale();
        boolean boolean48 = pricingRequest46.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType51 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest56 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType51, true, "hi!", true, (int) (short) -1);
        boolean boolean57 = pricingRequest56.seasonalSale();
        int int58 = pricingRequest56.quantity();
        double double59 = pricingRequest56.basePrice();
        boolean boolean60 = pricingRequest56.seasonalSale();
        boolean boolean61 = pricingRequest56.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType62 = pricingRequest56.customerType();
        boolean boolean63 = pricingRequest46.equals((java.lang.Object) pricingRequest56);
        boolean boolean64 = pricingRequest56.firstOrder();
        java.lang.String str65 = pricingRequest56.toString();
        boolean boolean66 = pricingRequest32.equals((java.lang.Object) pricingRequest56);
        boolean boolean67 = pricingRequest32.firstOrder();
        boolean boolean68 = pricingRequest7.equals((java.lang.Object) boolean67);
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str23, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType24 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType24.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType27 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType27.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 35.0d + "'", double35 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + customerType41 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType41.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + customerType51 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType51.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 35.0d + "'", double59 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + customerType62 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType62.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str65, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        int int10 = pricingRequest9.quantity();
        int int11 = pricingRequest9.quantity();
        int int12 = pricingRequest9.quantity();
        int int13 = pricingRequest9.quantity();
        java.lang.String str14 = pricingRequest9.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10, (int) (short) 100, customerType16, false, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=100]", false, 0);
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
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean9 = pricingRequest7.equals((java.lang.Object) 10);
        boolean boolean10 = pricingRequest7.seasonalSale();
        int int11 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest7.customerType();
        int int13 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        boolean boolean10 = pricingRequest9.seasonalSale();
        int int11 = pricingRequest9.quantity();
        double double12 = pricingRequest9.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest9.customerType();
        boolean boolean14 = pricingRequest9.seasonalSale();
        double double15 = pricingRequest9.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest(52.0d, 100, customerType16, true, "PricingRequest[basePrice=-1.0, quantity=97, customerType=null, seasonalSale=false, couponCode=PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=97]", false, (int) (short) 100);
        java.lang.String str22 = pricingRequest21.couponCode();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 35.0d + "'", double15 == 35.0d);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PricingRequest[basePrice=-1.0, quantity=97, customerType=null, seasonalSale=false, couponCode=PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=97]" + "'", str22, "PricingRequest[basePrice=-1.0, quantity=97, customerType=null, seasonalSale=false, couponCode=PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=97]");
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.quantity();
        int int9 = pricingRequest7.quantity();
        int int10 = pricingRequest7.quantity();
        int int11 = pricingRequest7.loyaltyPoints();
        int int12 = pricingRequest7.quantity();
        java.lang.Class<?> wildcardClass13 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.loyaltyPoints();
        int int10 = pricingRequest7.loyaltyPoints();
        int int11 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType6, true, "hi!", true, (int) (short) -1);
        boolean boolean12 = pricingRequest11.seasonalSale();
        boolean boolean14 = pricingRequest11.equals((java.lang.Object) 100.0d);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, 0, customerType15, true, "hi!", true, (int) (byte) 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 97, (int) (byte) -1, customerType15, true, "PricingRequest[basePrice=52.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100], firstOrder=true, loyaltyPoints=0]", true, (-1));
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType28, true, "hi!", true, (int) (short) -1);
        boolean boolean34 = pricingRequest33.seasonalSale();
        int int35 = pricingRequest33.quantity();
        boolean boolean36 = pricingRequest33.firstOrder();
        java.lang.String str37 = pricingRequest33.couponCode();
        double double38 = pricingRequest33.basePrice();
        boolean boolean39 = pricingRequest25.equals((java.lang.Object) double38);
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 35.0d + "'", double38 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        boolean boolean10 = pricingRequest7.firstOrder();
        double double11 = pricingRequest7.basePrice();
        int int12 = pricingRequest7.loyaltyPoints();
        java.lang.Class<?> wildcardClass13 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + customerType30 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType30.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType6, true, "hi!", true, (int) (short) -1);
        boolean boolean12 = pricingRequest11.seasonalSale();
        int int13 = pricingRequest11.quantity();
        double double14 = pricingRequest11.basePrice();
        boolean boolean15 = pricingRequest11.firstOrder();
        int int16 = pricingRequest11.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 10, 1, customerType17, false, "PricingRequest[basePrice=-1.0, quantity=97, customerType=null, seasonalSale=false, couponCode=PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=97]", false, (int) (byte) 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, (int) (byte) 1, customerType17, true, "hi!", true, 0);
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean9 = pricingRequest7.equals((java.lang.Object) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType12, true, "hi!", true, (int) (short) -1);
        boolean boolean18 = pricingRequest17.seasonalSale();
        boolean boolean20 = pricingRequest17.equals((java.lang.Object) 100.0d);
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = pricingRequest17.customerType();
        java.lang.String str22 = pricingRequest17.toString();
        boolean boolean23 = pricingRequest7.equals((java.lang.Object) pricingRequest17);
        int int24 = pricingRequest7.loyaltyPoints();
        int int25 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + customerType21 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType21.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str22, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        int int10 = pricingRequest9.quantity();
        int int11 = pricingRequest9.quantity();
        java.lang.String str12 = pricingRequest9.toString();
        int int13 = pricingRequest9.loyaltyPoints();
        java.lang.String str14 = pricingRequest9.toString();
        boolean boolean15 = pricingRequest9.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest9.customerType();
        int int17 = pricingRequest9.quantity();
        int int18 = pricingRequest9.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest(1336.59d, (int) (short) 1, customerType19, false, "hi!", true, 35);
        java.lang.String str25 = pricingRequest24.couponCode();
        int int26 = pricingRequest24.quantity();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str14, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        boolean boolean10 = pricingRequest9.seasonalSale();
        boolean boolean12 = pricingRequest9.equals((java.lang.Object) 100.0d);
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) (byte) 1, customerType13, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", true, (int) (byte) 100);
        boolean boolean19 = pricingRequest18.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
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
        java.lang.Object obj19 = null;
        boolean boolean20 = pricingRequest7.equals(obj19);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
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
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest75 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (short) 100, customerType70, false, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100]", true, (int) (short) 1);
        double double76 = pricingEngine0.calculateFinalPrice(pricingRequest75);
        com.viktor.lab4.PricingEngine.CustomerType customerType79 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest84 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType79, true, "hi!", true, (int) (short) -1);
        java.lang.String str85 = pricingRequest84.couponCode();
        double double86 = pricingRequest84.basePrice();
        boolean boolean88 = pricingRequest84.equals((java.lang.Object) false);
        java.lang.String str89 = pricingRequest84.couponCode();
        double double90 = pricingRequest84.basePrice();
        boolean boolean91 = pricingRequest84.firstOrder();
        // The following exception was thrown during execution in test generation
        try {
            double double92 = pricingEngine0.calculateFinalPrice(pricingRequest84);
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
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 7.99d + "'", double76 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType79 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType79.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "hi!" + "'", str85, "hi!");
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 35.0d + "'", double86 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "hi!" + "'", str89, "hi!");
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 35.0d + "'", double90 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean10 = pricingRequest7.equals((java.lang.Object) 100.0d);
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        double double12 = pricingRequest7.basePrice();
        int int13 = pricingRequest7.loyaltyPoints();
        int int14 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean10 = pricingRequest7.equals((java.lang.Object) 100.0d);
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        boolean boolean12 = pricingRequest7.seasonalSale();
        int int13 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType16, true, "hi!", true, (int) (short) -1);
        boolean boolean22 = pricingRequest21.seasonalSale();
        boolean boolean24 = pricingRequest21.equals((java.lang.Object) 100.0d);
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = pricingRequest21.customerType();
        double double26 = pricingRequest21.basePrice();
        int int27 = pricingRequest21.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = pricingRequest21.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType29 = pricingRequest21.customerType();
        boolean boolean30 = pricingRequest7.equals((java.lang.Object) pricingRequest21);
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 35.0d + "'", double26 == 35.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType29 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType29.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.firstOrder();
        boolean boolean10 = pricingRequest7.firstOrder();
        boolean boolean12 = pricingRequest7.equals((java.lang.Object) 1L);
        java.lang.String str13 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest7.customerType();
        java.lang.String str15 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType18, true, "hi!", true, (int) (short) -1);
        int int24 = pricingRequest23.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType27, true, "hi!", true, (int) (short) -1);
        java.lang.String str33 = pricingRequest32.couponCode();
        java.lang.String str34 = pricingRequest32.toString();
        boolean boolean35 = pricingRequest23.equals((java.lang.Object) str34);
        com.viktor.lab4.PricingEngine.CustomerType customerType36 = pricingRequest23.customerType();
        double double37 = pricingRequest23.basePrice();
        double double38 = pricingRequest23.basePrice();
        boolean boolean39 = pricingRequest23.seasonalSale();
        boolean boolean40 = pricingRequest7.equals((java.lang.Object) boolean39);
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str13, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str15, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + customerType27 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType27.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str34, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + customerType36 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType36.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 35.0d + "'", double37 == 35.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 35.0d + "'", double38 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, 0, customerType4, false, "", true, (int) (byte) 100);
        int int10 = pricingRequest9.loyaltyPoints();
        double double11 = pricingRequest9.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (int) '4', customerType14, true, "hi!", true, (int) (short) 0);
        boolean boolean20 = pricingRequest19.seasonalSale();
        java.lang.String str21 = pricingRequest19.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType24, true, "hi!", true, (int) (short) -1);
        boolean boolean31 = pricingRequest29.equals((java.lang.Object) 10);
        double double32 = pricingRequest29.basePrice();
        java.lang.String str33 = pricingRequest29.couponCode();
        boolean boolean34 = pricingRequest29.firstOrder();
        boolean boolean35 = pricingRequest19.equals((java.lang.Object) boolean34);
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PricingRequest[basePrice=97.0, quantity=52, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str21, "PricingRequest[basePrice=97.0, quantity=52, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + customerType24 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType24.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 35.0d + "'", double32 == 35.0d);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
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
        java.lang.String str17 = pricingRequest7.toString();
        boolean boolean18 = pricingRequest7.seasonalSale();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str17, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
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
        boolean boolean35 = pricingRequest32.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType33 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType33.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
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
        java.lang.String str27 = pricingRequest7.couponCode();
        boolean boolean28 = pricingRequest7.seasonalSale();
        java.lang.String str29 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType32 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest37 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType32, true, "hi!", true, (int) (short) -1);
        java.lang.String str38 = pricingRequest37.couponCode();
        java.lang.String str39 = pricingRequest37.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = pricingRequest37.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType43 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest48 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType43, true, "hi!", true, (int) (short) -1);
        boolean boolean49 = pricingRequest48.seasonalSale();
        int int50 = pricingRequest48.quantity();
        double double51 = pricingRequest48.basePrice();
        boolean boolean52 = pricingRequest48.seasonalSale();
        boolean boolean53 = pricingRequest48.seasonalSale();
        boolean boolean54 = pricingRequest37.equals((java.lang.Object) pricingRequest48);
        int int55 = pricingRequest37.quantity();
        java.lang.String str56 = pricingRequest37.toString();
        boolean boolean57 = pricingRequest37.seasonalSale();
        java.lang.String str58 = pricingRequest37.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType59 = pricingRequest37.customerType();
        boolean boolean60 = pricingRequest7.equals((java.lang.Object) customerType59);
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + customerType32 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType32.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str39, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType43 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType43.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 35.0d + "'", double51 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str56, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str58, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType59 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType59.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
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
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest39 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType34, true, "hi!", true, (int) (short) -1);
        int int40 = pricingRequest39.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType43 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest48 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType43, true, "hi!", true, (int) (short) -1);
        java.lang.String str49 = pricingRequest48.couponCode();
        java.lang.String str50 = pricingRequest48.toString();
        boolean boolean51 = pricingRequest39.equals((java.lang.Object) str50);
        com.viktor.lab4.PricingEngine.CustomerType customerType52 = pricingRequest39.customerType();
        int int53 = pricingRequest39.loyaltyPoints();
        boolean boolean54 = pricingRequest25.equals((java.lang.Object) pricingRequest39);
        int int55 = pricingRequest39.quantity();
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
        org.junit.Assert.assertTrue("'" + customerType34 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType34.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + customerType43 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType43.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str50, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + customerType52 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType52.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
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
        java.lang.String str35 = pricingRequest33.couponCode();
        double double36 = pricingRequest33.basePrice();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-1.0d) + "'", double36 == (-1.0d));
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType6, true, "hi!", true, (int) (short) -1);
        int int12 = pricingRequest11.quantity();
        int int13 = pricingRequest11.quantity();
        int int14 = pricingRequest11.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) '#', customerType15, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest(7.99d, (int) (short) 0, customerType15, true, "hi!", false, (int) (byte) 100);
        java.lang.String str26 = pricingRequest25.toString();
        int int27 = pricingRequest25.loyaltyPoints();
        double double28 = pricingRequest25.basePrice();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PricingRequest[basePrice=7.99, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=100]" + "'", str26, "PricingRequest[basePrice=7.99, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=100]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 7.99d + "'", double28 == 7.99d);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean10 = pricingRequest7.equals((java.lang.Object) 100.0d);
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        java.lang.String str12 = pricingRequest7.toString();
        java.lang.String str13 = pricingRequest7.couponCode();
        java.lang.String str14 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        int int10 = pricingRequest9.quantity();
        int int11 = pricingRequest9.quantity();
        java.lang.String str12 = pricingRequest9.toString();
        java.lang.String str13 = pricingRequest9.toString();
        int int14 = pricingRequest9.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), 97, customerType15, true, "PricingRequest[basePrice=-1.0, quantity=97, customerType=null, seasonalSale=false, couponCode=PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=97]", false, (-1));
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str13, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType11, true, "hi!", true, (int) (short) -1);
        java.lang.String str17 = pricingRequest16.couponCode();
        java.lang.String str18 = pricingRequest16.toString();
        boolean boolean19 = pricingRequest7.equals((java.lang.Object) str18);
        double double20 = pricingRequest7.basePrice();
        java.lang.Class<?> wildcardClass21 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str18, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 35.0d + "'", double20 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        double double10 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest7.customerType();
        boolean boolean13 = pricingRequest7.firstOrder();
        java.lang.Class<?> wildcardClass14 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) ' ', customerType2, false, "", true, 35);
        java.lang.String str8 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.quantity();
        int int9 = pricingRequest7.quantity();
        int int10 = pricingRequest7.quantity();
        int int11 = pricingRequest7.quantity();
        boolean boolean12 = pricingRequest7.seasonalSale();
        double double13 = pricingRequest7.basePrice();
        double double14 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
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
        int int17 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        java.lang.String str8 = pricingRequest7.couponCode();
        int int9 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        java.lang.Class<?> wildcardClass11 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.quantity();
        int int9 = pricingRequest7.quantity();
        java.lang.String str10 = pricingRequest7.toString();
        int int11 = pricingRequest7.loyaltyPoints();
        java.lang.String str12 = pricingRequest7.toString();
        boolean boolean13 = pricingRequest7.firstOrder();
        boolean boolean14 = pricingRequest7.firstOrder();
        double double15 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str10, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 35.0d + "'", double15 == 35.0d);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.quantity();
        int int9 = pricingRequest7.quantity();
        java.lang.String str10 = pricingRequest7.toString();
        int int11 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest7.customerType();
        java.lang.String str13 = pricingRequest7.couponCode();
        int int14 = pricingRequest7.quantity();
        int int15 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str10, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.loyaltyPoints();
        int int9 = pricingRequest7.loyaltyPoints();
        int int10 = pricingRequest7.loyaltyPoints();
        java.lang.String str11 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str11, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType6, true, "hi!", true, (int) (short) -1);
        boolean boolean12 = pricingRequest11.seasonalSale();
        boolean boolean14 = pricingRequest11.equals((java.lang.Object) 100.0d);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, 0, customerType15, true, "hi!", true, (int) (byte) 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 97, (int) (byte) 10, customerType15, true, "PricingRequest[basePrice=10.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=100.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=100], firstOrder=false, loyaltyPoints=100]", false, (int) '#');
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        java.lang.String str8 = pricingRequest7.couponCode();
        double double9 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        int int11 = pricingRequest7.loyaltyPoints();
        double double12 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType6, true, "hi!", true, (int) (short) -1);
        boolean boolean12 = pricingRequest11.seasonalSale();
        boolean boolean14 = pricingRequest11.equals((java.lang.Object) 100.0d);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, 0, customerType15, true, "hi!", true, (int) (byte) 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) (byte) 1, customerType15, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", true, (int) 'a');
        boolean boolean26 = pricingRequest25.firstOrder();
        double double27 = pricingRequest25.basePrice();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, 0, customerType4, true, "hi!", true, 100);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest14.customerType();
        double double16 = pricingRequest14.basePrice();
        java.lang.String str17 = pricingRequest14.couponCode();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        boolean boolean10 = pricingRequest9.seasonalSale();
        boolean boolean12 = pricingRequest9.equals((java.lang.Object) 100.0d);
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest9.customerType();
        double double14 = pricingRequest9.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, 0, customerType15, false, "PricingRequest[basePrice=100.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=100]", true, 0);
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
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
        int int77 = pricingRequest75.quantity();
        boolean boolean78 = pricingRequest75.seasonalSale();
        java.lang.String str79 = pricingRequest75.toString();
        java.lang.String str80 = pricingRequest75.toString();
        java.lang.String str81 = pricingRequest75.toString();
        // The following exception was thrown during execution in test generation
        try {
            double double82 = pricingEngine0.calculateFinalPrice(pricingRequest75);
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
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str79, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str80, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str81, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        boolean boolean10 = pricingRequest9.seasonalSale();
        boolean boolean11 = pricingRequest9.firstOrder();
        double double12 = pricingRequest9.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, 1, customerType13, false, "hi!", false, (int) (byte) 100);
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = pricingRequest18.customerType();
        java.lang.String str20 = pricingRequest18.toString();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=100]" + "'", str20, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=100]");
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
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
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean9 = pricingRequest7.equals((java.lang.Object) 10);
        double double10 = pricingRequest7.basePrice();
        java.lang.String str11 = pricingRequest7.couponCode();
        java.lang.String str12 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.quantity();
        int int9 = pricingRequest7.quantity();
        int int10 = pricingRequest7.quantity();
        int int11 = pricingRequest7.quantity();
        java.lang.String str12 = pricingRequest7.couponCode();
        int int13 = pricingRequest7.quantity();
        boolean boolean14 = pricingRequest7.seasonalSale();
        java.lang.String str15 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str15, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
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
        double double17 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str13, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 35.0d + "'", double17 == 35.0d);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
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
        com.viktor.lab4.PricingEngine.CustomerType customerType71 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest76 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType71, true, "hi!", true, (int) (short) -1);
        boolean boolean77 = pricingRequest76.seasonalSale();
        boolean boolean78 = pricingRequest76.firstOrder();
        boolean boolean79 = pricingRequest76.firstOrder();
        boolean boolean80 = pricingRequest76.firstOrder();
        // The following exception was thrown during execution in test generation
        try {
            double double81 = pricingEngine0.calculateFinalPrice(pricingRequest76);
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
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 1336.59d + "'", double68 == 1336.59d);
        org.junit.Assert.assertTrue("'" + customerType71 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType71.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.quantity();
        int int9 = pricingRequest7.quantity();
        int int10 = pricingRequest7.quantity();
        int int11 = pricingRequest7.loyaltyPoints();
        boolean boolean12 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType17, true, "hi!", true, (int) (short) -1);
        java.lang.String str23 = pricingRequest22.couponCode();
        int int24 = pricingRequest22.loyaltyPoints();
        java.lang.String str25 = pricingRequest22.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = pricingRequest22.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) '#', customerType26, true, "", false, (int) 'a');
        boolean boolean32 = pricingRequest7.equals((java.lang.Object) false);
        java.lang.String str33 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + customerType26 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType26.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        boolean boolean10 = pricingRequest9.seasonalSale();
        boolean boolean12 = pricingRequest9.equals((java.lang.Object) 100.0d);
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) (byte) 1, customerType13, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", true, (int) (byte) 100);
        java.lang.Class<?> wildcardClass19 = customerType13.getClass();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
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
        com.viktor.lab4.PricingEngine.CustomerType customerType33 = pricingRequest28.customerType();
        java.lang.Object obj34 = null;
        boolean boolean35 = pricingRequest28.equals(obj34);
        java.lang.String str36 = pricingRequest28.couponCode();
        boolean boolean37 = pricingRequest28.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType38 = pricingRequest28.customerType();
        // The following exception was thrown during execution in test generation
        try {
            double double39 = pricingEngine0.calculateFinalPrice(pricingRequest28);
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
        org.junit.Assert.assertTrue("'" + customerType33 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType33.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + customerType38 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType38.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.loyaltyPoints();
        int int10 = pricingRequest7.loyaltyPoints();
        java.lang.String str11 = pricingRequest7.couponCode();
        double double12 = pricingRequest7.basePrice();
        java.lang.Class<?> wildcardClass13 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, 0, customerType4, false, "", true, (int) (byte) 100);
        int int10 = pricingRequest9.loyaltyPoints();
        double double11 = pricingRequest9.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest(15.29d, 100, customerType13, true, "PricingRequest[basePrice=52.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100], firstOrder=true, loyaltyPoints=0]", true, (int) (byte) 0);
        java.lang.String str19 = pricingRequest18.toString();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PricingRequest[basePrice=15.29, quantity=100, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=52.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100], firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=0]" + "'", str19, "PricingRequest[basePrice=15.29, quantity=100, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=52.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100], firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=0]");
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType6, true, "hi!", true, (int) (short) -1);
        boolean boolean12 = pricingRequest11.seasonalSale();
        boolean boolean13 = pricingRequest11.firstOrder();
        int int14 = pricingRequest11.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest11.customerType();
        double double17 = pricingRequest11.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType18, true, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=100]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (-1), customerType18, false, "PricingRequest[basePrice=0.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=52]", false, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 35.0d + "'", double17 == 35.0d);
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        boolean boolean10 = pricingRequest9.seasonalSale();
        boolean boolean11 = pricingRequest9.firstOrder();
        int int12 = pricingRequest9.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest9.customerType();
        double double15 = pricingRequest9.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) 'a', customerType16, true, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=100]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType24, true, "hi!", true, (int) (short) -1);
        java.lang.String str30 = pricingRequest29.couponCode();
        java.lang.String str31 = pricingRequest29.toString();
        boolean boolean32 = pricingRequest29.seasonalSale();
        boolean boolean34 = pricingRequest29.equals((java.lang.Object) 7.99d);
        boolean boolean35 = pricingRequest21.equals((java.lang.Object) 7.99d);
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 35.0d + "'", double15 == 35.0d);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType24 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType24.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str31, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, 0, customerType4, true, "hi!", true, 100);
        int int15 = pricingRequest14.loyaltyPoints();
        boolean boolean16 = pricingRequest14.seasonalSale();
        java.lang.Class<?> wildcardClass17 = pricingRequest14.getClass();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean9 = pricingRequest7.equals((java.lang.Object) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType12, true, "hi!", true, (int) (short) -1);
        boolean boolean18 = pricingRequest17.seasonalSale();
        boolean boolean20 = pricingRequest17.equals((java.lang.Object) 100.0d);
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = pricingRequest17.customerType();
        java.lang.String str22 = pricingRequest17.toString();
        boolean boolean23 = pricingRequest7.equals((java.lang.Object) pricingRequest17);
        int int24 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + customerType21 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType21.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str22, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.quantity();
        int int9 = pricingRequest7.quantity();
        java.lang.String str10 = pricingRequest7.toString();
        int int11 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str10, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
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
        double double28 = pricingRequest7.basePrice();
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
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 35.0d + "'", double28 == 35.0d);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, 0, customerType2, false, "", true, (int) (byte) 100);
        boolean boolean8 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + customerType9 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType9.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, 0, customerType2, false, "", true, (int) (byte) 100);
        int int8 = pricingRequest7.loyaltyPoints();
        double double9 = pricingRequest7.basePrice();
        boolean boolean10 = pricingRequest7.seasonalSale();
        boolean boolean11 = pricingRequest7.firstOrder();
        boolean boolean12 = pricingRequest7.firstOrder();
        int int13 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
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
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType6, true, "hi!", true, (int) (short) -1);
        int int12 = pricingRequest11.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, 100, customerType13, false, "", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, 10, customerType13, false, "", true, 1);
        double double24 = pricingRequest23.basePrice();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        int int10 = pricingRequest9.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, 100, customerType11, false, "", true, (int) (short) -1);
        int int17 = pricingRequest16.quantity();
        int int18 = pricingRequest16.loyaltyPoints();
        java.lang.String str19 = pricingRequest16.toString();
        java.lang.Class<?> wildcardClass20 = pricingRequest16.getClass();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PricingRequest[basePrice=0.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str19, "PricingRequest[basePrice=0.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType8, true, "hi!", true, (int) (short) -1);
        boolean boolean14 = pricingRequest13.seasonalSale();
        boolean boolean16 = pricingRequest13.equals((java.lang.Object) 100.0d);
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest13.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, 0, customerType17, true, "hi!", true, (int) (byte) 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) (byte) 1, customerType17, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", true, (int) 'a');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) (byte) 10, customerType17, true, "PricingRequest[basePrice=52.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100], firstOrder=true, loyaltyPoints=0]", false, (int) (byte) 1);
        double double33 = pricingRequest32.basePrice();
        java.lang.Class<?> wildcardClass34 = pricingRequest32.getClass();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-1.0d) + "'", double33 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean10 = pricingRequest7.equals((java.lang.Object) 100.0d);
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        java.lang.String str12 = pricingRequest7.toString();
        java.lang.String str13 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str13, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        java.lang.String str8 = pricingRequest7.couponCode();
        java.lang.String str9 = pricingRequest7.toString();
        java.lang.Object obj10 = null;
        boolean boolean11 = pricingRequest7.equals(obj10);
        java.lang.String str12 = pricingRequest7.toString();
        java.lang.String str13 = pricingRequest7.couponCode();
        java.lang.String str14 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str9, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        java.lang.String str10 = pricingRequest9.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest9.customerType();
        boolean boolean12 = pricingRequest9.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest(7.99d, (int) (byte) 0, customerType13, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", true, (int) '4');
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
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
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = pricingRequest7.customerType();
        boolean boolean24 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str18, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 35.0d + "'", double21 == 35.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 35.0d + "'", double22 == 35.0d);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
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
        int int53 = pricingRequest52.quantity();
        int int54 = pricingRequest52.quantity();
        int int55 = pricingRequest52.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType56 = pricingRequest52.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest61 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) '#', customerType56, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest66 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) 1, customerType56, false, "hi!", true, 1);
        int int67 = pricingRequest66.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType72 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest77 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType72, true, "hi!", true, (int) (short) -1);
        int int78 = pricingRequest77.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType79 = pricingRequest77.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest84 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, 100, customerType79, false, "", true, (int) (short) -1);
        int int85 = pricingRequest84.quantity();
        int int86 = pricingRequest84.loyaltyPoints();
        boolean boolean87 = pricingRequest66.equals((java.lang.Object) int86);
        double double88 = pricingEngine0.calculateFinalPrice(pricingRequest66);
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
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + customerType56 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType56.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertTrue("'" + customerType72 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType72.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + customerType79 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType79.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 100 + "'", int85 == 100);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 7.99d + "'", double88 == 7.99d);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
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
        java.lang.Class<?> wildcardClass30 = pricingRequest7.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        java.lang.String str8 = pricingRequest7.couponCode();
        double double9 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        boolean boolean12 = pricingRequest7.equals((java.lang.Object) 100L);
        boolean boolean13 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        java.lang.String str8 = pricingRequest7.couponCode();
        int int9 = pricingRequest7.loyaltyPoints();
        java.lang.String str10 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        boolean boolean12 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType11, true, "hi!", true, (int) (short) -1);
        java.lang.String str17 = pricingRequest16.couponCode();
        java.lang.String str18 = pricingRequest16.toString();
        boolean boolean19 = pricingRequest7.equals((java.lang.Object) str18);
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = pricingRequest7.customerType();
        int int21 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str18, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType8, true, "hi!", true, (int) (short) -1);
        java.lang.String str14 = pricingRequest13.couponCode();
        java.lang.String str15 = pricingRequest13.toString();
        boolean boolean16 = pricingRequest13.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest13.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, 10, customerType17, false, "", true, (int) (byte) 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 97, (-1), customerType17, true, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]", false, (int) 'a');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1), (int) 'a', customerType17, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=100]", true, (-1));
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str15, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        boolean boolean10 = pricingRequest9.seasonalSale();
        boolean boolean12 = pricingRequest9.equals((java.lang.Object) 100.0d);
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest9.customerType();
        java.lang.String str14 = pricingRequest9.toString();
        java.lang.String str15 = pricingRequest9.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, 10, customerType16, false, "hi!", true, (int) 'a');
        int int22 = pricingRequest21.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType27, true, "hi!", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest37 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, 0, customerType27, true, "hi!", true, 100);
        int int38 = pricingRequest37.loyaltyPoints();
        java.lang.String str39 = pricingRequest37.couponCode();
        boolean boolean40 = pricingRequest37.firstOrder();
        int int41 = pricingRequest37.loyaltyPoints();
        boolean boolean42 = pricingRequest21.equals((java.lang.Object) int41);
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str14, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + customerType27 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType27.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.quantity();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.firstOrder();
        java.lang.String str12 = pricingRequest7.toString();
        java.lang.String str13 = pricingRequest7.toString();
        double double14 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str13, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType6, true, "hi!", true, (int) (short) -1);
        boolean boolean12 = pricingRequest11.seasonalSale();
        boolean boolean14 = pricingRequest11.equals((java.lang.Object) 100.0d);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, 0, customerType15, true, "hi!", true, (int) (byte) 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) (byte) 10, customerType15, true, "PricingRequest[basePrice=52.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100], firstOrder=true, loyaltyPoints=0]", false, 0);
        java.lang.Class<?> wildcardClass26 = customerType15.getClass();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean10 = pricingRequest7.equals((java.lang.Object) 100.0d);
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        java.lang.String str12 = pricingRequest7.toString();
        java.lang.String str13 = pricingRequest7.couponCode();
        double double14 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType19, true, "hi!", true, (int) (short) -1);
        boolean boolean25 = pricingRequest24.seasonalSale();
        int int26 = pricingRequest24.quantity();
        int int27 = pricingRequest24.quantity();
        java.lang.String str28 = pricingRequest24.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType29 = pricingRequest24.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest34 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, 100, customerType29, false, "PricingRequest[basePrice=0.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1]", false, (int) (short) 100);
        boolean boolean35 = pricingRequest7.equals((java.lang.Object) customerType29);
        java.lang.Class<?> wildcardClass36 = customerType29.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + customerType29 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType29.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, 0, customerType4, false, "", true, (int) (byte) 100);
        int int10 = pricingRequest9.loyaltyPoints();
        double double11 = pricingRequest9.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, 0, customerType14, true, "", false, 0);
        int int20 = pricingRequest19.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType6, true, "hi!", true, (int) (short) -1);
        int int12 = pricingRequest11.quantity();
        int int13 = pricingRequest11.quantity();
        int int14 = pricingRequest11.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) '#', customerType15, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) '#');
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = pricingRequest20.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest26 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, (int) (short) 10, customerType21, true, "PricingRequest[basePrice=52.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100], firstOrder=true, loyaltyPoints=0]", false, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType21 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType21.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
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
        com.viktor.lab4.PricingEngine.CustomerType customerType39 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest44 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType39, true, "hi!", true, (int) (short) -1);
        int int45 = pricingRequest44.quantity();
        int int46 = pricingRequest44.quantity();
        int int47 = pricingRequest44.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType48 = pricingRequest44.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest53 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '4', (int) ' ', customerType48, false, "hi!", false, (int) '#');
        double double54 = pricingRequest53.basePrice();
        boolean boolean55 = pricingRequest53.seasonalSale();
        boolean boolean56 = pricingRequest33.equals((java.lang.Object) boolean55);
        java.lang.String str57 = pricingRequest33.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType60 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest65 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType60, true, "hi!", true, (int) (short) -1);
        int int66 = pricingRequest65.loyaltyPoints();
        int int67 = pricingRequest65.loyaltyPoints();
        java.lang.String str68 = pricingRequest65.toString();
        boolean boolean69 = pricingRequest33.equals((java.lang.Object) pricingRequest65);
        boolean boolean70 = pricingRequest65.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + customerType39 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType39.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + customerType48 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType48.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 52.0d + "'", double54 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "PricingRequest[basePrice=-1.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str57, "PricingRequest[basePrice=-1.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType60 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType60.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str68, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType10, true, "hi!", true, (int) (short) -1);
        int int16 = pricingRequest15.quantity();
        int int17 = pricingRequest15.quantity();
        int int18 = pricingRequest15.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = pricingRequest15.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) '#', customerType19, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) 10, customerType19, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest34 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1), (int) (short) 1, customerType19, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1]", true, (int) (byte) 100);
        com.viktor.lab4.PricingEngine.CustomerType customerType35 = pricingRequest34.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest40 = new com.viktor.lab4.PricingEngine.PricingRequest((-1.0d), (int) '#', customerType35, true, "PricingRequest[basePrice=-1.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]", true, 32);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType35 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType35.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
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
        boolean boolean18 = pricingRequest7.firstOrder();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
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
        double double17 = pricingRequest7.basePrice();
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 35.0d + "'", double17 == 35.0d);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, 0, customerType4, true, "hi!", true, 100);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest14.customerType();
        int int16 = pricingRequest14.quantity();
        java.lang.String str17 = pricingRequest14.couponCode();
        boolean boolean18 = pricingRequest14.firstOrder();
        java.lang.String str19 = pricingRequest14.couponCode();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, 0, customerType2, false, "", true, (int) (byte) 100);
        int int8 = pricingRequest7.loyaltyPoints();
        double double9 = pricingRequest7.basePrice();
        boolean boolean10 = pricingRequest7.seasonalSale();
        java.lang.String str11 = pricingRequest7.couponCode();
        java.lang.String str12 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType15, true, "hi!", true, (int) (short) -1);
        boolean boolean21 = pricingRequest20.seasonalSale();
        boolean boolean22 = pricingRequest20.firstOrder();
        int int23 = pricingRequest20.loyaltyPoints();
        java.lang.String str24 = pricingRequest20.toString();
        boolean boolean25 = pricingRequest20.seasonalSale();
        java.lang.String str26 = pricingRequest20.toString();
        double double27 = pricingRequest20.basePrice();
        boolean boolean28 = pricingRequest20.seasonalSale();
        java.lang.String str29 = pricingRequest20.couponCode();
        boolean boolean30 = pricingRequest7.equals((java.lang.Object) str29);
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str24, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str26, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 35.0d + "'", double27 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
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
        boolean boolean27 = pricingRequest7.seasonalSale();
        java.lang.String str28 = pricingRequest7.toString();
        java.lang.String str29 = pricingRequest7.couponCode();
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str28, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
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
        com.viktor.lab4.PricingEngine.CustomerType customerType32 = pricingRequest28.customerType();
        boolean boolean33 = pricingRequest28.seasonalSale();
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + customerType32 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType32.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        int int8 = pricingRequest7.loyaltyPoints();
        boolean boolean9 = pricingRequest7.seasonalSale();
        int int10 = pricingRequest7.loyaltyPoints();
        java.lang.String str11 = pricingRequest7.couponCode();
        java.lang.String str12 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType6, true, "hi!", true, (int) (short) -1);
        boolean boolean12 = pricingRequest11.seasonalSale();
        boolean boolean13 = pricingRequest11.firstOrder();
        double double14 = pricingRequest11.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, 1, customerType15, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, 97, customerType15, false, "PricingRequest[basePrice=-1.0, quantity=97, customerType=null, seasonalSale=false, couponCode=PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=97]", true, 35);
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        boolean boolean8 = pricingRequest7.seasonalSale();
        int int9 = pricingRequest7.loyaltyPoints();
        boolean boolean10 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        java.lang.String str12 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
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
        java.lang.String str17 = pricingRequest7.couponCode();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType4, true, "hi!", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, 0, customerType4, true, "hi!", true, 100);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest14.customerType();
        java.lang.String str16 = pricingRequest14.toString();
        boolean boolean17 = pricingRequest14.seasonalSale();
        java.lang.String str18 = pricingRequest14.couponCode();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100]" + "'", str16, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
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
        java.lang.String str30 = pricingRequest7.toString();
        boolean boolean31 = pricingRequest7.seasonalSale();
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str30, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType8, true, "hi!", true, (int) (short) -1);
        int int14 = pricingRequest13.quantity();
        int int15 = pricingRequest13.quantity();
        int int16 = pricingRequest13.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest13.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) '#', customerType17, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) 10, customerType17, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) '4', customerType17, false, "", false, 1);
        double double33 = pricingRequest32.basePrice();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType6, true, "hi!", true, (int) (short) -1);
        boolean boolean12 = pricingRequest11.seasonalSale();
        boolean boolean14 = pricingRequest11.equals((java.lang.Object) 100.0d);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, 0, customerType15, true, "hi!", true, (int) (byte) 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) (byte) 1, customerType15, false, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", true, (int) 'a');
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = pricingRequest25.customerType();
        boolean boolean27 = pricingRequest25.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType26 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType26.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) 0, customerType2, true, "hi!", true, (int) (short) -1);
        java.lang.String str8 = pricingRequest7.couponCode();
        int int9 = pricingRequest7.quantity();
        java.lang.String str10 = pricingRequest7.toString();
        java.lang.Class<?> wildcardClass11 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str10, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
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
        java.lang.String str30 = pricingRequest7.toString();
        boolean boolean31 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str9, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str30, "PricingRequest[basePrice=35.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }
}

