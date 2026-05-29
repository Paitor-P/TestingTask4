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
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        int int8 = pricingRequest7.loyaltyPoints();
        boolean boolean9 = pricingRequest7.seasonalSale();
        double double10 = pricingRequest7.basePrice();
        int int11 = pricingRequest7.loyaltyPoints();
        java.lang.String str12 = pricingRequest7.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest7.customerType();
        boolean boolean14 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest7.customerType();
        int int16 = pricingRequest7.quantity();
        boolean boolean17 = pricingRequest7.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType6, true, "hi!", true, (int) (short) 0);
        java.lang.String str12 = pricingRequest11.couponCode();
        boolean boolean13 = pricingRequest11.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest11.customerType();
        java.lang.String str15 = pricingRequest11.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType16 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (-1), customerType16, true, "", false, (int) (short) -1);
        int int22 = pricingRequest21.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = pricingRequest21.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) -1, (int) (byte) 0, customerType23, false, "PricingRequest[basePrice=10.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=0.0, quantity=52, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=-1]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine pricingEngine29 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType32 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest37 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType32, true, "hi!", true, (int) (short) 0);
        int int38 = pricingRequest37.loyaltyPoints();
        boolean boolean39 = pricingRequest37.seasonalSale();
        double double40 = pricingRequest37.basePrice();
        boolean boolean41 = pricingRequest37.firstOrder();
        double double42 = pricingEngine29.calculateFinalPrice(pricingRequest37);
        java.lang.String str43 = pricingRequest37.toString();
        java.lang.String str44 = pricingRequest37.toString();
        boolean boolean45 = pricingRequest37.firstOrder();
        boolean boolean46 = pricingRequest37.firstOrder();
        boolean boolean47 = pricingRequest37.firstOrder();
        boolean boolean48 = pricingRequest28.equals((java.lang.Object) boolean47);
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str15, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + customerType16 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType16.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType32 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType32.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 1.0d + "'", double40 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 8.67d + "'", double42 == 8.67d);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str43, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str44, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
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
        com.viktor.lab4.PricingEngine.CustomerType customerType43 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest48 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType43, true, "hi!", true, (int) (short) 0);
        java.lang.String str49 = pricingRequest48.couponCode();
        boolean boolean51 = pricingRequest48.equals((java.lang.Object) 10L);
        double double52 = pricingRequest48.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType53 = pricingRequest48.customerType();
        boolean boolean54 = pricingRequest48.firstOrder();
        boolean boolean55 = pricingRequest48.seasonalSale();
        int int56 = pricingRequest48.loyaltyPoints();
        int int57 = pricingRequest48.loyaltyPoints();
        double double58 = pricingEngine0.calculateFinalPrice(pricingRequest48);
        com.viktor.lab4.PricingEngine.CustomerType customerType61 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest66 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType61, true, "hi!", true, (int) (short) 0);
        java.lang.String str67 = pricingRequest66.couponCode();
        boolean boolean69 = pricingRequest66.equals((java.lang.Object) 10L);
        int int70 = pricingRequest66.loyaltyPoints();
        java.lang.String str71 = pricingRequest66.toString();
        double double72 = pricingRequest66.basePrice();
        double double73 = pricingEngine0.calculateFinalPrice(pricingRequest66);
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
        org.junit.Assert.assertTrue("'" + customerType43 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType43.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 1.0d + "'", double52 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType53 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType53.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 8.67d + "'", double58 == 8.67d);
        org.junit.Assert.assertTrue("'" + customerType61 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType61.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str71, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 1.0d + "'", double72 == 1.0d);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 8.67d + "'", double73 == 8.67d);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
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
        boolean boolean49 = pricingRequest48.seasonalSale();
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
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        int int8 = pricingRequest7.loyaltyPoints();
        boolean boolean9 = pricingRequest7.seasonalSale();
        double double10 = pricingRequest7.basePrice();
        boolean boolean11 = pricingRequest7.firstOrder();
        boolean boolean12 = pricingRequest7.seasonalSale();
        int int13 = pricingRequest7.loyaltyPoints();
        boolean boolean14 = pricingRequest7.seasonalSale();
        java.lang.Class<?> wildcardClass15 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
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
        java.lang.String str35 = pricingRequest16.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType36 = pricingRequest16.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest41 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 10, (int) (short) -1, customerType36, true, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=100]", false, 35);
        java.lang.String str42 = pricingRequest41.couponCode();
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str35, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + customerType36 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType36.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=100]" + "'", str42, "PricingRequest[basePrice=100.0, quantity=0, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=100]");
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType8, true, "hi!", true, (int) (short) 0);
        int int14 = pricingRequest13.loyaltyPoints();
        boolean boolean15 = pricingRequest13.seasonalSale();
        double double16 = pricingRequest13.basePrice();
        boolean boolean17 = pricingRequest13.firstOrder();
        boolean boolean18 = pricingRequest13.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = pricingRequest13.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (int) ' ', customerType19, true, "PricingRequest[basePrice=-1.0, quantity=100, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", true, (int) (short) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest(737.99d, 97, customerType19, false, "PricingRequest[basePrice=52.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=10], firstOrder=true, loyaltyPoints=-1]", false, 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest34 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (short) 1, customerType19, false, "PricingRequest[basePrice=-1.0, quantity=100, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=35]", false, (-1));
        boolean boolean35 = pricingRequest34.firstOrder();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) '#', customerType6, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (short) 100, customerType6, false, "", false, (int) (byte) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 10, (int) (short) 100, customerType6, false, "", true, (int) 'a');
        int int22 = pricingRequest21.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = pricingRequest21.customerType();
        int int24 = pricingRequest21.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType29 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest34 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType29, true, "hi!", true, (int) (short) 0);
        int int35 = pricingRequest34.loyaltyPoints();
        boolean boolean36 = pricingRequest34.seasonalSale();
        double double37 = pricingRequest34.basePrice();
        boolean boolean38 = pricingRequest34.firstOrder();
        boolean boolean39 = pricingRequest34.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = pricingRequest34.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest45 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 'a', (int) ' ', customerType40, true, "PricingRequest[basePrice=-1.0, quantity=100, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", true, (int) (short) 1);
        java.lang.Class<?> wildcardClass46 = customerType40.getClass();
        boolean boolean47 = pricingRequest21.equals((java.lang.Object) wildcardClass46);
        boolean boolean48 = pricingRequest21.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + customerType29 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType29.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 1.0d + "'", double37 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) '#', customerType8, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) (short) 1, customerType8, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", false, (int) (short) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, (int) (short) 1, customerType8, false, "PricingRequest[basePrice=0.0, quantity=52, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, 1, customerType8, true, "PricingRequest[basePrice=-1.0, quantity=-1, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=-1]", true, (int) (byte) 100);
        double double29 = pricingRequest28.basePrice();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
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
        boolean boolean29 = pricingRequest22.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType36 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest41 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType36, true, "hi!", true, (int) (short) 0);
        java.lang.String str42 = pricingRequest41.couponCode();
        boolean boolean44 = pricingRequest41.equals((java.lang.Object) 10L);
        double double45 = pricingRequest41.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType46 = pricingRequest41.customerType();
        boolean boolean47 = pricingRequest41.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType48 = pricingRequest41.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest53 = new com.viktor.lab4.PricingEngine.PricingRequest(0.0d, (int) (short) -1, customerType48, true, "", false, 10);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest58 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (short) 0, customerType48, false, "PricingRequest[basePrice=-1.0, quantity=35, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=0]", false, (int) (byte) 100);
        com.viktor.lab4.PricingEngine.CustomerType customerType59 = pricingRequest58.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType60 = pricingRequest58.customerType();
        java.lang.String str61 = pricingRequest58.toString();
        boolean boolean62 = pricingRequest22.equals((java.lang.Object) str61);
        int int63 = pricingRequest22.quantity();
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + customerType36 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType36.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 1.0d + "'", double45 == 1.0d);
        org.junit.Assert.assertTrue("'" + customerType46 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType46.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + customerType48 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType48.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType59 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType59.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType60 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType60.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "PricingRequest[basePrice=0.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=-1.0, quantity=35, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=100]" + "'", str61, "PricingRequest[basePrice=0.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=-1.0, quantity=35, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=100]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        java.lang.String str8 = pricingRequest7.couponCode();
        boolean boolean9 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest7.customerType();
        java.lang.String str11 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest7.customerType();
        boolean boolean13 = pricingRequest7.seasonalSale();
        int int14 = pricingRequest7.quantity();
        java.lang.String str15 = pricingRequest7.toString();
        java.lang.String str16 = pricingRequest7.toString();
        java.lang.String str17 = pricingRequest7.couponCode();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str11, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str15, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str16, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
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
        double double75 = pricingRequest68.basePrice();
        boolean boolean76 = pricingRequest68.seasonalSale();
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
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 1.0d + "'", double75 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 1, (int) '#', customerType4, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", true, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1.0f), (int) (short) 1, customerType4, false, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]", false, (int) (short) 1);
        boolean boolean15 = pricingRequest14.seasonalSale();
        boolean boolean16 = pricingRequest14.seasonalSale();
        java.lang.String str17 = pricingRequest14.toString();
        boolean boolean18 = pricingRequest14.firstOrder();
        java.lang.String str19 = pricingRequest14.couponCode();
        java.lang.String str20 = pricingRequest14.toString();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PricingRequest[basePrice=-1.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=1]" + "'", str17, "PricingRequest[basePrice=-1.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=1]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]" + "'", str19, "PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PricingRequest[basePrice=-1.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=1]" + "'", str20, "PricingRequest[basePrice=-1.0, quantity=1, customerType=VIP, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=0], firstOrder=false, loyaltyPoints=1]");
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType6, true, "hi!", true, (int) (short) 0);
        int int12 = pricingRequest11.loyaltyPoints();
        boolean boolean13 = pricingRequest11.seasonalSale();
        double double14 = pricingRequest11.basePrice();
        int int15 = pricingRequest11.loyaltyPoints();
        java.lang.Object obj16 = null;
        boolean boolean17 = pricingRequest11.equals(obj16);
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 0, 0, customerType18, false, "PricingRequest[basePrice=0.0, quantity=52, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=-1]", true, 100);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) '4', customerType18, false, "PricingRequest[basePrice=-1.0, quantity=100, customerType=VIP, seasonalSale=true, couponCode=PricingRequest[basePrice=97.0, quantity=1, customerType=VIP, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=100]", true, 0);
        int int29 = pricingRequest28.loyaltyPoints();
        java.lang.Class<?> wildcardClass30 = pricingRequest28.getClass();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) '#', customerType2, true, "PricingRequest[basePrice=0.0, quantity=0, customerType=VIP, seasonalSale=false, couponCode=, firstOrder=true, loyaltyPoints=10]", false, 100);
        boolean boolean8 = pricingRequest7.firstOrder();
        double double9 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1, (int) (short) 1, customerType2, true, "hi!", true, (int) (short) 0);
        java.lang.String str8 = pricingRequest7.couponCode();
        boolean boolean10 = pricingRequest7.equals((java.lang.Object) 10L);
        int int11 = pricingRequest7.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest7.customerType();
        int int13 = pricingRequest7.loyaltyPoints();
        double double14 = pricingRequest7.basePrice();
        boolean boolean15 = pricingRequest7.firstOrder();
        int int16 = pricingRequest7.loyaltyPoints();
        java.lang.Class<?> wildcardClass17 = pricingRequest7.getClass();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }
}

