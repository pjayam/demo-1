package com.crossbridge.toys.practise;

public class MathPractise {
    public static void main(String[] args){
        add(13,20);
        substract(22,13);
        multiply(13,14);
    }

    public static void add(int a, int b){
        System.out.println("Addition value of a="+a + ", b=" +b+" a+b = "+  (a+b));
    }

    public static void substract(int a, int b){
        System.out.println("Substraction value of a="+a + ", b=" +b+" a-b = "+  (a-b));
    }

    public static void multiply(int a, int b){
        System.out.println("Multiplication value of a="+a +",b=" +b+" a*b= " + (a*b));
    }
}
