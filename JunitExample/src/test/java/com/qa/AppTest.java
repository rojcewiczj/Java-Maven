package com.qa;

import static org.junit.Assert.assertTrue;

import com.qa.Calculator.calculator;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{    

    public calculator calc = new calculator();
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void isTrue(){
        boolean math = true;
        assertTrue(math);
    }

    @Test
    public void changingTotal(){
        calc.Use(1,2,"+");
        System.out.println(calc.currentTotal);
        assertTrue("calculator is correctly calculating total", calc.currentTotal == 2);
    }
}
