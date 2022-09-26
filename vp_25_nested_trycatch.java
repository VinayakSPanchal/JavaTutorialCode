package com.vinayak;

import java.util.Scanner;

public class nestedtrycatch {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0] = 100;
        marks[1] = 120;
        marks[2] = 130;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter index no.:- ");
        int ind = sc.nextInt();
        try{
            System.out.println("Welcome to video no.82");
            try{
                System.out.println(marks[ind]);
            }
            catch(ArrayIndexOutOfBoundsException a){
                System.out.println("Exception at level 2");
                System.out.println("Sorry this index is out of scope of the array!");
            }
        }
        catch(Exception e){
            System.out.println("Exception in level 1");
        }
    }
}