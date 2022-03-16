package com.harman.Calculator;

public class Calculator {
    public static void main(String[] args) {
        Sub subobj=new Sub();
        int x = 3;
        int y = 5;
        int c = x + y;
        System.out.println(c);
        int subresult= subobj.sub2numbers(x,y);
        System.out.println(subresult);
    }

}
