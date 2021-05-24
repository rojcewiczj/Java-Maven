package com.qa;

import com.qa.Calculator.calculator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {   
        calculator calc = new calculator();
        System.out.println(calc.Use(3,2,"+"));
       
    }
}
