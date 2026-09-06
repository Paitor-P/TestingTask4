package com.viktor.lab4.autogen;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10L, 32, customerType2, false, "", true, (int) (short) 1);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType6, false, "hi!", false, (int) '#');
        boolean boolean12 = pricingRequest11.seasonalSale();
        java.lang.String str13 = pricingRequest11.couponCode();
        java.lang.String str14 = pricingRequest11.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest11.customerType();
        double double16 = pricingRequest11.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest11.customerType();
        double double18 = pricingRequest11.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest(2282.99d, (int) (short) -1, customerType19, true, "PricingRequest[basePrice=0.0, quantity=100, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=false, loyaltyPoints=52]", false, 97);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, 52, customerType19, false, "PricingRequest[basePrice=52.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=97]", true, 0);
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) ' ', customerType2, true, "PricingRequest[basePrice=10.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=10]", false, (int) (byte) 0);
        boolean boolean8 = pricingRequest7.seasonalSale();
        boolean boolean9 = pricingRequest7.seasonalSale();
        java.lang.String str10 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType13, false, "hi!", false, (int) '#');
        boolean boolean20 = pricingRequest18.equals((java.lang.Object) (short) -1);
        java.lang.String str21 = pricingRequest18.couponCode();
        int int22 = pricingRequest18.quantity();
        boolean boolean23 = pricingRequest7.equals((java.lang.Object) int22);
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) '4', customerType26, true, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, 35);
        double double32 = pricingRequest31.basePrice();
        int int33 = pricingRequest31.loyaltyPoints();
        boolean boolean35 = pricingRequest31.equals((java.lang.Object) (byte) 10);
        int int36 = pricingRequest31.loyaltyPoints();
        boolean boolean37 = pricingRequest7.equals((java.lang.Object) int36);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=1.0, quantity=32, customerType=null, seasonalSale=true, couponCode=PricingRequest[basePrice=10.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=10], firstOrder=false, loyaltyPoints=0]" + "'", str10, "PricingRequest[basePrice=1.0, quantity=32, customerType=null, seasonalSale=true, couponCode=PricingRequest[basePrice=10.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=10], firstOrder=false, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + customerType26 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType26.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 1.0d + "'", double32 == 1.0d);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType2, false, "hi!", false, (int) '#');
        boolean boolean9 = pricingRequest7.equals((java.lang.Object) (short) -1);
        boolean boolean11 = pricingRequest7.equals((java.lang.Object) 0);
        int int12 = pricingRequest7.loyaltyPoints();
        boolean boolean13 = pricingRequest7.seasonalSale();
        java.lang.String str14 = pricingRequest7.couponCode();
        boolean boolean15 = pricingRequest7.firstOrder();
        int int16 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest7.customerType();
        int int18 = pricingRequest7.loyaltyPoints();
        java.lang.Class<?> wildcardClass19 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        java.lang.String str9 = pricingRequest7.couponCode();
        java.lang.String str10 = pricingRequest7.toString();
        double double11 = pricingRequest7.basePrice();
        double double12 = pricingRequest7.basePrice();
        int int13 = pricingRequest7.loyaltyPoints();
        boolean boolean14 = pricingRequest7.firstOrder();
        java.lang.String str15 = pricingRequest7.toString();
        java.lang.String str16 = pricingRequest7.toString();
        boolean boolean17 = pricingRequest7.firstOrder();
        boolean boolean18 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str10, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str15, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str16, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType4, false, "hi!", false, (int) '#');
        boolean boolean10 = pricingRequest9.seasonalSale();
        java.lang.String str11 = pricingRequest9.couponCode();
        java.lang.String str12 = pricingRequest9.couponCode();
        boolean boolean13 = pricingRequest9.seasonalSale();
        boolean boolean15 = pricingRequest9.equals((java.lang.Object) 10.0d);
        boolean boolean16 = pricingRequest9.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest26 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType21, false, "hi!", false, (int) '#');
        boolean boolean27 = pricingRequest26.seasonalSale();
        java.lang.String str28 = pricingRequest26.couponCode();
        boolean boolean30 = pricingRequest26.equals((java.lang.Object) (short) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType31 = pricingRequest26.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest36 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (int) (byte) 10, customerType31, true, "", false, (int) 'a');
        double double37 = pricingRequest36.basePrice();
        boolean boolean38 = pricingRequest9.equals((java.lang.Object) pricingRequest36);
        double double39 = pricingRequest9.basePrice();
        boolean boolean40 = pricingRequest9.seasonalSale();
        int int41 = pricingRequest9.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType42 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest47 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, 0, customerType42, true, "PricingRequest[basePrice=0.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=false, loyaltyPoints=10]", true, 10);
        java.lang.String str48 = pricingRequest47.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType57 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest62 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType57, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest67 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, 10, customerType57, true, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest72 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100L, (int) (byte) 0, customerType57, true, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", false, (int) 'a');
        boolean boolean73 = pricingRequest72.firstOrder();
        int int74 = pricingRequest72.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType75 = pricingRequest72.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest80 = new com.viktor.lab4.PricingEngine.PricingRequest(657.99d, 10, customerType75, false, "PricingRequest[basePrice=0.0, quantity=0, customerType=null, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=false, loyaltyPoints=1]", false, 97);
        boolean boolean81 = pricingRequest80.seasonalSale();
        boolean boolean82 = pricingRequest47.equals((java.lang.Object) pricingRequest80);
        double double83 = pricingRequest80.basePrice();
        int int84 = pricingRequest80.quantity();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + customerType21 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType21.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + customerType31 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType31.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 97.0d + "'", double37 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 100.0d + "'", double39 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 35 + "'", int41 == 35);
        org.junit.Assert.assertTrue("'" + customerType42 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType42.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=0.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=false, loyaltyPoints=10], firstOrder=true, loyaltyPoints=10]" + "'", str48, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=0.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=false, loyaltyPoints=10], firstOrder=true, loyaltyPoints=10]");
        org.junit.Assert.assertTrue("'" + customerType57 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType57.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 97 + "'", int74 == 97);
        org.junit.Assert.assertTrue("'" + customerType75 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType75.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 657.99d + "'", double83 == 657.99d);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 10 + "'", int84 == 10);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        java.lang.String str9 = pricingRequest7.couponCode();
        java.lang.String str10 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType13, false, "hi!", false, (int) '#');
        boolean boolean19 = pricingRequest18.seasonalSale();
        java.lang.String str20 = pricingRequest18.couponCode();
        java.lang.String str21 = pricingRequest18.couponCode();
        boolean boolean22 = pricingRequest7.equals((java.lang.Object) pricingRequest18);
        java.lang.String str23 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = pricingRequest7.customerType();
        boolean boolean26 = pricingRequest7.equals((java.lang.Object) 737.99d);
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + customerType24 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType24.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType8, false, "hi!", false, (int) '#');
        boolean boolean14 = pricingRequest13.seasonalSale();
        java.lang.String str15 = pricingRequest13.couponCode();
        java.lang.String str16 = pricingRequest13.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest13.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, (int) '4', customerType17, false, "hi!", true, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, 97, customerType17, true, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) (byte) 0, customerType17, true, "", false, (int) (short) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType41 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest46 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType41, false, "hi!", false, (int) '#');
        boolean boolean47 = pricingRequest46.seasonalSale();
        java.lang.String str48 = pricingRequest46.couponCode();
        boolean boolean50 = pricingRequest46.equals((java.lang.Object) (short) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType51 = pricingRequest46.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest56 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (int) (byte) 10, customerType51, true, "", false, (int) 'a');
        double double57 = pricingRequest56.basePrice();
        int int58 = pricingRequest56.loyaltyPoints();
        com.viktor.lab4.PricingEngine pricingEngine59 = new com.viktor.lab4.PricingEngine();
        boolean boolean60 = pricingRequest56.equals((java.lang.Object) pricingEngine59);
        com.viktor.lab4.PricingEngine.CustomerType customerType63 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest68 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) '4', customerType63, true, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, 35);
        double double69 = pricingEngine59.calculateFinalPrice(pricingRequest68);
        com.viktor.lab4.PricingEngine.CustomerType customerType70 = pricingRequest68.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest75 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), 100, customerType70, true, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", true, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest80 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) 10, customerType70, true, "PricingRequest[basePrice=638.49, quantity=0, customerType=null, seasonalSale=false, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=10], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=10]", false, (int) (byte) -1);
        boolean boolean81 = pricingRequest32.equals((java.lang.Object) false);
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType41 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType41.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + customerType51 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType51.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 97.0d + "'", double57 == 97.0d);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 97 + "'", int58 == 97);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + customerType63 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType63.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 41.79d + "'", double69 == 41.79d);
        org.junit.Assert.assertTrue("'" + customerType70 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType70.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (short) 100, customerType2, true, "hi!", true, 10);
        boolean boolean8 = pricingRequest7.firstOrder();
        int int9 = pricingRequest7.quantity();
        double double10 = pricingRequest7.basePrice();
        int int11 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        java.lang.String str9 = pricingRequest7.couponCode();
        java.lang.String str10 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType13, false, "hi!", false, (int) '#');
        boolean boolean19 = pricingRequest18.seasonalSale();
        java.lang.String str20 = pricingRequest18.couponCode();
        java.lang.String str21 = pricingRequest18.couponCode();
        boolean boolean22 = pricingRequest7.equals((java.lang.Object) pricingRequest18);
        java.lang.String str23 = pricingRequest7.couponCode();
        java.lang.String str24 = pricingRequest7.couponCode();
        int int25 = pricingRequest7.loyaltyPoints();
        double double26 = pricingRequest7.basePrice();
        double double27 = pricingRequest7.basePrice();
        int int28 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 35 + "'", int25 == 35);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 35 + "'", int28 == 35);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
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
        int int63 = pricingRequest57.loyaltyPoints();
        java.lang.String str64 = pricingRequest57.couponCode();
        int int65 = pricingRequest57.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType66 = pricingRequest57.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest71 = new com.viktor.lab4.PricingEngine.PricingRequest(737.99d, (int) (byte) 1, customerType66, true, "PricingRequest[basePrice=10.0, quantity=32, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=0]", false, (int) (byte) 1);
        double double72 = pricingEngine45.calculateFinalPrice(pricingRequest71);
        com.viktor.lab4.PricingEngine.CustomerType customerType75 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest80 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType75, false, "hi!", false, (int) '#');
        boolean boolean81 = pricingRequest80.seasonalSale();
        java.lang.String str82 = pricingRequest80.couponCode();
        java.lang.String str83 = pricingRequest80.couponCode();
        boolean boolean84 = pricingRequest80.seasonalSale();
        boolean boolean86 = pricingRequest80.equals((java.lang.Object) 10.0d);
        java.lang.String str87 = pricingRequest80.couponCode();
        int int88 = pricingRequest80.quantity();
        boolean boolean89 = pricingRequest80.firstOrder();
        double double90 = pricingRequest80.basePrice();
        java.lang.String str91 = pricingRequest80.couponCode();
        double double92 = pricingRequest80.basePrice();
        // The following exception was thrown during execution in test generation
        try {
            double double93 = pricingEngine45.calculateFinalPrice(pricingRequest80);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 35 + "'", int63 == 35);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + customerType66 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType66.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 546.72d + "'", double72 == 546.72d);
        org.junit.Assert.assertTrue("'" + customerType75 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType75.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!" + "'", str83, "hi!");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "hi!" + "'", str87, "hi!");
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 100.0d + "'", double90 == 100.0d);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "hi!" + "'", str91, "hi!");
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 100.0d + "'", double92 == 100.0d);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType6, false, "hi!", false, (int) '#');
        boolean boolean13 = pricingRequest11.equals((java.lang.Object) (short) -1);
        boolean boolean15 = pricingRequest11.equals((java.lang.Object) 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (short) 0, customerType16, false, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", false, 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest26 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', (-1), customerType16, false, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", true, 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = pricingRequest26.customerType();
        java.lang.String str28 = pricingRequest26.toString();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType27 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType27.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "PricingRequest[basePrice=32.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=true, loyaltyPoints=0]" + "'", str28, "PricingRequest[basePrice=32.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=true, loyaltyPoints=0]");
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
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
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) '4', customerType26, true, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, 35);
        double double32 = pricingEngine22.calculateFinalPrice(pricingRequest31);
        com.viktor.lab4.PricingEngine.CustomerType customerType35 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest40 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (short) 100, customerType35, true, "hi!", true, 10);
        boolean boolean41 = pricingRequest40.firstOrder();
        boolean boolean42 = pricingRequest40.firstOrder();
        double double43 = pricingEngine22.calculateFinalPrice(pricingRequest40);
        com.viktor.lab4.PricingEngine.CustomerType customerType48 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest53 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType48, false, "hi!", false, (int) '#');
        boolean boolean54 = pricingRequest53.seasonalSale();
        java.lang.String str55 = pricingRequest53.couponCode();
        java.lang.String str56 = pricingRequest53.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType57 = pricingRequest53.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest62 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, (int) '4', customerType57, false, "hi!", true, 0);
        double double63 = pricingEngine22.calculateFinalPrice(pricingRequest62);
        int int64 = pricingRequest62.quantity();
        java.lang.String str65 = pricingRequest62.toString();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 97.0d + "'", double20 == 97.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + customerType26 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType26.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 41.79d + "'", double32 == 41.79d);
        org.junit.Assert.assertTrue("'" + customerType35 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType35.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 2282.99d + "'", double43 == 2282.99d);
        org.junit.Assert.assertTrue("'" + customerType48 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType48.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertTrue("'" + customerType57 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType57.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 7.99d + "'", double63 == 7.99d);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 52 + "'", int64 == 52);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "PricingRequest[basePrice=0.0, quantity=52, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str65, "PricingRequest[basePrice=0.0, quantity=52, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) '4', customerType4, true, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, 35);
        double double10 = pricingRequest9.basePrice();
        int int11 = pricingRequest9.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10, 35, customerType12, false, "PricingRequest[basePrice=-1.0, quantity=35, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=true, loyaltyPoints=100]", false, (int) (short) 100);
        boolean boolean18 = pricingRequest17.firstOrder();
        double double19 = pricingRequest17.basePrice();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, 0, customerType2, false, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", false, (int) (short) 1);
        boolean boolean8 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType8, false, "hi!", false, (int) '#');
        boolean boolean15 = pricingRequest13.equals((java.lang.Object) (short) -1);
        boolean boolean17 = pricingRequest13.equals((java.lang.Object) 0);
        double double18 = pricingRequest13.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = pricingRequest13.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, 0, customerType19, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=10], firstOrder=true, loyaltyPoints=-1]", false, 32);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 10, (int) (byte) 10, customerType19, false, "PricingRequest[basePrice=97.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=10.0, quantity=32, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=0], firstOrder=true, loyaltyPoints=52]", true, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest34 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) -1, (int) (byte) 0, customerType19, false, "PricingRequest[basePrice=100.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=97.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=10.0, quantity=32, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=0], firstOrder=true, loyaltyPoints=52], firstOrder=false, loyaltyPoints=10]", true, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        java.lang.String str9 = pricingRequest7.couponCode();
        java.lang.String str10 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest7.customerType();
        double double13 = pricingRequest7.basePrice();
        int int14 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest7.customerType();
        int int16 = pricingRequest7.loyaltyPoints();
        java.lang.String str17 = pricingRequest7.couponCode();
        java.lang.String str18 = pricingRequest7.toString();
        int int19 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str18, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType4, false, "hi!", false, (int) '#');
        boolean boolean10 = pricingRequest9.seasonalSale();
        java.lang.String str11 = pricingRequest9.couponCode();
        java.lang.String str12 = pricingRequest9.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) -1, 0, customerType14, true, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", true, 35);
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, 10, customerType22, true, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, (int) (short) 1);
        boolean boolean28 = pricingRequest19.equals((java.lang.Object) "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        com.viktor.lab4.PricingEngine.CustomerType customerType29 = pricingRequest19.customerType();
        boolean boolean30 = pricingRequest19.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + customerType29 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType29.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType10, false, "hi!", false, (int) '#');
        boolean boolean17 = pricingRequest15.equals((java.lang.Object) (short) -1);
        boolean boolean19 = pricingRequest15.equals((java.lang.Object) 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = pricingRequest15.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (short) 0, customerType20, false, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", false, 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', (-1), customerType20, false, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", true, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType20, false, "PricingRequest[basePrice=10.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=10]", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest40 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '4', (int) ' ', customerType20, true, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", true, (int) 'a');
        java.lang.String str41 = pricingRequest40.toString();
        int int42 = pricingRequest40.loyaltyPoints();
        java.lang.String str43 = pricingRequest40.toString();
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "PricingRequest[basePrice=52.0, quantity=32, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=true, loyaltyPoints=97]" + "'", str41, "PricingRequest[basePrice=52.0, quantity=32, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=true, loyaltyPoints=97]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 97 + "'", int42 == 97);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "PricingRequest[basePrice=52.0, quantity=32, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=true, loyaltyPoints=97]" + "'", str43, "PricingRequest[basePrice=52.0, quantity=32, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=true, loyaltyPoints=97]");
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType2, false, "hi!", false, (int) '#');
        java.lang.String str8 = pricingRequest7.toString();
        java.lang.String str9 = pricingRequest7.couponCode();
        int int10 = pricingRequest7.quantity();
        java.lang.String str11 = pricingRequest7.couponCode();
        boolean boolean12 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str8, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
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
        boolean boolean46 = pricingRequest36.firstOrder();
        java.lang.String str47 = pricingRequest36.toString();
        java.lang.Class<?> wildcardClass48 = pricingRequest36.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str47, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
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
        double double72 = pricingRequest67.basePrice();
        java.lang.String str73 = pricingRequest67.couponCode();
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
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 10.0d + "'", double72 == 10.0d);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType11, false, "hi!", false, (int) '#');
        boolean boolean17 = pricingRequest16.seasonalSale();
        java.lang.String str18 = pricingRequest16.couponCode();
        java.lang.String str19 = pricingRequest16.couponCode();
        boolean boolean20 = pricingRequest16.seasonalSale();
        double double21 = pricingRequest16.basePrice();
        double double22 = pricingRequest16.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType25, false, "hi!", false, (int) '#');
        boolean boolean31 = pricingRequest30.seasonalSale();
        java.lang.String str32 = pricingRequest30.couponCode();
        boolean boolean34 = pricingRequest30.equals((java.lang.Object) (short) 10);
        boolean boolean35 = pricingRequest30.seasonalSale();
        java.lang.Class<?> wildcardClass36 = pricingRequest30.getClass();
        boolean boolean37 = pricingRequest16.equals((java.lang.Object) wildcardClass36);
        int int38 = pricingRequest16.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType41 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest46 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType41, false, "hi!", false, (int) '#');
        boolean boolean47 = pricingRequest46.seasonalSale();
        java.lang.String str48 = pricingRequest46.couponCode();
        java.lang.String str49 = pricingRequest46.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType52 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest57 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType52, false, "hi!", false, (int) '#');
        boolean boolean58 = pricingRequest57.seasonalSale();
        java.lang.String str59 = pricingRequest57.couponCode();
        java.lang.String str60 = pricingRequest57.couponCode();
        boolean boolean61 = pricingRequest46.equals((java.lang.Object) pricingRequest57);
        boolean boolean62 = pricingRequest16.equals((java.lang.Object) pricingRequest46);
        boolean boolean63 = pricingRequest7.equals((java.lang.Object) pricingRequest46);
        java.lang.String str64 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType65 = pricingRequest7.customerType();
        java.lang.String str66 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType67 = pricingRequest7.customerType();
        int int68 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 35 + "'", int38 == 35);
        org.junit.Assert.assertTrue("'" + customerType41 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType41.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + customerType52 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType52.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertTrue("'" + customerType65 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType65.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str66, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + customerType67 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType67.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        java.lang.String str9 = pricingRequest7.couponCode();
        java.lang.String str10 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType14, false, "hi!", false, (int) '#');
        boolean boolean20 = pricingRequest19.seasonalSale();
        java.lang.String str21 = pricingRequest19.couponCode();
        java.lang.String str22 = pricingRequest19.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = pricingRequest19.customerType();
        int int24 = pricingRequest19.quantity();
        java.lang.String str25 = pricingRequest19.couponCode();
        boolean boolean26 = pricingRequest7.equals((java.lang.Object) str25);
        int int27 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine pricingEngine28 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType33 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest38 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType33, false, "hi!", false, (int) '#');
        boolean boolean39 = pricingRequest38.seasonalSale();
        java.lang.String str40 = pricingRequest38.couponCode();
        boolean boolean42 = pricingRequest38.equals((java.lang.Object) (short) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType43 = pricingRequest38.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest48 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (int) (byte) 10, customerType43, true, "", false, (int) 'a');
        boolean boolean50 = pricingRequest48.equals((java.lang.Object) false);
        double double51 = pricingEngine28.calculateFinalPrice(pricingRequest48);
        com.viktor.lab4.PricingEngine.CustomerType customerType56 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest61 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType56, false, "hi!", false, (int) '#');
        boolean boolean62 = pricingRequest61.seasonalSale();
        java.lang.String str63 = pricingRequest61.couponCode();
        boolean boolean65 = pricingRequest61.equals((java.lang.Object) (short) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType66 = pricingRequest61.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest71 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) (byte) 100, customerType66, false, "", true, (int) (byte) 10);
        boolean boolean72 = pricingRequest71.seasonalSale();
        double double73 = pricingEngine28.calculateFinalPrice(pricingRequest71);
        boolean boolean74 = pricingRequest7.equals((java.lang.Object) pricingRequest71);
        int int75 = pricingRequest7.quantity();
        boolean boolean76 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType77 = pricingRequest7.customerType();
        java.lang.String str78 = pricingRequest7.couponCode();
        int int79 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + customerType33 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType33.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + customerType43 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType43.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 638.49d + "'", double51 == 638.49d);
        org.junit.Assert.assertTrue("'" + customerType56 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType56.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + customerType66 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType66.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 737.99d + "'", double73 == 737.99d);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + customerType77 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType77.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType6, false, "hi!", false, (int) '#');
        boolean boolean12 = pricingRequest11.seasonalSale();
        java.lang.String str13 = pricingRequest11.couponCode();
        java.lang.String str14 = pricingRequest11.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, (int) '4', customerType15, false, "hi!", true, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, 97, customerType15, true, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = pricingRequest25.customerType();
        boolean boolean27 = pricingRequest25.firstOrder();
        int int28 = pricingRequest25.quantity();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType26 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType26.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        java.lang.String str9 = pricingRequest7.couponCode();
        java.lang.String str10 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        double double12 = pricingRequest7.basePrice();
        int int13 = pricingRequest7.loyaltyPoints();
        int int14 = pricingRequest7.loyaltyPoints();
        boolean boolean15 = pricingRequest7.seasonalSale();
        boolean boolean16 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType20, false, "hi!", false, (int) '#');
        boolean boolean26 = pricingRequest25.seasonalSale();
        java.lang.String str27 = pricingRequest25.couponCode();
        boolean boolean29 = pricingRequest25.equals((java.lang.Object) (short) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType30 = pricingRequest25.customerType();
        int int31 = pricingRequest25.loyaltyPoints();
        boolean boolean32 = pricingRequest7.equals((java.lang.Object) int31);
        com.viktor.lab4.PricingEngine.CustomerType customerType33 = pricingRequest7.customerType();
        double double34 = pricingRequest7.basePrice();
        java.lang.String str35 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + customerType30 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType30.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 35 + "'", int31 == 35);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + customerType33 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType33.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 100.0d + "'", double34 == 100.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str35, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType14, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, 10, customerType14, true, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100L, (int) (byte) 0, customerType14, true, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", false, (int) 'a');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest34 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (int) (byte) 0, customerType14, false, "PricingRequest[basePrice=97.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=97]", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest39 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, 0, customerType14, false, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", false, 35);
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = pricingRequest39.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType41 = pricingRequest39.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest46 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 0, (int) (short) 10, customerType41, false, "PricingRequest[basePrice=0.0, quantity=97, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=true, loyaltyPoints=1]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest51 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, (int) (short) 1, customerType41, false, "PricingRequest[basePrice=97.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=10], firstOrder=true, loyaltyPoints=-1]", false, (int) 'a');
        boolean boolean52 = pricingRequest51.seasonalSale();
        boolean boolean53 = pricingRequest51.firstOrder();
        java.lang.Class<?> wildcardClass54 = pricingRequest51.getClass();
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType41 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType41.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
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
        java.lang.String str16 = pricingRequest7.couponCode();
        java.lang.String str17 = pricingRequest7.toString();
        int int18 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str14, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str17, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) '4', customerType2, true, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, 35);
        double double8 = pricingRequest7.basePrice();
        int int9 = pricingRequest7.loyaltyPoints();
        boolean boolean11 = pricingRequest7.equals((java.lang.Object) (byte) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType16, false, "hi!", false, (int) '#');
        boolean boolean23 = pricingRequest21.equals((java.lang.Object) (short) -1);
        boolean boolean25 = pricingRequest21.equals((java.lang.Object) 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = pricingRequest21.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (short) 0, customerType26, false, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", false, 10);
        java.lang.String str32 = pricingRequest31.toString();
        double double33 = pricingRequest31.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType36 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest41 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType36, false, "hi!", false, (int) '#');
        boolean boolean42 = pricingRequest41.seasonalSale();
        java.lang.String str43 = pricingRequest41.couponCode();
        java.lang.String str44 = pricingRequest41.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType47 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest52 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType47, false, "hi!", false, (int) '#');
        boolean boolean53 = pricingRequest52.seasonalSale();
        java.lang.String str54 = pricingRequest52.couponCode();
        java.lang.String str55 = pricingRequest52.couponCode();
        boolean boolean56 = pricingRequest41.equals((java.lang.Object) pricingRequest52);
        java.lang.String str57 = pricingRequest41.toString();
        boolean boolean58 = pricingRequest41.firstOrder();
        boolean boolean59 = pricingRequest31.equals((java.lang.Object) pricingRequest41);
        boolean boolean60 = pricingRequest7.equals((java.lang.Object) pricingRequest41);
        java.lang.Class<?> wildcardClass61 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + customerType26 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType26.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PricingRequest[basePrice=0.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=false, loyaltyPoints=10]" + "'", str32, "PricingRequest[basePrice=0.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=false, loyaltyPoints=10]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + customerType36 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType36.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + customerType47 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType47.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str57, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType6, false, "hi!", false, (int) '#');
        boolean boolean12 = pricingRequest11.seasonalSale();
        java.lang.String str13 = pricingRequest11.couponCode();
        boolean boolean15 = pricingRequest11.equals((java.lang.Object) (short) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (int) (byte) 10, customerType16, true, "", false, (int) 'a');
        double double22 = pricingRequest21.basePrice();
        double double23 = pricingRequest21.basePrice();
        java.lang.String str24 = pricingRequest21.toString();
        java.lang.String str25 = pricingRequest21.toString();
        java.lang.String str26 = pricingRequest21.couponCode();
        boolean boolean27 = pricingRequest21.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = pricingRequest21.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest(79.99d, (int) (short) 0, customerType28, true, "", false, 35);
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = pricingRequest33.customerType();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 97.0d + "'", double22 == 97.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 97.0d + "'", double23 == 97.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PricingRequest[basePrice=97.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=97]" + "'", str24, "PricingRequest[basePrice=97.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=97]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PricingRequest[basePrice=97.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=97]" + "'", str25, "PricingRequest[basePrice=97.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=97]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType34 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType34.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
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
        com.viktor.lab4.PricingEngine.CustomerType customerType50 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest55 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType50, false, "hi!", false, (int) '#');
        boolean boolean56 = pricingRequest55.seasonalSale();
        java.lang.String str57 = pricingRequest55.couponCode();
        java.lang.String str58 = pricingRequest55.toString();
        double double59 = pricingRequest55.basePrice();
        java.lang.String str60 = pricingRequest55.toString();
        int int61 = pricingRequest55.loyaltyPoints();
        java.lang.String str62 = pricingRequest55.toString();
        java.lang.String str63 = pricingRequest55.toString();
        double double64 = pricingRequest55.basePrice();
        // The following exception was thrown during execution in test generation
        try {
            double double65 = pricingEngine45.calculateFinalPrice(pricingRequest55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + customerType50 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType50.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str58, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 100.0d + "'", double59 == 100.0d);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str60, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 35 + "'", int61 == 35);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str62, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str63, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 100.0d + "'", double64 == 100.0d);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType10, false, "hi!", false, (int) '#');
        boolean boolean16 = pricingRequest15.seasonalSale();
        java.lang.String str17 = pricingRequest15.couponCode();
        java.lang.String str18 = pricingRequest15.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = pricingRequest15.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = pricingRequest15.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) -1, 0, customerType20, true, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", true, 35);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 10, 32, customerType20, true, "PricingRequest[basePrice=100.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=true, loyaltyPoints=0]", false, 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType31 = pricingRequest30.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest36 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (int) (short) -1, customerType31, false, "PricingRequest[basePrice=0.0, quantity=97, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=true, loyaltyPoints=1]", true, (int) (short) 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest41 = new com.viktor.lab4.PricingEngine.PricingRequest(8.82d, 100, customerType31, false, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=false, loyaltyPoints=97]", false, (int) ' ');
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType31 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType31.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
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
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest43 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (int) (byte) 10, customerType38, true, "", false, (int) 'a');
        double double44 = pricingRequest43.basePrice();
        double double45 = pricingRequest43.basePrice();
        java.lang.String str46 = pricingRequest43.toString();
        java.lang.String str47 = pricingRequest43.toString();
        double double48 = pricingEngine0.calculateFinalPrice(pricingRequest43);
        double double49 = pricingRequest43.basePrice();
        boolean boolean50 = pricingRequest43.seasonalSale();
        java.lang.Object obj51 = null;
        boolean boolean52 = pricingRequest43.equals(obj51);
        int int53 = pricingRequest43.quantity();
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
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 97.0d + "'", double44 == 97.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 97.0d + "'", double45 == 97.0d);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "PricingRequest[basePrice=97.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=97]" + "'", str46, "PricingRequest[basePrice=97.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=97]");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "PricingRequest[basePrice=97.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=97]" + "'", str47, "PricingRequest[basePrice=97.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=97]");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 638.49d + "'", double48 == 638.49d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 97.0d + "'", double49 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 10 + "'", int53 == 10);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        java.lang.String str9 = pricingRequest7.couponCode();
        java.lang.String str10 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        int int12 = pricingRequest7.quantity();
        double double13 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest7.customerType();
        java.lang.String str15 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str15, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType8, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, 10, customerType8, true, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100L, (int) (byte) 0, customerType8, true, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", false, (int) 'a');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (short) -1, customerType8, true, "hi!", false, (int) (short) 1);
        double double29 = pricingRequest28.basePrice();
        boolean boolean30 = pricingRequest28.firstOrder();
        int int31 = pricingRequest28.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
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
        com.viktor.lab4.PricingEngine.CustomerType customerType48 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest53 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10L, (int) '#', customerType48, false, "hi!", false, (int) (byte) 1);
        boolean boolean54 = pricingRequest53.firstOrder();
        java.lang.String str55 = pricingRequest53.toString();
        double double56 = pricingRequest53.basePrice();
        double double57 = pricingEngine0.calculateFinalPrice(pricingRequest53);
        com.viktor.lab4.PricingEngine.CustomerType customerType60 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest65 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) '4', customerType60, true, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, 35);
        boolean boolean66 = pricingRequest65.firstOrder();
        java.lang.String str67 = pricingRequest65.toString();
        boolean boolean68 = pricingRequest65.seasonalSale();
        boolean boolean69 = pricingRequest65.firstOrder();
        boolean boolean70 = pricingRequest65.seasonalSale();
        boolean boolean71 = pricingRequest65.firstOrder();
        double double72 = pricingEngine0.calculateFinalPrice(pricingRequest65);
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
        org.junit.Assert.assertTrue("'" + customerType48 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType48.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]" + "'", str55, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 10.0d + "'", double56 == 10.0d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 280.99d + "'", double57 == 280.99d);
        org.junit.Assert.assertTrue("'" + customerType60 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType60.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "PricingRequest[basePrice=1.0, quantity=52, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=true, loyaltyPoints=35]" + "'", str67, "PricingRequest[basePrice=1.0, quantity=52, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=true, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 41.79d + "'", double72 == 41.79d);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
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
        boolean boolean16 = pricingRequest7.seasonalSale();
        java.lang.String str17 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str14, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str17, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType2, false, "hi!", false, (int) '#');
        boolean boolean9 = pricingRequest7.equals((java.lang.Object) (short) -1);
        boolean boolean11 = pricingRequest7.equals((java.lang.Object) 0);
        double double12 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest7.customerType();
        java.lang.String str14 = pricingRequest7.couponCode();
        boolean boolean15 = pricingRequest7.seasonalSale();
        boolean boolean16 = pricingRequest7.firstOrder();
        int int17 = pricingRequest7.quantity();
        java.lang.String str18 = pricingRequest7.toString();
        java.lang.String str19 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str18, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str19, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
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
        com.viktor.lab4.PricingEngine.CustomerType customerType39 = pricingRequest35.customerType();
        int int40 = pricingRequest35.quantity();
        java.lang.String str41 = pricingRequest35.couponCode();
        int int42 = pricingRequest35.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType45 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest50 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType45, false, "hi!", false, (int) '#');
        boolean boolean51 = pricingRequest50.seasonalSale();
        java.lang.String str52 = pricingRequest50.couponCode();
        java.lang.String str53 = pricingRequest50.toString();
        java.lang.String str54 = pricingRequest50.couponCode();
        boolean boolean55 = pricingRequest35.equals((java.lang.Object) pricingRequest50);
        com.viktor.lab4.PricingEngine.CustomerType customerType56 = pricingRequest50.customerType();
        boolean boolean57 = pricingRequest26.equals((java.lang.Object) pricingRequest50);
        java.lang.String str58 = pricingRequest50.couponCode();
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
        org.junit.Assert.assertTrue("'" + customerType39 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType39.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 35 + "'", int42 == 35);
        org.junit.Assert.assertTrue("'" + customerType45 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType45.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str53, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + customerType56 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType56.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
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
        boolean boolean24 = pricingRequest20.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType29 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest34 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType29, false, "hi!", false, (int) '#');
        boolean boolean35 = pricingRequest34.seasonalSale();
        java.lang.String str36 = pricingRequest34.couponCode();
        boolean boolean38 = pricingRequest34.equals((java.lang.Object) (short) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType39 = pricingRequest34.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest44 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) (byte) 100, customerType39, false, "", true, (int) (byte) 10);
        boolean boolean45 = pricingRequest44.seasonalSale();
        int int46 = pricingRequest44.quantity();
        java.lang.String str47 = pricingRequest44.toString();
        boolean boolean48 = pricingRequest44.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType49 = pricingRequest44.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType50 = pricingRequest44.customerType();
        boolean boolean51 = pricingRequest20.equals((java.lang.Object) pricingRequest44);
        java.lang.String str52 = pricingRequest20.toString();
        org.junit.Assert.assertTrue("'" + customerType5 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType5.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 638.49d + "'", double23 == 638.49d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + customerType29 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType29.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + customerType39 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType39.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 100 + "'", int46 == 100);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "PricingRequest[basePrice=10.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=10]" + "'", str47, "PricingRequest[basePrice=10.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=10]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + customerType49 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType49.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType50 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType50.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "PricingRequest[basePrice=97.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=97]" + "'", str52, "PricingRequest[basePrice=97.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=97]");
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType4, false, "hi!", false, (int) '#');
        boolean boolean10 = pricingRequest9.seasonalSale();
        java.lang.String str11 = pricingRequest9.couponCode();
        boolean boolean13 = pricingRequest9.equals((java.lang.Object) (short) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) (byte) 100, customerType14, false, "", true, (int) (byte) 10);
        boolean boolean20 = pricingRequest19.seasonalSale();
        int int21 = pricingRequest19.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest19.customerType();
        java.lang.String str23 = pricingRequest19.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = pricingRequest19.customerType();
        int int25 = pricingRequest19.quantity();
        int int26 = pricingRequest19.quantity();
        boolean boolean27 = pricingRequest19.seasonalSale();
        double double28 = pricingRequest19.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType29 = pricingRequest19.customerType();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + customerType24 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType24.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType29 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType29.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) ' ', customerType2, true, "PricingRequest[basePrice=10.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=10]", false, (int) (byte) 0);
        int int8 = pricingRequest7.quantity();
        java.lang.String str9 = pricingRequest7.toString();
        java.lang.String str10 = pricingRequest7.couponCode();
        boolean boolean11 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=1.0, quantity=32, customerType=null, seasonalSale=true, couponCode=PricingRequest[basePrice=10.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=10], firstOrder=false, loyaltyPoints=0]" + "'", str9, "PricingRequest[basePrice=1.0, quantity=32, customerType=null, seasonalSale=true, couponCode=PricingRequest[basePrice=10.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=10], firstOrder=false, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=10.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=10]" + "'", str10, "PricingRequest[basePrice=10.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=10]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType8, false, "hi!", false, (int) '#');
        boolean boolean14 = pricingRequest13.seasonalSale();
        java.lang.String str15 = pricingRequest13.couponCode();
        java.lang.String str16 = pricingRequest13.toString();
        double double17 = pricingRequest13.basePrice();
        double double18 = pricingRequest13.basePrice();
        double double19 = pricingRequest13.basePrice();
        boolean boolean20 = pricingRequest13.seasonalSale();
        java.lang.String str21 = pricingRequest13.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest13.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1L), (int) (byte) 1, customerType22, true, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=0.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=false, loyaltyPoints=10], firstOrder=true, loyaltyPoints=10]", true, 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest(6507.99d, (int) (byte) 1, customerType22, false, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=0.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=false, loyaltyPoints=10], firstOrder=true, loyaltyPoints=10]", true, (int) (short) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest37 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) 0, customerType22, true, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=10], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=32]", false, 35);
        double double38 = pricingRequest37.basePrice();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str16, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str21, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType4, false, "hi!", false, (int) '#');
        boolean boolean10 = pricingRequest9.seasonalSale();
        java.lang.String str11 = pricingRequest9.couponCode();
        boolean boolean13 = pricingRequest9.equals((java.lang.Object) (short) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (int) (byte) 10, customerType14, true, "", false, (int) 'a');
        boolean boolean21 = pricingRequest19.equals((java.lang.Object) false);
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest19.customerType();
        int int23 = pricingRequest19.loyaltyPoints();
        int int24 = pricingRequest19.quantity();
        double double25 = pricingRequest19.basePrice();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 97.0d + "'", double25 == 97.0d);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        java.lang.String str9 = pricingRequest7.couponCode();
        java.lang.String str10 = pricingRequest7.toString();
        double double11 = pricingRequest7.basePrice();
        double double12 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType23, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, 10, customerType23, true, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest38 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100L, (int) (byte) 0, customerType23, true, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", false, (int) 'a');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest43 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (int) (byte) 0, customerType23, false, "PricingRequest[basePrice=97.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=97]", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest48 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, 0, customerType23, false, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", false, 35);
        com.viktor.lab4.PricingEngine.CustomerType customerType49 = pricingRequest48.customerType();
        boolean boolean50 = pricingRequest7.equals((java.lang.Object) pricingRequest48);
        boolean boolean51 = pricingRequest48.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType52 = pricingRequest48.customerType();
        boolean boolean53 = pricingRequest48.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType54 = pricingRequest48.customerType();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str10, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType49 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType49.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + customerType52 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType52.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + customerType54 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType54.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
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
        int int70 = pricingRequest7.quantity();
        int int71 = pricingRequest7.loyaltyPoints();
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
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 35 + "'", int71 == 35);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        java.lang.String str9 = pricingRequest7.couponCode();
        java.lang.String str10 = pricingRequest7.couponCode();
        boolean boolean11 = pricingRequest7.seasonalSale();
        boolean boolean13 = pricingRequest7.equals((java.lang.Object) 10.0d);
        boolean boolean14 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType19, false, "hi!", false, (int) '#');
        boolean boolean25 = pricingRequest24.seasonalSale();
        java.lang.String str26 = pricingRequest24.couponCode();
        boolean boolean28 = pricingRequest24.equals((java.lang.Object) (short) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType29 = pricingRequest24.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest34 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (int) (byte) 10, customerType29, true, "", false, (int) 'a');
        double double35 = pricingRequest34.basePrice();
        boolean boolean36 = pricingRequest7.equals((java.lang.Object) pricingRequest34);
        int int37 = pricingRequest34.quantity();
        int int38 = pricingRequest34.loyaltyPoints();
        int int39 = pricingRequest34.loyaltyPoints();
        boolean boolean40 = pricingRequest34.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + customerType29 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType29.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 97.0d + "'", double35 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 97 + "'", int38 == 97);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 97 + "'", int39 == 97);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        java.lang.String str9 = pricingRequest7.couponCode();
        java.lang.String str10 = pricingRequest7.couponCode();
        boolean boolean11 = pricingRequest7.seasonalSale();
        boolean boolean13 = pricingRequest7.equals((java.lang.Object) 10.0d);
        boolean boolean14 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest7.customerType();
        int int16 = pricingRequest7.quantity();
        int int17 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType6, false, "hi!", false, (int) '#');
        boolean boolean13 = pricingRequest11.equals((java.lang.Object) (short) -1);
        boolean boolean15 = pricingRequest11.equals((java.lang.Object) 0);
        int int16 = pricingRequest11.loyaltyPoints();
        boolean boolean17 = pricingRequest11.seasonalSale();
        java.lang.String str18 = pricingRequest11.couponCode();
        java.lang.String str19 = pricingRequest11.toString();
        java.lang.String str20 = pricingRequest11.toString();
        boolean boolean21 = pricingRequest11.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (short) 10, customerType22, true, "PricingRequest[basePrice=280.99, quantity=100, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=true, loyaltyPoints=0]", false, (int) (short) 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (int) (byte) 10, customerType22, true, "PricingRequest[basePrice=0.0, quantity=52, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", false, 52);
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str19, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str20, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType6, false, "hi!", false, (int) '#');
        boolean boolean13 = pricingRequest11.equals((java.lang.Object) (short) -1);
        boolean boolean15 = pricingRequest11.equals((java.lang.Object) 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (short) 0, customerType16, false, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", false, 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest26 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', (-1), customerType16, false, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", true, 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType33 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest38 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType33, false, "hi!", false, (int) '#');
        boolean boolean40 = pricingRequest38.equals((java.lang.Object) (short) -1);
        boolean boolean42 = pricingRequest38.equals((java.lang.Object) 0);
        double double43 = pricingRequest38.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType44 = pricingRequest38.customerType();
        java.lang.String str45 = pricingRequest38.couponCode();
        int int46 = pricingRequest38.loyaltyPoints();
        boolean boolean47 = pricingRequest38.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType48 = pricingRequest38.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest53 = new com.viktor.lab4.PricingEngine.PricingRequest(6507.99d, 100, customerType48, true, "PricingRequest[basePrice=0.0, quantity=100, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=false, loyaltyPoints=52]", true, (int) (byte) 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest58 = new com.viktor.lab4.PricingEngine.PricingRequest(35.0d, (int) (byte) 1, customerType48, false, "PricingRequest[basePrice=1.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=true, loyaltyPoints=0]", true, (int) (byte) 1);
        boolean boolean59 = pricingRequest26.equals((java.lang.Object) (byte) 1);
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType33 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType33.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 100.0d + "'", double43 == 100.0d);
        org.junit.Assert.assertTrue("'" + customerType44 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType44.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 35 + "'", int46 == 35);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + customerType48 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType48.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType10, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, 10, customerType10, true, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, (int) (byte) 100, customerType10, false, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1), (int) '#', customerType10, true, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", true, (int) (short) 100);
        int int31 = pricingRequest30.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType32 = pricingRequest30.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest37 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, 10, customerType32, false, "PricingRequest[basePrice=0.0, quantity=97, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=true, loyaltyPoints=1]", false, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType38 = pricingRequest37.customerType();
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertTrue("'" + customerType32 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType32.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType38 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType38.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType8, false, "hi!", false, (int) '#');
        boolean boolean14 = pricingRequest13.seasonalSale();
        java.lang.String str15 = pricingRequest13.couponCode();
        java.lang.String str16 = pricingRequest13.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest13.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = pricingRequest13.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) -1, 0, customerType18, true, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", true, 35);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) (byte) 100, customerType18, true, "PricingRequest[basePrice=638.49, quantity=1, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=false, loyaltyPoints=32]", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (-1), customerType18, false, "PricingRequest[basePrice=1.0, quantity=32, customerType=null, seasonalSale=true, couponCode=PricingRequest[basePrice=10.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=10], firstOrder=false, loyaltyPoints=0]", false, (-1));
        int int34 = pricingRequest33.loyaltyPoints();
        int int35 = pricingRequest33.quantity();
        boolean boolean36 = pricingRequest33.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
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
        int int45 = pricingRequest43.quantity();
        java.lang.String str46 = pricingRequest43.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType49 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest54 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType49, false, "hi!", false, (int) '#');
        boolean boolean55 = pricingRequest54.seasonalSale();
        java.lang.String str56 = pricingRequest54.couponCode();
        java.lang.String str57 = pricingRequest54.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType58 = pricingRequest54.customerType();
        double double59 = pricingRequest54.basePrice();
        boolean boolean60 = pricingRequest43.equals((java.lang.Object) double59);
        boolean boolean61 = pricingRequest43.seasonalSale();
        double double62 = pricingRequest43.basePrice();
        double double63 = pricingEngine0.calculateFinalPrice(pricingRequest43);
        com.viktor.lab4.PricingEngine.CustomerType customerType70 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest75 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType70, false, "hi!", false, (int) '#');
        boolean boolean76 = pricingRequest75.seasonalSale();
        java.lang.String str77 = pricingRequest75.couponCode();
        boolean boolean79 = pricingRequest75.equals((java.lang.Object) (short) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType80 = pricingRequest75.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest85 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (int) (byte) 10, customerType80, true, "", false, (int) 'a');
        double double86 = pricingRequest85.basePrice();
        int int87 = pricingRequest85.loyaltyPoints();
        com.viktor.lab4.PricingEngine pricingEngine88 = new com.viktor.lab4.PricingEngine();
        boolean boolean89 = pricingRequest85.equals((java.lang.Object) pricingEngine88);
        int int90 = pricingRequest85.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType91 = pricingRequest85.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest96 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, (int) (byte) 0, customerType91, false, "PricingRequest[basePrice=97.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=10], firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double97 = pricingEngine0.calculateFinalPrice(pricingRequest96);
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "PricingRequest[basePrice=10.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=10]" + "'", str46, "PricingRequest[basePrice=10.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=10]");
        org.junit.Assert.assertTrue("'" + customerType49 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType49.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertTrue("'" + customerType58 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType58.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 100.0d + "'", double59 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 10.0d + "'", double62 == 10.0d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 737.99d + "'", double63 == 737.99d);
        org.junit.Assert.assertTrue("'" + customerType70 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType70.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + customerType80 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType80.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 97.0d + "'", double86 == 97.0d);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 97 + "'", int87 == 97);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 10 + "'", int90 == 10);
        org.junit.Assert.assertTrue("'" + customerType91 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType91.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
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
        double double57 = pricingRequest15.basePrice();
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
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 100.0d + "'", double57 == 100.0d);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType10, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, 10, customerType10, true, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100L, (int) (byte) 0, customerType10, true, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", false, (int) 'a');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, 100, customerType10, true, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", false, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (byte) 10, customerType10, false, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType36 = pricingRequest35.customerType();
        java.lang.String str37 = pricingRequest35.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest45 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType40, false, "hi!", false, (int) '#');
        boolean boolean46 = pricingRequest45.seasonalSale();
        java.lang.String str47 = pricingRequest45.couponCode();
        java.lang.String str48 = pricingRequest45.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType49 = pricingRequest45.customerType();
        double double50 = pricingRequest45.basePrice();
        int int51 = pricingRequest45.loyaltyPoints();
        int int52 = pricingRequest45.loyaltyPoints();
        boolean boolean53 = pricingRequest45.seasonalSale();
        boolean boolean54 = pricingRequest45.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType55 = pricingRequest45.customerType();
        java.lang.Class<?> wildcardClass56 = pricingRequest45.getClass();
        boolean boolean57 = pricingRequest35.equals((java.lang.Object) wildcardClass56);
        com.viktor.lab4.PricingEngine.CustomerType customerType58 = pricingRequest35.customerType();
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType36 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType36.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "PricingRequest[basePrice=0.0, quantity=10, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=true, loyaltyPoints=-1]" + "'", str37, "PricingRequest[basePrice=0.0, quantity=10, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertTrue("'" + customerType49 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType49.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 100.0d + "'", double50 == 100.0d);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 35 + "'", int51 == 35);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 35 + "'", int52 == 35);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + customerType55 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType55.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + customerType58 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType58.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10L, (int) '#', customerType2, false, "hi!", false, (int) (byte) 1);
        double double8 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest7.customerType();
        java.lang.String str14 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType9 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType9.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType4, false, "hi!", false, (int) '#');
        boolean boolean10 = pricingRequest9.seasonalSale();
        java.lang.String str11 = pricingRequest9.couponCode();
        java.lang.String str12 = pricingRequest9.couponCode();
        boolean boolean13 = pricingRequest9.seasonalSale();
        double double14 = pricingRequest9.basePrice();
        double double15 = pricingRequest9.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType18, false, "hi!", false, (int) '#');
        boolean boolean24 = pricingRequest23.seasonalSale();
        java.lang.String str25 = pricingRequest23.couponCode();
        boolean boolean27 = pricingRequest23.equals((java.lang.Object) (short) 10);
        boolean boolean28 = pricingRequest23.seasonalSale();
        java.lang.Class<?> wildcardClass29 = pricingRequest23.getClass();
        boolean boolean30 = pricingRequest9.equals((java.lang.Object) wildcardClass29);
        int int31 = pricingRequest9.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest39 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType34, false, "hi!", false, (int) '#');
        boolean boolean40 = pricingRequest39.seasonalSale();
        java.lang.String str41 = pricingRequest39.couponCode();
        java.lang.String str42 = pricingRequest39.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType45 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest50 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType45, false, "hi!", false, (int) '#');
        boolean boolean51 = pricingRequest50.seasonalSale();
        java.lang.String str52 = pricingRequest50.couponCode();
        java.lang.String str53 = pricingRequest50.couponCode();
        boolean boolean54 = pricingRequest39.equals((java.lang.Object) pricingRequest50);
        boolean boolean55 = pricingRequest9.equals((java.lang.Object) pricingRequest39);
        boolean boolean56 = pricingRequest9.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType57 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest62 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1L), (int) '4', customerType57, false, "PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, 35);
        boolean boolean63 = pricingRequest62.seasonalSale();
        java.lang.String str64 = pricingRequest62.toString();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 35 + "'", int31 == 35);
        org.junit.Assert.assertTrue("'" + customerType34 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType34.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + customerType45 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType45.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + customerType57 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType57.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "PricingRequest[basePrice=-1.0, quantity=52, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=true, loyaltyPoints=35]" + "'", str64, "PricingRequest[basePrice=-1.0, quantity=52, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=true, loyaltyPoints=35]");
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType2, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = pricingRequest7.customerType();
        boolean boolean9 = pricingRequest7.firstOrder();
        boolean boolean10 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        java.lang.String str9 = pricingRequest7.couponCode();
        java.lang.String str10 = pricingRequest7.couponCode();
        boolean boolean11 = pricingRequest7.seasonalSale();
        boolean boolean13 = pricingRequest7.equals((java.lang.Object) 10.0d);
        java.lang.String str14 = pricingRequest7.couponCode();
        int int15 = pricingRequest7.quantity();
        java.lang.String str16 = pricingRequest7.couponCode();
        boolean boolean17 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType2, false, "hi!", false, (int) '#');
        double double8 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest7.customerType();
        boolean boolean10 = pricingRequest7.firstOrder();
        java.lang.String str11 = pricingRequest7.toString();
        int int12 = pricingRequest7.quantity();
        boolean boolean13 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + customerType9 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType9.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str11, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        java.lang.String str9 = pricingRequest7.couponCode();
        java.lang.String str10 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        double double12 = pricingRequest7.basePrice();
        boolean boolean13 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType4, false, "hi!", false, (int) '#');
        boolean boolean10 = pricingRequest9.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType13, false, "hi!", false, (int) '#');
        boolean boolean19 = pricingRequest18.seasonalSale();
        java.lang.String str20 = pricingRequest18.couponCode();
        java.lang.String str21 = pricingRequest18.couponCode();
        boolean boolean22 = pricingRequest18.seasonalSale();
        double double23 = pricingRequest18.basePrice();
        double double24 = pricingRequest18.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType27, false, "hi!", false, (int) '#');
        boolean boolean33 = pricingRequest32.seasonalSale();
        java.lang.String str34 = pricingRequest32.couponCode();
        boolean boolean36 = pricingRequest32.equals((java.lang.Object) (short) 10);
        boolean boolean37 = pricingRequest32.seasonalSale();
        java.lang.Class<?> wildcardClass38 = pricingRequest32.getClass();
        boolean boolean39 = pricingRequest18.equals((java.lang.Object) wildcardClass38);
        int int40 = pricingRequest18.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType43 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest48 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType43, false, "hi!", false, (int) '#');
        boolean boolean49 = pricingRequest48.seasonalSale();
        java.lang.String str50 = pricingRequest48.couponCode();
        java.lang.String str51 = pricingRequest48.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType54 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest59 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType54, false, "hi!", false, (int) '#');
        boolean boolean60 = pricingRequest59.seasonalSale();
        java.lang.String str61 = pricingRequest59.couponCode();
        java.lang.String str62 = pricingRequest59.couponCode();
        boolean boolean63 = pricingRequest48.equals((java.lang.Object) pricingRequest59);
        boolean boolean64 = pricingRequest18.equals((java.lang.Object) pricingRequest48);
        boolean boolean65 = pricingRequest9.equals((java.lang.Object) pricingRequest48);
        java.lang.String str66 = pricingRequest9.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType67 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType68 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest73 = new com.viktor.lab4.PricingEngine.PricingRequest(657.99d, (-1), customerType68, false, "PricingRequest[basePrice=280.99, quantity=100, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=true, loyaltyPoints=0]", true, (int) 'a');
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
        org.junit.Assert.assertTrue("'" + customerType27 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType27.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 35 + "'", int40 == 35);
        org.junit.Assert.assertTrue("'" + customerType43 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType43.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + customerType54 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType54.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertTrue("'" + customerType67 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType67.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType68 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType68.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType4, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) 'a', customerType4, false, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", true, 1);
        boolean boolean16 = pricingRequest14.equals((java.lang.Object) 1.0f);
        boolean boolean17 = pricingRequest14.firstOrder();
        boolean boolean18 = pricingRequest14.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        java.lang.String str9 = pricingRequest7.couponCode();
        java.lang.String str10 = pricingRequest7.couponCode();
        boolean boolean11 = pricingRequest7.seasonalSale();
        double double12 = pricingRequest7.basePrice();
        double double13 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType16, false, "hi!", false, (int) '#');
        boolean boolean22 = pricingRequest21.seasonalSale();
        java.lang.String str23 = pricingRequest21.couponCode();
        boolean boolean25 = pricingRequest21.equals((java.lang.Object) (short) 10);
        boolean boolean26 = pricingRequest21.seasonalSale();
        java.lang.Class<?> wildcardClass27 = pricingRequest21.getClass();
        boolean boolean28 = pricingRequest7.equals((java.lang.Object) wildcardClass27);
        int int29 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType32 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest37 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType32, false, "hi!", false, (int) '#');
        boolean boolean38 = pricingRequest37.seasonalSale();
        java.lang.String str39 = pricingRequest37.couponCode();
        java.lang.String str40 = pricingRequest37.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType43 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest48 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType43, false, "hi!", false, (int) '#');
        boolean boolean49 = pricingRequest48.seasonalSale();
        java.lang.String str50 = pricingRequest48.couponCode();
        java.lang.String str51 = pricingRequest48.couponCode();
        boolean boolean52 = pricingRequest37.equals((java.lang.Object) pricingRequest48);
        boolean boolean53 = pricingRequest7.equals((java.lang.Object) pricingRequest37);
        boolean boolean54 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType55 = pricingRequest7.customerType();
        java.lang.String str56 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType61 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest66 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType61, false, "hi!", false, (int) '#');
        boolean boolean67 = pricingRequest66.seasonalSale();
        java.lang.String str68 = pricingRequest66.couponCode();
        boolean boolean70 = pricingRequest66.equals((java.lang.Object) (short) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType71 = pricingRequest66.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest76 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) (byte) 100, customerType71, false, "", true, (int) (byte) 10);
        int int77 = pricingRequest76.loyaltyPoints();
        int int78 = pricingRequest76.quantity();
        boolean boolean79 = pricingRequest76.seasonalSale();
        boolean boolean80 = pricingRequest7.equals((java.lang.Object) boolean79);
        boolean boolean81 = pricingRequest7.firstOrder();
        int int82 = pricingRequest7.quantity();
        double double83 = pricingRequest7.basePrice();
        java.lang.String str84 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
        org.junit.Assert.assertTrue("'" + customerType32 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType32.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + customerType43 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType43.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + customerType55 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType55.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str56, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + customerType61 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType61.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + customerType71 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType71.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 10 + "'", int77 == 10);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 100 + "'", int78 == 100);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 100.0d + "'", double83 == 100.0d);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str84, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        java.lang.String str9 = pricingRequest7.couponCode();
        java.lang.String str10 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        int int12 = pricingRequest7.quantity();
        int int13 = pricingRequest7.quantity();
        java.lang.Object obj14 = null;
        boolean boolean15 = pricingRequest7.equals(obj14);
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest7.customerType();
        boolean boolean17 = pricingRequest7.firstOrder();
        java.lang.String str18 = pricingRequest7.couponCode();
        int int19 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType4, false, "hi!", false, (int) '#');
        boolean boolean10 = pricingRequest9.seasonalSale();
        java.lang.String str11 = pricingRequest9.couponCode();
        java.lang.String str12 = pricingRequest9.couponCode();
        boolean boolean13 = pricingRequest9.seasonalSale();
        boolean boolean15 = pricingRequest9.equals((java.lang.Object) 10.0d);
        java.lang.String str16 = pricingRequest9.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1), (int) (short) 1, customerType17, true, "hi!", false, 97);
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = pricingRequest22.customerType();
        java.lang.String str24 = pricingRequest22.couponCode();
        boolean boolean25 = pricingRequest22.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType4, false, "hi!", false, (int) '#');
        boolean boolean11 = pricingRequest9.equals((java.lang.Object) (short) -1);
        boolean boolean13 = pricingRequest9.equals((java.lang.Object) 0);
        int int14 = pricingRequest9.loyaltyPoints();
        boolean boolean15 = pricingRequest9.seasonalSale();
        java.lang.String str16 = pricingRequest9.couponCode();
        java.lang.String str17 = pricingRequest9.toString();
        java.lang.String str18 = pricingRequest9.toString();
        boolean boolean19 = pricingRequest9.seasonalSale();
        java.lang.String str20 = pricingRequest9.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest26 = new com.viktor.lab4.PricingEngine.PricingRequest(6507.99d, (int) (byte) 1, customerType21, false, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=0.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=false, loyaltyPoints=10], firstOrder=true, loyaltyPoints=10]", false, (int) (byte) 0);
        int int27 = pricingRequest26.quantity();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str17, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str18, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str20, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + customerType21 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType21.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType10, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, 10, customerType10, true, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100L, (int) (byte) 0, customerType10, true, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", false, (int) 'a');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (int) (byte) 0, customerType10, false, "PricingRequest[basePrice=97.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=97]", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, 0, customerType10, false, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", false, 35);
        int int36 = pricingRequest35.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType37 = pricingRequest35.customerType();
        java.lang.String str38 = pricingRequest35.toString();
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + customerType37 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType37.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "PricingRequest[basePrice=-1.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=false, loyaltyPoints=35]" + "'", str38, "PricingRequest[basePrice=-1.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=false, loyaltyPoints=35]");
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType6, false, "hi!", false, (int) '#');
        boolean boolean12 = pricingRequest11.seasonalSale();
        java.lang.String str13 = pricingRequest11.couponCode();
        java.lang.String str14 = pricingRequest11.couponCode();
        boolean boolean15 = pricingRequest11.seasonalSale();
        boolean boolean17 = pricingRequest11.equals((java.lang.Object) 10.0d);
        boolean boolean18 = pricingRequest11.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType23, false, "hi!", false, (int) '#');
        boolean boolean29 = pricingRequest28.seasonalSale();
        java.lang.String str30 = pricingRequest28.couponCode();
        boolean boolean32 = pricingRequest28.equals((java.lang.Object) (short) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType33 = pricingRequest28.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest38 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (int) (byte) 10, customerType33, true, "", false, (int) 'a');
        double double39 = pricingRequest38.basePrice();
        boolean boolean40 = pricingRequest11.equals((java.lang.Object) pricingRequest38);
        int int41 = pricingRequest38.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType42 = pricingRequest38.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest47 = new com.viktor.lab4.PricingEngine.PricingRequest(3387.99d, (int) (byte) 10, customerType42, true, "", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest52 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, 100, customerType42, true, "PricingRequest[basePrice=-1.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=false, loyaltyPoints=10], firstOrder=false, loyaltyPoints=1]", false, 52);
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + customerType33 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType33.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 97.0d + "'", double39 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertTrue("'" + customerType42 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType42.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        java.lang.String str9 = pricingRequest7.couponCode();
        java.lang.String str10 = pricingRequest7.couponCode();
        boolean boolean11 = pricingRequest7.seasonalSale();
        double double12 = pricingRequest7.basePrice();
        double double13 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType16, false, "hi!", false, (int) '#');
        boolean boolean22 = pricingRequest21.seasonalSale();
        java.lang.String str23 = pricingRequest21.couponCode();
        boolean boolean25 = pricingRequest21.equals((java.lang.Object) (short) 10);
        boolean boolean26 = pricingRequest21.seasonalSale();
        java.lang.Class<?> wildcardClass27 = pricingRequest21.getClass();
        boolean boolean28 = pricingRequest7.equals((java.lang.Object) wildcardClass27);
        int int29 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType32 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest37 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType32, false, "hi!", false, (int) '#');
        boolean boolean38 = pricingRequest37.seasonalSale();
        java.lang.String str39 = pricingRequest37.couponCode();
        java.lang.String str40 = pricingRequest37.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType43 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest48 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType43, false, "hi!", false, (int) '#');
        boolean boolean49 = pricingRequest48.seasonalSale();
        java.lang.String str50 = pricingRequest48.couponCode();
        java.lang.String str51 = pricingRequest48.couponCode();
        boolean boolean52 = pricingRequest37.equals((java.lang.Object) pricingRequest48);
        boolean boolean53 = pricingRequest7.equals((java.lang.Object) pricingRequest37);
        java.lang.String str54 = pricingRequest37.couponCode();
        double double55 = pricingRequest37.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType56 = pricingRequest37.customerType();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
        org.junit.Assert.assertTrue("'" + customerType32 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType32.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + customerType43 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType43.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 100.0d + "'", double55 == 100.0d);
        org.junit.Assert.assertTrue("'" + customerType56 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType56.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType4, false, "hi!", false, (int) '#');
        boolean boolean10 = pricingRequest9.seasonalSale();
        java.lang.String str11 = pricingRequest9.couponCode();
        boolean boolean13 = pricingRequest9.equals((java.lang.Object) (short) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) (byte) 100, customerType14, false, "", true, (int) (byte) 10);
        boolean boolean20 = pricingRequest19.firstOrder();
        java.lang.String str21 = pricingRequest19.couponCode();
        boolean boolean22 = pricingRequest19.seasonalSale();
        java.lang.String str23 = pricingRequest19.toString();
        int int24 = pricingRequest19.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "PricingRequest[basePrice=10.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=10]" + "'", str23, "PricingRequest[basePrice=10.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=10]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
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
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, 10, customerType26, true, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, (int) (short) 1);
        double double32 = pricingEngine22.calculateFinalPrice(pricingRequest31);
        com.viktor.lab4.PricingEngine.CustomerType customerType35 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest40 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) '4', customerType35, true, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, 35);
        boolean boolean41 = pricingRequest40.firstOrder();
        java.lang.String str42 = pricingRequest40.toString();
        boolean boolean43 = pricingRequest40.seasonalSale();
        boolean boolean44 = pricingRequest40.firstOrder();
        java.lang.String str45 = pricingRequest40.toString();
        double double46 = pricingEngine22.calculateFinalPrice(pricingRequest40);
        com.viktor.lab4.PricingEngine.CustomerType customerType49 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest54 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType49, false, "hi!", false, (int) '#');
        boolean boolean55 = pricingRequest54.seasonalSale();
        java.lang.String str56 = pricingRequest54.couponCode();
        boolean boolean58 = pricingRequest54.equals((java.lang.Object) (short) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType59 = pricingRequest54.customerType();
        int int60 = pricingRequest54.loyaltyPoints();
        int int61 = pricingRequest54.loyaltyPoints();
        double double62 = pricingRequest54.basePrice();
        java.lang.String str63 = pricingRequest54.couponCode();
        java.lang.String str64 = pricingRequest54.couponCode();
        boolean boolean65 = pricingRequest54.seasonalSale();
        // The following exception was thrown during execution in test generation
        try {
            double double66 = pricingEngine22.calculateFinalPrice(pricingRequest54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: quantity must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 97.0d + "'", double20 == 97.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + customerType26 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType26.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 707.99d + "'", double32 == 707.99d);
        org.junit.Assert.assertTrue("'" + customerType35 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType35.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "PricingRequest[basePrice=1.0, quantity=52, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=true, loyaltyPoints=35]" + "'", str42, "PricingRequest[basePrice=1.0, quantity=52, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=true, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "PricingRequest[basePrice=1.0, quantity=52, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=true, loyaltyPoints=35]" + "'", str45, "PricingRequest[basePrice=1.0, quantity=52, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=true, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 41.79d + "'", double46 == 41.79d);
        org.junit.Assert.assertTrue("'" + customerType49 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType49.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + customerType59 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType59.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 35 + "'", int60 == 35);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 35 + "'", int61 == 35);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 100.0d + "'", double62 == 100.0d);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType6, false, "hi!", false, (int) '#');
        boolean boolean12 = pricingRequest11.seasonalSale();
        java.lang.String str13 = pricingRequest11.couponCode();
        java.lang.String str14 = pricingRequest11.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType17, false, "hi!", false, (int) '#');
        boolean boolean23 = pricingRequest22.seasonalSale();
        java.lang.String str24 = pricingRequest22.couponCode();
        java.lang.String str25 = pricingRequest22.couponCode();
        boolean boolean26 = pricingRequest11.equals((java.lang.Object) pricingRequest22);
        java.lang.String str27 = pricingRequest11.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, 1, customerType28, false, "PricingRequest[basePrice=-1.0, quantity=35, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=true, loyaltyPoints=100]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = pricingRequest33.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest39 = new com.viktor.lab4.PricingEngine.PricingRequest(62.38d, 10, customerType34, true, "PricingRequest[basePrice=1.0, quantity=52, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=true, loyaltyPoints=35]", false, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType34 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType34.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType4, false, "hi!", false, (int) '#');
        boolean boolean10 = pricingRequest9.seasonalSale();
        java.lang.String str11 = pricingRequest9.couponCode();
        boolean boolean13 = pricingRequest9.equals((java.lang.Object) (short) 10);
        boolean boolean14 = pricingRequest9.seasonalSale();
        boolean boolean15 = pricingRequest9.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest9.customerType();
        java.lang.String str17 = pricingRequest9.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, (int) '#', customerType18, false, "PricingRequest[basePrice=32.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=52, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=true, loyaltyPoints=35], firstOrder=true, loyaltyPoints=1]", true, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str17, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        com.viktor.lab4.PricingEngine pricingEngine2 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType7 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest12 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType7, false, "hi!", false, (int) '#');
        boolean boolean13 = pricingRequest12.seasonalSale();
        java.lang.String str14 = pricingRequest12.couponCode();
        boolean boolean16 = pricingRequest12.equals((java.lang.Object) (short) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest12.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (int) (byte) 10, customerType17, true, "", false, (int) 'a');
        boolean boolean24 = pricingRequest22.equals((java.lang.Object) false);
        double double25 = pricingEngine2.calculateFinalPrice(pricingRequest22);
        com.viktor.lab4.PricingEngine.CustomerType customerType30 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType30, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest40 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, 10, customerType30, true, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, 0);
        double double41 = pricingEngine2.calculateFinalPrice(pricingRequest40);
        int int42 = pricingRequest40.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType43 = pricingRequest40.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest48 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, 0, customerType43, false, "PricingRequest[basePrice=1.0, quantity=52, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=true, loyaltyPoints=35]", false, 0);
        boolean boolean49 = pricingRequest48.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType52 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest57 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType52, false, "hi!", false, (int) '#');
        boolean boolean58 = pricingRequest57.seasonalSale();
        java.lang.String str59 = pricingRequest57.couponCode();
        java.lang.String str60 = pricingRequest57.couponCode();
        boolean boolean61 = pricingRequest57.seasonalSale();
        boolean boolean63 = pricingRequest57.equals((java.lang.Object) 10.0d);
        boolean boolean64 = pricingRequest57.seasonalSale();
        double double65 = pricingRequest57.basePrice();
        boolean boolean66 = pricingRequest48.equals((java.lang.Object) pricingRequest57);
        double double67 = pricingRequest48.basePrice();
        int int68 = pricingRequest48.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType7 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType7.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 638.49d + "'", double25 == 638.49d);
        org.junit.Assert.assertTrue("'" + customerType30 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType30.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 657.99d + "'", double41 == 657.99d);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + customerType43 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType43.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + customerType52 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType52.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 100.0d + "'", double65 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 10.0d + "'", double67 == 10.0d);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
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
        int int48 = pricingRequest19.loyaltyPoints();
        int int49 = pricingRequest19.quantity();
        java.lang.String str50 = pricingRequest19.couponCode();
        boolean boolean51 = pricingRequest19.seasonalSale();
        boolean boolean52 = pricingRequest19.firstOrder();
        java.lang.String str53 = pricingRequest19.toString();
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
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 97 + "'", int48 == 97);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "PricingRequest[basePrice=97.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=97]" + "'", str53, "PricingRequest[basePrice=97.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=97]");
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) '4', customerType4, true, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, 35);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) (short) 1, customerType4, false, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, 0);
        double double15 = pricingRequest14.basePrice();
        double double16 = pricingRequest14.basePrice();
        int int17 = pricingRequest14.loyaltyPoints();
        java.lang.String str18 = pricingRequest14.toString();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=true, loyaltyPoints=0]" + "'", str18, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=true, loyaltyPoints=0]");
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        java.lang.String str9 = pricingRequest7.couponCode();
        java.lang.String str10 = pricingRequest7.couponCode();
        boolean boolean11 = pricingRequest7.seasonalSale();
        boolean boolean13 = pricingRequest7.equals((java.lang.Object) 10.0d);
        boolean boolean14 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType19, false, "hi!", false, (int) '#');
        boolean boolean25 = pricingRequest24.seasonalSale();
        java.lang.String str26 = pricingRequest24.couponCode();
        boolean boolean28 = pricingRequest24.equals((java.lang.Object) (short) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType29 = pricingRequest24.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest34 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (int) (byte) 10, customerType29, true, "", false, (int) 'a');
        double double35 = pricingRequest34.basePrice();
        boolean boolean36 = pricingRequest7.equals((java.lang.Object) pricingRequest34);
        double double37 = pricingRequest7.basePrice();
        boolean boolean38 = pricingRequest7.seasonalSale();
        double double39 = pricingRequest7.basePrice();
        int int40 = pricingRequest7.loyaltyPoints();
        boolean boolean41 = pricingRequest7.seasonalSale();
        int int42 = pricingRequest7.quantity();
        int int43 = pricingRequest7.quantity();
        java.lang.String str44 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + customerType29 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType29.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 97.0d + "'", double35 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 100.0d + "'", double37 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 100.0d + "'", double39 == 100.0d);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 35 + "'", int40 == 35);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        java.lang.String str9 = pricingRequest7.couponCode();
        boolean boolean11 = pricingRequest7.equals((java.lang.Object) (short) 10);
        boolean boolean12 = pricingRequest7.seasonalSale();
        boolean boolean13 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10L, (int) '#', customerType16, false, "hi!", false, (int) (byte) 1);
        double double22 = pricingRequest21.basePrice();
        boolean boolean23 = pricingRequest21.seasonalSale();
        boolean boolean24 = pricingRequest7.equals((java.lang.Object) pricingRequest21);
        java.lang.String str25 = pricingRequest7.couponCode();
        java.lang.String str26 = pricingRequest7.toString();
        int int27 = pricingRequest7.quantity();
        int int28 = pricingRequest7.quantity();
        int int29 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str26, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        java.lang.String str9 = pricingRequest7.couponCode();
        java.lang.String str10 = pricingRequest7.couponCode();
        boolean boolean11 = pricingRequest7.seasonalSale();
        double double12 = pricingRequest7.basePrice();
        int int13 = pricingRequest7.loyaltyPoints();
        java.lang.Object obj14 = null;
        boolean boolean15 = pricingRequest7.equals(obj14);
        int int16 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        java.lang.String str9 = pricingRequest7.couponCode();
        java.lang.String str10 = pricingRequest7.couponCode();
        boolean boolean11 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType14, false, "hi!", false, (int) '#');
        boolean boolean20 = pricingRequest19.seasonalSale();
        java.lang.String str21 = pricingRequest19.couponCode();
        java.lang.String str22 = pricingRequest19.couponCode();
        boolean boolean23 = pricingRequest7.equals((java.lang.Object) pricingRequest19);
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType26, false, "hi!", false, (int) '#');
        boolean boolean32 = pricingRequest31.seasonalSale();
        java.lang.String str33 = pricingRequest31.couponCode();
        java.lang.String str34 = pricingRequest31.toString();
        double double35 = pricingRequest31.basePrice();
        double double36 = pricingRequest31.basePrice();
        double double37 = pricingRequest31.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType38 = pricingRequest31.customerType();
        boolean boolean39 = pricingRequest19.equals((java.lang.Object) pricingRequest31);
        double double40 = pricingRequest19.basePrice();
        boolean boolean41 = pricingRequest19.seasonalSale();
        boolean boolean42 = pricingRequest19.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + customerType26 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType26.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str34, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 100.0d + "'", double35 == 100.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 100.0d + "'", double36 == 100.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 100.0d + "'", double37 == 100.0d);
        org.junit.Assert.assertTrue("'" + customerType38 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType38.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 100.0d + "'", double40 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10L, (int) '#', customerType2, false, "hi!", false, (int) (byte) 1);
        boolean boolean8 = pricingRequest7.firstOrder();
        java.lang.String str9 = pricingRequest7.toString();
        boolean boolean10 = pricingRequest7.firstOrder();
        java.lang.String str11 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]" + "'", str9, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) '4', customerType4, true, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, 35);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, (int) (short) 1, customerType4, false, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest14.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType20, false, "hi!", false, (int) '#');
        boolean boolean27 = pricingRequest25.equals((java.lang.Object) (short) -1);
        boolean boolean29 = pricingRequest25.equals((java.lang.Object) 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType30 = pricingRequest25.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (short) 0, customerType30, false, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", false, 10);
        java.lang.String str36 = pricingRequest35.toString();
        double double37 = pricingRequest35.basePrice();
        boolean boolean38 = pricingRequest35.firstOrder();
        boolean boolean39 = pricingRequest35.firstOrder();
        boolean boolean40 = pricingRequest35.seasonalSale();
        java.lang.String str41 = pricingRequest35.couponCode();
        java.lang.String str42 = pricingRequest35.toString();
        boolean boolean43 = pricingRequest14.equals((java.lang.Object) pricingRequest35);
        java.lang.String str44 = pricingRequest14.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType49 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest54 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType49, false, "hi!", false, (int) '#');
        boolean boolean55 = pricingRequest54.seasonalSale();
        java.lang.String str56 = pricingRequest54.couponCode();
        boolean boolean58 = pricingRequest54.equals((java.lang.Object) (short) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType59 = pricingRequest54.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest64 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) (byte) 100, customerType59, false, "", true, (int) (byte) 10);
        boolean boolean65 = pricingRequest64.seasonalSale();
        int int66 = pricingRequest64.quantity();
        java.lang.String str67 = pricingRequest64.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType70 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest75 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType70, false, "hi!", false, (int) '#');
        boolean boolean76 = pricingRequest75.seasonalSale();
        java.lang.String str77 = pricingRequest75.couponCode();
        java.lang.String str78 = pricingRequest75.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType79 = pricingRequest75.customerType();
        double double80 = pricingRequest75.basePrice();
        boolean boolean81 = pricingRequest64.equals((java.lang.Object) double80);
        boolean boolean82 = pricingRequest64.seasonalSale();
        double double83 = pricingRequest64.basePrice();
        int int84 = pricingRequest64.quantity();
        boolean boolean85 = pricingRequest14.equals((java.lang.Object) pricingRequest64);
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + customerType30 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType30.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "PricingRequest[basePrice=0.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=false, loyaltyPoints=10]" + "'", str36, "PricingRequest[basePrice=0.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=false, loyaltyPoints=10]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]" + "'", str41, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "PricingRequest[basePrice=0.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=false, loyaltyPoints=10]" + "'", str42, "PricingRequest[basePrice=0.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=false, loyaltyPoints=10]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=true, loyaltyPoints=0]" + "'", str44, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + customerType49 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType49.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + customerType59 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType59.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 100 + "'", int66 == 100);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "PricingRequest[basePrice=10.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=10]" + "'", str67, "PricingRequest[basePrice=10.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=10]");
        org.junit.Assert.assertTrue("'" + customerType70 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType70.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
        org.junit.Assert.assertTrue("'" + customerType79 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType79.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 100.0d + "'", double80 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 10.0d + "'", double83 == 10.0d);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 100 + "'", int84 == 100);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (short) 100, customerType4, true, "hi!", true, 10);
        boolean boolean10 = pricingRequest9.firstOrder();
        boolean boolean11 = pricingRequest9.firstOrder();
        int int12 = pricingRequest9.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest(3387.99d, 0, customerType13, true, "PricingRequest[basePrice=0.0, quantity=100, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=true, loyaltyPoints=10]", true, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType4, false, "hi!", false, (int) '#');
        boolean boolean10 = pricingRequest9.seasonalSale();
        java.lang.String str11 = pricingRequest9.couponCode();
        boolean boolean13 = pricingRequest9.equals((java.lang.Object) (short) 10);
        boolean boolean14 = pricingRequest9.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType17, false, "hi!", false, (int) '#');
        boolean boolean23 = pricingRequest22.seasonalSale();
        java.lang.String str24 = pricingRequest22.couponCode();
        java.lang.String str25 = pricingRequest22.couponCode();
        boolean boolean26 = pricingRequest22.seasonalSale();
        boolean boolean28 = pricingRequest22.equals((java.lang.Object) 10.0d);
        java.lang.String str29 = pricingRequest22.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType30 = pricingRequest22.customerType();
        boolean boolean31 = pricingRequest9.equals((java.lang.Object) customerType30);
        com.viktor.lab4.PricingEngine.CustomerType customerType32 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest37 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) '4', customerType32, false, "PricingRequest[basePrice=52.0, quantity=32, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=true, loyaltyPoints=97]", false, (int) (short) -1);
        java.lang.String str38 = pricingRequest37.couponCode();
        boolean boolean39 = pricingRequest37.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + customerType30 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType30.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + customerType32 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType32.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "PricingRequest[basePrice=52.0, quantity=32, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=true, loyaltyPoints=97]" + "'", str38, "PricingRequest[basePrice=52.0, quantity=32, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=true, loyaltyPoints=97]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
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
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) '4', customerType26, true, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, 35);
        double double32 = pricingEngine22.calculateFinalPrice(pricingRequest31);
        com.viktor.lab4.PricingEngine.CustomerType customerType35 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest40 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (short) 100, customerType35, true, "hi!", true, 10);
        boolean boolean41 = pricingRequest40.firstOrder();
        boolean boolean42 = pricingRequest40.firstOrder();
        double double43 = pricingEngine22.calculateFinalPrice(pricingRequest40);
        com.viktor.lab4.PricingEngine.CustomerType customerType46 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest51 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType46, false, "hi!", false, (int) '#');
        boolean boolean52 = pricingRequest51.seasonalSale();
        java.lang.String str53 = pricingRequest51.couponCode();
        java.lang.String str54 = pricingRequest51.couponCode();
        boolean boolean55 = pricingRequest51.seasonalSale();
        double double56 = pricingRequest51.basePrice();
        boolean boolean57 = pricingRequest51.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType60 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest65 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10L, (int) '#', customerType60, false, "hi!", false, (int) (byte) 1);
        boolean boolean66 = pricingRequest65.firstOrder();
        java.lang.String str67 = pricingRequest65.toString();
        boolean boolean68 = pricingRequest51.equals((java.lang.Object) pricingRequest65);
        int int69 = pricingRequest65.quantity();
        boolean boolean70 = pricingRequest65.seasonalSale();
        java.lang.String str71 = pricingRequest65.toString();
        double double72 = pricingRequest65.basePrice();
        double double73 = pricingEngine22.calculateFinalPrice(pricingRequest65);
        com.viktor.lab4.PricingEngine.CustomerType customerType78 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest83 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType78, false, "hi!", false, (int) '#');
        boolean boolean84 = pricingRequest83.seasonalSale();
        java.lang.String str85 = pricingRequest83.couponCode();
        boolean boolean87 = pricingRequest83.equals((java.lang.Object) (short) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType88 = pricingRequest83.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest93 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (int) (byte) 10, customerType88, true, "", false, (int) 'a');
        double double94 = pricingRequest93.basePrice();
        double double95 = pricingRequest93.basePrice();
        java.lang.String str96 = pricingRequest93.toString();
        boolean boolean97 = pricingRequest93.seasonalSale();
        double double98 = pricingEngine22.calculateFinalPrice(pricingRequest93);
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 97.0d + "'", double20 == 97.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + customerType26 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType26.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 41.79d + "'", double32 == 41.79d);
        org.junit.Assert.assertTrue("'" + customerType35 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType35.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 2282.99d + "'", double43 == 2282.99d);
        org.junit.Assert.assertTrue("'" + customerType46 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType46.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 100.0d + "'", double56 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + customerType60 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType60.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]" + "'", str67, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 35 + "'", int69 == 35);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]" + "'", str71, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]");
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 10.0d + "'", double72 == 10.0d);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 280.99d + "'", double73 == 280.99d);
        org.junit.Assert.assertTrue("'" + customerType78 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType78.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "hi!" + "'", str85, "hi!");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + customerType88 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType88.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 97.0d + "'", double94 == 97.0d);
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 97.0d + "'", double95 == 97.0d);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "PricingRequest[basePrice=97.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=97]" + "'", str96, "PricingRequest[basePrice=97.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=97]");
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
        org.junit.Assert.assertTrue("'" + double98 + "' != '" + 638.49d + "'", double98 == 638.49d);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        java.lang.String str9 = pricingRequest7.couponCode();
        java.lang.String str10 = pricingRequest7.couponCode();
        boolean boolean11 = pricingRequest7.seasonalSale();
        double double12 = pricingRequest7.basePrice();
        double double13 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType16, false, "hi!", false, (int) '#');
        boolean boolean22 = pricingRequest21.seasonalSale();
        java.lang.String str23 = pricingRequest21.couponCode();
        boolean boolean25 = pricingRequest21.equals((java.lang.Object) (short) 10);
        boolean boolean26 = pricingRequest21.seasonalSale();
        java.lang.Class<?> wildcardClass27 = pricingRequest21.getClass();
        boolean boolean28 = pricingRequest7.equals((java.lang.Object) wildcardClass27);
        int int29 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType32 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest37 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType32, false, "hi!", false, (int) '#');
        boolean boolean38 = pricingRequest37.seasonalSale();
        java.lang.String str39 = pricingRequest37.couponCode();
        java.lang.String str40 = pricingRequest37.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType43 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest48 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType43, false, "hi!", false, (int) '#');
        boolean boolean49 = pricingRequest48.seasonalSale();
        java.lang.String str50 = pricingRequest48.couponCode();
        java.lang.String str51 = pricingRequest48.couponCode();
        boolean boolean52 = pricingRequest37.equals((java.lang.Object) pricingRequest48);
        boolean boolean53 = pricingRequest7.equals((java.lang.Object) pricingRequest37);
        java.lang.String str54 = pricingRequest37.toString();
        int int55 = pricingRequest37.loyaltyPoints();
        double double56 = pricingRequest37.basePrice();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
        org.junit.Assert.assertTrue("'" + customerType32 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType32.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + customerType43 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType43.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str54, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 35 + "'", int55 == 35);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 100.0d + "'", double56 == 100.0d);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
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
        boolean boolean24 = pricingRequest20.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType29 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest34 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType29, false, "hi!", false, (int) '#');
        boolean boolean35 = pricingRequest34.seasonalSale();
        java.lang.String str36 = pricingRequest34.couponCode();
        boolean boolean38 = pricingRequest34.equals((java.lang.Object) (short) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType39 = pricingRequest34.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest44 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) (byte) 100, customerType39, false, "", true, (int) (byte) 10);
        boolean boolean45 = pricingRequest44.seasonalSale();
        int int46 = pricingRequest44.quantity();
        java.lang.String str47 = pricingRequest44.toString();
        boolean boolean48 = pricingRequest44.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType49 = pricingRequest44.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType50 = pricingRequest44.customerType();
        boolean boolean51 = pricingRequest20.equals((java.lang.Object) pricingRequest44);
        double double52 = pricingRequest20.basePrice();
        org.junit.Assert.assertTrue("'" + customerType5 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType5.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 638.49d + "'", double23 == 638.49d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + customerType29 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType29.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + customerType39 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType39.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 100 + "'", int46 == 100);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "PricingRequest[basePrice=10.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=10]" + "'", str47, "PricingRequest[basePrice=10.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=10]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + customerType49 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType49.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType50 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType50.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 97.0d + "'", double52 == 97.0d);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        java.lang.String str9 = pricingRequest7.couponCode();
        java.lang.String str10 = pricingRequest7.couponCode();
        boolean boolean11 = pricingRequest7.seasonalSale();
        boolean boolean13 = pricingRequest7.equals((java.lang.Object) 10.0d);
        boolean boolean14 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest7.customerType();
        int int16 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest7.customerType();
        double double18 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = pricingRequest7.customerType();
        boolean boolean21 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
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
        com.viktor.lab4.PricingEngine.CustomerType customerType48 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest53 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType48, false, "hi!", false, (int) '#');
        boolean boolean54 = pricingRequest53.seasonalSale();
        java.lang.String str55 = pricingRequest53.couponCode();
        java.lang.String str56 = pricingRequest53.couponCode();
        boolean boolean57 = pricingRequest53.seasonalSale();
        double double58 = pricingRequest53.basePrice();
        boolean boolean59 = pricingRequest53.firstOrder();
        int int60 = pricingRequest53.quantity();
        java.lang.String str61 = pricingRequest53.toString();
        // The following exception was thrown during execution in test generation
        try {
            double double62 = pricingEngine0.calculateFinalPrice(pricingRequest53);
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
        org.junit.Assert.assertTrue("'" + customerType48 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType48.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 100.0d + "'", double58 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str61, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType10, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, 10, customerType10, true, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100L, (int) (byte) 0, customerType10, true, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", false, (int) 'a');
        boolean boolean26 = pricingRequest25.firstOrder();
        int int27 = pricingRequest25.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = pricingRequest25.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest(3387.99d, (int) (byte) 10, customerType28, true, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, (int) (byte) 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest38 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 97, (int) (short) 10, customerType28, true, "PricingRequest[basePrice=-1.0, quantity=35, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=true, loyaltyPoints=100]", false, (int) ' ');
        boolean boolean39 = pricingRequest38.seasonalSale();
        java.lang.String str40 = pricingRequest38.toString();
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "PricingRequest[basePrice=97.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=-1.0, quantity=35, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=true, loyaltyPoints=100], firstOrder=false, loyaltyPoints=32]" + "'", str40, "PricingRequest[basePrice=97.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=-1.0, quantity=35, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=true, loyaltyPoints=100], firstOrder=false, loyaltyPoints=32]");
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
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
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest62 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) 'a', customerType52, false, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", true, 1);
        java.lang.String str63 = pricingRequest62.couponCode();
        int int64 = pricingRequest62.loyaltyPoints();
        int int65 = pricingRequest62.quantity();
        java.lang.String str66 = pricingRequest62.toString();
        double double67 = pricingEngine45.calculateFinalPrice(pricingRequest62);
        com.viktor.lab4.PricingEngine.CustomerType customerType70 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest75 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) ' ', customerType70, true, "PricingRequest[basePrice=10.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=10]", false, (int) (byte) 0);
        boolean boolean76 = pricingRequest75.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType79 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest84 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType79, false, "hi!", false, (int) '#');
        boolean boolean85 = pricingRequest84.seasonalSale();
        java.lang.String str86 = pricingRequest84.couponCode();
        java.lang.String str87 = pricingRequest84.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType88 = pricingRequest84.customerType();
        int int89 = pricingRequest84.quantity();
        java.lang.String str90 = pricingRequest84.couponCode();
        boolean boolean91 = pricingRequest75.equals((java.lang.Object) pricingRequest84);
        com.viktor.lab4.PricingEngine.CustomerType customerType92 = pricingRequest75.customerType();
        // The following exception was thrown during execution in test generation
        try {
            double double93 = pricingEngine45.calculateFinalPrice(pricingRequest75);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: customerType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]" + "'", str63, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 97 + "'", int65 == 97);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "PricingRequest[basePrice=0.0, quantity=97, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=true, loyaltyPoints=1]" + "'", str66, "PricingRequest[basePrice=0.0, quantity=97, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=true, loyaltyPoints=1]");
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 7.99d + "'", double67 == 7.99d);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + customerType79 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType79.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!" + "'", str86, "hi!");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "hi!" + "'", str87, "hi!");
        org.junit.Assert.assertTrue("'" + customerType88 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType88.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "hi!" + "'", str90, "hi!");
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNull(customerType92);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType10, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, 10, customerType10, true, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100L, (int) (byte) 0, customerType10, true, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", false, (int) 'a');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (int) (byte) 0, customerType10, false, "PricingRequest[basePrice=97.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=97]", false, (int) '#');
        boolean boolean31 = pricingRequest30.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType32 = pricingRequest30.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest37 = new com.viktor.lab4.PricingEngine.PricingRequest(8.82d, (int) (byte) 1, customerType32, false, "", false, 52);
        boolean boolean38 = pricingRequest37.seasonalSale();
        boolean boolean39 = pricingRequest37.seasonalSale();
        double double40 = pricingRequest37.basePrice();
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + customerType32 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType32.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 8.82d + "'", double40 == 8.82d);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        java.lang.String str9 = pricingRequest7.couponCode();
        java.lang.String str10 = pricingRequest7.toString();
        double double11 = pricingRequest7.basePrice();
        int int12 = pricingRequest7.loyaltyPoints();
        java.lang.String str13 = pricingRequest7.toString();
        java.lang.String str14 = pricingRequest7.toString();
        int int15 = pricingRequest7.quantity();
        java.lang.String str16 = pricingRequest7.toString();
        double double17 = pricingRequest7.basePrice();
        java.lang.Class<?> wildcardClass18 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str10, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str13, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str14, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str16, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
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
        java.lang.String str27 = pricingRequest19.toString();
        java.lang.Class<?> wildcardClass28 = pricingRequest19.getClass();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "PricingRequest[basePrice=97.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=97]" + "'", str27, "PricingRequest[basePrice=97.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=97]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
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
        com.viktor.lab4.PricingEngine.CustomerType customerType48 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest53 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10L, (int) '#', customerType48, false, "hi!", false, (int) (byte) 1);
        boolean boolean54 = pricingRequest53.firstOrder();
        java.lang.String str55 = pricingRequest53.toString();
        double double56 = pricingRequest53.basePrice();
        double double57 = pricingEngine0.calculateFinalPrice(pricingRequest53);
        com.viktor.lab4.PricingEngine.CustomerType customerType60 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest65 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType60, false, "hi!", false, (int) '#');
        boolean boolean66 = pricingRequest65.seasonalSale();
        java.lang.String str67 = pricingRequest65.couponCode();
        java.lang.String str68 = pricingRequest65.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType71 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest76 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType71, false, "hi!", false, (int) '#');
        boolean boolean77 = pricingRequest76.seasonalSale();
        java.lang.String str78 = pricingRequest76.couponCode();
        java.lang.String str79 = pricingRequest76.couponCode();
        boolean boolean80 = pricingRequest65.equals((java.lang.Object) pricingRequest76);
        java.lang.String str81 = pricingRequest65.couponCode();
        java.lang.String str82 = pricingRequest65.couponCode();
        int int83 = pricingRequest65.loyaltyPoints();
        double double84 = pricingRequest65.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType85 = pricingRequest65.customerType();
        double double86 = pricingRequest65.basePrice();
        java.lang.String str87 = pricingRequest65.couponCode();
        // The following exception was thrown during execution in test generation
        try {
            double double88 = pricingEngine0.calculateFinalPrice(pricingRequest65);
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
        org.junit.Assert.assertTrue("'" + customerType48 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType48.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]" + "'", str55, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 10.0d + "'", double56 == 10.0d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 280.99d + "'", double57 == 280.99d);
        org.junit.Assert.assertTrue("'" + customerType60 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType60.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertTrue("'" + customerType71 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType71.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!" + "'", str81, "hi!");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 35 + "'", int83 == 35);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 100.0d + "'", double84 == 100.0d);
        org.junit.Assert.assertTrue("'" + customerType85 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType85.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 100.0d + "'", double86 == 100.0d);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "hi!" + "'", str87, "hi!");
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType2, false, "hi!", false, (int) '#');
        boolean boolean9 = pricingRequest7.equals((java.lang.Object) (short) -1);
        java.lang.String str10 = pricingRequest7.couponCode();
        int int11 = pricingRequest7.quantity();
        java.lang.String str12 = pricingRequest7.toString();
        boolean boolean13 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType16, false, "hi!", false, (int) '#');
        boolean boolean22 = pricingRequest21.seasonalSale();
        java.lang.String str23 = pricingRequest21.couponCode();
        java.lang.String str24 = pricingRequest21.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = pricingRequest21.customerType();
        double double26 = pricingRequest21.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = pricingRequest21.customerType();
        boolean boolean28 = pricingRequest7.equals((java.lang.Object) customerType27);
        java.lang.String str29 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str12, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertTrue("'" + customerType27 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType27.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str29, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType8, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) 'a', customerType8, false, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", true, 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1), (int) (byte) -1, customerType8, false, "PricingRequest[basePrice=0.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=false, loyaltyPoints=10]", false, 1);
        int int24 = pricingRequest23.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = pricingRequest23.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest(79.99d, 10, customerType25, true, "PricingRequest[basePrice=1.0, quantity=32, customerType=null, seasonalSale=true, couponCode=PricingRequest[basePrice=10.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=10], firstOrder=false, loyaltyPoints=0]", true, (int) ' ');
        int int31 = pricingRequest30.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 32 + "'", int31 == 32);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
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
        java.lang.String str17 = pricingRequest7.couponCode();
        int int18 = pricingRequest7.loyaltyPoints();
        boolean boolean19 = pricingRequest7.seasonalSale();
        int int20 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        java.lang.String str9 = pricingRequest7.couponCode();
        java.lang.String str10 = pricingRequest7.couponCode();
        boolean boolean11 = pricingRequest7.seasonalSale();
        double double12 = pricingRequest7.basePrice();
        java.lang.String str13 = pricingRequest7.couponCode();
        java.lang.Object obj14 = null;
        boolean boolean15 = pricingRequest7.equals(obj14);
        int int16 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest7.customerType();
        double double18 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType22, false, "hi!", false, (int) '#');
        boolean boolean28 = pricingRequest27.seasonalSale();
        java.lang.String str29 = pricingRequest27.couponCode();
        java.lang.String str30 = pricingRequest27.toString();
        double double31 = pricingRequest27.basePrice();
        java.lang.String str32 = pricingRequest27.toString();
        int int33 = pricingRequest27.loyaltyPoints();
        java.lang.String str34 = pricingRequest27.toString();
        int int35 = pricingRequest27.loyaltyPoints();
        java.lang.String str36 = pricingRequest27.toString();
        int int37 = pricingRequest27.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType38 = pricingRequest27.customerType();
        boolean boolean39 = pricingRequest7.equals((java.lang.Object) customerType38);
        java.lang.String str40 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str30, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str32, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str34, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 35 + "'", int35 == 35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str36, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + customerType38 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType38.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType2, false, "hi!", false, (int) '#');
        int int8 = pricingRequest7.quantity();
        boolean boolean9 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType4, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) 'a', customerType4, false, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", true, 1);
        int int15 = pricingRequest14.loyaltyPoints();
        int int16 = pricingRequest14.loyaltyPoints();
        int int17 = pricingRequest14.quantity();
        int int18 = pricingRequest14.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType6, false, "hi!", false, (int) '#');
        boolean boolean13 = pricingRequest11.equals((java.lang.Object) (short) -1);
        boolean boolean15 = pricingRequest11.equals((java.lang.Object) 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (short) 0, customerType16, false, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", false, 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest26 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0L, 1, customerType16, false, "", true, (int) (byte) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType29 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest34 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType29, false, "hi!", false, (int) '#');
        boolean boolean36 = pricingRequest34.equals((java.lang.Object) (short) -1);
        boolean boolean38 = pricingRequest34.equals((java.lang.Object) 0);
        double double39 = pricingRequest34.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = pricingRequest34.customerType();
        boolean boolean41 = pricingRequest34.firstOrder();
        boolean boolean42 = pricingRequest26.equals((java.lang.Object) pricingRequest34);
        int int43 = pricingRequest26.quantity();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType29 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType29.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 100.0d + "'", double39 == 100.0d);
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType4, false, "hi!", false, (int) '#');
        boolean boolean11 = pricingRequest9.equals((java.lang.Object) (short) -1);
        boolean boolean13 = pricingRequest9.equals((java.lang.Object) 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (short) 0, customerType14, false, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", false, 10);
        java.lang.String str20 = pricingRequest19.toString();
        int int21 = pricingRequest19.quantity();
        boolean boolean22 = pricingRequest19.firstOrder();
        double double23 = pricingRequest19.basePrice();
        int int24 = pricingRequest19.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PricingRequest[basePrice=0.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=false, loyaltyPoints=10]" + "'", str20, "PricingRequest[basePrice=0.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=false, loyaltyPoints=10]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType4, false, "hi!", false, (int) '#');
        boolean boolean10 = pricingRequest9.seasonalSale();
        java.lang.String str11 = pricingRequest9.couponCode();
        java.lang.String str12 = pricingRequest9.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType16, false, "hi!", false, (int) '#');
        boolean boolean23 = pricingRequest21.equals((java.lang.Object) (short) -1);
        boolean boolean24 = pricingRequest9.equals((java.lang.Object) pricingRequest21);
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, 0, customerType25, false, "", false, (int) '#');
        com.viktor.lab4.PricingEngine.CustomerType customerType31 = pricingRequest30.customerType();
        int int32 = pricingRequest30.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType31 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType31.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 35 + "'", int32 == 35);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, 100, customerType4, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=10], firstOrder=true, loyaltyPoints=-1]", true, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 0, 97, customerType4, true, "", true, 32);
        java.lang.String str15 = pricingRequest14.couponCode();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        java.lang.String str9 = pricingRequest7.couponCode();
        boolean boolean11 = pricingRequest7.equals((java.lang.Object) (short) 10);
        java.lang.String str12 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType15, false, "hi!", false, (int) '#');
        boolean boolean21 = pricingRequest20.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) '4', customerType24, true, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, 35);
        boolean boolean30 = pricingRequest20.equals((java.lang.Object) true);
        int int31 = pricingRequest20.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType32 = pricingRequest20.customerType();
        int int33 = pricingRequest20.loyaltyPoints();
        boolean boolean34 = pricingRequest7.equals((java.lang.Object) int33);
        int int35 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + customerType24 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType24.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + customerType32 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType32.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 35 + "'", int35 == 35);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType12, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, 10, customerType12, true, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, 0);
        java.lang.String str23 = pricingRequest22.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = pricingRequest22.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) -1, customerType24, false, "PricingRequest[basePrice=1.0, quantity=32, customerType=null, seasonalSale=true, couponCode=PricingRequest[basePrice=10.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=10], firstOrder=false, loyaltyPoints=0]", false, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType30 = pricingRequest29.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) ' ', customerType30, true, "PricingRequest[basePrice=52.0, quantity=100, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=97]", true, 35);
        com.viktor.lab4.PricingEngine.CustomerType customerType36 = pricingRequest35.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest41 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, (int) (byte) -1, customerType36, true, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=true, loyaltyPoints=0]", false, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest46 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) (byte) 0, customerType36, false, "", true, (int) 'a');
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str23, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + customerType24 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType24.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType30 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType30.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType36 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType36.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
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
        boolean boolean46 = pricingRequest36.seasonalSale();
        java.lang.String str47 = pricingRequest36.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType48 = pricingRequest36.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType55 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest60 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType55, false, "hi!", false, (int) '#');
        boolean boolean61 = pricingRequest60.seasonalSale();
        java.lang.String str62 = pricingRequest60.couponCode();
        java.lang.String str63 = pricingRequest60.couponCode();
        boolean boolean64 = pricingRequest60.seasonalSale();
        double double65 = pricingRequest60.basePrice();
        double double66 = pricingRequest60.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType69 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest74 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType69, false, "hi!", false, (int) '#');
        boolean boolean75 = pricingRequest74.seasonalSale();
        java.lang.String str76 = pricingRequest74.couponCode();
        java.lang.String str77 = pricingRequest74.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType78 = pricingRequest74.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType79 = pricingRequest74.customerType();
        boolean boolean80 = pricingRequest60.equals((java.lang.Object) customerType79);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest85 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) '4', customerType79, true, "", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest90 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, 32, customerType79, true, "PricingRequest[basePrice=638.49, quantity=0, customerType=null, seasonalSale=false, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=10], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=10]", true, 35);
        int int91 = pricingRequest90.loyaltyPoints();
        boolean boolean92 = pricingRequest36.equals((java.lang.Object) int91);
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
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertTrue("'" + customerType48 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType48.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType55 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType55.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 100.0d + "'", double65 == 100.0d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 100.0d + "'", double66 == 100.0d);
        org.junit.Assert.assertTrue("'" + customerType69 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType69.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertTrue("'" + customerType78 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType78.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType79 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType79.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 35 + "'", int91 == 35);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        java.lang.String str9 = pricingRequest7.couponCode();
        boolean boolean11 = pricingRequest7.equals((java.lang.Object) (short) 10);
        java.lang.String str12 = pricingRequest7.toString();
        java.lang.String str13 = pricingRequest7.couponCode();
        int int14 = pricingRequest7.quantity();
        java.lang.Object obj15 = null;
        boolean boolean16 = pricingRequest7.equals(obj15);
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str12, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        java.lang.String str9 = pricingRequest7.couponCode();
        boolean boolean11 = pricingRequest7.equals((java.lang.Object) (short) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest7.customerType();
        int int13 = pricingRequest7.loyaltyPoints();
        java.lang.String str14 = pricingRequest7.couponCode();
        int int15 = pricingRequest7.quantity();
        boolean boolean16 = pricingRequest7.seasonalSale();
        int int17 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType6, false, "hi!", false, (int) '#');
        boolean boolean13 = pricingRequest11.equals((java.lang.Object) (short) -1);
        boolean boolean15 = pricingRequest11.equals((java.lang.Object) 0);
        double double16 = pricingRequest11.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest22 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, 0, customerType17, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=10], firstOrder=true, loyaltyPoints=-1]", false, 32);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 10, (int) (byte) 10, customerType17, false, "PricingRequest[basePrice=97.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=10.0, quantity=32, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=0], firstOrder=true, loyaltyPoints=52]", true, 0);
        java.lang.Class<?> wildcardClass28 = customerType17.getClass();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        java.lang.String str9 = pricingRequest7.couponCode();
        java.lang.String str10 = pricingRequest7.couponCode();
        boolean boolean11 = pricingRequest7.seasonalSale();
        boolean boolean13 = pricingRequest7.equals((java.lang.Object) 10.0d);
        boolean boolean14 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType19, false, "hi!", false, (int) '#');
        boolean boolean25 = pricingRequest24.seasonalSale();
        java.lang.String str26 = pricingRequest24.couponCode();
        boolean boolean28 = pricingRequest24.equals((java.lang.Object) (short) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType29 = pricingRequest24.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest34 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (int) (byte) 10, customerType29, true, "", false, (int) 'a');
        double double35 = pricingRequest34.basePrice();
        boolean boolean36 = pricingRequest7.equals((java.lang.Object) pricingRequest34);
        int int37 = pricingRequest34.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType38 = pricingRequest34.customerType();
        int int39 = pricingRequest34.loyaltyPoints();
        boolean boolean40 = pricingRequest34.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType41 = pricingRequest34.customerType();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + customerType29 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType29.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 97.0d + "'", double35 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + customerType38 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType38.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 97 + "'", int39 == 97);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + customerType41 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType41.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType4, false, "hi!", false, (int) '#');
        boolean boolean10 = pricingRequest9.seasonalSale();
        java.lang.String str11 = pricingRequest9.couponCode();
        boolean boolean13 = pricingRequest9.equals((java.lang.Object) (short) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) (byte) 100, customerType14, false, "", true, (int) (byte) 10);
        int int20 = pricingRequest19.loyaltyPoints();
        java.lang.String str21 = pricingRequest19.toString();
        java.lang.String str22 = pricingRequest19.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = pricingRequest19.customerType();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PricingRequest[basePrice=10.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=10]" + "'", str21, "PricingRequest[basePrice=10.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=10]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PricingRequest[basePrice=10.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=10]" + "'", str22, "PricingRequest[basePrice=10.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=10]");
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
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
        int int24 = pricingRequest19.quantity();
        boolean boolean25 = pricingRequest19.firstOrder();
        java.lang.Object obj26 = null;
        boolean boolean27 = pricingRequest19.equals(obj26);
        java.lang.Class<?> wildcardClass28 = pricingRequest19.getClass();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 97.0d + "'", double20 == 97.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 97.0d + "'", double21 == 97.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PricingRequest[basePrice=97.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=97]" + "'", str22, "PricingRequest[basePrice=97.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=97]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "PricingRequest[basePrice=97.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=97]" + "'", str23, "PricingRequest[basePrice=97.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=97]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType6, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) 'a', customerType6, false, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", true, 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1), (int) (byte) -1, customerType6, false, "PricingRequest[basePrice=0.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=false, loyaltyPoints=10]", false, 1);
        double double22 = pricingRequest21.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = pricingRequest21.customerType();
        double double24 = pricingRequest21.basePrice();
        boolean boolean25 = pricingRequest21.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
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
        java.lang.String str57 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType58 = pricingRequest7.customerType();
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
        org.junit.Assert.assertTrue("'" + customerType58 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType58.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType4, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) 'a', customerType4, false, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", true, 1);
        java.lang.String str15 = pricingRequest14.couponCode();
        boolean boolean16 = pricingRequest14.firstOrder();
        boolean boolean17 = pricingRequest14.firstOrder();
        java.lang.String str18 = pricingRequest14.toString();
        int int19 = pricingRequest14.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType26, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest36 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, 10, customerType26, true, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest41 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100L, (int) (byte) 0, customerType26, true, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", false, (int) 'a');
        boolean boolean42 = pricingRequest41.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType47 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest52 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType47, false, "hi!", false, (int) '#');
        boolean boolean53 = pricingRequest52.seasonalSale();
        java.lang.String str54 = pricingRequest52.couponCode();
        boolean boolean56 = pricingRequest52.equals((java.lang.Object) (short) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType57 = pricingRequest52.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest62 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (int) (byte) 10, customerType57, true, "", false, (int) 'a');
        double double63 = pricingRequest62.basePrice();
        int int64 = pricingRequest62.loyaltyPoints();
        com.viktor.lab4.PricingEngine pricingEngine65 = new com.viktor.lab4.PricingEngine();
        boolean boolean66 = pricingRequest62.equals((java.lang.Object) pricingEngine65);
        boolean boolean67 = pricingRequest41.equals((java.lang.Object) pricingRequest62);
        boolean boolean68 = pricingRequest14.equals((java.lang.Object) pricingRequest41);
        com.viktor.lab4.PricingEngine.CustomerType customerType69 = pricingRequest14.customerType();
        int int70 = pricingRequest14.quantity();
        java.lang.Class<?> wildcardClass71 = pricingRequest14.getClass();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]" + "'", str15, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PricingRequest[basePrice=0.0, quantity=97, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=true, loyaltyPoints=1]" + "'", str18, "PricingRequest[basePrice=0.0, quantity=97, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=true, loyaltyPoints=1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + customerType26 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType26.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + customerType47 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType47.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + customerType57 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType57.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 97.0d + "'", double63 == 97.0d);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 97 + "'", int64 == 97);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + customerType69 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType69.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 97 + "'", int70 == 97);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        java.lang.String str9 = pricingRequest7.couponCode();
        boolean boolean11 = pricingRequest7.equals((java.lang.Object) (short) 10);
        java.lang.String str12 = pricingRequest7.toString();
        java.lang.String str13 = pricingRequest7.couponCode();
        int int14 = pricingRequest7.quantity();
        int int15 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str12, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
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
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest38 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, 10, customerType28, true, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, 0);
        double double39 = pricingEngine0.calculateFinalPrice(pricingRequest38);
        com.viktor.lab4.PricingEngine.CustomerType customerType48 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest53 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType48, false, "hi!", false, (int) '#');
        boolean boolean55 = pricingRequest53.equals((java.lang.Object) (short) -1);
        boolean boolean57 = pricingRequest53.equals((java.lang.Object) 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType58 = pricingRequest53.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest63 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (short) 0, customerType58, false, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", false, 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest68 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', (-1), customerType58, false, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", true, 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType69 = pricingRequest68.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest74 = new com.viktor.lab4.PricingEngine.PricingRequest(638.49d, (int) (short) 1, customerType69, true, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", false, (int) ' ');
        java.lang.String str75 = pricingRequest74.couponCode();
        double double76 = pricingEngine0.calculateFinalPrice(pricingRequest74);
        com.viktor.lab4.PricingEngine.CustomerType customerType79 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest84 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType79, false, "hi!", false, (int) '#');
        boolean boolean85 = pricingRequest84.seasonalSale();
        java.lang.String str86 = pricingRequest84.couponCode();
        java.lang.String str87 = pricingRequest84.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType88 = pricingRequest84.customerType();
        int int89 = pricingRequest84.quantity();
        double double90 = pricingRequest84.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType91 = pricingRequest84.customerType();
        java.lang.String str92 = pricingRequest84.toString();
        double double93 = pricingRequest84.basePrice();
        // The following exception was thrown during execution in test generation
        try {
            double double94 = pricingEngine0.calculateFinalPrice(pricingRequest84);
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
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 657.99d + "'", double39 == 657.99d);
        org.junit.Assert.assertTrue("'" + customerType48 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType48.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + customerType58 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType58.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType69 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType69.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str75, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 474.09d + "'", double76 == 474.09d);
        org.junit.Assert.assertTrue("'" + customerType79 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType79.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!" + "'", str86, "hi!");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "hi!" + "'", str87, "hi!");
        org.junit.Assert.assertTrue("'" + customerType88 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType88.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 100.0d + "'", double90 == 100.0d);
        org.junit.Assert.assertTrue("'" + customerType91 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType91.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str92, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 100.0d + "'", double93 == 100.0d);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType10, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, 10, customerType10, true, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, 0);
        java.lang.String str21 = pricingRequest20.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest20.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '#', (int) (byte) -1, customerType22, false, "PricingRequest[basePrice=1.0, quantity=32, customerType=null, seasonalSale=true, couponCode=PricingRequest[basePrice=10.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=10], firstOrder=false, loyaltyPoints=0]", false, (int) (short) -1);
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = pricingRequest27.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) ' ', customerType28, true, "PricingRequest[basePrice=52.0, quantity=100, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=97]", true, 35);
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = pricingRequest33.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest39 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, (int) (byte) -1, customerType34, true, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=true, loyaltyPoints=0]", false, 0);
        boolean boolean40 = pricingRequest39.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str21, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType34 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType34.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType8, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, 10, customerType8, true, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100L, (int) (byte) 0, customerType8, true, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", false, (int) 'a');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 0, 0, customerType8, true, "PricingRequest[basePrice=0.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=false, loyaltyPoints=10]", false, (-1));
        boolean boolean29 = pricingRequest28.firstOrder();
        boolean boolean30 = pricingRequest28.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType33 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest38 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType33, false, "hi!", false, (int) '#');
        boolean boolean39 = pricingRequest38.seasonalSale();
        java.lang.String str40 = pricingRequest38.couponCode();
        java.lang.String str41 = pricingRequest38.couponCode();
        boolean boolean42 = pricingRequest38.seasonalSale();
        double double43 = pricingRequest38.basePrice();
        double double44 = pricingRequest38.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType47 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest52 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType47, false, "hi!", false, (int) '#');
        boolean boolean53 = pricingRequest52.seasonalSale();
        java.lang.String str54 = pricingRequest52.couponCode();
        boolean boolean56 = pricingRequest52.equals((java.lang.Object) (short) 10);
        boolean boolean57 = pricingRequest52.seasonalSale();
        java.lang.Class<?> wildcardClass58 = pricingRequest52.getClass();
        boolean boolean59 = pricingRequest38.equals((java.lang.Object) wildcardClass58);
        double double60 = pricingRequest38.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType69 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest74 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType69, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest79 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, 10, customerType69, true, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest84 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100L, (int) (byte) 0, customerType69, true, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", false, (int) 'a');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest89 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 0, 0, customerType69, true, "PricingRequest[basePrice=0.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=false, loyaltyPoints=10]", false, (-1));
        boolean boolean90 = pricingRequest38.equals((java.lang.Object) (byte) 0);
        double double91 = pricingRequest38.basePrice();
        int int92 = pricingRequest38.loyaltyPoints();
        java.lang.String str93 = pricingRequest38.toString();
        boolean boolean94 = pricingRequest28.equals((java.lang.Object) str93);
        java.lang.String str95 = pricingRequest28.couponCode();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + customerType33 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType33.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 100.0d + "'", double43 == 100.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 100.0d + "'", double44 == 100.0d);
        org.junit.Assert.assertTrue("'" + customerType47 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType47.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 100.0d + "'", double60 == 100.0d);
        org.junit.Assert.assertTrue("'" + customerType69 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType69.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 100.0d + "'", double91 == 100.0d);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 35 + "'", int92 == 35);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str93, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "PricingRequest[basePrice=0.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=false, loyaltyPoints=10]" + "'", str95, "PricingRequest[basePrice=0.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=false, loyaltyPoints=10]");
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType6, false, "hi!", false, (int) '#');
        boolean boolean12 = pricingRequest11.seasonalSale();
        java.lang.String str13 = pricingRequest11.couponCode();
        boolean boolean15 = pricingRequest11.equals((java.lang.Object) (short) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest11.customerType();
        int int17 = pricingRequest11.loyaltyPoints();
        boolean boolean18 = pricingRequest11.seasonalSale();
        boolean boolean19 = pricingRequest11.firstOrder();
        java.lang.String str20 = pricingRequest11.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType21 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest26 = new com.viktor.lab4.PricingEngine.PricingRequest(52.0d, (int) (short) 1, customerType21, true, "PricingRequest[basePrice=1.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=10], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=32]", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 97, (int) (short) 0, customerType21, true, "PricingRequest[basePrice=97.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=97.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=97], firstOrder=false, loyaltyPoints=0]", false, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str20, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + customerType21 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType21.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
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
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, 10, customerType26, true, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, (int) (short) 1);
        double double32 = pricingEngine22.calculateFinalPrice(pricingRequest31);
        com.viktor.lab4.PricingEngine.CustomerType customerType35 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest40 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) '4', customerType35, true, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, 35);
        boolean boolean41 = pricingRequest40.firstOrder();
        java.lang.String str42 = pricingRequest40.toString();
        boolean boolean43 = pricingRequest40.seasonalSale();
        boolean boolean44 = pricingRequest40.firstOrder();
        java.lang.String str45 = pricingRequest40.toString();
        double double46 = pricingEngine22.calculateFinalPrice(pricingRequest40);
        java.lang.String str47 = pricingRequest40.toString();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 97.0d + "'", double20 == 97.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + customerType26 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType26.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 707.99d + "'", double32 == 707.99d);
        org.junit.Assert.assertTrue("'" + customerType35 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType35.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "PricingRequest[basePrice=1.0, quantity=52, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=true, loyaltyPoints=35]" + "'", str42, "PricingRequest[basePrice=1.0, quantity=52, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=true, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "PricingRequest[basePrice=1.0, quantity=52, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=true, loyaltyPoints=35]" + "'", str45, "PricingRequest[basePrice=1.0, quantity=52, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=true, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 41.79d + "'", double46 == 41.79d);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "PricingRequest[basePrice=1.0, quantity=52, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=true, loyaltyPoints=35]" + "'", str47, "PricingRequest[basePrice=1.0, quantity=52, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=true, loyaltyPoints=35]");
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
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
        boolean boolean24 = pricingRequest19.firstOrder();
        int int25 = pricingRequest19.loyaltyPoints();
        java.lang.String str26 = pricingRequest19.toString();
        java.lang.String str27 = pricingRequest19.toString();
        double double28 = pricingRequest19.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType29 = pricingRequest19.customerType();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 97.0d + "'", double20 == 97.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PricingRequest[basePrice=97.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=97]" + "'", str26, "PricingRequest[basePrice=97.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=97]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "PricingRequest[basePrice=97.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=97]" + "'", str27, "PricingRequest[basePrice=97.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=97]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 97.0d + "'", double28 == 97.0d);
        org.junit.Assert.assertTrue("'" + customerType29 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType29.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
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
        int int48 = pricingRequest29.quantity();
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
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
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
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType25, false, "hi!", false, (int) '#');
        boolean boolean32 = pricingRequest30.equals((java.lang.Object) (short) -1);
        boolean boolean34 = pricingRequest30.equals((java.lang.Object) 0);
        double double35 = pricingRequest30.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType36 = pricingRequest30.customerType();
        java.lang.String str37 = pricingRequest30.couponCode();
        int int38 = pricingRequest30.loyaltyPoints();
        boolean boolean39 = pricingRequest30.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = pricingRequest30.customerType();
        boolean boolean41 = pricingRequest19.equals((java.lang.Object) customerType40);
        int int42 = pricingRequest19.quantity();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 97.0d + "'", double20 == 97.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 97.0d + "'", double21 == 97.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PricingRequest[basePrice=97.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=97]" + "'", str22, "PricingRequest[basePrice=97.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=97]");
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 100.0d + "'", double35 == 100.0d);
        org.junit.Assert.assertTrue("'" + customerType36 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType36.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 35 + "'", int38 == 35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        java.lang.String str9 = pricingRequest7.couponCode();
        java.lang.String str10 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType13, false, "hi!", false, (int) '#');
        boolean boolean19 = pricingRequest18.seasonalSale();
        java.lang.String str20 = pricingRequest18.couponCode();
        java.lang.String str21 = pricingRequest18.couponCode();
        boolean boolean22 = pricingRequest7.equals((java.lang.Object) pricingRequest18);
        java.lang.String str23 = pricingRequest7.couponCode();
        double double24 = pricingRequest7.basePrice();
        int int25 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 35 + "'", int25 == 35);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        java.lang.String str9 = pricingRequest7.couponCode();
        java.lang.String str10 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType13, false, "hi!", false, (int) '#');
        boolean boolean19 = pricingRequest18.seasonalSale();
        java.lang.String str20 = pricingRequest18.couponCode();
        java.lang.String str21 = pricingRequest18.couponCode();
        boolean boolean22 = pricingRequest7.equals((java.lang.Object) pricingRequest18);
        java.lang.String str23 = pricingRequest7.couponCode();
        java.lang.String str24 = pricingRequest7.couponCode();
        int int25 = pricingRequest7.loyaltyPoints();
        double double26 = pricingRequest7.basePrice();
        double double27 = pricingRequest7.basePrice();
        boolean boolean28 = pricingRequest7.firstOrder();
        double double29 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 35 + "'", int25 == 35);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType2, false, "hi!", false, (int) '#');
        boolean boolean9 = pricingRequest7.equals((java.lang.Object) (short) -1);
        boolean boolean11 = pricingRequest7.equals((java.lang.Object) 0);
        double double12 = pricingRequest7.basePrice();
        boolean boolean13 = pricingRequest7.firstOrder();
        double double14 = pricingRequest7.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType23, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, 10, customerType23, true, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest38 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100L, (int) (byte) 0, customerType23, true, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", false, (int) 'a');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest43 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (int) (byte) 0, customerType23, false, "PricingRequest[basePrice=97.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=97]", false, (int) '#');
        int int44 = pricingRequest43.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType45 = pricingRequest43.customerType();
        boolean boolean46 = pricingRequest7.equals((java.lang.Object) customerType45);
        com.viktor.lab4.PricingEngine.CustomerType customerType47 = pricingRequest7.customerType();
        java.lang.String str48 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + customerType45 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType45.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + customerType47 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType47.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str48, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType10, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest20 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, 10, customerType10, true, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100L, (int) (byte) 0, customerType10, true, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", false, (int) 'a');
        boolean boolean26 = pricingRequest25.firstOrder();
        int int27 = pricingRequest25.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType28 = pricingRequest25.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest(3387.99d, (int) (byte) 10, customerType28, true, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, (int) (byte) 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest38 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 97, (int) (short) 10, customerType28, true, "PricingRequest[basePrice=-1.0, quantity=35, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=true, loyaltyPoints=100]", false, (int) ' ');
        int int39 = pricingRequest38.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertTrue("'" + customerType28 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType28.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 32 + "'", int39 == 32);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType6, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) 'a', customerType6, false, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", true, 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1), (int) (byte) -1, customerType6, false, "PricingRequest[basePrice=0.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=false, loyaltyPoints=10]", false, 1);
        int int22 = pricingRequest21.quantity();
        java.lang.String str23 = pricingRequest21.toString();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "PricingRequest[basePrice=-1.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=false, loyaltyPoints=10], firstOrder=false, loyaltyPoints=1]" + "'", str23, "PricingRequest[basePrice=-1.0, quantity=-1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=false, loyaltyPoints=10], firstOrder=false, loyaltyPoints=1]");
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType4, false, "hi!", false, (int) '#');
        boolean boolean11 = pricingRequest9.equals((java.lang.Object) (short) -1);
        boolean boolean13 = pricingRequest9.equals((java.lang.Object) 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (short) 0, customerType14, false, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", false, 10);
        java.lang.String str20 = pricingRequest19.toString();
        int int21 = pricingRequest19.quantity();
        boolean boolean22 = pricingRequest19.firstOrder();
        java.lang.String str23 = pricingRequest19.couponCode();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PricingRequest[basePrice=0.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=false, loyaltyPoints=10]" + "'", str20, "PricingRequest[basePrice=0.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=false, loyaltyPoints=10]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]" + "'", str23, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]");
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType11, false, "hi!", false, (int) '#');
        boolean boolean17 = pricingRequest16.seasonalSale();
        java.lang.String str18 = pricingRequest16.couponCode();
        java.lang.String str19 = pricingRequest16.couponCode();
        boolean boolean20 = pricingRequest16.seasonalSale();
        double double21 = pricingRequest16.basePrice();
        double double22 = pricingRequest16.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType25, false, "hi!", false, (int) '#');
        boolean boolean31 = pricingRequest30.seasonalSale();
        java.lang.String str32 = pricingRequest30.couponCode();
        boolean boolean34 = pricingRequest30.equals((java.lang.Object) (short) 10);
        boolean boolean35 = pricingRequest30.seasonalSale();
        java.lang.Class<?> wildcardClass36 = pricingRequest30.getClass();
        boolean boolean37 = pricingRequest16.equals((java.lang.Object) wildcardClass36);
        int int38 = pricingRequest16.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType41 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest46 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType41, false, "hi!", false, (int) '#');
        boolean boolean47 = pricingRequest46.seasonalSale();
        java.lang.String str48 = pricingRequest46.couponCode();
        java.lang.String str49 = pricingRequest46.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType52 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest57 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType52, false, "hi!", false, (int) '#');
        boolean boolean58 = pricingRequest57.seasonalSale();
        java.lang.String str59 = pricingRequest57.couponCode();
        java.lang.String str60 = pricingRequest57.couponCode();
        boolean boolean61 = pricingRequest46.equals((java.lang.Object) pricingRequest57);
        boolean boolean62 = pricingRequest16.equals((java.lang.Object) pricingRequest46);
        boolean boolean63 = pricingRequest7.equals((java.lang.Object) pricingRequest46);
        int int64 = pricingRequest7.loyaltyPoints();
        int int65 = pricingRequest7.loyaltyPoints();
        java.lang.String str66 = pricingRequest7.couponCode();
        boolean boolean67 = pricingRequest7.firstOrder();
        int int68 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 35 + "'", int38 == 35);
        org.junit.Assert.assertTrue("'" + customerType41 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType41.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + customerType52 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType52.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 35 + "'", int64 == 35);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 35 + "'", int65 == 35);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 35 + "'", int68 == 35);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 0, (int) (byte) 100, customerType2, true, "PricingRequest[basePrice=1.0, quantity=52, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=true, loyaltyPoints=35]", true, (int) '#');
        int int8 = pricingRequest7.loyaltyPoints();
        java.lang.String str9 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PricingRequest[basePrice=1.0, quantity=52, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=true, loyaltyPoints=35]" + "'", str9, "PricingRequest[basePrice=1.0, quantity=52, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=true, loyaltyPoints=35]");
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType4, false, "hi!", false, (int) '#');
        boolean boolean10 = pricingRequest9.seasonalSale();
        java.lang.String str11 = pricingRequest9.couponCode();
        boolean boolean13 = pricingRequest9.equals((java.lang.Object) (short) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) (byte) 100, customerType14, false, "", true, (int) (byte) 10);
        boolean boolean20 = pricingRequest19.seasonalSale();
        int int21 = pricingRequest19.quantity();
        java.lang.String str22 = pricingRequest19.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType25, false, "hi!", false, (int) '#');
        boolean boolean31 = pricingRequest30.seasonalSale();
        java.lang.String str32 = pricingRequest30.couponCode();
        java.lang.String str33 = pricingRequest30.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = pricingRequest30.customerType();
        double double35 = pricingRequest30.basePrice();
        boolean boolean36 = pricingRequest19.equals((java.lang.Object) double35);
        double double37 = pricingRequest19.basePrice();
        double double38 = pricingRequest19.basePrice();
        java.lang.String str39 = pricingRequest19.couponCode();
        int int40 = pricingRequest19.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PricingRequest[basePrice=10.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=10]" + "'", str22, "PricingRequest[basePrice=10.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=10]");
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + customerType34 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType34.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 100.0d + "'", double35 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 10.0d + "'", double37 == 10.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 10.0d + "'", double38 == 10.0d);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType6, false, "hi!", false, (int) '#');
        boolean boolean12 = pricingRequest11.seasonalSale();
        java.lang.String str13 = pricingRequest11.couponCode();
        java.lang.String str14 = pricingRequest11.couponCode();
        boolean boolean15 = pricingRequest11.seasonalSale();
        boolean boolean17 = pricingRequest11.equals((java.lang.Object) 10.0d);
        java.lang.String str18 = pricingRequest11.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1), (int) (short) 1, customerType19, true, "hi!", false, 97);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, 97, customerType19, false, "PricingRequest[basePrice=0.0, quantity=10, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=true, loyaltyPoints=-1]", false, (int) (short) 0);
        java.lang.String str30 = pricingRequest29.toString();
        double double31 = pricingRequest29.basePrice();
        double double32 = pricingRequest29.basePrice();
        boolean boolean33 = pricingRequest29.firstOrder();
        int int34 = pricingRequest29.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "PricingRequest[basePrice=-1.0, quantity=97, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=10, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]" + "'", str30, "PricingRequest[basePrice=-1.0, quantity=97, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=10, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-1.0d) + "'", double32 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        java.lang.String str9 = pricingRequest7.couponCode();
        java.lang.String str10 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest7.customerType();
        double double13 = pricingRequest7.basePrice();
        double double14 = pricingRequest7.basePrice();
        java.lang.String str15 = pricingRequest7.toString();
        java.lang.String str16 = pricingRequest7.toString();
        java.lang.String str17 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str15, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str16, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str17, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
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
        boolean boolean41 = pricingRequest7.firstOrder();
        int int42 = pricingRequest7.quantity();
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
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        java.lang.String str9 = pricingRequest7.couponCode();
        boolean boolean11 = pricingRequest7.equals((java.lang.Object) (short) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest7.customerType();
        int int13 = pricingRequest7.loyaltyPoints();
        boolean boolean14 = pricingRequest7.seasonalSale();
        boolean boolean15 = pricingRequest7.firstOrder();
        boolean boolean16 = pricingRequest7.seasonalSale();
        int int17 = pricingRequest7.quantity();
        double double18 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        java.lang.String str9 = pricingRequest7.couponCode();
        java.lang.String str10 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest7.customerType();
        double double13 = pricingRequest7.basePrice();
        int int14 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest7.customerType();
        int int16 = pricingRequest7.loyaltyPoints();
        java.lang.String str17 = pricingRequest7.couponCode();
        boolean boolean18 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType4, false, "hi!", false, (int) '#');
        boolean boolean10 = pricingRequest9.seasonalSale();
        java.lang.String str11 = pricingRequest9.couponCode();
        boolean boolean13 = pricingRequest9.equals((java.lang.Object) (short) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (int) (byte) 10, customerType14, true, "", false, (int) 'a');
        double double20 = pricingRequest19.basePrice();
        boolean boolean21 = pricingRequest19.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest19.customerType();
        boolean boolean23 = pricingRequest19.seasonalSale();
        double double24 = pricingRequest19.basePrice();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 97.0d + "'", double20 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 97.0d + "'", double24 == 97.0d);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
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
        java.lang.String str46 = pricingRequest36.couponCode();
        int int47 = pricingRequest36.loyaltyPoints();
        boolean boolean48 = pricingRequest36.seasonalSale();
        double double49 = pricingRequest36.basePrice();
        int int50 = pricingRequest36.quantity();
        java.lang.String str51 = pricingRequest36.couponCode();
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
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 35 + "'", int47 == 35);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 100.0d + "'", double49 == 100.0d);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
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
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10L, (int) '#', customerType26, false, "hi!", false, (int) (byte) 1);
        double double32 = pricingRequest31.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType33 = pricingRequest31.customerType();
        double double34 = pricingEngine22.calculateFinalPrice(pricingRequest31);
        com.viktor.lab4.PricingEngine.CustomerType customerType37 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest42 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType37, false, "hi!", false, (int) '#');
        boolean boolean43 = pricingRequest42.seasonalSale();
        java.lang.String str44 = pricingRequest42.couponCode();
        java.lang.String str45 = pricingRequest42.couponCode();
        boolean boolean46 = pricingRequest42.seasonalSale();
        boolean boolean48 = pricingRequest42.equals((java.lang.Object) 10.0d);
        boolean boolean49 = pricingRequest42.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType54 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest59 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType54, false, "hi!", false, (int) '#');
        boolean boolean60 = pricingRequest59.seasonalSale();
        java.lang.String str61 = pricingRequest59.couponCode();
        boolean boolean63 = pricingRequest59.equals((java.lang.Object) (short) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType64 = pricingRequest59.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest69 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (int) (byte) 10, customerType64, true, "", false, (int) 'a');
        double double70 = pricingRequest69.basePrice();
        boolean boolean71 = pricingRequest42.equals((java.lang.Object) pricingRequest69);
        int int72 = pricingRequest69.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType75 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest80 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType75, false, "hi!", false, (int) '#');
        boolean boolean81 = pricingRequest80.seasonalSale();
        java.lang.String str82 = pricingRequest80.couponCode();
        java.lang.String str83 = pricingRequest80.couponCode();
        boolean boolean84 = pricingRequest80.seasonalSale();
        boolean boolean86 = pricingRequest80.equals((java.lang.Object) 10.0d);
        double double87 = pricingRequest80.basePrice();
        boolean boolean88 = pricingRequest69.equals((java.lang.Object) double87);
        double double89 = pricingEngine22.calculateFinalPrice(pricingRequest69);
        int int90 = pricingRequest69.quantity();
        int int91 = pricingRequest69.quantity();
        int int92 = pricingRequest69.quantity();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 97.0d + "'", double20 == 97.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + customerType26 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType26.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType33 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType33.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 280.99d + "'", double34 == 280.99d);
        org.junit.Assert.assertTrue("'" + customerType37 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType37.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + customerType54 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType54.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + customerType64 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType64.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 97.0d + "'", double70 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 10 + "'", int72 == 10);
        org.junit.Assert.assertTrue("'" + customerType75 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType75.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!" + "'", str83, "hi!");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 100.0d + "'", double87 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 638.49d + "'", double89 == 638.49d);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 10 + "'", int90 == 10);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 10 + "'", int91 == 10);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 10 + "'", int92 == 10);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType8, false, "hi!", false, (int) '#');
        boolean boolean14 = pricingRequest13.seasonalSale();
        java.lang.String str15 = pricingRequest13.couponCode();
        java.lang.String str16 = pricingRequest13.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest13.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = pricingRequest13.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) -1, 0, customerType18, true, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", true, 35);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 10, 32, customerType18, true, "PricingRequest[basePrice=100.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=true, loyaltyPoints=0]", false, 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType29 = pricingRequest28.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest34 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, (int) (short) -1, customerType29, false, "PricingRequest[basePrice=0.0, quantity=97, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=true, loyaltyPoints=1]", true, (int) (short) 100);
        com.viktor.lab4.PricingEngine.CustomerType customerType35 = pricingRequest34.customerType();
        java.lang.String str36 = pricingRequest34.couponCode();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType29 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType29.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType35 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType35.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "PricingRequest[basePrice=0.0, quantity=97, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=true, loyaltyPoints=1]" + "'", str36, "PricingRequest[basePrice=0.0, quantity=97, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=true, loyaltyPoints=1]");
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType8, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, 10, customerType8, true, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100L, (int) (byte) 0, customerType8, true, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", false, (int) 'a');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (short) -1, customerType8, true, "hi!", false, (int) (short) 1);
        int int29 = pricingRequest28.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        java.lang.String str9 = pricingRequest7.couponCode();
        java.lang.String str10 = pricingRequest7.couponCode();
        boolean boolean11 = pricingRequest7.seasonalSale();
        boolean boolean13 = pricingRequest7.equals((java.lang.Object) 10.0d);
        boolean boolean14 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType19, false, "hi!", false, (int) '#');
        boolean boolean25 = pricingRequest24.seasonalSale();
        java.lang.String str26 = pricingRequest24.couponCode();
        boolean boolean28 = pricingRequest24.equals((java.lang.Object) (short) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType29 = pricingRequest24.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest34 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (int) (byte) 10, customerType29, true, "", false, (int) 'a');
        double double35 = pricingRequest34.basePrice();
        boolean boolean36 = pricingRequest7.equals((java.lang.Object) pricingRequest34);
        boolean boolean37 = pricingRequest7.firstOrder();
        int int38 = pricingRequest7.quantity();
        int int39 = pricingRequest7.quantity();
        boolean boolean40 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + customerType29 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType29.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 97.0d + "'", double35 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
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
        com.viktor.lab4.PricingEngine.CustomerType customerType26 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest31 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) '4', customerType26, true, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, 35);
        double double32 = pricingEngine22.calculateFinalPrice(pricingRequest31);
        com.viktor.lab4.PricingEngine.CustomerType customerType37 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest42 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType37, false, "hi!", false, (int) '#');
        boolean boolean43 = pricingRequest42.seasonalSale();
        java.lang.String str44 = pricingRequest42.couponCode();
        boolean boolean46 = pricingRequest42.equals((java.lang.Object) (short) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType47 = pricingRequest42.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest52 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (int) (byte) 10, customerType47, true, "", false, (int) 'a');
        double double53 = pricingRequest52.basePrice();
        double double54 = pricingRequest52.basePrice();
        java.lang.String str55 = pricingRequest52.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType60 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest65 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType60, false, "hi!", false, (int) '#');
        boolean boolean66 = pricingRequest65.seasonalSale();
        java.lang.String str67 = pricingRequest65.couponCode();
        boolean boolean69 = pricingRequest65.equals((java.lang.Object) (short) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType70 = pricingRequest65.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest75 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (int) (byte) 10, customerType70, true, "", false, (int) 'a');
        double double76 = pricingRequest75.basePrice();
        int int77 = pricingRequest75.loyaltyPoints();
        com.viktor.lab4.PricingEngine pricingEngine78 = new com.viktor.lab4.PricingEngine();
        boolean boolean79 = pricingRequest75.equals((java.lang.Object) pricingEngine78);
        boolean boolean80 = pricingRequest52.equals((java.lang.Object) pricingEngine78);
        int int81 = pricingRequest52.loyaltyPoints();
        double double82 = pricingEngine22.calculateFinalPrice(pricingRequest52);
        com.viktor.lab4.PricingEngine.CustomerType customerType85 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest90 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10L, (int) '#', customerType85, false, "hi!", false, (int) (byte) 1);
        boolean boolean91 = pricingRequest90.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType92 = pricingRequest90.customerType();
        boolean boolean93 = pricingRequest90.seasonalSale();
        double double94 = pricingEngine22.calculateFinalPrice(pricingRequest90);
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 97.0d + "'", double20 == 97.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + customerType26 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType26.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 41.79d + "'", double32 == 41.79d);
        org.junit.Assert.assertTrue("'" + customerType37 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType37.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + customerType47 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType47.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 97.0d + "'", double53 == 97.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 97.0d + "'", double54 == 97.0d);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "PricingRequest[basePrice=97.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=97]" + "'", str55, "PricingRequest[basePrice=97.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=97]");
        org.junit.Assert.assertTrue("'" + customerType60 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType60.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + customerType70 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType70.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 97.0d + "'", double76 == 97.0d);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 97 + "'", int77 == 97);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 97 + "'", int81 == 97);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 638.49d + "'", double82 == 638.49d);
        org.junit.Assert.assertTrue("'" + customerType85 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType85.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + customerType92 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType92.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 280.99d + "'", double94 == 280.99d);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
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
        int int43 = pricingRequest7.loyaltyPoints();
        int int44 = pricingRequest7.quantity();
        boolean boolean45 = pricingRequest7.seasonalSale();
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
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 35 + "'", int43 == 35);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType10, false, "hi!", false, (int) '#');
        boolean boolean17 = pricingRequest15.equals((java.lang.Object) (short) -1);
        boolean boolean19 = pricingRequest15.equals((java.lang.Object) 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = pricingRequest15.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (short) 0, customerType20, false, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", false, 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', (-1), customerType20, false, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", true, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType20, false, "PricingRequest[basePrice=10.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=10]", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest40 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '4', (int) ' ', customerType20, true, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", true, (int) 'a');
        java.lang.String str41 = pricingRequest40.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType44 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest49 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, (int) '4', customerType44, true, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", true, 35);
        double double50 = pricingRequest49.basePrice();
        int int51 = pricingRequest49.loyaltyPoints();
        boolean boolean53 = pricingRequest49.equals((java.lang.Object) (byte) 10);
        int int54 = pricingRequest49.loyaltyPoints();
        java.lang.String str55 = pricingRequest49.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType58 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest63 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType58, false, "hi!", false, (int) '#');
        boolean boolean64 = pricingRequest63.seasonalSale();
        java.lang.String str65 = pricingRequest63.couponCode();
        java.lang.String str66 = pricingRequest63.toString();
        double double67 = pricingRequest63.basePrice();
        double double68 = pricingRequest63.basePrice();
        boolean boolean69 = pricingRequest63.seasonalSale();
        boolean boolean70 = pricingRequest63.seasonalSale();
        boolean boolean71 = pricingRequest49.equals((java.lang.Object) boolean70);
        boolean boolean72 = pricingRequest40.equals((java.lang.Object) pricingRequest49);
        java.lang.String str73 = pricingRequest49.toString();
        java.lang.String str74 = pricingRequest49.couponCode();
        java.lang.String str75 = pricingRequest49.toString();
        double double76 = pricingRequest49.basePrice();
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "PricingRequest[basePrice=52.0, quantity=32, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=true, loyaltyPoints=97]" + "'", str41, "PricingRequest[basePrice=52.0, quantity=32, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=true, loyaltyPoints=97]");
        org.junit.Assert.assertTrue("'" + customerType44 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType44.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 1.0d + "'", double50 == 1.0d);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 35 + "'", int51 == 35);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 35 + "'", int54 == 35);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str55, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + customerType58 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType58.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str66, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 100.0d + "'", double67 == 100.0d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 100.0d + "'", double68 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "PricingRequest[basePrice=1.0, quantity=52, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=true, loyaltyPoints=35]" + "'", str73, "PricingRequest[basePrice=1.0, quantity=52, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=true, loyaltyPoints=35]");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str74, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "PricingRequest[basePrice=1.0, quantity=52, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=true, loyaltyPoints=35]" + "'", str75, "PricingRequest[basePrice=1.0, quantity=52, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=true, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 1.0d + "'", double76 == 1.0d);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType8, false, "hi!", false, (int) '#');
        boolean boolean14 = pricingRequest13.seasonalSale();
        java.lang.String str15 = pricingRequest13.couponCode();
        boolean boolean17 = pricingRequest13.equals((java.lang.Object) (short) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = pricingRequest13.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) (byte) 100, customerType18, false, "", true, (int) (byte) 10);
        boolean boolean24 = pricingRequest23.seasonalSale();
        int int25 = pricingRequest23.quantity();
        java.lang.String str26 = pricingRequest23.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType29 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest34 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType29, false, "hi!", false, (int) '#');
        boolean boolean35 = pricingRequest34.seasonalSale();
        java.lang.String str36 = pricingRequest34.couponCode();
        java.lang.String str37 = pricingRequest34.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType38 = pricingRequest34.customerType();
        double double39 = pricingRequest34.basePrice();
        boolean boolean40 = pricingRequest23.equals((java.lang.Object) double39);
        double double41 = pricingRequest23.basePrice();
        int int42 = pricingRequest23.quantity();
        boolean boolean43 = pricingRequest23.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType44 = pricingRequest23.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest49 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, (int) (byte) 10, customerType44, false, "PricingRequest[basePrice=10.0, quantity=32, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=0]", false, (int) '4');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest54 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', 10, customerType44, true, "PricingRequest[basePrice=1.0, quantity=52, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=true, loyaltyPoints=35]", true, 0);
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PricingRequest[basePrice=10.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=10]" + "'", str26, "PricingRequest[basePrice=10.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=10]");
        org.junit.Assert.assertTrue("'" + customerType29 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType29.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + customerType38 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType38.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 100.0d + "'", double39 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 10.0d + "'", double41 == 10.0d);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + customerType44 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType44.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        java.lang.String str9 = pricingRequest7.couponCode();
        java.lang.String str10 = pricingRequest7.toString();
        double double11 = pricingRequest7.basePrice();
        int int12 = pricingRequest7.loyaltyPoints();
        int int13 = pricingRequest7.loyaltyPoints();
        java.lang.String str14 = pricingRequest7.toString();
        boolean boolean15 = pricingRequest7.firstOrder();
        int int16 = pricingRequest7.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str10, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str14, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        java.lang.String str9 = pricingRequest7.couponCode();
        boolean boolean11 = pricingRequest7.equals((java.lang.Object) (short) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest7.customerType();
        int int13 = pricingRequest7.loyaltyPoints();
        int int14 = pricingRequest7.loyaltyPoints();
        double double15 = pricingRequest7.basePrice();
        java.lang.String str16 = pricingRequest7.couponCode();
        java.lang.String str17 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = pricingRequest7.customerType();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
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
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest43 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (int) (byte) 10, customerType38, true, "", false, (int) 'a');
        double double44 = pricingRequest43.basePrice();
        double double45 = pricingRequest43.basePrice();
        java.lang.String str46 = pricingRequest43.toString();
        java.lang.String str47 = pricingRequest43.toString();
        double double48 = pricingEngine0.calculateFinalPrice(pricingRequest43);
        com.viktor.lab4.PricingEngine.CustomerType customerType53 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest58 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType53, false, "hi!", false, (int) '#');
        boolean boolean59 = pricingRequest58.seasonalSale();
        java.lang.String str60 = pricingRequest58.couponCode();
        boolean boolean62 = pricingRequest58.equals((java.lang.Object) (short) 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType63 = pricingRequest58.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest68 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) (byte) 100, customerType63, false, "", true, (int) (byte) 10);
        boolean boolean69 = pricingRequest68.seasonalSale();
        boolean boolean70 = pricingRequest68.firstOrder();
        double double71 = pricingEngine0.calculateFinalPrice(pricingRequest68);
        java.lang.String str72 = pricingRequest68.couponCode();
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
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 97.0d + "'", double44 == 97.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 97.0d + "'", double45 == 97.0d);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "PricingRequest[basePrice=97.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=97]" + "'", str46, "PricingRequest[basePrice=97.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=97]");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "PricingRequest[basePrice=97.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=97]" + "'", str47, "PricingRequest[basePrice=97.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=97]");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 638.49d + "'", double48 == 638.49d);
        org.junit.Assert.assertTrue("'" + customerType53 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType53.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + customerType63 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType63.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 737.99d + "'", double71 == 737.99d);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType2, false, "hi!", false, (int) '#');
        boolean boolean9 = pricingRequest7.equals((java.lang.Object) (short) -1);
        boolean boolean11 = pricingRequest7.equals((java.lang.Object) 0);
        double double12 = pricingRequest7.basePrice();
        boolean boolean13 = pricingRequest7.seasonalSale();
        int int14 = pricingRequest7.quantity();
        java.lang.String str15 = pricingRequest7.couponCode();
        java.lang.String str16 = pricingRequest7.toString();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str16, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType6, false, "hi!", false, (int) '#');
        boolean boolean12 = pricingRequest11.seasonalSale();
        java.lang.String str13 = pricingRequest11.couponCode();
        java.lang.String str14 = pricingRequest11.toString();
        double double15 = pricingRequest11.basePrice();
        double double16 = pricingRequest11.basePrice();
        double double17 = pricingRequest11.basePrice();
        boolean boolean18 = pricingRequest11.firstOrder();
        boolean boolean19 = pricingRequest11.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest(3387.99d, 97, customerType20, false, "PricingRequest[basePrice=52.0, quantity=100, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=97]", true, 97);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 97, 10, customerType20, true, "PricingRequest[basePrice=10.0, quantity=32, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=10, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=0]", true, 52);
        com.viktor.lab4.PricingEngine.CustomerType customerType31 = pricingRequest30.customerType();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str14, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType31 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType31.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
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
        double double17 = pricingRequest7.basePrice();
        boolean boolean18 = pricingRequest7.firstOrder();
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, 0, customerType10, false, "hi!", false, (int) '#');
        boolean boolean17 = pricingRequest15.equals((java.lang.Object) (short) -1);
        boolean boolean19 = pricingRequest15.equals((java.lang.Object) 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = pricingRequest15.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest25 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (short) 0, customerType20, false, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", false, 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) ' ', (-1), customerType20, false, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", true, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest35 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', 0, customerType20, false, "PricingRequest[basePrice=10.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=10]", true, (int) (short) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest40 = new com.viktor.lab4.PricingEngine.PricingRequest((double) '4', (int) ' ', customerType20, true, "PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1]", true, (int) 'a');
        java.lang.String str41 = pricingRequest40.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType42 = pricingRequest40.customerType();
        java.lang.String str43 = pricingRequest40.toString();
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "PricingRequest[basePrice=52.0, quantity=32, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=true, loyaltyPoints=97]" + "'", str41, "PricingRequest[basePrice=52.0, quantity=32, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=true, loyaltyPoints=97]");
        org.junit.Assert.assertTrue("'" + customerType42 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType42.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "PricingRequest[basePrice=52.0, quantity=32, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=true, loyaltyPoints=97]" + "'", str43, "PricingRequest[basePrice=52.0, quantity=32, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=10.0, quantity=35, customerType=VIP, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=1], firstOrder=true, loyaltyPoints=97]");
    }
}

