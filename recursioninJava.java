package com.vinayak;
// A function in java can call itself. Such calling of
// function by itself is called recursion
// Example : Factorial of a number
// factorial(n) = n * factorial(n-1) for all n>= 1 only



public class recursioninjava {
//    static int factorial(int n){ // recursive approach
//        if(n==0 || n==1){
//            return 1;
//        }
//        else{
//            return n * factorial(n-1);
//        }
//    }

    static int factorial_iterative(int n){
          if(n==0 || n==1){
              return 1;
          }
          else{
              int product = 1;
              for (int i = 1; i<=n; i++){
                  product *= i;
              }
              return product;


          }
    }
    public static void main(String[] args) {
        //System.out.println("The value of factorial 5 is:- " + factorial(5));
        System.out.println("The value of factorial 5 using iterative approach is :- " + factorial_iterative(5));
    }
}
