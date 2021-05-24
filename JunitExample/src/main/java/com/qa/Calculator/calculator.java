package com.qa.Calculator;

import java.util.*;



public class calculator {
  
    public Integer currentTotal = 0;

    public Integer Use(Integer first, Integer second, String action){
        switch(action){
            case "x":
            currentTotal += (first * second);
            case "+":
            currentTotal += (first + second);
            case "-":
            currentTotal += (first - second);
        }
        return currentTotal;
    }

    public void Clear(){
        currentTotal = 0;
    }
    
       
}
