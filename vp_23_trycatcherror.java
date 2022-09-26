package com.vinayak;

public class errors {
    public static void main(String[] args) {
       double a = 67547;
       double b = 0;
       try{
           double c = a/b;
           System.out.println("The result is:- " + c);
       }
       catch(Exception e){
           System.out.println("We failed to divide. Reason :-  " + e);
       }
        System.out.println("End of the program...");


    }
}