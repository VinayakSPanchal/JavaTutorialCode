package com.vinayak;
public class Main{
    static int logic(int x, int y){
        int z;
        if(x>y){
            z = x+y;
        }
        else{
            z = (x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {
        int a =5;
        int b = 4;
        int c;
        c = logic(a, b);
        System.out.println("The value is :- " + c);
    }
} 