package com.vinayak;
import java.util.Scanner;

public class specificexceptions {
    public static void main(String[] args) {
        int [] marks = new int[5];
        marks[0] = 100;
        marks[1] = 120;
        marks[2] = 130;
        marks[3] = 140;
        marks[4] = 150;
//        marks[5] = 57;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index");
        int ind = sc.nextInt();

        System.out.println("Enter the number to divide");
        int number = sc.nextInt();

        try{
            System.out.println("The value at array index entered is:- " + marks[ind]);
            System.out.println("The value of array-value/number is:- " + marks[ind]/number);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception occurred !");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException a){
            System.out.println("Array Index Out of Bound Exception occurred !");
            System.out.println(a);
        }
        catch(Exception f){
            System.out.println("Some other error");
            System.out.println(f);
        }

    }
}
