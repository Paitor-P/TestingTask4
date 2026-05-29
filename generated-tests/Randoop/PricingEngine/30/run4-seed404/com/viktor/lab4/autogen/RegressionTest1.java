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
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100, (-1), customerType4, false, "PricingRequest[basePrice=0.0, quantity=10, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=10, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=10]", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, 35, customerType4, false, "PricingRequest[basePrice=100.0, quantity=-1, customerType=REGULAR, seasonalSale=true, couponCode=, firstOrder=false, loyaltyPoints=0]", false, (-1));
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType2, false, "hi!", false, (int) '#');
        double double8 = pricingRequest7.basePrice();
        int int9 = pricingRequest7.loyaltyPoints();
        java.lang.String str10 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest7.customerType();
        double double12 = pricingRequest7.basePrice();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str10, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType6, false, "hi!", false, (int) '#');
        boolean boolean12 = pricingRequest11.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest11.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest19 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) '#', customerType14, true, "", false, 1);
        int int20 = pricingRequest19.loyaltyPoints();
        int int21 = pricingRequest19.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType24 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest29 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType24, false, "hi!", false, (int) '#');
        double double30 = pricingRequest29.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType31 = pricingRequest29.customerType();
        java.lang.String str32 = pricingRequest29.toString();
        boolean boolean33 = pricingRequest29.seasonalSale();
        boolean boolean34 = pricingRequest19.equals((java.lang.Object) pricingRequest29);
        com.viktor.lab4.PricingEngine.CustomerType customerType35 = pricingRequest19.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest40 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 100, 35, customerType35, false, "PricingRequest[basePrice=-1.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=0], firstOrder=false, loyaltyPoints=0]", false, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + customerType24 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType24.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType31 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType31.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str32, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + customerType35 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType35.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
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
        com.viktor.lab4.PricingEngine.CustomerType customerType54 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest59 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType54, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest64 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (byte) -1, customerType54, false, "", false, 0);
        int int65 = pricingRequest64.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType66 = pricingRequest64.customerType();
        boolean boolean67 = pricingRequest64.firstOrder();
        int int68 = pricingRequest64.quantity();
        int int69 = pricingRequest64.loyaltyPoints();
        // The following exception was thrown during execution in test generation
        try {
            double double70 = pricingEngine0.calculateFinalPrice(pricingRequest64);
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
        org.junit.Assert.assertTrue("'" + customerType54 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType54.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + customerType66 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType66.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType4, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (byte) -1, customerType4, false, "", false, 0);
        int int15 = pricingRequest14.quantity();
        int int16 = pricingRequest14.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType27, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest37 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (byte) -1, customerType27, false, "", false, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest42 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, (int) (short) 1, customerType27, false, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest47 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) -1, (int) (short) 100, customerType27, false, "PricingRequest[basePrice=100.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=10]", false, (int) ' ');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest52 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1), (int) (byte) 100, customerType27, false, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", false, (int) 'a');
        boolean boolean53 = pricingRequest14.equals((java.lang.Object) (-1));
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + customerType27 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType27.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType8, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (byte) -1, customerType8, false, "", false, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, (int) (short) 1, customerType8, false, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", false, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1), (-1), customerType8, true, "PricingRequest[basePrice=97.0, quantity=35, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", false, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType4, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, (int) (short) -1, customerType4, false, "hi!", false, 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType15 = pricingRequest14.customerType();
        boolean boolean16 = pricingRequest14.seasonalSale();
        boolean boolean17 = pricingRequest14.seasonalSale();
        boolean boolean18 = pricingRequest14.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = pricingRequest14.customerType();
        java.lang.String str20 = pricingRequest14.couponCode();
        java.lang.String str21 = pricingRequest14.toString();
        java.lang.String str22 = pricingRequest14.couponCode();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType15 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType15.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PricingRequest[basePrice=100.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=10]" + "'", str21, "PricingRequest[basePrice=100.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=10]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType4, false, "hi!", false, (int) '#');
        boolean boolean10 = pricingRequest9.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType13 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0.0f, 1, customerType13, true, "PricingRequest[basePrice=1.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35], firstOrder=true, loyaltyPoints=97]", false, (int) '4');
        com.viktor.lab4.PricingEngine.CustomerType customerType27 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType27, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest37 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (byte) -1, customerType27, false, "", false, 0);
        int int38 = pricingRequest37.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType39 = pricingRequest37.customerType();
        boolean boolean40 = pricingRequest37.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType41 = pricingRequest37.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest46 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) (short) 1, customerType41, true, "", true, (int) (short) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest51 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (short) -1, customerType41, true, "", false, 0);
        com.viktor.lab4.PricingEngine pricingEngine52 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType55 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest60 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType55, false, "hi!", false, (int) '#');
        boolean boolean61 = pricingRequest60.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType62 = pricingRequest60.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType63 = pricingRequest60.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType64 = pricingRequest60.customerType();
        double double65 = pricingEngine52.calculateFinalPrice(pricingRequest60);
        boolean boolean66 = pricingRequest60.seasonalSale();
        java.lang.Class<?> wildcardClass67 = pricingRequest60.getClass();
        boolean boolean68 = pricingRequest51.equals((java.lang.Object) pricingRequest60);
        int int69 = pricingRequest51.quantity();
        int int70 = pricingRequest51.quantity();
        boolean boolean71 = pricingRequest18.equals((java.lang.Object) int70);
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType13 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType13.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType27 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType27.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + customerType39 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType39.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + customerType41 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType41.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType55 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType55.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + customerType62 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType62.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType63 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType63.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType64 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType64.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 880.99d + "'", double65 == 880.99d);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType4, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, (int) (short) -1, customerType4, false, "hi!", false, 10);
        boolean boolean15 = pricingRequest14.firstOrder();
        double double16 = pricingRequest14.basePrice();
        java.lang.String str17 = pricingRequest14.couponCode();
        int int18 = pricingRequest14.loyaltyPoints();
        double double19 = pricingRequest14.basePrice();
        int int20 = pricingRequest14.loyaltyPoints();
        int int21 = pricingRequest14.loyaltyPoints();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType4, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, (int) (short) -1, customerType4, false, "hi!", false, 10);
        boolean boolean15 = pricingRequest14.firstOrder();
        double double16 = pricingRequest14.basePrice();
        java.lang.String str17 = pricingRequest14.couponCode();
        int int18 = pricingRequest14.loyaltyPoints();
        double double19 = pricingRequest14.basePrice();
        int int20 = pricingRequest14.loyaltyPoints();
        java.lang.Class<?> wildcardClass21 = pricingRequest14.getClass();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest7.customerType();
        int int10 = pricingRequest7.loyaltyPoints();
        boolean boolean11 = pricingRequest7.firstOrder();
        double double12 = pricingRequest7.basePrice();
        java.lang.String str13 = pricingRequest7.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType14 = pricingRequest7.customerType();
        java.lang.String str15 = pricingRequest7.toString();
        java.lang.String str16 = pricingRequest7.couponCode();
        java.lang.String str17 = pricingRequest7.toString();
        boolean boolean18 = pricingRequest7.seasonalSale();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + customerType9 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType9.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str13, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + customerType14 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType14.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str15, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str17, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType8, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (byte) -1, customerType8, false, "", false, 0);
        int int19 = pricingRequest18.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = pricingRequest18.customerType();
        boolean boolean21 = pricingRequest18.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest18.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) (short) 1, customerType22, true, "", true, (int) (short) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (short) -1, customerType22, true, "", false, 0);
        com.viktor.lab4.PricingEngine pricingEngine33 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType36 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest41 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType36, false, "hi!", false, (int) '#');
        boolean boolean42 = pricingRequest41.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType43 = pricingRequest41.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType44 = pricingRequest41.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType45 = pricingRequest41.customerType();
        double double46 = pricingEngine33.calculateFinalPrice(pricingRequest41);
        boolean boolean47 = pricingRequest41.seasonalSale();
        java.lang.Class<?> wildcardClass48 = pricingRequest41.getClass();
        boolean boolean49 = pricingRequest32.equals((java.lang.Object) pricingRequest41);
        int int50 = pricingRequest32.quantity();
        int int51 = pricingRequest32.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType52 = pricingRequest32.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType57 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest62 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType57, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest67 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, (int) (short) -1, customerType57, false, "hi!", false, 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType68 = pricingRequest67.customerType();
        boolean boolean69 = pricingRequest32.equals((java.lang.Object) pricingRequest67);
        double double70 = pricingRequest32.basePrice();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType36 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType36.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + customerType43 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType43.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType44 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType44.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType45 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType45.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 880.99d + "'", double46 == 880.99d);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + customerType52 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType52.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType57 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType57.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType68 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType68.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 100.0d + "'", double70 == 100.0d);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 35, (int) 'a', customerType6, false, "", false, (int) (byte) -1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (-1), 10, customerType6, true, "PricingRequest[basePrice=1.0, quantity=10, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]", true, (-1));
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest21 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, (int) (byte) 1, customerType6, true, "PricingRequest[basePrice=100.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=10]", true, 0);
        int int22 = pricingRequest21.quantity();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.VIP;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, (-1), customerType4, true, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", false, 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest15 = new com.viktor.lab4.PricingEngine.PricingRequest(10.0d, (int) (byte) -1, customerType10, false, "PricingRequest[basePrice=0.0, quantity=10, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=1.0, quantity=10, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=10]", false, 0);
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.VIP + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.VIP));
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType4, false, "hi!", false, (int) '#');
        double double10 = pricingRequest9.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, 1, customerType11, true, "hi!", true, (int) (byte) 0);
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest16.customerType();
        java.lang.String str18 = pricingRequest16.couponCode();
        com.viktor.lab4.PricingEngine.CustomerType customerType23 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType23, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest33 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, (int) (short) -1, customerType23, false, "hi!", false, 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType34 = pricingRequest33.customerType();
        int int35 = pricingRequest33.loyaltyPoints();
        boolean boolean36 = pricingRequest33.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType37 = pricingRequest33.customerType();
        java.lang.Class<?> wildcardClass38 = customerType37.getClass();
        boolean boolean39 = pricingRequest16.equals((java.lang.Object) customerType37);
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + customerType23 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType23.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType34 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType34.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + customerType37 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType37.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType4, false, "hi!", false, (int) '#');
        boolean boolean10 = pricingRequest9.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest9.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest17 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1L, (int) '#', customerType12, true, "", false, 1);
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = pricingRequest17.customerType();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        com.viktor.lab4.PricingEngine.CustomerType customerType8 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest13 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType8, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest18 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (byte) -1, customerType8, false, "", false, 0);
        int int19 = pricingRequest18.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = pricingRequest18.customerType();
        boolean boolean21 = pricingRequest18.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType22 = pricingRequest18.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest27 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) (short) 1, customerType22, true, "", true, (int) (short) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest32 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 35, (-1), customerType22, false, "PricingRequest[basePrice=10.0, quantity=10, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=97.0, quantity=35, customerType=REGULAR, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1], firstOrder=false, loyaltyPoints=-1]", false, 97);
        double double33 = pricingRequest32.basePrice();
        org.junit.Assert.assertTrue("'" + customerType8 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType8.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + customerType22 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType22.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 35.0d + "'", double33 == 35.0d);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType4, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, (int) (short) -1, customerType4, false, "hi!", false, 10);
        boolean boolean15 = pricingRequest14.firstOrder();
        int int16 = pricingRequest14.quantity();
        java.lang.String str17 = pricingRequest14.toString();
        java.lang.String str18 = pricingRequest14.couponCode();
        java.lang.String str19 = pricingRequest14.toString();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PricingRequest[basePrice=100.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=10]" + "'", str17, "PricingRequest[basePrice=100.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=10]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PricingRequest[basePrice=100.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=10]" + "'", str19, "PricingRequest[basePrice=100.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=10]");
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        com.viktor.lab4.PricingEngine pricingEngine0 = new com.viktor.lab4.PricingEngine();
        com.viktor.lab4.PricingEngine.CustomerType customerType3 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest8 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType3, false, "hi!", false, (int) '#');
        boolean boolean9 = pricingRequest8.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType10 = pricingRequest8.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType11 = pricingRequest8.customerType();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest8.customerType();
        double double13 = pricingEngine0.calculateFinalPrice(pricingRequest8);
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType18, false, "hi!", false, (int) '#');
        double double24 = pricingRequest23.basePrice();
        com.viktor.lab4.PricingEngine.CustomerType customerType25 = pricingRequest23.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest30 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (short) 1, 1, customerType25, true, "hi!", true, (int) (byte) 0);
        double double31 = pricingRequest30.basePrice();
        boolean boolean32 = pricingRequest30.seasonalSale();
        double double33 = pricingEngine0.calculateFinalPrice(pricingRequest30);
        com.viktor.lab4.PricingEngine.CustomerType customerType40 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest45 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType40, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest50 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (byte) -1, customerType40, false, "", false, 0);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest55 = new com.viktor.lab4.PricingEngine.PricingRequest(1.0d, (int) (short) 1, customerType40, false, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]", false, (int) (byte) 0);
        double double56 = pricingEngine0.calculateFinalPrice(pricingRequest55);
        java.lang.Class<?> wildcardClass57 = pricingRequest55.getClass();
        org.junit.Assert.assertTrue("'" + customerType3 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType3.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + customerType10 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType10.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType11 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType11.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 880.99d + "'", double13 == 880.99d);
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertTrue("'" + customerType25 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType25.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 8.79d + "'", double33 == 8.79d);
        org.junit.Assert.assertTrue("'" + customerType40 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType40.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 8.99d + "'", double56 == 8.99d);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        com.viktor.lab4.PricingEngine.CustomerType customerType4 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest9 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType4, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest14 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (byte) -1, customerType4, false, "", false, 0);
        int int15 = pricingRequest14.quantity();
        boolean boolean16 = pricingRequest14.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest14.customerType();
        double double18 = pricingRequest14.basePrice();
        java.lang.String str19 = pricingRequest14.toString();
        com.viktor.lab4.PricingEngine.CustomerType customerType20 = pricingRequest14.customerType();
        org.junit.Assert.assertTrue("'" + customerType4 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType4.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=0]" + "'", str19, "PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=0]");
        org.junit.Assert.assertTrue("'" + customerType20 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType20.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((-1.0d), 0, customerType2, false, "PricingRequest[basePrice=-1.0, quantity=0, customerType=REGULAR, seasonalSale=false, couponCode=PricingRequest[basePrice=0.0, quantity=-1, customerType=REGULAR, seasonalSale=false, couponCode=, firstOrder=false, loyaltyPoints=0], firstOrder=false, loyaltyPoints=0]", true, (int) ' ');
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        com.viktor.lab4.PricingEngine.CustomerType customerType6 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest11 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType6, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest16 = new com.viktor.lab4.PricingEngine.PricingRequest(100.0d, (int) (short) -1, customerType6, false, "hi!", false, 10);
        com.viktor.lab4.PricingEngine.CustomerType customerType17 = pricingRequest16.customerType();
        int int18 = pricingRequest16.loyaltyPoints();
        com.viktor.lab4.PricingEngine.CustomerType customerType19 = pricingRequest16.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest24 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (-1), customerType19, true, "", false, (int) (short) 0);
        double double25 = pricingRequest24.basePrice();
        org.junit.Assert.assertTrue("'" + customerType6 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType6.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + customerType17 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType17.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + customerType19 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType19.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType2, false, "hi!", false, (int) '#');
        boolean boolean8 = pricingRequest7.seasonalSale();
        com.viktor.lab4.PricingEngine.CustomerType customerType9 = pricingRequest7.customerType();
        int int10 = pricingRequest7.loyaltyPoints();
        int int11 = pricingRequest7.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType12 = pricingRequest7.customerType();
        java.lang.String str13 = pricingRequest7.toString();
        int int14 = pricingRequest7.quantity();
        org.junit.Assert.assertTrue("'" + customerType2 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType2.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + customerType9 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType9.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + customerType12 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType12.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]" + "'", str13, "PricingRequest[basePrice=10.0, quantity=97, customerType=REGULAR, seasonalSale=false, couponCode=hi!, firstOrder=false, loyaltyPoints=35]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        com.viktor.lab4.PricingEngine.CustomerType customerType2 = null;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest7 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 1.0f, 10, customerType2, true, "hi!", true, (-1));
        java.lang.String str8 = pricingRequest7.toString();
        boolean boolean9 = pricingRequest7.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType18 = com.viktor.lab4.PricingEngine.CustomerType.REGULAR;
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest23 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 10.0f, (int) 'a', customerType18, false, "hi!", false, (int) '#');
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest28 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 0, (int) (byte) -1, customerType18, false, "", false, 0);
        int int29 = pricingRequest28.quantity();
        com.viktor.lab4.PricingEngine.CustomerType customerType30 = pricingRequest28.customerType();
        boolean boolean31 = pricingRequest28.firstOrder();
        com.viktor.lab4.PricingEngine.CustomerType customerType32 = pricingRequest28.customerType();
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest37 = new com.viktor.lab4.PricingEngine.PricingRequest((double) 100.0f, (int) (short) 1, customerType32, true, "", true, (int) (short) 1);
        com.viktor.lab4.PricingEngine.PricingRequest pricingRequest42 = new com.viktor.lab4.PricingEngine.PricingRequest((double) (byte) 100, (int) (short) -1, customerType32, true, "", false, 0);
        boolean boolean43 = pricingRequest42.seasonalSale();
        boolean boolean44 = pricingRequest7.equals((java.lang.Object) pricingRequest42);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PricingRequest[basePrice=1.0, quantity=10, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]" + "'", str8, "PricingRequest[basePrice=1.0, quantity=10, customerType=null, seasonalSale=true, couponCode=hi!, firstOrder=true, loyaltyPoints=-1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + customerType18 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType18.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + customerType30 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType30.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + customerType32 + "' != '" + com.viktor.lab4.PricingEngine.CustomerType.REGULAR + "'", customerType32.equals(com.viktor.lab4.PricingEngine.CustomerType.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }
}

