package com.vinayak;

public class varargsinJava {
//    static int sum(int a, int b){
//        return a+b;
//    }
//    static int sum(int a, int b, int c){
//        return a+b+c;
//    }
//    static int sum(int a, int b, int c, int d){
//        return a+b+c+d;
//    }
    // you dont need to write all this methods, even if you are hardworking person
    // use varargs and do smart work!!!!!!
//    static int sum(int ...arr){
//        //Available as int [] arr;
//        int result = 0;
//        for(int element : arr){
//            result += element;
//        }
//        return result;
//    }
    static int sum(int x, int ...arr){
        int result = x;
        for(int e : arr){
            result += e;
        }
        return result;
    }

    public static void main(String[] args) {
//        System.out.println("Welcome to varArgs tutorials");
//        System.out.println("The sum of 4 and 5 is :- " + sum(4,5));
//        System.out.println("The sum of 4, 3 and 5 is :- " + sum(4,3,5));
//        System.out.println("The sum of 2, 4, 3and 5 is :- " + sum(2,4,3,5));
        // Now see the diff
//        System.out.println("The sum of 2, 3, 4, 5, 6, and 7 is :- " + sum(2,3,4,5,6,7));
        // comment out upper souts and also comment out method with only ...arr
        // keep the below sout and method with int a, int ...arr
        System.out.println("The sum of 2, 3, 4, 5, 6, is:-  " + sum(2,3,4,5,6));
    }
}