package com.example.javaproject;

public class RecursiveMethod {
    public static void main(String[] args) {

    System.out.println(factorial(5));
    System.out.println(factorialRecursive(8));
    }

    // Factorial Loop
    static int factorial(int value){
        var result = 1;

        for (var counter = 1; counter <= value; counter++){
            result *= counter;
        }
        return result;
    }

    // Factorial ,Recursive
    static int factorialRecursive(int value2){
        if (value2 == 1){
            return 1;
        } else {
            return value2 * factorialRecursive(value2 - 1);
        }
    }

}
