package com.example.javaproject;

public class MethodOverloading {
    public static void main(String[] args) {

        sayHello();
        sayHello("Kukuh");
        sayHello("Kukuh","Pradipto");
    }

    static void sayHello(){
        System.out.println("Hay");
    }

    static void sayHello(String name){
        System.out.println("hello "+ name);
    }

    static void sayHello(String firstName, String lasName){
        System.out.println("hello " + firstName + " " + lasName);
    }
}
