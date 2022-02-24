package com.example;

public class TestClass {
    
    public static void main(String args[]) {
        //Create an instance of ComputeMethods, 
        //invoke the 3 methods and dispay their results
        ComputeMethods com = new ComputeMethods();
        System.out.println(com.fToC(32));
        System.out.println(com.hypotenuse(3, 4));
        System.out.println(com.roll());
    }
}
