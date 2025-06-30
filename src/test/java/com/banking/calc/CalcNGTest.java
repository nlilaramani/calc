/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.banking.calc;

import org.testng.annotations.Test;
import static org.testng.Assert.*;
import org.testng.annotations.Parameters;

/**
 *
 * @author itexps
 */
public class CalcNGTest {

    @Test
    public void testAdd(){
        System.out.println("Test NG - add");
        double num1 = 10.0;
        double num2 = 20.0;
        Calculator instance = new Calculator();
        double expResult = 30.0;
        double result = instance.add(num1, num2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
    }
    @Parameters({"num1","num2"})
    @Test
    public void testSub(double num1, double num2){
        System.out.println("Test NG - add");
        Calculator instance = new Calculator();
        double expResult = 0.0;
        double result = instance.subtract(num1, num2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
    }
    
}
