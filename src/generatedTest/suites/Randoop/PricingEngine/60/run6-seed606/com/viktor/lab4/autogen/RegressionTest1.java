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
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1), 10, customerType4, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", true, (int) (short) 1);
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 10, customerType10, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", true, (int) '#');
        java.lang.String str16 = pricingRequest15.couponCode();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str16, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        double double8 = pricingRequest7.basePrice();
        boolean boolean9 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        boolean boolean12 = pricingRequest7.equals((java.lang.Object) false);
        java.lang.String str13 = pricingRequest7.couponCode();
        boolean boolean14 = pricingRequest7.firstOrder();
        java.lang.String str15 = pricingRequest7.toString();
        boolean boolean16 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str15, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType2, false, "", true, (int) (byte) 0);
        java.lang.String str8 = pricingRequest7.toString();
        boolean boolean9 = pricingRequest7.seasonalSale();
        java.lang.String str10 = pricingRequest7.toString();
        double double11 = pricingRequest7.basePrice();
        boolean boolean12 = pricingRequest7.seasonalSale();
        boolean boolean13 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str8, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str10, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType2, false, "", true, (int) (byte) 0);
        java.lang.String str8 = pricingRequest7.toString();
        boolean boolean9 = pricingRequest7.seasonalSale();
        int int10 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        int int12 = pricingRequest7.quantity();
        java.lang.String str13 = pricingRequest7.toString();
        int int14 = pricingRequest7.quantity();
        java.lang.String str15 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str8, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str13, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        double double8 = pricingRequest7.basePrice();
        java.lang.String str9 = pricingRequest7.toString();
        int int10 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        java.lang.String str12 = pricingRequest7.toString();
        boolean boolean13 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest7.customerType();
        int int15 = pricingRequest7.quantity();
        int int16 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str9, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(customerType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(customerType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        int int9 = pricingRequest7.quantity();
        java.lang.String str10 = pricingRequest7.toString();
        java.lang.Object obj11 = null;
        boolean boolean12 = pricingRequest7.equals(obj11);
        boolean boolean13 = pricingRequest7.firstOrder();
        java.lang.Class<?> wildcardClass14 = pricingRequest7.getClass();
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str10, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        double double8 = pricingRequest7.basePrice();
        java.lang.String str9 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean11 = pricingRequest7.equals((java.lang.Object) customerType10);
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest7.customerType();
        java.lang.String str13 = pricingRequest7.toString();
        double double14 = pricingRequest7.basePrice();
        boolean boolean15 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest7.customerType();
        java.lang.String str17 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str9, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(customerType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str13, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(customerType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType2, false, "", true, (int) (byte) 0);
        java.lang.String str8 = pricingRequest7.toString();
        boolean boolean9 = pricingRequest7.seasonalSale();
        java.lang.String str10 = pricingRequest7.toString();
        int int11 = pricingRequest7.loyaltyPoints();
        int int12 = pricingRequest7.loyaltyPoints();
        int int13 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType16, false, "", true, (int) (byte) 0);
        int int22 = pricingRequest21.loyaltyPoints();
        int int23 = pricingRequest21.quantity();
        double double24 = pricingRequest21.basePrice();
        int int25 = pricingRequest21.quantity();
        boolean boolean26 = pricingRequest7.equals((java.lang.Object) int25);
        double double27 = pricingRequest7.basePrice();
        double double28 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str8, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str10, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        double double8 = pricingRequest7.basePrice();
        java.lang.String str9 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean11 = pricingRequest7.equals((java.lang.Object) customerType10);
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest7.customerType();
        boolean boolean14 = pricingRequest7.equals((java.lang.Object) 1.0f);
        boolean boolean15 = pricingRequest7.seasonalSale();
        java.lang.String str16 = pricingRequest7.toString();
        double double17 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str9, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(customerType12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str16, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        double double8 = pricingRequest7.basePrice();
        java.lang.String str9 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean11 = pricingRequest7.equals((java.lang.Object) customerType10);
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest7.customerType();
        java.lang.String str13 = pricingRequest7.toString();
        double double14 = pricingRequest7.basePrice();
        boolean boolean15 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest7.customerType();
        boolean boolean17 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str9, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(customerType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str13, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(customerType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        double double8 = pricingRequest7.basePrice();
        boolean boolean9 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        int int11 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType14, true, "hi!", false, (int) (byte) -1);
        double double20 = pricingRequest19.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = pricingRequest19.customerType();
        boolean boolean22 = pricingRequest7.equals((java.lang.Object) pricingRequest19);
        java.lang.String str23 = pricingRequest19.toString();
        int int24 = pricingRequest19.loyaltyPoints();
        java.lang.String str25 = pricingRequest19.toString();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNull(customerType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str23, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str25, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType2, false, "", true, (int) (byte) 0);
        java.lang.String str8 = pricingRequest7.toString();
        java.lang.String str9 = pricingRequest7.couponCode();
        java.lang.String str10 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str8, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str10, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1), 10, customerType6, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", true, (int) (short) 1);
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 10, customerType12, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", true, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType12, true, "", true, (-1));
        boolean boolean23 = pricingRequest22.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType4, false, "", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (short) -1, customerType4, false, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]", false, (int) (byte) 100);
        boolean boolean15 = pricingRequest14.firstOrder();
        int int16 = pricingRequest14.quantity();
        java.lang.Object obj17 = null;
        boolean boolean18 = pricingRequest14.equals(obj17);
        java.lang.String str19 = pricingRequest14.toString();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PricingRequest[basePrice=0.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=100]" + "'", str19, "PricingRequest[basePrice=0.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=100]");
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        double double8 = pricingRequest7.basePrice();
        java.lang.String str9 = pricingRequest7.toString();
        int int10 = pricingRequest7.loyaltyPoints();
        int int11 = pricingRequest7.loyaltyPoints();
        java.lang.String str12 = pricingRequest7.couponCode();
        java.lang.String str13 = pricingRequest7.couponCode();
        int int14 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str9, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType6, false, "", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) (short) 100, customerType6, false, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, (int) (short) 1, customerType6, true, "", true, 1);
        int int22 = pricingRequest21.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType25, true, "hi!", false, (int) (byte) -1);
        double double31 = pricingRequest30.basePrice();
        boolean boolean32 = pricingRequest30.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType33 = pricingRequest30.customerType();
        boolean boolean35 = pricingRequest30.equals((java.lang.Object) false);
        com.viktor.lab4.PricingEngine.CustomerType customerType36 = pricingRequest30.customerType();
        boolean boolean37 = pricingRequest30.seasonalSale();
        java.lang.String str38 = pricingRequest30.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType41 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest46 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType41, false, "", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType47 = pricingRequest46.customerType();
        boolean boolean48 = pricingRequest30.equals((java.lang.Object) customerType47);
        boolean boolean49 = pricingRequest21.equals((java.lang.Object) pricingRequest30);
        boolean boolean50 = pricingRequest21.seasonalSale();
        double double51 = pricingRequest21.basePrice();
        int int52 = pricingRequest21.loyaltyPoints();
        java.lang.String str53 = pricingRequest21.couponCode();
        java.lang.String str54 = pricingRequest21.couponCode();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(customerType33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(customerType36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str38, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType41 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType41.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType47 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType47.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 1.0d + "'", double51 == 1.0d);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType6, false, "", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (short) -1, customerType6, false, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]", false, (int) (byte) 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (byte) -1, customerType6, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", true, 97);
        java.lang.String str22 = pricingRequest21.couponCode();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str22, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        double double8 = pricingRequest7.basePrice();
        java.lang.String str9 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean11 = pricingRequest7.equals((java.lang.Object) customerType10);
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest7.customerType();
        java.lang.String str13 = pricingRequest7.couponCode();
        boolean boolean14 = pricingRequest7.firstOrder();
        boolean boolean15 = pricingRequest7.firstOrder();
        java.lang.String str16 = pricingRequest7.toString();
        double double17 = pricingRequest7.basePrice();
        java.lang.Class<?> wildcardClass18 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str9, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(customerType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str16, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        double double8 = pricingRequest7.basePrice();
        java.lang.String str9 = pricingRequest7.toString();
        int int10 = pricingRequest7.loyaltyPoints();
        double double11 = pricingRequest7.basePrice();
        double double12 = pricingRequest7.basePrice();
        boolean boolean13 = pricingRequest7.firstOrder();
        boolean boolean14 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str9, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType4, false, "", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (short) -1, customerType4, false, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]", false, (int) (byte) 100);
        boolean boolean15 = pricingRequest14.seasonalSale();
        double double16 = pricingRequest14.basePrice();
        boolean boolean17 = pricingRequest14.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType20, false, "", true, (int) (byte) 0);
        java.lang.String str26 = pricingRequest25.toString();
        boolean boolean27 = pricingRequest25.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType30 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType30, false, "", true, (int) (byte) 0);
        int int36 = pricingRequest35.loyaltyPoints();
        int int37 = pricingRequest35.loyaltyPoints();
        boolean boolean38 = pricingRequest25.equals((java.lang.Object) int37);
        boolean boolean39 = pricingRequest25.firstOrder();
        boolean boolean40 = pricingRequest14.equals((java.lang.Object) pricingRequest25);
        double double41 = pricingRequest25.basePrice();
        boolean boolean42 = pricingRequest25.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str26, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + customerType30 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType30.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        int int8 = pricingRequest7.loyaltyPoints();
        int int9 = pricingRequest7.quantity();
        int int10 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType14, true, "hi!", false, (int) (byte) -1);
        double double20 = pricingRequest19.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = pricingRequest19.customerType();
        boolean boolean22 = pricingRequest7.equals((java.lang.Object) pricingRequest19);
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType25, true, "hi!", false, (int) (byte) -1);
        double double31 = pricingRequest30.basePrice();
        boolean boolean32 = pricingRequest30.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType33 = pricingRequest30.customerType();
        int int34 = pricingRequest30.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType37 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest42 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType37, true, "hi!", false, (int) (byte) -1);
        double double43 = pricingRequest42.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType44 = pricingRequest42.customerType();
        boolean boolean45 = pricingRequest30.equals((java.lang.Object) pricingRequest42);
        java.lang.String str46 = pricingRequest42.toString();
        double double47 = pricingRequest42.basePrice();
        boolean boolean48 = pricingRequest19.equals((java.lang.Object) pricingRequest42);
        java.lang.String str49 = pricingRequest19.toString();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(customerType11);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNull(customerType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(customerType33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 10.0d + "'", double43 == 10.0d);
        org.junit.Assert.assertNull(customerType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str46, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 10.0d + "'", double47 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str49, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        boolean boolean8 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType11, true, "hi!", false, (int) (byte) -1);
        double double17 = pricingRequest16.basePrice();
        java.lang.String str18 = pricingRequest16.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean20 = pricingRequest16.equals((java.lang.Object) customerType19);
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = pricingRequest16.customerType();
        boolean boolean22 = pricingRequest16.seasonalSale();
        boolean boolean23 = pricingRequest7.equals((java.lang.Object) boolean22);
        double double24 = pricingRequest7.basePrice();
        double double25 = pricingRequest7.basePrice();
        double double26 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str18, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(customerType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType8, false, "", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) (short) 100, customerType8, false, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, (int) (short) 1, customerType8, true, "", true, 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, (int) (short) 100, customerType8, false, "hi!", true, (int) (short) -1);
        boolean boolean30 = pricingRequest28.equals((java.lang.Object) 1);
        boolean boolean31 = pricingRequest28.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest39 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType34, true, "hi!", false, (int) (byte) -1);
        double double40 = pricingRequest39.basePrice();
        boolean boolean41 = pricingRequest39.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType42 = pricingRequest39.customerType();
        boolean boolean44 = pricingRequest39.equals((java.lang.Object) false);
        com.viktor.lab4.PricingEngine.CustomerType customerType45 = pricingRequest39.customerType();
        boolean boolean46 = pricingRequest39.seasonalSale();
        java.lang.String str47 = pricingRequest39.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType50 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest55 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType50, false, "", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType56 = pricingRequest55.customerType();
        boolean boolean57 = pricingRequest39.equals((java.lang.Object) customerType56);
        boolean boolean58 = pricingRequest39.seasonalSale();
        boolean boolean59 = pricingRequest28.equals((java.lang.Object) boolean58);
        java.lang.String str60 = pricingRequest28.toString();
        java.lang.String str61 = pricingRequest28.couponCode();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(customerType42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(customerType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str47, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType50 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType50.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType56 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType56.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "PricingRequest[basePrice=100.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str60, "PricingRequest[basePrice=100.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType6, true, "hi!", false, (int) (byte) -1);
        double double12 = pricingRequest11.basePrice();
        boolean boolean13 = pricingRequest11.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest11.customerType();
        boolean boolean16 = pricingRequest11.equals((java.lang.Object) false);
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest11.customerType();
        boolean boolean18 = pricingRequest11.seasonalSale();
        java.lang.String str19 = pricingRequest11.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType22, false, "", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = pricingRequest27.customerType();
        boolean boolean29 = pricingRequest11.equals((java.lang.Object) customerType28);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest34 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, (int) (short) 1, customerType28, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", true, 97);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest39 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, 97, customerType28, true, "PricingRequest[basePrice=-1.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=1]", false, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(customerType14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(customerType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str19, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine pricingEngine1 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType6, true, "hi!", false, (int) (byte) -1);
        double double12 = pricingRequest11.basePrice();
        java.lang.String str13 = pricingRequest11.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean15 = pricingRequest11.equals((java.lang.Object) customerType14);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (byte) 100, customerType14, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", false, (int) 'a');
        double double21 = pricingEngine1.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType24, false, "", true, (int) (byte) 0);
        java.lang.String str30 = pricingRequest29.toString();
        boolean boolean31 = pricingRequest29.seasonalSale();
        java.lang.String str32 = pricingRequest29.toString();
        double double33 = pricingRequest29.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest45 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType40, false, "", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest50 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) (short) 100, customerType40, false, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest55 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, (int) (short) 1, customerType40, true, "", true, 1);
        boolean boolean56 = pricingRequest29.equals((java.lang.Object) (short) 1);
        double double57 = pricingEngine1.calculateFinalPrice(pricingRequest29);
        double double58 = pricingEngine0.calculateFinalPrice(pricingRequest29);
        com.viktor.lab4.PricingEngine.CustomerType customerType61 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest66 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType61, false, "", true, (int) (byte) 0);
        java.lang.String str67 = pricingRequest66.toString();
        boolean boolean68 = pricingRequest66.seasonalSale();
        java.lang.String str69 = pricingRequest66.toString();
        int int70 = pricingRequest66.loyaltyPoints();
        double double71 = pricingEngine0.calculateFinalPrice(pricingRequest66);
        com.viktor.lab4.PricingEngine.CustomerType customerType78 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest83 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType78, false, "", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest88 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) (short) 100, customerType78, false, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest93 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, (int) (short) 1, customerType78, true, "", true, 1);
        com.viktor.lab4.PricingEngine.CustomerType customerType94 = pricingRequest93.customerType();
        double double95 = pricingEngine0.calculateFinalPrice(pricingRequest93);
        java.lang.String str96 = pricingRequest93.toString();
        java.lang.String str97 = pricingRequest93.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType98 = pricingRequest93.customerType();
        java.lang.String str99 = pricingRequest93.couponCode();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str13, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 657.99d + "'", double21 == 657.99d);
        org.junit.Assert.assertTrue("'" + customerType24 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType24.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str30, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str32, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 7.99d + "'", double57 == 7.99d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 7.99d + "'", double58 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType61 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType61.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str67, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str69, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 7.99d + "'", double71 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType78 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType78.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType94 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType94.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 8.67d + "'", double95 == 8.67d);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=1]" + "'", str96, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=1]");
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=1]" + "'", str97, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=1]");
        org.junit.Assert.assertTrue("'" + customerType98 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType98.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str99 + "' != '" + "" + "'", str99, "");
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        double double8 = pricingRequest7.basePrice();
        boolean boolean9 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        boolean boolean12 = pricingRequest7.equals((java.lang.Object) false);
        java.lang.String str13 = pricingRequest7.couponCode();
        int int14 = pricingRequest7.loyaltyPoints();
        boolean boolean15 = pricingRequest7.seasonalSale();
        boolean boolean16 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(customerType17);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1), 10, customerType4, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", true, (int) (short) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) (short) 0, customerType4, false, "", true, (int) 'a');
        java.lang.String str15 = pricingRequest14.toString();
        boolean boolean16 = pricingRequest14.firstOrder();
        boolean boolean17 = pricingRequest14.seasonalSale();
        java.lang.Class<?> wildcardClass18 = pricingRequest14.getClass();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=97]" + "'", str15, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=97]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1), 10, customerType6, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", true, (int) (short) 1);
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 10, customerType12, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", true, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 0, customerType12, true, "", true, (-1));
        double double23 = pricingRequest22.basePrice();
        java.lang.String str24 = pricingRequest22.toString();
        boolean boolean25 = pricingRequest22.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PricingRequest[basePrice=0.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]" + "'", str24, "PricingRequest[basePrice=0.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1), 10, customerType6, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", true, (int) (short) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) (short) 0, customerType6, false, "", true, (int) 'a');
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest16.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = pricingRequest16.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10L, (int) (short) 0, customerType18, false, "hi!", true, (int) ' ');
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        double double8 = pricingRequest7.basePrice();
        boolean boolean9 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        boolean boolean12 = pricingRequest7.equals((java.lang.Object) false);
        java.lang.String str13 = pricingRequest7.couponCode();
        boolean boolean14 = pricingRequest7.firstOrder();
        java.lang.String str15 = pricingRequest7.toString();
        int int16 = pricingRequest7.quantity();
        int int17 = pricingRequest7.loyaltyPoints();
        boolean boolean18 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str15, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1), 10, customerType4, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", true, (int) (short) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) (short) 0, customerType4, false, "", true, (int) 'a');
        java.lang.String str15 = pricingRequest14.toString();
        double double16 = pricingRequest14.basePrice();
        int int17 = pricingRequest14.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = pricingRequest14.customerType();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=97]" + "'", str15, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=97]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1), 10, customerType2, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", true, (int) (short) 1);
        int int8 = pricingRequest7.loyaltyPoints();
        double double9 = pricingRequest7.basePrice();
        double double10 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType5 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest10 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType5, true, "hi!", false, (int) (byte) -1);
        double double11 = pricingRequest10.basePrice();
        java.lang.String str12 = pricingRequest10.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean14 = pricingRequest10.equals((java.lang.Object) customerType13);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (byte) 100, customerType13, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", false, (int) 'a');
        double double20 = pricingEngine0.calculateFinalPrice(pricingRequest19);
        com.viktor.lab4.PricingEngine pricingEngine21 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType26, true, "hi!", false, (int) (byte) -1);
        double double32 = pricingRequest31.basePrice();
        java.lang.String str33 = pricingRequest31.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean35 = pricingRequest31.equals((java.lang.Object) customerType34);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest40 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (byte) 100, customerType34, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", false, (int) 'a');
        double double41 = pricingEngine21.calculateFinalPrice(pricingRequest40);
        com.viktor.lab4.PricingEngine.CustomerType customerType44 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest49 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType44, false, "", true, (int) (byte) 0);
        java.lang.String str50 = pricingRequest49.toString();
        boolean boolean51 = pricingRequest49.seasonalSale();
        java.lang.String str52 = pricingRequest49.toString();
        double double53 = pricingRequest49.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType60 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest65 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType60, false, "", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest70 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) (short) 100, customerType60, false, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest75 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, (int) (short) 1, customerType60, true, "", true, 1);
        boolean boolean76 = pricingRequest49.equals((java.lang.Object) (short) 1);
        double double77 = pricingEngine21.calculateFinalPrice(pricingRequest49);
        double double78 = pricingEngine0.calculateFinalPrice(pricingRequest49);
        com.viktor.lab4.PricingEngine.CustomerType customerType81 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest86 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType81, true, "hi!", false, (int) (byte) -1);
        double double87 = pricingRequest86.basePrice();
        boolean boolean88 = pricingRequest86.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType89 = pricingRequest86.customerType();
        boolean boolean91 = pricingRequest86.equals((java.lang.Object) false);
        java.lang.String str92 = pricingRequest86.couponCode();
        int int93 = pricingRequest86.loyaltyPoints();
        boolean boolean94 = pricingRequest86.seasonalSale();
        boolean boolean95 = pricingRequest86.seasonalSale();
        double double96 = pricingRequest86.basePrice();
        // The following exception was thrown during execution in test generation
        try {
            double double97 = pricingEngine0.calculateFinalPrice(pricingRequest86);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 657.99d + "'", double20 == 657.99d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str33, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType34 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType34.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 657.99d + "'", double41 == 657.99d);
        org.junit.Assert.assertTrue("'" + customerType44 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType44.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str50, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str52, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + customerType60 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType60.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 7.99d + "'", double77 == 7.99d);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 7.99d + "'", double78 == 7.99d);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 10.0d + "'", double87 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNull(customerType89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "hi!" + "'", str92, "hi!");
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 10.0d + "'", double96 == 10.0d);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        int int8 = pricingRequest7.loyaltyPoints();
        java.lang.Class<?> wildcardClass9 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType2, false, "", true, (int) (byte) 0);
        java.lang.String str8 = pricingRequest7.toString();
        boolean boolean9 = pricingRequest7.seasonalSale();
        java.lang.String str10 = pricingRequest7.toString();
        double double11 = pricingRequest7.basePrice();
        boolean boolean12 = pricingRequest7.seasonalSale();
        java.lang.String str13 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str8, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str10, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        double double8 = pricingRequest7.basePrice();
        boolean boolean9 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        boolean boolean12 = pricingRequest7.equals((java.lang.Object) false);
        java.lang.String str13 = pricingRequest7.couponCode();
        boolean boolean14 = pricingRequest7.firstOrder();
        int int15 = pricingRequest7.loyaltyPoints();
        int int16 = pricingRequest7.quantity();
        double double17 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType4, false, "", true, (int) (byte) 0);
        int int10 = pricingRequest9.loyaltyPoints();
        int int11 = pricingRequest9.quantity();
        double double12 = pricingRequest9.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType15, false, "", true, (int) (byte) 0);
        java.lang.String str21 = pricingRequest20.toString();
        boolean boolean22 = pricingRequest20.seasonalSale();
        java.lang.String str23 = pricingRequest20.toString();
        int int24 = pricingRequest20.loyaltyPoints();
        double double25 = pricingRequest20.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = pricingRequest20.customerType();
        boolean boolean27 = pricingRequest9.equals((java.lang.Object) customerType26);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, (int) (short) 0, customerType26, false, "PricingRequest[basePrice=0.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=100]", true, (int) '#');
        com.viktor.lab4.PricingEngine.CustomerType customerType35 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest40 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType35, true, "hi!", false, (int) (byte) -1);
        double double41 = pricingRequest40.basePrice();
        java.lang.String str42 = pricingRequest40.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType43 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean44 = pricingRequest40.equals((java.lang.Object) customerType43);
        boolean boolean45 = pricingRequest32.equals((java.lang.Object) boolean44);
        java.lang.Object obj46 = null;
        boolean boolean47 = pricingRequest32.equals(obj46);
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str21, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str23, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + customerType26 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType26.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 10.0d + "'", double41 == 10.0d);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str42, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType43 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType43.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        double double8 = pricingRequest7.basePrice();
        boolean boolean9 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        boolean boolean12 = pricingRequest7.equals((java.lang.Object) false);
        java.lang.String str13 = pricingRequest7.couponCode();
        boolean boolean14 = pricingRequest7.firstOrder();
        java.lang.Class<?> wildcardClass15 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType6, true, "hi!", false, (int) (byte) -1);
        double double12 = pricingRequest11.basePrice();
        java.lang.String str13 = pricingRequest11.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean15 = pricingRequest11.equals((java.lang.Object) customerType14);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (byte) 100, customerType14, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", false, (int) 'a');
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = pricingRequest20.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest26 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) ' ', customerType21, false, "PricingRequest[basePrice=52.0, quantity=-1, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=10]", true, (int) (byte) 1);
        java.lang.String str27 = pricingRequest26.couponCode();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str13, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + customerType21 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType21.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "PricingRequest[basePrice=52.0, quantity=-1, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=10]" + "'", str27, "PricingRequest[basePrice=52.0, quantity=-1, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=10]");
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType2, false, "", true, (int) (byte) 0);
        java.lang.String str8 = pricingRequest7.toString();
        boolean boolean9 = pricingRequest7.seasonalSale();
        java.lang.String str10 = pricingRequest7.toString();
        boolean boolean12 = pricingRequest7.equals((java.lang.Object) "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        java.lang.String str13 = pricingRequest7.toString();
        java.lang.String str14 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str8, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str10, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str13, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str14, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType12, false, "", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) 100, customerType12, false, "PricingRequest[basePrice=1.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '4', (int) (byte) -1, customerType12, true, "", true, 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (int) (short) 100, customerType12, true, "", false, (int) (byte) 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest37 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 0, (int) (short) 10, customerType12, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=1]", false, 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest42 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 32, (int) '#', customerType12, false, "PricingRequest[basePrice=-1.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=1]", true, 1);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType4, true, "hi!", false, (int) (byte) -1);
        double double10 = pricingRequest9.basePrice();
        boolean boolean11 = pricingRequest9.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest9.customerType();
        boolean boolean14 = pricingRequest9.equals((java.lang.Object) false);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest9.customerType();
        boolean boolean16 = pricingRequest9.seasonalSale();
        java.lang.String str17 = pricingRequest9.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType20, false, "", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = pricingRequest25.customerType();
        boolean boolean27 = pricingRequest9.equals((java.lang.Object) customerType26);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) ' ', customerType26, false, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=97]", true, (int) (short) -1);
        boolean boolean33 = pricingRequest32.firstOrder();
        int int34 = pricingRequest32.quantity();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(customerType12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(customerType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str17, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType26 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType26.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 32 + "'", int34 == 32);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType2, false, "", true, (int) (byte) 0);
        java.lang.String str8 = pricingRequest7.toString();
        boolean boolean9 = pricingRequest7.seasonalSale();
        int int10 = pricingRequest7.loyaltyPoints();
        java.lang.String str11 = pricingRequest7.toString();
        int int12 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType17, true, "hi!", false, (int) (byte) -1);
        double double23 = pricingRequest22.basePrice();
        java.lang.String str24 = pricingRequest22.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean26 = pricingRequest22.equals((java.lang.Object) customerType25);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (byte) 100, customerType25, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", false, (int) 'a');
        boolean boolean32 = pricingRequest31.firstOrder();
        boolean boolean33 = pricingRequest7.equals((java.lang.Object) boolean32);
        double double34 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str8, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str11, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str24, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType2, false, "", true, (int) (byte) 0);
        java.lang.String str8 = pricingRequest7.toString();
        boolean boolean9 = pricingRequest7.seasonalSale();
        java.lang.String str10 = pricingRequest7.toString();
        int int11 = pricingRequest7.quantity();
        boolean boolean12 = pricingRequest7.firstOrder();
        java.lang.Class<?> wildcardClass13 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str8, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str10, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        double double8 = pricingRequest7.basePrice();
        boolean boolean9 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        boolean boolean12 = pricingRequest7.equals((java.lang.Object) false);
        java.lang.String str13 = pricingRequest7.couponCode();
        int int14 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest7.customerType();
        int int16 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest26 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType21, true, "hi!", false, (int) (byte) -1);
        double double27 = pricingRequest26.basePrice();
        java.lang.String str28 = pricingRequest26.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType29 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean30 = pricingRequest26.equals((java.lang.Object) customerType29);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (byte) 100, customerType29, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", false, (int) 'a');
        com.viktor.lab4.PricingEngine.CustomerType customerType36 = pricingRequest35.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType39 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest44 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType39, true, "hi!", false, (int) (byte) -1);
        double double45 = pricingRequest44.basePrice();
        boolean boolean46 = pricingRequest44.firstOrder();
        int int47 = pricingRequest44.quantity();
        boolean boolean48 = pricingRequest44.firstOrder();
        boolean boolean49 = pricingRequest35.equals((java.lang.Object) pricingRequest44);
        double double50 = pricingRequest35.basePrice();
        boolean boolean51 = pricingRequest7.equals((java.lang.Object) pricingRequest35);
        com.viktor.lab4.PricingEngine.CustomerType customerType52 = pricingRequest35.customerType();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(customerType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str28, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType29 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType29.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + customerType36 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType36.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 10.0d + "'", double45 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 10.0d + "'", double50 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + customerType52 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType52.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType6, true, "hi!", false, (int) (byte) -1);
        double double12 = pricingRequest11.basePrice();
        java.lang.String str13 = pricingRequest11.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean15 = pricingRequest11.equals((java.lang.Object) customerType14);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (byte) 100, customerType14, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", false, (int) 'a');
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = pricingRequest20.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest26 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 0, (int) (short) 100, customerType21, false, "", true, (int) (byte) 1);
        java.lang.Class<?> wildcardClass27 = customerType21.getClass();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str13, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + customerType21 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType21.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, 0, customerType2, true, "", false, (int) (short) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest7.customerType();
        boolean boolean10 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(customerType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType10, true, "hi!", false, (int) (byte) -1);
        double double16 = pricingRequest15.basePrice();
        java.lang.String str17 = pricingRequest15.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean19 = pricingRequest15.equals((java.lang.Object) customerType18);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (byte) 100, customerType18, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", false, (int) 'a');
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = pricingRequest24.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 10, (int) (short) 1, customerType25, false, "", false, 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, 10, customerType25, true, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]", false, (int) (short) 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest40 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), 97, customerType25, true, "", false, 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType41 = pricingRequest40.customerType();
        java.lang.String str42 = pricingRequest40.toString();
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str17, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType41 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType41.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "PricingRequest[basePrice=-1.0, quantity=97, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=0]" + "'", str42, "PricingRequest[basePrice=-1.0, quantity=97, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=0]");
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        double double8 = pricingRequest7.basePrice();
        boolean boolean9 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        boolean boolean11 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType18, false, "", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) (short) 100, customerType18, false, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, (int) (short) 1, customerType18, true, "", true, 1);
        int int34 = pricingRequest33.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType37 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest42 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType37, true, "hi!", false, (int) (byte) -1);
        double double43 = pricingRequest42.basePrice();
        boolean boolean44 = pricingRequest42.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType45 = pricingRequest42.customerType();
        boolean boolean47 = pricingRequest42.equals((java.lang.Object) false);
        com.viktor.lab4.PricingEngine.CustomerType customerType48 = pricingRequest42.customerType();
        boolean boolean49 = pricingRequest42.seasonalSale();
        java.lang.String str50 = pricingRequest42.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType53 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest58 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType53, false, "", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType59 = pricingRequest58.customerType();
        boolean boolean60 = pricingRequest42.equals((java.lang.Object) customerType59);
        boolean boolean61 = pricingRequest33.equals((java.lang.Object) pricingRequest42);
        int int62 = pricingRequest42.loyaltyPoints();
        boolean boolean63 = pricingRequest42.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType66 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest71 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType66, true, "hi!", false, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType72 = pricingRequest71.customerType();
        int int73 = pricingRequest71.loyaltyPoints();
        boolean boolean74 = pricingRequest42.equals((java.lang.Object) pricingRequest71);
        boolean boolean75 = pricingRequest7.equals((java.lang.Object) boolean74);
        int int76 = pricingRequest7.loyaltyPoints();
        int int77 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 10.0d + "'", double43 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(customerType45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(customerType48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str50, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType53 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType53.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType59 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType59.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(customerType72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType5 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest10 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType5, true, "hi!", false, (int) (byte) -1);
        double double11 = pricingRequest10.basePrice();
        java.lang.String str12 = pricingRequest10.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean14 = pricingRequest10.equals((java.lang.Object) customerType13);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (byte) 100, customerType13, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", false, (int) 'a');
        double double20 = pricingEngine0.calculateFinalPrice(pricingRequest19);
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType25, true, "hi!", false, (int) (byte) -1);
        double double31 = pricingRequest30.basePrice();
        java.lang.String str32 = pricingRequest30.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType33 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean34 = pricingRequest30.equals((java.lang.Object) customerType33);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest39 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (byte) 100, customerType33, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", false, (int) 'a');
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = pricingRequest39.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType43 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest48 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType43, true, "hi!", false, (int) (byte) -1);
        double double49 = pricingRequest48.basePrice();
        boolean boolean50 = pricingRequest48.firstOrder();
        int int51 = pricingRequest48.quantity();
        boolean boolean52 = pricingRequest48.firstOrder();
        boolean boolean53 = pricingRequest39.equals((java.lang.Object) pricingRequest48);
        double double54 = pricingEngine0.calculateFinalPrice(pricingRequest39);
        com.viktor.lab4.PricingEngine.CustomerType customerType57 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest62 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType57, true, "hi!", false, (int) (byte) -1);
        double double63 = pricingRequest62.basePrice();
        java.lang.String str64 = pricingRequest62.toString();
        int int65 = pricingRequest62.loyaltyPoints();
        double double66 = pricingRequest62.basePrice();
        double double67 = pricingRequest62.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType68 = pricingRequest62.customerType();
        // The following exception was thrown during execution in test generation
        try {
            double double69 = pricingEngine0.calculateFinalPrice(pricingRequest62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 657.99d + "'", double20 == 657.99d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str32, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType33 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType33.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10.0d + "'", double49 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 657.99d + "'", double54 == 657.99d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 10.0d + "'", double63 == 10.0d);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str64, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 10.0d + "'", double66 == 10.0d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 10.0d + "'", double67 == 10.0d);
        org.junit.Assert.assertNull(customerType68);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        double double8 = pricingRequest7.basePrice();
        boolean boolean9 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        boolean boolean12 = pricingRequest7.equals((java.lang.Object) false);
        java.lang.String str13 = pricingRequest7.couponCode();
        int int14 = pricingRequest7.loyaltyPoints();
        boolean boolean15 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType19, false, "", true, (int) (byte) 0);
        java.lang.String str25 = pricingRequest24.toString();
        boolean boolean26 = pricingRequest24.seasonalSale();
        int int27 = pricingRequest24.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = pricingRequest24.customerType();
        boolean boolean29 = pricingRequest7.equals((java.lang.Object) customerType28);
        java.lang.String str30 = pricingRequest7.toString();
        int int31 = pricingRequest7.loyaltyPoints();
        java.lang.String str32 = pricingRequest7.couponCode();
        int int33 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(customerType16);
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str25, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str30, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType6, true, "hi!", false, (int) (byte) -1);
        double double12 = pricingRequest11.basePrice();
        java.lang.String str13 = pricingRequest11.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean15 = pricingRequest11.equals((java.lang.Object) customerType14);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (byte) 100, customerType14, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", false, (int) 'a');
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = pricingRequest20.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest26 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 10, (int) (short) 1, customerType21, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", false, (int) (byte) 10);
        boolean boolean27 = pricingRequest26.firstOrder();
        int int28 = pricingRequest26.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str13, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + customerType21 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType21.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType8, false, "", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) (short) 100, customerType8, false, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, (int) (short) 1, customerType8, true, "", true, 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, (int) (short) 100, customerType8, false, "hi!", true, (int) (short) -1);
        boolean boolean30 = pricingRequest28.equals((java.lang.Object) 1);
        boolean boolean31 = pricingRequest28.seasonalSale();
        java.lang.String str32 = pricingRequest28.toString();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PricingRequest[basePrice=100.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str32, "PricingRequest[basePrice=100.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        double double8 = pricingRequest7.basePrice();
        java.lang.String str9 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean11 = pricingRequest7.equals((java.lang.Object) customerType10);
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest7.customerType();
        java.lang.String str13 = pricingRequest7.couponCode();
        boolean boolean14 = pricingRequest7.firstOrder();
        boolean boolean15 = pricingRequest7.firstOrder();
        boolean boolean16 = pricingRequest7.firstOrder();
        java.lang.String str17 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str9, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(customerType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        double double8 = pricingRequest7.basePrice();
        boolean boolean9 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        boolean boolean12 = pricingRequest7.equals((java.lang.Object) false);
        java.lang.String str13 = pricingRequest7.couponCode();
        boolean boolean14 = pricingRequest7.firstOrder();
        java.lang.String str15 = pricingRequest7.toString();
        int int16 = pricingRequest7.quantity();
        double double17 = pricingRequest7.basePrice();
        double double18 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest26 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType21, true, "hi!", false, (int) (byte) -1);
        double double27 = pricingRequest26.basePrice();
        boolean boolean28 = pricingRequest26.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType29 = pricingRequest26.customerType();
        boolean boolean31 = pricingRequest26.equals((java.lang.Object) false);
        com.viktor.lab4.PricingEngine.CustomerType customerType32 = pricingRequest26.customerType();
        boolean boolean33 = pricingRequest26.seasonalSale();
        boolean boolean34 = pricingRequest7.equals((java.lang.Object) boolean33);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str15, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(customerType29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(customerType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        double double8 = pricingRequest7.basePrice();
        java.lang.String str9 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean11 = pricingRequest7.equals((java.lang.Object) customerType10);
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest7.customerType();
        int int14 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str9, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(customerType12);
        org.junit.Assert.assertNull(customerType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType4, false, "", true, (int) (byte) 0);
        java.lang.String str10 = pricingRequest9.toString();
        boolean boolean11 = pricingRequest9.seasonalSale();
        boolean boolean12 = pricingRequest9.firstOrder();
        int int13 = pricingRequest9.quantity();
        java.lang.Object obj14 = null;
        boolean boolean15 = pricingRequest9.equals(obj14);
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, (int) '4', customerType16, true, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=97]", false, (int) 'a');
        java.lang.Class<?> wildcardClass22 = customerType16.getClass();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str10, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType2, false, "", true, (int) (byte) 0);
        java.lang.String str8 = pricingRequest7.toString();
        boolean boolean9 = pricingRequest7.seasonalSale();
        java.lang.String str10 = pricingRequest7.toString();
        boolean boolean12 = pricingRequest7.equals((java.lang.Object) "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType17, true, "hi!", false, (int) (byte) -1);
        double double23 = pricingRequest22.basePrice();
        boolean boolean24 = pricingRequest22.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = pricingRequest22.customerType();
        boolean boolean27 = pricingRequest22.equals((java.lang.Object) false);
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = pricingRequest22.customerType();
        boolean boolean29 = pricingRequest22.seasonalSale();
        java.lang.String str30 = pricingRequest22.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType33 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest38 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType33, false, "", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType39 = pricingRequest38.customerType();
        boolean boolean40 = pricingRequest22.equals((java.lang.Object) customerType39);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest45 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) ' ', customerType39, false, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=97]", true, (int) (short) -1);
        boolean boolean46 = pricingRequest7.equals((java.lang.Object) '#');
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str8, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str10, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(customerType25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(customerType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str30, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType33 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType33.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType39 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType39.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        int int8 = pricingRequest7.loyaltyPoints();
        int int9 = pricingRequest7.quantity();
        int int10 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        int int12 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(customerType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType3, false, "", true, (int) (byte) 0);
        java.lang.String str9 = pricingRequest8.toString();
        boolean boolean10 = pricingRequest8.seasonalSale();
        java.lang.String str11 = pricingRequest8.toString();
        int int12 = pricingRequest8.loyaltyPoints();
        double double13 = pricingRequest8.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest8.customerType();
        double double15 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType22, false, "", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) (short) 100, customerType22, false, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest37 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, (int) (short) 1, customerType22, true, "", true, 1);
        int int38 = pricingRequest37.loyaltyPoints();
        boolean boolean39 = pricingRequest37.firstOrder();
        double double40 = pricingEngine0.calculateFinalPrice(pricingRequest37);
        com.viktor.lab4.PricingEngine.CustomerType customerType43 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest48 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType43, false, "", true, (int) (byte) 0);
        java.lang.String str49 = pricingRequest48.toString();
        boolean boolean50 = pricingRequest48.seasonalSale();
        int int51 = pricingRequest48.loyaltyPoints();
        boolean boolean52 = pricingRequest48.firstOrder();
        double double53 = pricingEngine0.calculateFinalPrice(pricingRequest48);
        com.viktor.lab4.PricingEngine.CustomerType customerType58 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest63 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType58, false, "", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest68 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) 100, customerType58, false, "PricingRequest[basePrice=1.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", true, (int) (byte) 0);
        double double69 = pricingRequest68.basePrice();
        java.lang.String str70 = pricingRequest68.couponCode();
        boolean boolean71 = pricingRequest68.seasonalSale();
        java.lang.String str72 = pricingRequest68.couponCode();
        double double73 = pricingEngine0.calculateFinalPrice(pricingRequest68);
        com.viktor.lab4.PricingEngine.CustomerType customerType76 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest81 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType76, false, "", true, (int) (byte) 0);
        java.lang.String str82 = pricingRequest81.toString();
        java.lang.String str83 = pricingRequest81.couponCode();
        java.lang.String str84 = pricingRequest81.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType87 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest92 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType87, true, "hi!", false, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType93 = pricingRequest92.customerType();
        int int94 = pricingRequest92.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType95 = pricingRequest92.customerType();
        int int96 = pricingRequest92.loyaltyPoints();
        boolean boolean97 = pricingRequest81.equals((java.lang.Object) pricingRequest92);
        double double98 = pricingEngine0.calculateFinalPrice(pricingRequest81);
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str9, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str11, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 7.99d + "'", double15 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 8.67d + "'", double40 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType43 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType43.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str49, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 7.99d + "'", double53 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType58 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType58.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "PricingRequest[basePrice=1.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]" + "'", str70, "PricingRequest[basePrice=1.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "PricingRequest[basePrice=1.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]" + "'", str72, "PricingRequest[basePrice=1.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 7.99d + "'", double73 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType76 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType76.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str82, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str84, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertNull(customerType93);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
        org.junit.Assert.assertNull(customerType95);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + (-1) + "'", int96 == (-1));
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + double98 + "' != '" + 7.99d + "'", double98 == 7.99d);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType6, true, "hi!", false, (int) (byte) -1);
        double double12 = pricingRequest11.basePrice();
        java.lang.String str13 = pricingRequest11.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean15 = pricingRequest11.equals((java.lang.Object) customerType14);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (byte) 100, customerType14, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", false, (int) 'a');
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = pricingRequest20.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest26 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 10, (int) (short) 1, customerType21, false, "", false, 100);
        java.lang.String str27 = pricingRequest26.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType32 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest37 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType32, true, "hi!", false, (int) (byte) -1);
        double double38 = pricingRequest37.basePrice();
        java.lang.String str39 = pricingRequest37.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean41 = pricingRequest37.equals((java.lang.Object) customerType40);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest46 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (byte) 100, customerType40, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", false, (int) 'a');
        boolean boolean47 = pricingRequest46.firstOrder();
        boolean boolean48 = pricingRequest46.seasonalSale();
        boolean boolean49 = pricingRequest26.equals((java.lang.Object) boolean48);
        com.viktor.lab4.PricingEngine.CustomerType customerType50 = pricingRequest26.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType53 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest58 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType53, true, "hi!", false, (int) (byte) -1);
        double double59 = pricingRequest58.basePrice();
        java.lang.String str60 = pricingRequest58.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType61 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean62 = pricingRequest58.equals((java.lang.Object) customerType61);
        com.viktor.lab4.PricingEngine.CustomerType customerType63 = pricingRequest58.customerType();
        boolean boolean64 = pricingRequest58.firstOrder();
        java.lang.String str65 = pricingRequest58.couponCode();
        int int66 = pricingRequest58.loyaltyPoints();
        java.lang.String str67 = pricingRequest58.toString();
        boolean boolean68 = pricingRequest26.equals((java.lang.Object) pricingRequest58);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str13, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + customerType21 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType21.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 10.0d + "'", double38 == 10.0d);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str39, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + customerType50 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType50.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 10.0d + "'", double59 == 10.0d);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str60, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType61 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType61.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(customerType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str67, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType10, true, "hi!", false, (int) (byte) -1);
        double double16 = pricingRequest15.basePrice();
        java.lang.String str17 = pricingRequest15.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean19 = pricingRequest15.equals((java.lang.Object) customerType18);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (byte) 100, customerType18, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", false, (int) 'a');
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = pricingRequest24.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10, 97, customerType25, true, "PricingRequest[basePrice=1.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 10, (int) (short) 1, customerType25, true, "hi!", false, (int) (short) 100);
        com.viktor.lab4.PricingEngine.CustomerType customerType36 = pricingRequest35.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest41 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, (int) (short) -1, customerType36, false, "PricingRequest[basePrice=-1.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=1]", false, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str17, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType36 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType36.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType2, false, "", true, (int) (byte) 0);
        java.lang.String str8 = pricingRequest7.toString();
        java.lang.String str9 = pricingRequest7.couponCode();
        java.lang.String str10 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType13, false, "", true, (int) (byte) 0);
        int int19 = pricingRequest18.loyaltyPoints();
        int int20 = pricingRequest18.quantity();
        boolean boolean21 = pricingRequest7.equals((java.lang.Object) pricingRequest18);
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType24, true, "hi!", false, (int) (byte) -1);
        double double30 = pricingRequest29.basePrice();
        boolean boolean31 = pricingRequest29.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType32 = pricingRequest29.customerType();
        boolean boolean34 = pricingRequest29.equals((java.lang.Object) false);
        java.lang.String str35 = pricingRequest29.couponCode();
        int int36 = pricingRequest29.loyaltyPoints();
        boolean boolean37 = pricingRequest29.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType38 = pricingRequest29.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType41 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest46 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType41, false, "", true, (int) (byte) 0);
        java.lang.String str47 = pricingRequest46.toString();
        boolean boolean48 = pricingRequest46.seasonalSale();
        int int49 = pricingRequest46.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType50 = pricingRequest46.customerType();
        boolean boolean51 = pricingRequest29.equals((java.lang.Object) customerType50);
        boolean boolean52 = pricingRequest18.equals((java.lang.Object) boolean51);
        boolean boolean53 = pricingRequest18.seasonalSale();
        int int54 = pricingRequest18.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str8, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str10, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(customerType32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(customerType38);
        org.junit.Assert.assertTrue("'" + customerType41 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType41.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str47, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + customerType50 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType50.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        int int9 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        java.lang.String str12 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType15, true, "hi!", false, (int) (byte) -1);
        double double21 = pricingRequest20.basePrice();
        java.lang.String str22 = pricingRequest20.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean24 = pricingRequest20.equals((java.lang.Object) customerType23);
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = pricingRequest20.customerType();
        int int26 = pricingRequest20.loyaltyPoints();
        int int27 = pricingRequest20.loyaltyPoints();
        int int28 = pricingRequest20.quantity();
        boolean boolean29 = pricingRequest7.equals((java.lang.Object) int28);
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertNull(customerType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str22, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(customerType25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType2, false, "", true, (int) (byte) 0);
        java.lang.String str8 = pricingRequest7.toString();
        boolean boolean9 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType12, false, "", true, (int) (byte) 0);
        int int18 = pricingRequest17.loyaltyPoints();
        int int19 = pricingRequest17.loyaltyPoints();
        boolean boolean20 = pricingRequest7.equals((java.lang.Object) int19);
        boolean boolean21 = pricingRequest7.firstOrder();
        java.lang.String str22 = pricingRequest7.toString();
        boolean boolean23 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str8, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str22, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType2, false, "", true, (int) (byte) 0);
        java.lang.String str8 = pricingRequest7.toString();
        boolean boolean9 = pricingRequest7.firstOrder();
        boolean boolean10 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str8, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        double double8 = pricingRequest7.basePrice();
        boolean boolean9 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        int int11 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType14, true, "hi!", false, (int) (byte) -1);
        double double20 = pricingRequest19.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = pricingRequest19.customerType();
        boolean boolean22 = pricingRequest7.equals((java.lang.Object) pricingRequest19);
        boolean boolean23 = pricingRequest19.seasonalSale();
        int int24 = pricingRequest19.quantity();
        java.lang.String str25 = pricingRequest19.toString();
        int int26 = pricingRequest19.quantity();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNull(customerType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str25, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        double double8 = pricingRequest7.basePrice();
        boolean boolean9 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        boolean boolean12 = pricingRequest7.equals((java.lang.Object) false);
        java.lang.String str13 = pricingRequest7.couponCode();
        int int14 = pricingRequest7.loyaltyPoints();
        int int15 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine pricingEngine1 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType6, true, "hi!", false, (int) (byte) -1);
        double double12 = pricingRequest11.basePrice();
        java.lang.String str13 = pricingRequest11.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean15 = pricingRequest11.equals((java.lang.Object) customerType14);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (byte) 100, customerType14, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", false, (int) 'a');
        double double21 = pricingEngine1.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType24, false, "", true, (int) (byte) 0);
        java.lang.String str30 = pricingRequest29.toString();
        boolean boolean31 = pricingRequest29.seasonalSale();
        java.lang.String str32 = pricingRequest29.toString();
        double double33 = pricingRequest29.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest45 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType40, false, "", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest50 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) (short) 100, customerType40, false, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest55 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, (int) (short) 1, customerType40, true, "", true, 1);
        boolean boolean56 = pricingRequest29.equals((java.lang.Object) (short) 1);
        double double57 = pricingEngine1.calculateFinalPrice(pricingRequest29);
        double double58 = pricingEngine0.calculateFinalPrice(pricingRequest29);
        com.viktor.lab4.PricingEngine.CustomerType customerType61 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest66 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType61, false, "", true, (int) (byte) 0);
        java.lang.String str67 = pricingRequest66.toString();
        boolean boolean68 = pricingRequest66.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType71 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest76 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType71, false, "", true, (int) (byte) 0);
        int int77 = pricingRequest76.loyaltyPoints();
        int int78 = pricingRequest76.loyaltyPoints();
        boolean boolean79 = pricingRequest66.equals((java.lang.Object) int78);
        boolean boolean80 = pricingRequest66.firstOrder();
        double double81 = pricingEngine0.calculateFinalPrice(pricingRequest66);
        int int82 = pricingRequest66.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str13, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 657.99d + "'", double21 == 657.99d);
        org.junit.Assert.assertTrue("'" + customerType24 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType24.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str30, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str32, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 7.99d + "'", double57 == 7.99d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 7.99d + "'", double58 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType61 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType61.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str67, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + customerType71 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType71.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 7.99d + "'", double81 == 7.99d);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        double double8 = pricingRequest7.basePrice();
        boolean boolean9 = pricingRequest7.firstOrder();
        int int10 = pricingRequest7.quantity();
        int int11 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest7.customerType();
        boolean boolean13 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(customerType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType3, false, "", true, (int) (byte) 0);
        java.lang.String str9 = pricingRequest8.toString();
        boolean boolean10 = pricingRequest8.seasonalSale();
        java.lang.String str11 = pricingRequest8.toString();
        int int12 = pricingRequest8.loyaltyPoints();
        double double13 = pricingRequest8.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest8.customerType();
        double double15 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType22, false, "", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) (short) 100, customerType22, false, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest37 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, (int) (short) 1, customerType22, true, "", true, 1);
        int int38 = pricingRequest37.loyaltyPoints();
        boolean boolean39 = pricingRequest37.firstOrder();
        double double40 = pricingEngine0.calculateFinalPrice(pricingRequest37);
        com.viktor.lab4.PricingEngine.CustomerType customerType43 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest48 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType43, false, "", true, (int) (byte) 0);
        java.lang.String str49 = pricingRequest48.toString();
        boolean boolean50 = pricingRequest48.seasonalSale();
        int int51 = pricingRequest48.loyaltyPoints();
        boolean boolean52 = pricingRequest48.firstOrder();
        double double53 = pricingEngine0.calculateFinalPrice(pricingRequest48);
        com.viktor.lab4.PricingEngine.CustomerType customerType58 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest63 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType58, false, "", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest68 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) 100, customerType58, false, "PricingRequest[basePrice=1.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", true, (int) (byte) 0);
        double double69 = pricingRequest68.basePrice();
        java.lang.String str70 = pricingRequest68.couponCode();
        boolean boolean71 = pricingRequest68.seasonalSale();
        java.lang.String str72 = pricingRequest68.couponCode();
        double double73 = pricingEngine0.calculateFinalPrice(pricingRequest68);
        com.viktor.lab4.PricingEngine.CustomerType customerType76 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest81 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType76, true, "hi!", false, (int) (byte) -1);
        double double82 = pricingRequest81.basePrice();
        java.lang.String str83 = pricingRequest81.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType84 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean85 = pricingRequest81.equals((java.lang.Object) customerType84);
        com.viktor.lab4.PricingEngine.CustomerType customerType86 = pricingRequest81.customerType();
        int int87 = pricingRequest81.quantity();
        java.lang.String str88 = pricingRequest81.couponCode();
        // The following exception was thrown during execution in test generation
        try {
            double double89 = pricingEngine0.calculateFinalPrice(pricingRequest81);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str9, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str11, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 7.99d + "'", double15 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 8.67d + "'", double40 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType43 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType43.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str49, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 7.99d + "'", double53 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType58 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType58.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "PricingRequest[basePrice=1.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]" + "'", str70, "PricingRequest[basePrice=1.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "PricingRequest[basePrice=1.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]" + "'", str72, "PricingRequest[basePrice=1.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 7.99d + "'", double73 == 7.99d);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 10.0d + "'", double82 == 10.0d);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str83, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType84 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType84.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNull(customerType86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "hi!" + "'", str88, "hi!");
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        double double8 = pricingRequest7.basePrice();
        boolean boolean9 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        boolean boolean12 = pricingRequest7.equals((java.lang.Object) false);
        java.lang.String str13 = pricingRequest7.couponCode();
        int int14 = pricingRequest7.loyaltyPoints();
        boolean boolean15 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType19, false, "", true, (int) (byte) 0);
        java.lang.String str25 = pricingRequest24.toString();
        boolean boolean26 = pricingRequest24.seasonalSale();
        int int27 = pricingRequest24.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = pricingRequest24.customerType();
        boolean boolean29 = pricingRequest7.equals((java.lang.Object) customerType28);
        java.lang.String str30 = pricingRequest7.toString();
        java.lang.String str31 = pricingRequest7.couponCode();
        int int32 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(customerType16);
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str25, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str30, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        com.viktor.lab4.PricingEngine pricingEngine2 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType7 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest12 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType7, true, "hi!", false, (int) (byte) -1);
        double double13 = pricingRequest12.basePrice();
        java.lang.String str14 = pricingRequest12.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean16 = pricingRequest12.equals((java.lang.Object) customerType15);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (byte) 100, customerType15, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", false, (int) 'a');
        double double22 = pricingEngine2.calculateFinalPrice(pricingRequest21);
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType25, false, "", true, (int) (byte) 0);
        java.lang.String str31 = pricingRequest30.toString();
        boolean boolean32 = pricingRequest30.seasonalSale();
        java.lang.String str33 = pricingRequest30.toString();
        double double34 = pricingRequest30.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType41 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest46 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType41, false, "", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest51 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) (short) 100, customerType41, false, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest56 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, (int) (short) 1, customerType41, true, "", true, 1);
        boolean boolean57 = pricingRequest30.equals((java.lang.Object) (short) 1);
        double double58 = pricingEngine2.calculateFinalPrice(pricingRequest30);
        com.viktor.lab4.PricingEngine.CustomerType customerType59 = pricingRequest30.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest64 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1L), (int) (short) 100, customerType59, false, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=97]", true, (int) '4');
        com.viktor.lab4.PricingEngine.CustomerType customerType67 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest72 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType67, true, "hi!", false, (int) (byte) -1);
        double double73 = pricingRequest72.basePrice();
        java.lang.String str74 = pricingRequest72.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType75 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean76 = pricingRequest72.equals((java.lang.Object) customerType75);
        com.viktor.lab4.PricingEngine.CustomerType customerType77 = pricingRequest72.customerType();
        java.lang.String str78 = pricingRequest72.toString();
        int int79 = pricingRequest72.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType82 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest87 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType82, true, "hi!", false, (int) (byte) -1);
        double double88 = pricingRequest87.basePrice();
        java.lang.String str89 = pricingRequest87.toString();
        int int90 = pricingRequest87.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType91 = pricingRequest87.customerType();
        java.lang.String str92 = pricingRequest87.toString();
        boolean boolean93 = pricingRequest87.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType94 = pricingRequest87.customerType();
        int int95 = pricingRequest87.quantity();
        boolean boolean96 = pricingRequest72.equals((java.lang.Object) pricingRequest87);
        boolean boolean97 = pricingRequest64.equals((java.lang.Object) pricingRequest72);
        int int98 = pricingRequest72.loyaltyPoints();
        double double99 = pricingRequest72.basePrice();
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str14, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 657.99d + "'", double22 == 657.99d);
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str31, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str33, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + customerType41 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType41.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 7.99d + "'", double58 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType59 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType59.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 10.0d + "'", double73 == 10.0d);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str74, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType75 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType75.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNull(customerType77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str78, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 10.0d + "'", double88 == 10.0d);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str89, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertNull(customerType91);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str92, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNull(customerType94);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 0 + "'", int95 == 0);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + (-1) + "'", int98 == (-1));
        org.junit.Assert.assertTrue("'" + double99 + "' != '" + 10.0d + "'", double99 == 10.0d);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        boolean boolean8 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(customerType9);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType6, false, "", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) (short) 100, customerType6, false, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, (int) (short) 1, customerType6, true, "", true, 1);
        int int22 = pricingRequest21.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType25, true, "hi!", false, (int) (byte) -1);
        double double31 = pricingRequest30.basePrice();
        boolean boolean32 = pricingRequest30.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType33 = pricingRequest30.customerType();
        boolean boolean35 = pricingRequest30.equals((java.lang.Object) false);
        com.viktor.lab4.PricingEngine.CustomerType customerType36 = pricingRequest30.customerType();
        boolean boolean37 = pricingRequest30.seasonalSale();
        java.lang.String str38 = pricingRequest30.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType41 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest46 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType41, false, "", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType47 = pricingRequest46.customerType();
        boolean boolean48 = pricingRequest30.equals((java.lang.Object) customerType47);
        boolean boolean49 = pricingRequest21.equals((java.lang.Object) pricingRequest30);
        boolean boolean50 = pricingRequest21.seasonalSale();
        double double51 = pricingRequest21.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType52 = pricingRequest21.customerType();
        int int53 = pricingRequest21.quantity();
        int int54 = pricingRequest21.quantity();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(customerType33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(customerType36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str38, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType41 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType41.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType47 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType47.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 1.0d + "'", double51 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType52 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType52.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType3, false, "", true, (int) (byte) 0);
        java.lang.String str9 = pricingRequest8.toString();
        boolean boolean10 = pricingRequest8.seasonalSale();
        java.lang.String str11 = pricingRequest8.toString();
        int int12 = pricingRequest8.loyaltyPoints();
        double double13 = pricingRequest8.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest8.customerType();
        double double15 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType22, false, "", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) (short) 100, customerType22, false, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest37 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, (int) (short) 1, customerType22, true, "", true, 1);
        int int38 = pricingRequest37.loyaltyPoints();
        boolean boolean39 = pricingRequest37.firstOrder();
        double double40 = pricingEngine0.calculateFinalPrice(pricingRequest37);
        com.viktor.lab4.PricingEngine.CustomerType customerType43 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest48 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType43, false, "", true, (int) (byte) 0);
        java.lang.String str49 = pricingRequest48.toString();
        boolean boolean50 = pricingRequest48.seasonalSale();
        int int51 = pricingRequest48.loyaltyPoints();
        boolean boolean52 = pricingRequest48.firstOrder();
        double double53 = pricingEngine0.calculateFinalPrice(pricingRequest48);
        com.viktor.lab4.PricingEngine.CustomerType customerType56 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest61 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType56, false, "", true, (int) (byte) 0);
        java.lang.String str62 = pricingRequest61.toString();
        boolean boolean63 = pricingRequest61.seasonalSale();
        java.lang.String str64 = pricingRequest61.toString();
        boolean boolean66 = pricingRequest61.equals((java.lang.Object) "hi!");
        com.viktor.lab4.PricingEngine.CustomerType customerType67 = pricingRequest61.customerType();
        double double68 = pricingEngine0.calculateFinalPrice(pricingRequest61);
        com.viktor.lab4.PricingEngine.CustomerType customerType71 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest76 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType71, false, "", true, (int) (byte) 0);
        java.lang.String str77 = pricingRequest76.toString();
        boolean boolean78 = pricingRequest76.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType81 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest86 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType81, false, "", true, (int) (byte) 0);
        int int87 = pricingRequest86.loyaltyPoints();
        int int88 = pricingRequest86.loyaltyPoints();
        boolean boolean89 = pricingRequest76.equals((java.lang.Object) int88);
        boolean boolean90 = pricingRequest76.firstOrder();
        int int91 = pricingRequest76.loyaltyPoints();
        double double92 = pricingEngine0.calculateFinalPrice(pricingRequest76);
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str9, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str11, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 7.99d + "'", double15 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 8.67d + "'", double40 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType43 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType43.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str49, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 7.99d + "'", double53 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType56 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType56.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str62, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str64, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + customerType67 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType67.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 7.99d + "'", double68 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType71 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType71.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str77, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + customerType81 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType81.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 7.99d + "'", double92 == 7.99d);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) ' ', customerType2, true, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=97]", false, 1);
        int int8 = pricingRequest7.quantity();
        int int9 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        double double8 = pricingRequest7.basePrice();
        java.lang.String str9 = pricingRequest7.toString();
        int int10 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        java.lang.String str12 = pricingRequest7.toString();
        boolean boolean13 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest7.customerType();
        int int15 = pricingRequest7.loyaltyPoints();
        int int16 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine pricingEngine17 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType20, false, "", true, (int) (byte) 0);
        java.lang.String str26 = pricingRequest25.toString();
        boolean boolean27 = pricingRequest25.seasonalSale();
        java.lang.String str28 = pricingRequest25.toString();
        int int29 = pricingRequest25.loyaltyPoints();
        double double30 = pricingRequest25.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType31 = pricingRequest25.customerType();
        double double32 = pricingEngine17.calculateFinalPrice(pricingRequest25);
        com.viktor.lab4.PricingEngine.CustomerType customerType35 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest40 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType35, false, "", true, (int) (byte) 0);
        int int41 = pricingRequest40.loyaltyPoints();
        int int42 = pricingRequest40.loyaltyPoints();
        double double43 = pricingRequest40.basePrice();
        double double44 = pricingEngine17.calculateFinalPrice(pricingRequest40);
        boolean boolean45 = pricingRequest7.equals((java.lang.Object) double44);
        int int46 = pricingRequest7.loyaltyPoints();
        java.lang.Class<?> wildcardClass47 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str9, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(customerType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(customerType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str26, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str28, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + customerType31 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType31.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 7.99d + "'", double32 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType35 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType35.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 7.99d + "'", double44 == 7.99d);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType5 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest10 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType5, true, "hi!", false, (int) (byte) -1);
        double double11 = pricingRequest10.basePrice();
        java.lang.String str12 = pricingRequest10.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean14 = pricingRequest10.equals((java.lang.Object) customerType13);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (byte) 100, customerType13, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", false, (int) 'a');
        double double20 = pricingEngine0.calculateFinalPrice(pricingRequest19);
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType27, true, "hi!", false, (int) (byte) -1);
        double double33 = pricingRequest32.basePrice();
        java.lang.String str34 = pricingRequest32.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType35 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean36 = pricingRequest32.equals((java.lang.Object) customerType35);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest41 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (byte) 100, customerType35, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", false, (int) 'a');
        com.viktor.lab4.PricingEngine.CustomerType customerType42 = pricingRequest41.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest47 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 10, (int) (short) 1, customerType42, false, "", false, 100);
        java.lang.String str48 = pricingRequest47.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType53 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest58 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType53, true, "hi!", false, (int) (byte) -1);
        double double59 = pricingRequest58.basePrice();
        java.lang.String str60 = pricingRequest58.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType61 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean62 = pricingRequest58.equals((java.lang.Object) customerType61);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest67 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (byte) 100, customerType61, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", false, (int) 'a');
        boolean boolean68 = pricingRequest67.firstOrder();
        boolean boolean69 = pricingRequest67.seasonalSale();
        boolean boolean70 = pricingRequest47.equals((java.lang.Object) boolean69);
        double double71 = pricingEngine0.calculateFinalPrice(pricingRequest47);
        com.viktor.lab4.PricingEngine.CustomerType customerType74 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest79 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType74, true, "hi!", false, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType80 = pricingRequest79.customerType();
        int int81 = pricingRequest79.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType82 = pricingRequest79.customerType();
        boolean boolean83 = pricingRequest79.firstOrder();
        // The following exception was thrown during execution in test generation
        try {
            double double84 = pricingEngine0.calculateFinalPrice(pricingRequest79);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 657.99d + "'", double20 == 657.99d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str34, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType35 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType35.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + customerType42 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType42.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 10.0d + "'", double59 == 10.0d);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str60, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType61 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType61.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 16.69d + "'", double71 == 16.69d);
        org.junit.Assert.assertNull(customerType80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNull(customerType82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        double double8 = pricingRequest7.basePrice();
        boolean boolean9 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        boolean boolean12 = pricingRequest7.equals((java.lang.Object) false);
        java.lang.String str13 = pricingRequest7.couponCode();
        boolean boolean14 = pricingRequest7.firstOrder();
        boolean boolean15 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        double double8 = pricingRequest7.basePrice();
        boolean boolean9 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        boolean boolean11 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType14, true, "hi!", false, (int) (byte) -1);
        java.lang.String str20 = pricingRequest19.toString();
        boolean boolean21 = pricingRequest19.firstOrder();
        int int22 = pricingRequest19.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1), 10, customerType27, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", true, (int) (short) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest37 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) (short) 0, customerType27, false, "", true, (int) 'a');
        boolean boolean38 = pricingRequest19.equals((java.lang.Object) (short) 0);
        boolean boolean39 = pricingRequest7.equals((java.lang.Object) boolean38);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str20, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + customerType27 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType27.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        double double8 = pricingRequest7.basePrice();
        boolean boolean9 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        boolean boolean12 = pricingRequest7.equals((java.lang.Object) false);
        java.lang.String str13 = pricingRequest7.couponCode();
        int int14 = pricingRequest7.loyaltyPoints();
        boolean boolean15 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType19, false, "", true, (int) (byte) 0);
        java.lang.String str25 = pricingRequest24.toString();
        boolean boolean26 = pricingRequest24.seasonalSale();
        int int27 = pricingRequest24.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = pricingRequest24.customerType();
        boolean boolean29 = pricingRequest7.equals((java.lang.Object) customerType28);
        boolean boolean30 = pricingRequest7.firstOrder();
        double double31 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(customerType16);
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str25, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType10, true, "hi!", false, (int) (byte) -1);
        double double16 = pricingRequest15.basePrice();
        java.lang.String str17 = pricingRequest15.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean19 = pricingRequest15.equals((java.lang.Object) customerType18);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (byte) 100, customerType18, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", false, (int) 'a');
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = pricingRequest24.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 10, (int) (short) 1, customerType25, false, "", false, 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, 10, customerType25, true, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]", false, (int) (short) 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest40 = new com.viktor.lab4.PricingEngine.PricingRequest(657.99d, (int) (short) 100, customerType25, false, "", true, (int) ' ');
        java.lang.Class<?> wildcardClass41 = customerType25.getClass();
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str17, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType6, false, "", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) (short) 100, customerType6, false, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, (int) (short) 1, customerType6, true, "", true, 1);
        int int22 = pricingRequest21.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType25, true, "hi!", false, (int) (byte) -1);
        double double31 = pricingRequest30.basePrice();
        boolean boolean32 = pricingRequest30.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType33 = pricingRequest30.customerType();
        boolean boolean35 = pricingRequest30.equals((java.lang.Object) false);
        com.viktor.lab4.PricingEngine.CustomerType customerType36 = pricingRequest30.customerType();
        boolean boolean37 = pricingRequest30.seasonalSale();
        java.lang.String str38 = pricingRequest30.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType41 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest46 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType41, false, "", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType47 = pricingRequest46.customerType();
        boolean boolean48 = pricingRequest30.equals((java.lang.Object) customerType47);
        boolean boolean49 = pricingRequest21.equals((java.lang.Object) pricingRequest30);
        int int50 = pricingRequest30.loyaltyPoints();
        boolean boolean51 = pricingRequest30.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType52 = pricingRequest30.customerType();
        boolean boolean53 = pricingRequest30.seasonalSale();
        double double54 = pricingRequest30.basePrice();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(customerType33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(customerType36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str38, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType41 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType41.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType47 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType47.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(customerType52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 10.0d + "'", double54 == 10.0d);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        double double8 = pricingRequest7.basePrice();
        java.lang.String str9 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean11 = pricingRequest7.equals((java.lang.Object) customerType10);
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest7.customerType();
        int int13 = pricingRequest7.loyaltyPoints();
        int int14 = pricingRequest7.loyaltyPoints();
        int int15 = pricingRequest7.quantity();
        int int16 = pricingRequest7.loyaltyPoints();
        boolean boolean17 = pricingRequest7.seasonalSale();
        int int18 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str9, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(customerType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType3, false, "", true, (int) (byte) 0);
        java.lang.String str9 = pricingRequest8.toString();
        boolean boolean10 = pricingRequest8.seasonalSale();
        java.lang.String str11 = pricingRequest8.toString();
        int int12 = pricingRequest8.loyaltyPoints();
        double double13 = pricingRequest8.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest8.customerType();
        double double15 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType22, false, "", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) (short) 100, customerType22, false, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest37 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, (int) (short) 1, customerType22, true, "", true, 1);
        int int38 = pricingRequest37.loyaltyPoints();
        boolean boolean39 = pricingRequest37.firstOrder();
        double double40 = pricingEngine0.calculateFinalPrice(pricingRequest37);
        com.viktor.lab4.PricingEngine.CustomerType customerType43 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest48 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType43, false, "", true, (int) (byte) 0);
        java.lang.String str49 = pricingRequest48.toString();
        boolean boolean50 = pricingRequest48.seasonalSale();
        int int51 = pricingRequest48.loyaltyPoints();
        boolean boolean52 = pricingRequest48.firstOrder();
        double double53 = pricingEngine0.calculateFinalPrice(pricingRequest48);
        com.viktor.lab4.PricingEngine.CustomerType customerType56 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest61 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType56, true, "hi!", false, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType62 = pricingRequest61.customerType();
        int int63 = pricingRequest61.quantity();
        java.lang.String str64 = pricingRequest61.toString();
        java.lang.Object obj65 = null;
        boolean boolean66 = pricingRequest61.equals(obj65);
        // The following exception was thrown during execution in test generation
        try {
            double double67 = pricingEngine0.calculateFinalPrice(pricingRequest61);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str9, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str11, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 7.99d + "'", double15 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 8.67d + "'", double40 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType43 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType43.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str49, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 7.99d + "'", double53 == 7.99d);
        org.junit.Assert.assertNull(customerType62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str64, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1), 10, customerType4, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", true, (int) (short) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) (short) 0, customerType4, false, "", true, (int) 'a');
        boolean boolean15 = pricingRequest14.seasonalSale();
        boolean boolean16 = pricingRequest14.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        double double8 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest7.customerType();
        int int10 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType13, false, "", true, (int) (byte) 0);
        java.lang.String str19 = pricingRequest18.toString();
        java.lang.String str20 = pricingRequest18.couponCode();
        java.lang.String str21 = pricingRequest18.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType24, false, "", true, (int) (byte) 0);
        int int30 = pricingRequest29.loyaltyPoints();
        int int31 = pricingRequest29.quantity();
        boolean boolean32 = pricingRequest18.equals((java.lang.Object) pricingRequest29);
        com.viktor.lab4.PricingEngine.CustomerType customerType33 = pricingRequest18.customerType();
        java.lang.Class<?> wildcardClass34 = customerType33.getClass();
        boolean boolean35 = pricingRequest7.equals((java.lang.Object) customerType33);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNull(customerType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str19, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str21, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + customerType24 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType24.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + customerType33 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType33.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType10, false, "", true, (int) (byte) 0);
        boolean boolean16 = pricingRequest7.equals((java.lang.Object) true);
        boolean boolean17 = pricingRequest7.seasonalSale();
        java.lang.String str18 = pricingRequest7.toString();
        double double19 = pricingRequest7.basePrice();
        int int20 = pricingRequest7.quantity();
        java.lang.Class<?> wildcardClass21 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str18, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        double double8 = pricingRequest7.basePrice();
        java.lang.String str9 = pricingRequest7.toString();
        int int10 = pricingRequest7.loyaltyPoints();
        boolean boolean11 = pricingRequest7.seasonalSale();
        boolean boolean12 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str9, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType4, true, "hi!", false, (int) (byte) -1);
        double double10 = pricingRequest9.basePrice();
        java.lang.String str11 = pricingRequest9.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean13 = pricingRequest9.equals((java.lang.Object) customerType12);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (byte) 100, customerType12, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", false, (int) 'a');
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = pricingRequest18.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType22, true, "hi!", false, (int) (byte) -1);
        double double28 = pricingRequest27.basePrice();
        boolean boolean29 = pricingRequest27.firstOrder();
        int int30 = pricingRequest27.quantity();
        boolean boolean31 = pricingRequest27.firstOrder();
        boolean boolean32 = pricingRequest18.equals((java.lang.Object) pricingRequest27);
        int int33 = pricingRequest27.loyaltyPoints();
        int int34 = pricingRequest27.quantity();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str11, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType4, true, "hi!", false, (int) (byte) -1);
        double double10 = pricingRequest9.basePrice();
        java.lang.String str11 = pricingRequest9.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean13 = pricingRequest9.equals((java.lang.Object) customerType12);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) (short) 10, customerType12, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", false, (-1));
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) ' ', customerType23, true, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=97]", false, 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) '#', customerType23, false, "hi!", false, 97);
        boolean boolean34 = pricingRequest18.equals((java.lang.Object) customerType23);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str11, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType2, false, "", true, (int) (byte) 0);
        java.lang.String str8 = pricingRequest7.toString();
        boolean boolean9 = pricingRequest7.seasonalSale();
        java.lang.String str10 = pricingRequest7.toString();
        int int11 = pricingRequest7.loyaltyPoints();
        int int12 = pricingRequest7.loyaltyPoints();
        java.lang.String str13 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str8, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str10, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str13, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        double double8 = pricingRequest7.basePrice();
        java.lang.String str9 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean11 = pricingRequest7.equals((java.lang.Object) customerType10);
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest7.customerType();
        java.lang.String str13 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest7.customerType();
        int int15 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str9, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(customerType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str13, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertNull(customerType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(customerType16);
        org.junit.Assert.assertNull(customerType17);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        double double8 = pricingRequest7.basePrice();
        boolean boolean9 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        boolean boolean12 = pricingRequest7.equals((java.lang.Object) false);
        java.lang.String str13 = pricingRequest7.couponCode();
        int int14 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest7.customerType();
        int int16 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest26 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType21, true, "hi!", false, (int) (byte) -1);
        double double27 = pricingRequest26.basePrice();
        java.lang.String str28 = pricingRequest26.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType29 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean30 = pricingRequest26.equals((java.lang.Object) customerType29);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (byte) 100, customerType29, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", false, (int) 'a');
        com.viktor.lab4.PricingEngine.CustomerType customerType36 = pricingRequest35.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType39 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest44 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType39, true, "hi!", false, (int) (byte) -1);
        double double45 = pricingRequest44.basePrice();
        boolean boolean46 = pricingRequest44.firstOrder();
        int int47 = pricingRequest44.quantity();
        boolean boolean48 = pricingRequest44.firstOrder();
        boolean boolean49 = pricingRequest35.equals((java.lang.Object) pricingRequest44);
        double double50 = pricingRequest35.basePrice();
        boolean boolean51 = pricingRequest7.equals((java.lang.Object) pricingRequest35);
        boolean boolean52 = pricingRequest35.seasonalSale();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(customerType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str28, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType29 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType29.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + customerType36 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType36.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 10.0d + "'", double45 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 10.0d + "'", double50 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        int int8 = pricingRequest7.loyaltyPoints();
        int int9 = pricingRequest7.quantity();
        int int10 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType14, true, "hi!", false, (int) (byte) -1);
        double double20 = pricingRequest19.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = pricingRequest19.customerType();
        boolean boolean22 = pricingRequest7.equals((java.lang.Object) pricingRequest19);
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType25, true, "hi!", false, (int) (byte) -1);
        double double31 = pricingRequest30.basePrice();
        boolean boolean32 = pricingRequest30.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType33 = pricingRequest30.customerType();
        int int34 = pricingRequest30.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType37 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest42 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType37, true, "hi!", false, (int) (byte) -1);
        double double43 = pricingRequest42.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType44 = pricingRequest42.customerType();
        boolean boolean45 = pricingRequest30.equals((java.lang.Object) pricingRequest42);
        java.lang.String str46 = pricingRequest42.toString();
        double double47 = pricingRequest42.basePrice();
        boolean boolean48 = pricingRequest19.equals((java.lang.Object) pricingRequest42);
        boolean boolean49 = pricingRequest19.firstOrder();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(customerType11);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNull(customerType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(customerType33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 10.0d + "'", double43 == 10.0d);
        org.junit.Assert.assertNull(customerType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str46, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 10.0d + "'", double47 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1), 10, customerType4, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", true, (int) (short) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, (int) (byte) 10, customerType4, true, "PricingRequest[basePrice=1.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, 0);
        int int15 = pricingRequest14.loyaltyPoints();
        double double16 = pricingRequest14.basePrice();
        int int17 = pricingRequest14.loyaltyPoints();
        java.lang.Class<?> wildcardClass18 = pricingRequest14.getClass();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        double double8 = pricingRequest7.basePrice();
        boolean boolean9 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        boolean boolean12 = pricingRequest7.equals((java.lang.Object) false);
        java.lang.String str13 = pricingRequest7.couponCode();
        int int14 = pricingRequest7.loyaltyPoints();
        boolean boolean15 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest7.customerType();
        int int17 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType22, true, "hi!", false, (int) (byte) -1);
        double double28 = pricingRequest27.basePrice();
        java.lang.String str29 = pricingRequest27.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType30 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean31 = pricingRequest27.equals((java.lang.Object) customerType30);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest36 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (byte) 100, customerType30, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", false, (int) 'a');
        com.viktor.lab4.PricingEngine.CustomerType customerType37 = pricingRequest36.customerType();
        boolean boolean38 = pricingRequest7.equals((java.lang.Object) pricingRequest36);
        int int39 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(customerType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str29, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType30 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType30.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + customerType37 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType37.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType4, true, "hi!", false, (int) (byte) -1);
        double double10 = pricingRequest9.basePrice();
        java.lang.String str11 = pricingRequest9.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean13 = pricingRequest9.equals((java.lang.Object) customerType12);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 0, 10, customerType12, true, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=97]", true, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str11, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType4, true, "hi!", false, (int) (byte) -1);
        double double10 = pricingRequest9.basePrice();
        java.lang.String str11 = pricingRequest9.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean13 = pricingRequest9.equals((java.lang.Object) customerType12);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (byte) 100, customerType12, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", false, (int) 'a');
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = pricingRequest18.customerType();
        double double20 = pricingRequest18.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = pricingRequest18.customerType();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str11, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType21 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType21.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType2, false, "", true, (int) (byte) 0);
        java.lang.String str8 = pricingRequest7.toString();
        java.lang.String str9 = pricingRequest7.couponCode();
        java.lang.String str10 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType13, false, "", true, (int) (byte) 0);
        int int19 = pricingRequest18.loyaltyPoints();
        int int20 = pricingRequest18.quantity();
        boolean boolean21 = pricingRequest7.equals((java.lang.Object) pricingRequest18);
        int int22 = pricingRequest18.loyaltyPoints();
        java.lang.String str23 = pricingRequest18.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str8, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str10, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        int int9 = pricingRequest7.quantity();
        boolean boolean10 = pricingRequest7.seasonalSale();
        int int11 = pricingRequest7.loyaltyPoints();
        int int12 = pricingRequest7.quantity();
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType8, false, "", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) (short) 100, customerType8, false, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, (int) (short) 1, customerType8, true, "", true, 1);
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = pricingRequest23.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), 0, customerType24, false, "", true, (int) (short) 0);
        java.lang.String str30 = pricingRequest29.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType31 = pricingRequest29.customerType();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType24 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType24.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "PricingRequest[basePrice=-1.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str30, "PricingRequest[basePrice=-1.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + customerType31 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType31.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType2, false, "", true, (int) (byte) 0);
        java.lang.String str8 = pricingRequest7.toString();
        boolean boolean9 = pricingRequest7.seasonalSale();
        boolean boolean10 = pricingRequest7.firstOrder();
        double double11 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str8, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine pricingEngine1 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType6, true, "hi!", false, (int) (byte) -1);
        double double12 = pricingRequest11.basePrice();
        java.lang.String str13 = pricingRequest11.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean15 = pricingRequest11.equals((java.lang.Object) customerType14);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (byte) 100, customerType14, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", false, (int) 'a');
        double double21 = pricingEngine1.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType24, false, "", true, (int) (byte) 0);
        java.lang.String str30 = pricingRequest29.toString();
        boolean boolean31 = pricingRequest29.seasonalSale();
        java.lang.String str32 = pricingRequest29.toString();
        double double33 = pricingRequest29.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest45 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType40, false, "", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest50 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) (short) 100, customerType40, false, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest55 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, (int) (short) 1, customerType40, true, "", true, 1);
        boolean boolean56 = pricingRequest29.equals((java.lang.Object) (short) 1);
        double double57 = pricingEngine1.calculateFinalPrice(pricingRequest29);
        double double58 = pricingEngine0.calculateFinalPrice(pricingRequest29);
        java.lang.String str59 = pricingRequest29.toString();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str13, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 657.99d + "'", double21 == 657.99d);
        org.junit.Assert.assertTrue("'" + customerType24 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType24.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str30, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str32, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 7.99d + "'", double57 == 7.99d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 7.99d + "'", double58 == 7.99d);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str59, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType6, false, "", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) (short) 100, customerType6, false, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, (int) (short) 1, customerType6, true, "", true, 1);
        int int22 = pricingRequest21.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType25, true, "hi!", false, (int) (byte) -1);
        double double31 = pricingRequest30.basePrice();
        boolean boolean32 = pricingRequest30.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType33 = pricingRequest30.customerType();
        boolean boolean35 = pricingRequest30.equals((java.lang.Object) false);
        com.viktor.lab4.PricingEngine.CustomerType customerType36 = pricingRequest30.customerType();
        boolean boolean37 = pricingRequest30.seasonalSale();
        java.lang.String str38 = pricingRequest30.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType41 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest46 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType41, false, "", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType47 = pricingRequest46.customerType();
        boolean boolean48 = pricingRequest30.equals((java.lang.Object) customerType47);
        boolean boolean49 = pricingRequest21.equals((java.lang.Object) pricingRequest30);
        int int50 = pricingRequest30.loyaltyPoints();
        boolean boolean51 = pricingRequest30.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType54 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest59 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType54, true, "hi!", false, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType60 = pricingRequest59.customerType();
        int int61 = pricingRequest59.loyaltyPoints();
        boolean boolean62 = pricingRequest30.equals((java.lang.Object) pricingRequest59);
        com.viktor.lab4.PricingEngine.CustomerType customerType63 = pricingRequest30.customerType();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(customerType33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(customerType36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str38, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType41 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType41.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType47 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType47.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(customerType60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNull(customerType63);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType2, false, "", true, (int) (byte) 0);
        java.lang.String str8 = pricingRequest7.toString();
        java.lang.String str9 = pricingRequest7.couponCode();
        java.lang.String str10 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType13, true, "hi!", false, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = pricingRequest18.customerType();
        int int20 = pricingRequest18.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = pricingRequest18.customerType();
        int int22 = pricingRequest18.loyaltyPoints();
        boolean boolean23 = pricingRequest7.equals((java.lang.Object) pricingRequest18);
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = pricingRequest7.customerType();
        boolean boolean25 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str8, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str10, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertNull(customerType19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(customerType21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + customerType24 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType24.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType8, true, "hi!", false, (int) (byte) -1);
        double double14 = pricingRequest13.basePrice();
        java.lang.String str15 = pricingRequest13.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean17 = pricingRequest13.equals((java.lang.Object) customerType16);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (byte) 100, customerType16, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", false, (int) 'a');
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = pricingRequest22.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 10, (int) (short) 1, customerType23, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", false, (int) (byte) 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (-1), customerType23, true, "PricingRequest[basePrice=10.0, quantity=100, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=97]", false, 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str15, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType10, true, "hi!", false, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest15.customerType();
        int int17 = pricingRequest15.quantity();
        java.lang.String str18 = pricingRequest15.toString();
        java.lang.Object obj19 = null;
        boolean boolean20 = pricingRequest15.equals(obj19);
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = pricingRequest15.customerType();
        boolean boolean22 = pricingRequest7.equals((java.lang.Object) customerType21);
        java.lang.String str23 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = pricingRequest7.customerType();
        org.junit.Assert.assertNull(customerType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str18, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(customerType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNull(customerType24);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        int int9 = pricingRequest7.quantity();
        java.lang.String str10 = pricingRequest7.toString();
        java.lang.Object obj11 = null;
        boolean boolean12 = pricingRequest7.equals(obj11);
        boolean boolean13 = pricingRequest7.seasonalSale();
        java.lang.String str14 = pricingRequest7.couponCode();
        java.lang.String str15 = pricingRequest7.toString();
        java.lang.String str16 = pricingRequest7.toString();
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str10, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str15, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str16, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        com.viktor.lab4.PricingEngine pricingEngine4 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType7 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest12 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType7, false, "", true, (int) (byte) 0);
        java.lang.String str13 = pricingRequest12.toString();
        boolean boolean14 = pricingRequest12.seasonalSale();
        java.lang.String str15 = pricingRequest12.toString();
        int int16 = pricingRequest12.loyaltyPoints();
        double double17 = pricingRequest12.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = pricingRequest12.customerType();
        double double19 = pricingEngine4.calculateFinalPrice(pricingRequest12);
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = pricingRequest12.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (-1), customerType20, true, "hi!", true, (int) (short) 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) (short) 100, customerType20, false, "hi!", false, (-1));
        com.viktor.lab4.PricingEngine.CustomerType customerType37 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest42 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType37, false, "", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest47 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) (short) 100, customerType37, false, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest52 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, (int) (short) 1, customerType37, true, "", true, 1);
        int int53 = pricingRequest52.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType56 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest61 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType56, true, "hi!", false, (int) (byte) -1);
        double double62 = pricingRequest61.basePrice();
        boolean boolean63 = pricingRequest61.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType64 = pricingRequest61.customerType();
        boolean boolean66 = pricingRequest61.equals((java.lang.Object) false);
        com.viktor.lab4.PricingEngine.CustomerType customerType67 = pricingRequest61.customerType();
        boolean boolean68 = pricingRequest61.seasonalSale();
        java.lang.String str69 = pricingRequest61.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType72 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest77 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType72, false, "", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType78 = pricingRequest77.customerType();
        boolean boolean79 = pricingRequest61.equals((java.lang.Object) customerType78);
        boolean boolean80 = pricingRequest52.equals((java.lang.Object) pricingRequest61);
        com.viktor.lab4.PricingEngine.CustomerType customerType81 = pricingRequest61.customerType();
        java.lang.String str82 = pricingRequest61.toString();
        boolean boolean83 = pricingRequest30.equals((java.lang.Object) pricingRequest61);
        org.junit.Assert.assertTrue("'" + customerType7 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType7.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str13, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str15, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 7.99d + "'", double19 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType37 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType37.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 10.0d + "'", double62 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(customerType64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(customerType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str69, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType72 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType72.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType78 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType78.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNull(customerType81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str82, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType4, false, "", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (short) -1, customerType4, false, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]", false, (int) (byte) 100);
        boolean boolean15 = pricingRequest14.seasonalSale();
        double double16 = pricingRequest14.basePrice();
        boolean boolean17 = pricingRequest14.seasonalSale();
        int int18 = pricingRequest14.quantity();
        double double19 = pricingRequest14.basePrice();
        int int20 = pricingRequest14.quantity();
        boolean boolean21 = pricingRequest14.seasonalSale();
        boolean boolean22 = pricingRequest14.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType4, false, "", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (short) -1, customerType4, false, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]", false, (int) (byte) 100);
        boolean boolean15 = pricingRequest14.seasonalSale();
        boolean boolean16 = pricingRequest14.firstOrder();
        int int17 = pricingRequest14.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType20, true, "hi!", false, (int) (byte) -1);
        double double26 = pricingRequest25.basePrice();
        boolean boolean27 = pricingRequest25.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = pricingRequest25.customerType();
        boolean boolean30 = pricingRequest25.equals((java.lang.Object) false);
        java.lang.String str31 = pricingRequest25.couponCode();
        int int32 = pricingRequest25.loyaltyPoints();
        double double33 = pricingRequest25.basePrice();
        boolean boolean34 = pricingRequest25.firstOrder();
        boolean boolean35 = pricingRequest14.equals((java.lang.Object) boolean34);
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(customerType28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType5 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest10 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1), 10, customerType5, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", true, (int) (short) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, (int) (byte) 10, customerType5, true, "PricingRequest[basePrice=1.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, 0);
        int int16 = pricingRequest15.loyaltyPoints();
        double double17 = pricingEngine0.calculateFinalPrice(pricingRequest15);
        org.junit.Assert.assertTrue("'" + customerType5 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType5.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 7.99d + "'", double17 == 7.99d);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType5 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest10 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType5, true, "hi!", false, (int) (byte) -1);
        double double11 = pricingRequest10.basePrice();
        java.lang.String str12 = pricingRequest10.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean14 = pricingRequest10.equals((java.lang.Object) customerType13);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (byte) 100, customerType13, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", false, (int) 'a');
        double double20 = pricingEngine0.calculateFinalPrice(pricingRequest19);
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType25, true, "hi!", false, (int) (byte) -1);
        double double31 = pricingRequest30.basePrice();
        java.lang.String str32 = pricingRequest30.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType33 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean34 = pricingRequest30.equals((java.lang.Object) customerType33);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest39 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (byte) 100, customerType33, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", false, (int) 'a');
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = pricingRequest39.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType43 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest48 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType43, true, "hi!", false, (int) (byte) -1);
        double double49 = pricingRequest48.basePrice();
        boolean boolean50 = pricingRequest48.firstOrder();
        int int51 = pricingRequest48.quantity();
        boolean boolean52 = pricingRequest48.firstOrder();
        boolean boolean53 = pricingRequest39.equals((java.lang.Object) pricingRequest48);
        double double54 = pricingEngine0.calculateFinalPrice(pricingRequest39);
        com.viktor.lab4.PricingEngine.CustomerType customerType57 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest62 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType57, false, "", true, (int) (byte) 0);
        java.lang.String str63 = pricingRequest62.toString();
        boolean boolean64 = pricingRequest62.seasonalSale();
        java.lang.String str65 = pricingRequest62.toString();
        boolean boolean67 = pricingRequest62.equals((java.lang.Object) "hi!");
        com.viktor.lab4.PricingEngine.CustomerType customerType68 = pricingRequest62.customerType();
        double double69 = pricingEngine0.calculateFinalPrice(pricingRequest62);
        java.lang.String str70 = pricingRequest62.couponCode();
        int int71 = pricingRequest62.loyaltyPoints();
        int int72 = pricingRequest62.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType73 = pricingRequest62.customerType();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 657.99d + "'", double20 == 657.99d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str32, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType33 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType33.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10.0d + "'", double49 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 657.99d + "'", double54 == 657.99d);
        org.junit.Assert.assertTrue("'" + customerType57 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType57.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str63, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str65, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + customerType68 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType68.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 7.99d + "'", double69 == 7.99d);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertTrue("'" + customerType73 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType73.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType6, false, "", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) 100, customerType6, false, "PricingRequest[basePrice=1.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest16.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (byte) 10, customerType17, true, "hi!", true, (int) (byte) -1);
        int int23 = pricingRequest22.quantity();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType4, false, "", true, (int) (byte) 0);
        int int10 = pricingRequest9.loyaltyPoints();
        int int11 = pricingRequest9.quantity();
        double double12 = pricingRequest9.basePrice();
        int int13 = pricingRequest9.quantity();
        double double14 = pricingRequest9.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (short) 1, customerType15, true, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=97]", true, 97);
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType23, true, "hi!", false, (int) (byte) -1);
        double double29 = pricingRequest28.basePrice();
        boolean boolean30 = pricingRequest28.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType31 = pricingRequest28.customerType();
        boolean boolean33 = pricingRequest28.equals((java.lang.Object) false);
        java.lang.String str34 = pricingRequest28.couponCode();
        int int35 = pricingRequest28.loyaltyPoints();
        java.lang.String str36 = pricingRequest28.toString();
        boolean boolean37 = pricingRequest20.equals((java.lang.Object) pricingRequest28);
        boolean boolean38 = pricingRequest28.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(customerType31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str36, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine pricingEngine1 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType6, true, "hi!", false, (int) (byte) -1);
        double double12 = pricingRequest11.basePrice();
        java.lang.String str13 = pricingRequest11.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean15 = pricingRequest11.equals((java.lang.Object) customerType14);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (byte) 100, customerType14, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", false, (int) 'a');
        double double21 = pricingEngine1.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType24, false, "", true, (int) (byte) 0);
        java.lang.String str30 = pricingRequest29.toString();
        boolean boolean31 = pricingRequest29.seasonalSale();
        java.lang.String str32 = pricingRequest29.toString();
        double double33 = pricingRequest29.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest45 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType40, false, "", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest50 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) (short) 100, customerType40, false, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest55 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, (int) (short) 1, customerType40, true, "", true, 1);
        boolean boolean56 = pricingRequest29.equals((java.lang.Object) (short) 1);
        double double57 = pricingEngine1.calculateFinalPrice(pricingRequest29);
        double double58 = pricingEngine0.calculateFinalPrice(pricingRequest29);
        com.viktor.lab4.PricingEngine.CustomerType customerType61 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest66 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType61, false, "", true, (int) (byte) 0);
        java.lang.String str67 = pricingRequest66.toString();
        boolean boolean68 = pricingRequest66.seasonalSale();
        java.lang.String str69 = pricingRequest66.toString();
        int int70 = pricingRequest66.loyaltyPoints();
        double double71 = pricingEngine0.calculateFinalPrice(pricingRequest66);
        com.viktor.lab4.PricingEngine.CustomerType customerType74 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest79 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType74, false, "", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType80 = pricingRequest79.customerType();
        double double81 = pricingEngine0.calculateFinalPrice(pricingRequest79);
        com.viktor.lab4.PricingEngine.CustomerType customerType84 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest89 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType84, false, "", true, (int) (byte) 0);
        java.lang.String str90 = pricingRequest89.toString();
        java.lang.String str91 = pricingRequest89.couponCode();
        int int92 = pricingRequest89.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType93 = pricingRequest89.customerType();
        int int94 = pricingRequest89.quantity();
        double double95 = pricingEngine0.calculateFinalPrice(pricingRequest89);
        java.lang.String str96 = pricingRequest89.couponCode();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str13, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 657.99d + "'", double21 == 657.99d);
        org.junit.Assert.assertTrue("'" + customerType24 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType24.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str30, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str32, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 7.99d + "'", double57 == 7.99d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 7.99d + "'", double58 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType61 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType61.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str67, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str69, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 7.99d + "'", double71 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType74 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType74.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType80 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType80.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 7.99d + "'", double81 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType84 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType84.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str90, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 1 + "'", int92 == 1);
        org.junit.Assert.assertTrue("'" + customerType93 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType93.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 1 + "'", int94 == 1);
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 7.99d + "'", double95 == 7.99d);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "" + "'", str96, "");
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        double double8 = pricingRequest7.basePrice();
        java.lang.String str9 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean11 = pricingRequest7.equals((java.lang.Object) customerType10);
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest7.customerType();
        java.lang.String str13 = pricingRequest7.toString();
        int int14 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType17, true, "hi!", false, (int) (byte) -1);
        double double23 = pricingRequest22.basePrice();
        java.lang.String str24 = pricingRequest22.toString();
        int int25 = pricingRequest22.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = pricingRequest22.customerType();
        java.lang.String str27 = pricingRequest22.toString();
        boolean boolean28 = pricingRequest22.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType29 = pricingRequest22.customerType();
        int int30 = pricingRequest22.quantity();
        boolean boolean31 = pricingRequest7.equals((java.lang.Object) pricingRequest22);
        boolean boolean32 = pricingRequest7.firstOrder();
        boolean boolean33 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str9, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(customerType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str13, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str24, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(customerType26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str27, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(customerType29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType4, false, "", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (short) -1, customerType4, false, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]", false, (int) (byte) 100);
        boolean boolean15 = pricingRequest14.firstOrder();
        int int16 = pricingRequest14.quantity();
        java.lang.Object obj17 = null;
        boolean boolean18 = pricingRequest14.equals(obj17);
        java.lang.String str19 = pricingRequest14.couponCode();
        double double20 = pricingRequest14.basePrice();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str19, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        int int9 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType12, true, "hi!", false, (int) (byte) -1);
        double double18 = pricingRequest17.basePrice();
        java.lang.String str19 = pricingRequest17.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean21 = pricingRequest17.equals((java.lang.Object) customerType20);
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest17.customerType();
        java.lang.String str23 = pricingRequest17.couponCode();
        boolean boolean24 = pricingRequest17.firstOrder();
        boolean boolean25 = pricingRequest17.firstOrder();
        java.lang.String str26 = pricingRequest17.toString();
        boolean boolean27 = pricingRequest7.equals((java.lang.Object) pricingRequest17);
        com.viktor.lab4.PricingEngine.CustomerType customerType30 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType30, true, "hi!", false, (int) (byte) -1);
        double double36 = pricingRequest35.basePrice();
        java.lang.String str37 = pricingRequest35.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType38 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean39 = pricingRequest35.equals((java.lang.Object) customerType38);
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = pricingRequest35.customerType();
        int int41 = pricingRequest35.loyaltyPoints();
        int int42 = pricingRequest35.loyaltyPoints();
        java.lang.String str43 = pricingRequest35.toString();
        boolean boolean44 = pricingRequest35.firstOrder();
        boolean boolean45 = pricingRequest17.equals((java.lang.Object) boolean44);
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str19, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(customerType22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str26, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str37, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType38 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType38.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(customerType40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str43, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        int int9 = pricingRequest7.quantity();
        java.lang.String str10 = pricingRequest7.toString();
        java.lang.Object obj11 = null;
        boolean boolean12 = pricingRequest7.equals(obj11);
        boolean boolean13 = pricingRequest7.seasonalSale();
        java.lang.String str14 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest7.customerType();
        boolean boolean16 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str10, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(customerType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1), 10, customerType4, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", true, (int) (short) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) (short) 0, customerType4, false, "", true, (int) 'a');
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest14.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType22, true, "hi!", false, (int) (byte) -1);
        double double28 = pricingRequest27.basePrice();
        java.lang.String str29 = pricingRequest27.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType30 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean31 = pricingRequest27.equals((java.lang.Object) customerType30);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest36 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (byte) 100, customerType30, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", false, (int) 'a');
        com.viktor.lab4.PricingEngine.CustomerType customerType37 = pricingRequest36.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest42 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 10, (int) (short) 1, customerType37, false, "", false, 100);
        com.viktor.lab4.PricingEngine.CustomerType customerType49 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest54 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType49, true, "hi!", false, (int) (byte) -1);
        double double55 = pricingRequest54.basePrice();
        java.lang.String str56 = pricingRequest54.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType57 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean58 = pricingRequest54.equals((java.lang.Object) customerType57);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest63 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (byte) 100, customerType57, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", false, (int) 'a');
        com.viktor.lab4.PricingEngine.CustomerType customerType64 = pricingRequest63.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest69 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 10, (int) (short) 1, customerType64, false, "", false, 100);
        boolean boolean70 = pricingRequest42.equals((java.lang.Object) false);
        int int71 = pricingRequest42.quantity();
        boolean boolean72 = pricingRequest14.equals((java.lang.Object) pricingRequest42);
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str29, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType30 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType30.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + customerType37 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType37.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 10.0d + "'", double55 == 10.0d);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str56, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType57 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType57.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + customerType64 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType64.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType2, false, "", true, (int) (byte) 0);
        java.lang.String str8 = pricingRequest7.toString();
        boolean boolean9 = pricingRequest7.seasonalSale();
        java.lang.String str10 = pricingRequest7.toString();
        int int11 = pricingRequest7.loyaltyPoints();
        double double12 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest7.customerType();
        java.lang.String str14 = pricingRequest7.toString();
        java.lang.String str15 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str8, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str10, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str14, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str15, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType6, false, "", true, (int) (byte) 0);
        java.lang.String str12 = pricingRequest11.toString();
        java.lang.String str13 = pricingRequest11.couponCode();
        java.lang.String str14 = pricingRequest11.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType17, false, "", true, (int) (byte) 0);
        int int23 = pricingRequest22.loyaltyPoints();
        int int24 = pricingRequest22.quantity();
        boolean boolean25 = pricingRequest11.equals((java.lang.Object) pricingRequest22);
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = pricingRequest22.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, (int) (byte) 1, customerType26, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=1]", true, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest36 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) (short) 10, customerType26, true, "PricingRequest[basePrice=0.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=100]", true, 32);
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str12, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str14, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + customerType26 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType26.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType5 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest10 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType5, false, "", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) (short) 100, customerType5, false, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", true, (-1));
        int int16 = pricingRequest15.quantity();
        java.lang.String str17 = pricingRequest15.toString();
        double double18 = pricingRequest15.basePrice();
        boolean boolean19 = pricingRequest15.firstOrder();
        int int20 = pricingRequest15.loyaltyPoints();
        // The following exception was thrown during execution in test generation
        try {
            double double21 = pricingEngine0.calculateFinalPrice(pricingRequest15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: loyaltyPoints must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType5 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType5.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PricingRequest[basePrice=1.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]" + "'", str17, "PricingRequest[basePrice=1.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType4, false, "", true, (int) (byte) 0);
        int int10 = pricingRequest9.loyaltyPoints();
        int int11 = pricingRequest9.quantity();
        double double12 = pricingRequest9.basePrice();
        int int13 = pricingRequest9.quantity();
        double double14 = pricingRequest9.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (short) 1, customerType15, true, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=97]", true, 97);
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType23, true, "hi!", false, (int) (byte) -1);
        double double29 = pricingRequest28.basePrice();
        boolean boolean30 = pricingRequest28.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType31 = pricingRequest28.customerType();
        boolean boolean33 = pricingRequest28.equals((java.lang.Object) false);
        java.lang.String str34 = pricingRequest28.couponCode();
        int int35 = pricingRequest28.loyaltyPoints();
        java.lang.String str36 = pricingRequest28.toString();
        boolean boolean37 = pricingRequest20.equals((java.lang.Object) pricingRequest28);
        java.lang.String str38 = pricingRequest28.toString();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(customerType31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str36, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str38, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        double double8 = pricingRequest7.basePrice();
        java.lang.String str9 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean11 = pricingRequest7.equals((java.lang.Object) customerType10);
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest7.customerType();
        boolean boolean13 = pricingRequest7.firstOrder();
        int int14 = pricingRequest7.loyaltyPoints();
        boolean boolean16 = pricingRequest7.equals((java.lang.Object) 32);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str9, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(customerType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        java.lang.String str8 = pricingRequest7.toString();
        boolean boolean9 = pricingRequest7.firstOrder();
        java.lang.String str10 = pricingRequest7.toString();
        java.lang.String str11 = pricingRequest7.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str8, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str10, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str11, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType2, false, "", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        int int9 = pricingRequest7.loyaltyPoints();
        boolean boolean10 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType2, false, "", true, (int) (byte) 0);
        int int8 = pricingRequest7.loyaltyPoints();
        int int9 = pricingRequest7.loyaltyPoints();
        double double10 = pricingRequest7.basePrice();
        double double11 = pricingRequest7.basePrice();
        java.lang.String str12 = pricingRequest7.couponCode();
        int int13 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        double double8 = pricingRequest7.basePrice();
        boolean boolean9 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType12, true, "hi!", false, (int) (byte) -1);
        double double18 = pricingRequest17.basePrice();
        java.lang.String str19 = pricingRequest17.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean21 = pricingRequest17.equals((java.lang.Object) customerType20);
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest17.customerType();
        boolean boolean23 = pricingRequest7.equals((java.lang.Object) customerType22);
        java.lang.String str24 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str19, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(customerType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        double double8 = pricingRequest7.basePrice();
        boolean boolean9 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        boolean boolean12 = pricingRequest7.equals((java.lang.Object) false);
        java.lang.String str13 = pricingRequest7.couponCode();
        int int14 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        int int9 = pricingRequest7.loyaltyPoints();
        int int10 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        double double8 = pricingRequest7.basePrice();
        boolean boolean9 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        boolean boolean12 = pricingRequest7.equals((java.lang.Object) false);
        java.lang.String str13 = pricingRequest7.couponCode();
        int int14 = pricingRequest7.loyaltyPoints();
        boolean boolean15 = pricingRequest7.seasonalSale();
        java.lang.String str16 = pricingRequest7.toString();
        boolean boolean17 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str16, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType3, true, "hi!", false, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType11, true, "hi!", false, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest16.customerType();
        int int18 = pricingRequest16.quantity();
        java.lang.String str19 = pricingRequest16.toString();
        java.lang.Object obj20 = null;
        boolean boolean21 = pricingRequest16.equals(obj20);
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest16.customerType();
        boolean boolean23 = pricingRequest8.equals((java.lang.Object) customerType22);
        int int24 = pricingRequest8.loyaltyPoints();
        // The following exception was thrown during execution in test generation
        try {
            double double25 = pricingEngine0.calculateFinalPrice(pricingRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(customerType17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str19, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(customerType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType10, false, "", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) 100, customerType10, false, "PricingRequest[basePrice=1.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = pricingRequest20.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest26 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (byte) 10, customerType21, true, "hi!", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, 100, customerType21, false, "hi!", true, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest36 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '4', (int) (short) 100, customerType21, true, "PricingRequest[basePrice=10.0, quantity=100, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=97]", false, (int) 'a');
        boolean boolean37 = pricingRequest36.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType21 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType21.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        int int9 = pricingRequest7.quantity();
        int int10 = pricingRequest7.loyaltyPoints();
        boolean boolean11 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest7.customerType();
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(customerType12);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        double double8 = pricingRequest7.basePrice();
        boolean boolean9 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        boolean boolean12 = pricingRequest7.equals((java.lang.Object) false);
        java.lang.String str13 = pricingRequest7.couponCode();
        int int14 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest7.customerType();
        int int16 = pricingRequest7.loyaltyPoints();
        java.lang.String str17 = pricingRequest7.couponCode();
        java.lang.String str18 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(customerType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        int int9 = pricingRequest7.quantity();
        java.lang.String str10 = pricingRequest7.toString();
        java.lang.Object obj11 = null;
        boolean boolean12 = pricingRequest7.equals(obj11);
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest7.customerType();
        java.lang.String str14 = pricingRequest7.toString();
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str10, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(customerType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str14, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType8, false, "", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) 100, customerType8, false, "PricingRequest[basePrice=1.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '4', (int) (byte) -1, customerType8, true, "", true, 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (int) (short) 100, customerType8, true, "", false, (int) (byte) 10);
        java.lang.String str29 = pricingRequest28.toString();
        java.lang.String str30 = pricingRequest28.toString();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PricingRequest[basePrice=0.0, quantity=100, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=10]" + "'", str29, "PricingRequest[basePrice=0.0, quantity=100, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=10]");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "PricingRequest[basePrice=0.0, quantity=100, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=10]" + "'", str30, "PricingRequest[basePrice=0.0, quantity=100, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=10]");
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType2, false, "", true, (int) (byte) 0);
        java.lang.String str8 = pricingRequest7.toString();
        boolean boolean9 = pricingRequest7.seasonalSale();
        java.lang.String str10 = pricingRequest7.toString();
        double double11 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType18, false, "", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) (short) 100, customerType18, false, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, (int) (short) 1, customerType18, true, "", true, 1);
        boolean boolean34 = pricingRequest7.equals((java.lang.Object) (short) 1);
        com.viktor.lab4.PricingEngine.CustomerType customerType43 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest48 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType43, true, "hi!", false, (int) (byte) -1);
        double double49 = pricingRequest48.basePrice();
        java.lang.String str50 = pricingRequest48.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType51 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean52 = pricingRequest48.equals((java.lang.Object) customerType51);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest57 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (byte) 100, customerType51, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", false, (int) 'a');
        com.viktor.lab4.PricingEngine.CustomerType customerType58 = pricingRequest57.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest63 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 10, (int) (short) 1, customerType58, false, "", false, 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest68 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, 10, customerType58, true, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]", false, (int) (short) 10);
        boolean boolean69 = pricingRequest7.equals((java.lang.Object) true);
        java.lang.String str70 = pricingRequest7.couponCode();
        int int71 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str8, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str10, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10.0d + "'", double49 == 10.0d);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str50, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType51 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType51.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + customerType58 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType58.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        int int9 = pricingRequest7.quantity();
        java.lang.String str10 = pricingRequest7.toString();
        java.lang.Object obj11 = null;
        boolean boolean12 = pricingRequest7.equals(obj11);
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest7.customerType();
        double double14 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest7.customerType();
        double double16 = pricingRequest7.basePrice();
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str10, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(customerType13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNull(customerType15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        int int9 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        java.lang.String str11 = pricingRequest7.toString();
        java.lang.String str12 = pricingRequest7.couponCode();
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str11, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType2, false, "", true, (int) (byte) 0);
        java.lang.String str8 = pricingRequest7.toString();
        boolean boolean9 = pricingRequest7.seasonalSale();
        java.lang.String str10 = pricingRequest7.toString();
        int int11 = pricingRequest7.loyaltyPoints();
        double double12 = pricingRequest7.basePrice();
        double double13 = pricingRequest7.basePrice();
        java.lang.String str14 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str8, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str10, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str14, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType10, false, "", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) (short) 100, customerType10, false, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, (int) (short) 1, customerType10, true, "", true, 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, (int) (short) 100, customerType10, false, "hi!", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, 1, customerType10, false, "PricingRequest[basePrice=1.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) -1);
        boolean boolean36 = pricingRequest35.seasonalSale();
        java.lang.String str37 = pricingRequest35.couponCode();
        boolean boolean38 = pricingRequest35.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "PricingRequest[basePrice=1.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]" + "'", str37, "PricingRequest[basePrice=1.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        int int9 = pricingRequest7.quantity();
        java.lang.String str10 = pricingRequest7.toString();
        java.lang.Object obj11 = null;
        boolean boolean12 = pricingRequest7.equals(obj11);
        boolean boolean13 = pricingRequest7.seasonalSale();
        java.lang.String str14 = pricingRequest7.toString();
        boolean boolean15 = pricingRequest7.firstOrder();
        int int16 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest7.customerType();
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str10, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str14, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(customerType17);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, (int) '4', customerType2, true, "PricingRequest[basePrice=100.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, 1);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType2, false, "", true, (int) (byte) 0);
        java.lang.String str8 = pricingRequest7.toString();
        boolean boolean9 = pricingRequest7.seasonalSale();
        java.lang.String str10 = pricingRequest7.toString();
        double double11 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType18, false, "", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) (short) 100, customerType18, false, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, (int) (short) 1, customerType18, true, "", true, 1);
        boolean boolean34 = pricingRequest7.equals((java.lang.Object) (short) 1);
        int int35 = pricingRequest7.loyaltyPoints();
        int int36 = pricingRequest7.quantity();
        int int37 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str8, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str10, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType10, false, "", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) (short) 100, customerType10, false, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, (int) (short) 1, customerType10, true, "", true, 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, (int) (short) 100, customerType10, false, "hi!", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, 1, customerType10, false, "PricingRequest[basePrice=1.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) -1);
        java.lang.String str36 = pricingRequest35.toString();
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=-1]" + "'", str36, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=-1]");
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType2, false, "", true, (int) (byte) 0);
        java.lang.String str8 = pricingRequest7.toString();
        java.lang.String str9 = pricingRequest7.couponCode();
        java.lang.String str10 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType13, false, "", true, (int) (byte) 0);
        int int19 = pricingRequest18.loyaltyPoints();
        int int20 = pricingRequest18.quantity();
        double double21 = pricingRequest18.basePrice();
        int int22 = pricingRequest18.quantity();
        boolean boolean23 = pricingRequest7.equals((java.lang.Object) int22);
        java.lang.String str24 = pricingRequest7.toString();
        boolean boolean25 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str8, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str10, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str24, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        double double8 = pricingRequest7.basePrice();
        boolean boolean9 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        boolean boolean12 = pricingRequest7.equals((java.lang.Object) false);
        java.lang.String str13 = pricingRequest7.couponCode();
        int int14 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest7.customerType();
        int int16 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest26 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType21, true, "hi!", false, (int) (byte) -1);
        double double27 = pricingRequest26.basePrice();
        java.lang.String str28 = pricingRequest26.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType29 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean30 = pricingRequest26.equals((java.lang.Object) customerType29);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (byte) 100, customerType29, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", false, (int) 'a');
        com.viktor.lab4.PricingEngine.CustomerType customerType36 = pricingRequest35.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType39 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest44 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType39, true, "hi!", false, (int) (byte) -1);
        double double45 = pricingRequest44.basePrice();
        boolean boolean46 = pricingRequest44.firstOrder();
        int int47 = pricingRequest44.quantity();
        boolean boolean48 = pricingRequest44.firstOrder();
        boolean boolean49 = pricingRequest35.equals((java.lang.Object) pricingRequest44);
        double double50 = pricingRequest35.basePrice();
        boolean boolean51 = pricingRequest7.equals((java.lang.Object) pricingRequest35);
        int int52 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(customerType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str28, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType29 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType29.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + customerType36 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType36.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 10.0d + "'", double45 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 10.0d + "'", double50 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType2, false, "", true, (int) (byte) 0);
        java.lang.String str8 = pricingRequest7.toString();
        boolean boolean9 = pricingRequest7.seasonalSale();
        int int10 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        boolean boolean12 = pricingRequest7.firstOrder();
        java.lang.String str13 = pricingRequest7.couponCode();
        boolean boolean14 = pricingRequest7.seasonalSale();
        java.lang.String str15 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str8, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str15, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType2, false, "", true, (int) (byte) 0);
        java.lang.String str8 = pricingRequest7.toString();
        java.lang.String str9 = pricingRequest7.couponCode();
        java.lang.String str10 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType13, false, "", true, (int) (byte) 0);
        int int19 = pricingRequest18.loyaltyPoints();
        int int20 = pricingRequest18.quantity();
        boolean boolean21 = pricingRequest7.equals((java.lang.Object) pricingRequest18);
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType24, true, "hi!", false, (int) (byte) -1);
        double double30 = pricingRequest29.basePrice();
        boolean boolean31 = pricingRequest29.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType32 = pricingRequest29.customerType();
        boolean boolean34 = pricingRequest29.equals((java.lang.Object) false);
        java.lang.String str35 = pricingRequest29.couponCode();
        int int36 = pricingRequest29.loyaltyPoints();
        boolean boolean37 = pricingRequest29.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType38 = pricingRequest29.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType41 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest46 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType41, false, "", true, (int) (byte) 0);
        java.lang.String str47 = pricingRequest46.toString();
        boolean boolean48 = pricingRequest46.seasonalSale();
        int int49 = pricingRequest46.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType50 = pricingRequest46.customerType();
        boolean boolean51 = pricingRequest29.equals((java.lang.Object) customerType50);
        boolean boolean52 = pricingRequest18.equals((java.lang.Object) boolean51);
        boolean boolean53 = pricingRequest18.seasonalSale();
        java.lang.String str54 = pricingRequest18.toString();
        boolean boolean55 = pricingRequest18.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str8, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str10, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(customerType32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(customerType38);
        org.junit.Assert.assertTrue("'" + customerType41 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType41.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str47, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + customerType50 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType50.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str54, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType4, false, "", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (short) -1, customerType4, false, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]", false, (int) (byte) 100);
        boolean boolean15 = pricingRequest14.seasonalSale();
        double double16 = pricingRequest14.basePrice();
        boolean boolean17 = pricingRequest14.firstOrder();
        java.lang.String str18 = pricingRequest14.toString();
        int int19 = pricingRequest14.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType22, true, "hi!", false, (int) (byte) -1);
        double double28 = pricingRequest27.basePrice();
        java.lang.String str29 = pricingRequest27.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType30 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean31 = pricingRequest27.equals((java.lang.Object) customerType30);
        com.viktor.lab4.PricingEngine.CustomerType customerType32 = pricingRequest27.customerType();
        int int33 = pricingRequest27.loyaltyPoints();
        int int34 = pricingRequest27.loyaltyPoints();
        java.lang.String str35 = pricingRequest27.toString();
        boolean boolean36 = pricingRequest14.equals((java.lang.Object) str35);
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PricingRequest[basePrice=0.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=100]" + "'", str18, "PricingRequest[basePrice=0.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=100]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str29, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType30 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType30.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(customerType32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str35, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1), 10, customerType4, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", true, (int) (short) 1);
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1L), (int) (short) 100, customerType11, true, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]", true, (int) (short) 1);
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType19, true, "hi!", false, (int) (byte) -1);
        double double25 = pricingRequest24.basePrice();
        java.lang.String str26 = pricingRequest24.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean28 = pricingRequest24.equals((java.lang.Object) customerType27);
        java.lang.String str29 = pricingRequest24.toString();
        java.lang.Object obj30 = null;
        boolean boolean31 = pricingRequest24.equals(obj30);
        boolean boolean32 = pricingRequest16.equals((java.lang.Object) pricingRequest24);
        com.viktor.lab4.PricingEngine.CustomerType customerType33 = pricingRequest16.customerType();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str26, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType27 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType27.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str29, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + customerType33 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType33.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType4, false, "", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10, (int) (short) 1, customerType4, true, "PricingRequest[basePrice=-1.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=1]", false, (int) (byte) 100);
        boolean boolean15 = pricingRequest14.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        boolean boolean8 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType11, true, "hi!", false, (int) (byte) -1);
        double double17 = pricingRequest16.basePrice();
        java.lang.String str18 = pricingRequest16.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean20 = pricingRequest16.equals((java.lang.Object) customerType19);
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = pricingRequest16.customerType();
        boolean boolean22 = pricingRequest16.seasonalSale();
        boolean boolean23 = pricingRequest7.equals((java.lang.Object) boolean22);
        double double24 = pricingRequest7.basePrice();
        double double25 = pricingRequest7.basePrice();
        boolean boolean26 = pricingRequest7.seasonalSale();
        java.lang.String str27 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str18, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(customerType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType6, false, "", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) (short) 100, customerType6, false, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, (int) (short) 1, customerType6, true, "", true, 1);
        int int22 = pricingRequest21.loyaltyPoints();
        boolean boolean23 = pricingRequest21.firstOrder();
        int int24 = pricingRequest21.quantity();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType5 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest10 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType5, true, "hi!", false, (int) (byte) -1);
        double double11 = pricingRequest10.basePrice();
        java.lang.String str12 = pricingRequest10.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean14 = pricingRequest10.equals((java.lang.Object) customerType13);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (byte) 100, customerType13, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", false, (int) 'a');
        double double20 = pricingEngine0.calculateFinalPrice(pricingRequest19);
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType25, true, "hi!", false, (int) (byte) -1);
        double double31 = pricingRequest30.basePrice();
        java.lang.String str32 = pricingRequest30.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType33 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean34 = pricingRequest30.equals((java.lang.Object) customerType33);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest39 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (byte) 100, customerType33, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", false, (int) 'a');
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = pricingRequest39.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType43 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest48 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType43, true, "hi!", false, (int) (byte) -1);
        double double49 = pricingRequest48.basePrice();
        boolean boolean50 = pricingRequest48.firstOrder();
        int int51 = pricingRequest48.quantity();
        boolean boolean52 = pricingRequest48.firstOrder();
        boolean boolean53 = pricingRequest39.equals((java.lang.Object) pricingRequest48);
        double double54 = pricingEngine0.calculateFinalPrice(pricingRequest39);
        com.viktor.lab4.PricingEngine.CustomerType customerType57 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest62 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType57, false, "", true, (int) (byte) 0);
        java.lang.String str63 = pricingRequest62.toString();
        boolean boolean64 = pricingRequest62.seasonalSale();
        java.lang.String str65 = pricingRequest62.toString();
        boolean boolean67 = pricingRequest62.equals((java.lang.Object) "hi!");
        com.viktor.lab4.PricingEngine.CustomerType customerType68 = pricingRequest62.customerType();
        double double69 = pricingEngine0.calculateFinalPrice(pricingRequest62);
        com.viktor.lab4.PricingEngine.CustomerType customerType72 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest77 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType72, false, "", true, (int) (byte) 0);
        java.lang.String str78 = pricingRequest77.toString();
        boolean boolean79 = pricingRequest77.seasonalSale();
        java.lang.String str80 = pricingRequest77.toString();
        boolean boolean82 = pricingRequest77.equals((java.lang.Object) "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        java.lang.String str83 = pricingRequest77.toString();
        double double84 = pricingEngine0.calculateFinalPrice(pricingRequest77);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest85 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double86 = pricingEngine0.calculateFinalPrice(pricingRequest85);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 657.99d + "'", double20 == 657.99d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str32, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType33 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType33.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10.0d + "'", double49 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 657.99d + "'", double54 == 657.99d);
        org.junit.Assert.assertTrue("'" + customerType57 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType57.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str63, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str65, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + customerType68 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType68.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 7.99d + "'", double69 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType72 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType72.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str78, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str80, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str83, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 7.99d + "'", double84 == 7.99d);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        double double8 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest7.customerType();
        java.lang.String str10 = pricingRequest7.toString();
        double double11 = pricingRequest7.basePrice();
        double double12 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNull(customerType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str10, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        double double8 = pricingRequest7.basePrice();
        java.lang.String str9 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean11 = pricingRequest7.equals((java.lang.Object) customerType10);
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest7.customerType();
        int int13 = pricingRequest7.loyaltyPoints();
        int int14 = pricingRequest7.loyaltyPoints();
        int int15 = pricingRequest7.quantity();
        java.lang.Class<?> wildcardClass16 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str9, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(customerType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType4, false, "", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (short) -1, customerType4, false, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]", false, (int) (byte) 100);
        boolean boolean15 = pricingRequest14.seasonalSale();
        double double16 = pricingRequest14.basePrice();
        boolean boolean17 = pricingRequest14.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType20, false, "", true, (int) (byte) 0);
        java.lang.String str26 = pricingRequest25.toString();
        boolean boolean27 = pricingRequest25.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType30 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType30, false, "", true, (int) (byte) 0);
        int int36 = pricingRequest35.loyaltyPoints();
        int int37 = pricingRequest35.loyaltyPoints();
        boolean boolean38 = pricingRequest25.equals((java.lang.Object) int37);
        boolean boolean39 = pricingRequest25.firstOrder();
        boolean boolean40 = pricingRequest14.equals((java.lang.Object) pricingRequest25);
        int int41 = pricingRequest14.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType42 = pricingRequest14.customerType();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str26, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + customerType30 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType30.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
        org.junit.Assert.assertTrue("'" + customerType42 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType42.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType2, false, "", true, (int) (byte) 0);
        java.lang.String str8 = pricingRequest7.toString();
        boolean boolean9 = pricingRequest7.seasonalSale();
        java.lang.String str10 = pricingRequest7.toString();
        boolean boolean12 = pricingRequest7.equals((java.lang.Object) "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest7.customerType();
        java.lang.Class<?> wildcardClass14 = customerType13.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str8, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str10, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType3, false, "", true, (int) (byte) 0);
        java.lang.String str9 = pricingRequest8.toString();
        boolean boolean10 = pricingRequest8.seasonalSale();
        java.lang.String str11 = pricingRequest8.toString();
        int int12 = pricingRequest8.loyaltyPoints();
        double double13 = pricingRequest8.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest8.customerType();
        double double15 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType18, false, "", true, (int) (byte) 0);
        int int24 = pricingRequest23.loyaltyPoints();
        int int25 = pricingRequest23.loyaltyPoints();
        double double26 = pricingRequest23.basePrice();
        double double27 = pricingEngine0.calculateFinalPrice(pricingRequest23);
        com.viktor.lab4.PricingEngine.CustomerType customerType30 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, 0, customerType30, true, "", false, (int) (short) 0);
        boolean boolean36 = pricingRequest35.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType37 = pricingRequest35.customerType();
        // The following exception was thrown during execution in test generation
        try {
            double double38 = pricingEngine0.calculateFinalPrice(pricingRequest35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str9, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str11, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 7.99d + "'", double15 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 7.99d + "'", double27 == 7.99d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(customerType37);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType2, false, "", true, (int) (byte) 0);
        java.lang.String str8 = pricingRequest7.toString();
        boolean boolean9 = pricingRequest7.seasonalSale();
        int int10 = pricingRequest7.loyaltyPoints();
        int int11 = pricingRequest7.loyaltyPoints();
        java.lang.String str12 = pricingRequest7.couponCode();
        double double13 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str8, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        double double8 = pricingRequest7.basePrice();
        java.lang.String str9 = pricingRequest7.toString();
        int int10 = pricingRequest7.loyaltyPoints();
        double double11 = pricingRequest7.basePrice();
        boolean boolean12 = pricingRequest7.seasonalSale();
        int int13 = pricingRequest7.loyaltyPoints();
        java.lang.String str14 = pricingRequest7.toString();
        double double15 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType18, true, "hi!", false, (int) (byte) -1);
        double double24 = pricingRequest23.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = pricingRequest23.customerType();
        java.lang.String str26 = pricingRequest23.toString();
        boolean boolean27 = pricingRequest7.equals((java.lang.Object) str26);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str9, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str14, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertNull(customerType25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str26, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType5 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest10 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType5, true, "hi!", false, (int) (byte) -1);
        double double11 = pricingRequest10.basePrice();
        java.lang.String str12 = pricingRequest10.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean14 = pricingRequest10.equals((java.lang.Object) customerType13);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (byte) 100, customerType13, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", false, (int) 'a');
        double double20 = pricingEngine0.calculateFinalPrice(pricingRequest19);
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType25, true, "hi!", false, (int) (byte) -1);
        double double31 = pricingRequest30.basePrice();
        java.lang.String str32 = pricingRequest30.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType33 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean34 = pricingRequest30.equals((java.lang.Object) customerType33);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest39 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (byte) 100, customerType33, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", false, (int) 'a');
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = pricingRequest39.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType43 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest48 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType43, true, "hi!", false, (int) (byte) -1);
        double double49 = pricingRequest48.basePrice();
        boolean boolean50 = pricingRequest48.firstOrder();
        int int51 = pricingRequest48.quantity();
        boolean boolean52 = pricingRequest48.firstOrder();
        boolean boolean53 = pricingRequest39.equals((java.lang.Object) pricingRequest48);
        double double54 = pricingEngine0.calculateFinalPrice(pricingRequest39);
        com.viktor.lab4.PricingEngine.CustomerType customerType57 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest62 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType57, false, "", true, (int) (byte) 0);
        java.lang.String str63 = pricingRequest62.toString();
        boolean boolean64 = pricingRequest62.seasonalSale();
        java.lang.String str65 = pricingRequest62.toString();
        boolean boolean67 = pricingRequest62.equals((java.lang.Object) "hi!");
        com.viktor.lab4.PricingEngine.CustomerType customerType68 = pricingRequest62.customerType();
        double double69 = pricingEngine0.calculateFinalPrice(pricingRequest62);
        com.viktor.lab4.PricingEngine.CustomerType customerType72 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest77 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType72, false, "", true, (int) (byte) 0);
        java.lang.String str78 = pricingRequest77.toString();
        boolean boolean79 = pricingRequest77.seasonalSale();
        java.lang.String str80 = pricingRequest77.toString();
        boolean boolean82 = pricingRequest77.equals((java.lang.Object) "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        java.lang.String str83 = pricingRequest77.toString();
        double double84 = pricingEngine0.calculateFinalPrice(pricingRequest77);
        com.viktor.lab4.PricingEngine.CustomerType customerType87 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest92 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType87, false, "", true, (int) (byte) 0);
        java.lang.String str93 = pricingRequest92.toString();
        boolean boolean94 = pricingRequest92.seasonalSale();
        java.lang.String str95 = pricingRequest92.toString();
        boolean boolean97 = pricingRequest92.equals((java.lang.Object) "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        double double98 = pricingEngine0.calculateFinalPrice(pricingRequest92);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str12, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 657.99d + "'", double20 == 657.99d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str32, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType33 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType33.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10.0d + "'", double49 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 657.99d + "'", double54 == 657.99d);
        org.junit.Assert.assertTrue("'" + customerType57 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType57.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str63, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str65, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + customerType68 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType68.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 7.99d + "'", double69 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType72 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType72.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str78, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str80, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str83, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 7.99d + "'", double84 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType87 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType87.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str93, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str95, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + double98 + "' != '" + 7.99d + "'", double98 == 7.99d);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        int int9 = pricingRequest7.quantity();
        boolean boolean10 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType13, false, "", true, (int) (byte) 0);
        java.lang.String str19 = pricingRequest18.toString();
        boolean boolean20 = pricingRequest18.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType23, false, "", true, (int) (byte) 0);
        int int29 = pricingRequest28.loyaltyPoints();
        int int30 = pricingRequest28.loyaltyPoints();
        boolean boolean31 = pricingRequest18.equals((java.lang.Object) int30);
        boolean boolean32 = pricingRequest7.equals((java.lang.Object) boolean31);
        boolean boolean33 = pricingRequest7.firstOrder();
        boolean boolean34 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertNull(customerType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str19, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType8, true, "hi!", false, (int) (byte) -1);
        double double14 = pricingRequest13.basePrice();
        java.lang.String str15 = pricingRequest13.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean17 = pricingRequest13.equals((java.lang.Object) customerType16);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (byte) 100, customerType16, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", false, (int) 'a');
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = pricingRequest22.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 10, (int) (short) 1, customerType23, false, "", false, 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, 10, customerType23, true, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]", false, (int) (short) 10);
        double double34 = pricingRequest33.basePrice();
        java.lang.String str35 = pricingRequest33.couponCode();
        java.lang.Class<?> wildcardClass36 = pricingRequest33.getClass();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str15, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 100.0d + "'", double34 == 100.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str35, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        double double8 = pricingRequest7.basePrice();
        boolean boolean9 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        boolean boolean12 = pricingRequest7.equals((java.lang.Object) false);
        java.lang.String str13 = pricingRequest7.couponCode();
        int int14 = pricingRequest7.loyaltyPoints();
        boolean boolean15 = pricingRequest7.seasonalSale();
        double double16 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        java.lang.String str8 = pricingRequest7.toString();
        int int9 = pricingRequest7.quantity();
        boolean boolean10 = pricingRequest7.seasonalSale();
        boolean boolean11 = pricingRequest7.firstOrder();
        boolean boolean12 = pricingRequest7.firstOrder();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str8, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType4, false, "", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) 100, customerType4, false, "PricingRequest[basePrice=1.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1]", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest14.customerType();
        java.lang.String str16 = pricingRequest14.toString();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PricingRequest[basePrice=0.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=true, loyaltyPoints=0]" + "'", str16, "PricingRequest[basePrice=0.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=true, loyaltyPoints=0]");
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        double double8 = pricingRequest7.basePrice();
        boolean boolean9 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        int int11 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType14, true, "hi!", false, (int) (byte) -1);
        double double20 = pricingRequest19.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = pricingRequest19.customerType();
        boolean boolean22 = pricingRequest7.equals((java.lang.Object) pricingRequest19);
        java.lang.String str23 = pricingRequest7.toString();
        java.lang.Class<?> wildcardClass24 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNull(customerType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str23, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType4, false, "", true, (int) (byte) 0);
        java.lang.String str10 = pricingRequest9.toString();
        boolean boolean11 = pricingRequest9.seasonalSale();
        boolean boolean12 = pricingRequest9.firstOrder();
        int int13 = pricingRequest9.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', (-1), customerType14, true, "hi!", true, (int) 'a');
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str10, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType2, false, "", true, (int) (byte) 0);
        java.lang.String str8 = pricingRequest7.toString();
        boolean boolean9 = pricingRequest7.seasonalSale();
        int int10 = pricingRequest7.loyaltyPoints();
        java.lang.String str11 = pricingRequest7.toString();
        int int12 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType17, true, "hi!", false, (int) (byte) -1);
        double double23 = pricingRequest22.basePrice();
        java.lang.String str24 = pricingRequest22.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean26 = pricingRequest22.equals((java.lang.Object) customerType25);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (byte) 100, customerType25, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", false, (int) 'a');
        boolean boolean32 = pricingRequest31.firstOrder();
        boolean boolean33 = pricingRequest7.equals((java.lang.Object) boolean32);
        java.lang.String str34 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str8, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str11, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str24, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str34, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType2, false, "", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        int int9 = pricingRequest7.loyaltyPoints();
        java.lang.String str10 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType4, false, "", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (short) -1, customerType4, false, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]", false, (int) (byte) 100);
        boolean boolean15 = pricingRequest14.seasonalSale();
        double double16 = pricingRequest14.basePrice();
        boolean boolean17 = pricingRequest14.firstOrder();
        java.lang.String str18 = pricingRequest14.toString();
        double double19 = pricingRequest14.basePrice();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PricingRequest[basePrice=0.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=100]" + "'", str18, "PricingRequest[basePrice=0.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=100]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine pricingEngine1 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType6, true, "hi!", false, (int) (byte) -1);
        double double12 = pricingRequest11.basePrice();
        java.lang.String str13 = pricingRequest11.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean15 = pricingRequest11.equals((java.lang.Object) customerType14);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (byte) 100, customerType14, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", false, (int) 'a');
        double double21 = pricingEngine1.calculateFinalPrice(pricingRequest20);
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType24, false, "", true, (int) (byte) 0);
        java.lang.String str30 = pricingRequest29.toString();
        boolean boolean31 = pricingRequest29.seasonalSale();
        java.lang.String str32 = pricingRequest29.toString();
        double double33 = pricingRequest29.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest45 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType40, false, "", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest50 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) (short) 100, customerType40, false, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest55 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, (int) (short) 1, customerType40, true, "", true, 1);
        boolean boolean56 = pricingRequest29.equals((java.lang.Object) (short) 1);
        double double57 = pricingEngine1.calculateFinalPrice(pricingRequest29);
        double double58 = pricingEngine0.calculateFinalPrice(pricingRequest29);
        com.viktor.lab4.PricingEngine.CustomerType customerType61 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest66 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType61, false, "", true, (int) (byte) 0);
        java.lang.String str67 = pricingRequest66.toString();
        boolean boolean68 = pricingRequest66.seasonalSale();
        java.lang.String str69 = pricingRequest66.toString();
        int int70 = pricingRequest66.loyaltyPoints();
        double double71 = pricingEngine0.calculateFinalPrice(pricingRequest66);
        com.viktor.lab4.PricingEngine.CustomerType customerType74 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest79 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType74, false, "", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType80 = pricingRequest79.customerType();
        double double81 = pricingEngine0.calculateFinalPrice(pricingRequest79);
        com.viktor.lab4.PricingEngine.CustomerType customerType82 = pricingRequest79.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType85 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest90 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType85, true, "hi!", false, (int) (byte) -1);
        double double91 = pricingRequest90.basePrice();
        boolean boolean92 = pricingRequest90.firstOrder();
        boolean boolean93 = pricingRequest90.seasonalSale();
        boolean boolean94 = pricingRequest79.equals((java.lang.Object) pricingRequest90);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str13, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 657.99d + "'", double21 == 657.99d);
        org.junit.Assert.assertTrue("'" + customerType24 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType24.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str30, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str32, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 7.99d + "'", double57 == 7.99d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 7.99d + "'", double58 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType61 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType61.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str67, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str69, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 7.99d + "'", double71 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType74 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType74.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType80 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType80.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 7.99d + "'", double81 == 7.99d);
        org.junit.Assert.assertTrue("'" + customerType82 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType82.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 10.0d + "'", double91 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        double double8 = pricingRequest7.basePrice();
        boolean boolean9 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        boolean boolean12 = pricingRequest7.equals((java.lang.Object) false);
        java.lang.String str13 = pricingRequest7.couponCode();
        int int14 = pricingRequest7.loyaltyPoints();
        boolean boolean15 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType19, false, "", true, (int) (byte) 0);
        java.lang.String str25 = pricingRequest24.toString();
        boolean boolean26 = pricingRequest24.seasonalSale();
        int int27 = pricingRequest24.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = pricingRequest24.customerType();
        boolean boolean29 = pricingRequest7.equals((java.lang.Object) customerType28);
        java.lang.String str30 = pricingRequest7.toString();
        java.lang.String str31 = pricingRequest7.couponCode();
        boolean boolean32 = pricingRequest7.seasonalSale();
        java.lang.String str33 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(customerType10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(customerType16);
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str25, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str30, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        int int8 = pricingRequest7.loyaltyPoints();
        int int9 = pricingRequest7.quantity();
        int int10 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType14, true, "hi!", false, (int) (byte) -1);
        double double20 = pricingRequest19.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = pricingRequest19.customerType();
        boolean boolean22 = pricingRequest7.equals((java.lang.Object) pricingRequest19);
        java.lang.String str23 = pricingRequest19.couponCode();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(customerType11);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNull(customerType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType4, true, "hi!", false, (int) (byte) -1);
        double double10 = pricingRequest9.basePrice();
        java.lang.String str11 = pricingRequest9.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean13 = pricingRequest9.equals((java.lang.Object) customerType12);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (byte) 100, customerType12, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", false, (int) 'a');
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = pricingRequest18.customerType();
        int int20 = pricingRequest18.loyaltyPoints();
        int int21 = pricingRequest18.loyaltyPoints();
        double double22 = pricingRequest18.basePrice();
        java.lang.String str23 = pricingRequest18.couponCode();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str11, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str23, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType2, false, "", true, (int) (byte) 0);
        java.lang.String str8 = pricingRequest7.toString();
        boolean boolean9 = pricingRequest7.seasonalSale();
        int int10 = pricingRequest7.loyaltyPoints();
        boolean boolean11 = pricingRequest7.firstOrder();
        double double12 = pricingRequest7.basePrice();
        double double13 = pricingRequest7.basePrice();
        int int14 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str8, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType4, true, "hi!", false, (int) (byte) -1);
        double double10 = pricingRequest9.basePrice();
        boolean boolean11 = pricingRequest9.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType14, true, "hi!", false, (int) (byte) -1);
        double double20 = pricingRequest19.basePrice();
        java.lang.String str21 = pricingRequest19.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean23 = pricingRequest19.equals((java.lang.Object) customerType22);
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = pricingRequest19.customerType();
        boolean boolean25 = pricingRequest9.equals((java.lang.Object) customerType24);
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType28, false, "", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = pricingRequest33.customerType();
        boolean boolean35 = pricingRequest9.equals((java.lang.Object) customerType34);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest40 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, (int) 'a', customerType34, false, "", false, 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType49 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest54 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType49, false, "", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest59 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) (short) 100, customerType49, false, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest64 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, (int) (short) 1, customerType49, true, "", true, 1);
        com.viktor.lab4.PricingEngine.CustomerType customerType65 = pricingRequest64.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest70 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), 0, customerType65, false, "", true, (int) (short) 0);
        boolean boolean71 = pricingRequest40.equals((java.lang.Object) (-1.0f));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str21, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(customerType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType34 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType34.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + customerType49 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType49.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType65 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType65.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType2, false, "", true, (int) (byte) 0);
        java.lang.String str8 = pricingRequest7.toString();
        boolean boolean9 = pricingRequest7.seasonalSale();
        java.lang.String str10 = pricingRequest7.toString();
        boolean boolean12 = pricingRequest7.equals((java.lang.Object) "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest7.customerType();
        java.lang.Class<?> wildcardClass14 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str8, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]" + "'", str10, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        double double8 = pricingRequest7.basePrice();
        java.lang.String str9 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean11 = pricingRequest7.equals((java.lang.Object) customerType10);
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest7.customerType();
        int int13 = pricingRequest7.quantity();
        java.lang.String str14 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str9, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(customerType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str14, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (short) 0, customerType2, true, "hi!", false, (int) (byte) -1);
        double double8 = pricingRequest7.basePrice();
        java.lang.String str9 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        boolean boolean11 = pricingRequest7.equals((java.lang.Object) customerType10);
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest7.customerType();
        java.lang.String str13 = pricingRequest7.couponCode();
        boolean boolean14 = pricingRequest7.firstOrder();
        boolean boolean15 = pricingRequest7.firstOrder();
        boolean boolean16 = pricingRequest7.firstOrder();
        int int17 = pricingRequest7.quantity();
        double double18 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]" + "'", str9, "PricingRequest[basePrice=10.0, quantity=0, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=false, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(customerType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1), 10, customerType4, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", true, (int) (short) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) (short) 0, customerType4, false, "", true, (int) 'a');
        int int15 = pricingRequest14.loyaltyPoints();
        java.lang.String str16 = pricingRequest14.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest14.customerType();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (short) 1, customerType10, false, "", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) (short) 100, customerType10, false, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0]", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, (int) (short) 1, customerType10, true, "", true, 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, (int) (short) 100, customerType10, false, "hi!", true, (int) (short) -1);
        double double31 = pricingRequest30.basePrice();
        java.lang.String str32 = pricingRequest30.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType33 = pricingRequest30.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest38 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (int) (byte) 0, customerType33, true, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=-1]", true, 0);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + customerType33 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType33.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }
}

