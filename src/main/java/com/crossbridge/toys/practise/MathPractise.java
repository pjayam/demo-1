package com.crossbridge.toys.practise;

public class MathPractise {
    public static void main(String[] args){
        add(13,20);
        substract(22,13);
        multiply(13,14);
        division(12,5);

        add(10,10,10);
        subtract(100,20,30);
        multiply(11,12,13);
        division(12,4,3);
    }

    public static void add(int a, int b,int c){
        System.out.println("Addition value = "+  (a+b+c));
    }
    public static void subtract(int a,int b,int c){
        System.out.println("subtract value = "+  (a-b-c));
    }
    public static void division(int a ,int b) { System.out.println("division value="+ (a/b));}
     public static void multiply(int a,int b,int c){
        System.out.println("multiply value="+ (a*b*c));
     }
     public static void division(int a,int b,int c){
          System.out.println("division value="+ (a/b/c));
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
