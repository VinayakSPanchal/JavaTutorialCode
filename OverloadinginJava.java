package com.vinayak;

public class overloading {
//    static void tellJoke(){
//        System.out.println("I invented a word called Plagiarism!");
//    }
//    static int myInt(int a){
//        return a;
//    }
//
//    public static void main(String[] args) {
//        tellJoke();
//        int a = 3;
//        int c = myInt(a);
//        System.out.println(c);
//    }
//-------------------------------------------------------------------------------------------------
    static void change(int a){
        a = 99;
    }
    static void change2(int [] arr){
        arr[0] = 99;
    }
    static void foo(){
        System.out.println("Good Morning");
    }
    static void foo(int a){
        System.out.println("Good morning " + a + " bro!");
    }
    static int source(int a){
        return a*a ;
    }


    public static void main(String[] args) {
    int [] marks = {12, 34, 45, 56, 67, 78};
//     int x = 45; // an example of changing the integer
//     change(x);
//        System.out.println("The value of x after running array1 is " + x);
    // -------Let us see what happens in case of array-----
//      change2(marks);
//        System.out.println("The value of x after running change is :- " + marks[0]);
//        System.out.println();

//----------------------------------------------------------------------------------------------------------------------

        //Overloading
        foo();
        foo(3000); // Arguments are actual
        int x = 2;
       // source(x); // If you have return type it will print only when you Sout
        System.out.println(source(x)); // this is right approach
   }
}