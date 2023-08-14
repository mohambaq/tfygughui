/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.mavenproject2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Mohammed Baqar
 */
public class Mavenproject2Test {
    
    public Mavenproject2Test() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class Mavenproject2.
     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        Mavenproject2.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of validateBirthYear method, of class Mavenproject 2.
     */
    @Test
    public void testValidateBirthYearGood() {
        System.out.println("Good case");
        int playerBirthYear = 2010;
        Mavenproject2 instance = new Mavenproject2();
        boolean expResult = true;
        boolean result = instance.validateBirthYear(playerBirthYear);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    @Test
    public void testValidateBirthYearBad() {
        System.out.println("bad case");
        int playerBirthYear = 2008;
        Mavenproject2 instance = new Mavenproject2();
        boolean expResult = false;
        boolean result = instance.validateBirthYear(playerBirthYear);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    @Test
    public void testValidateBirthYearBoundary() {
        System.out.println("boundary case");
        int playerBirthYear = 2022;
        Mavenproject2 instance = new Mavenproject2();
        boolean expResult = true;
        boolean result = instance.validateBirthYear(playerBirthYear);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
