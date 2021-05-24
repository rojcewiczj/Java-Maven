package com.qa;

import com.qa.Calculator.calculator;
import com.qa.Tree.Land;
import com.qa.Tree.tree;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {   Land America = new Land();
        tree tree1 = new tree("Oak", America);
        System.out.println(tree1.branches.get(0).length);
       
    }
}
