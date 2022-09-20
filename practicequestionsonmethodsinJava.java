package com.vinayak;

public class practiceonmethodsinJava {
    // P1
//    static void multiplication(int n){
//        for(int i =1; i<=10;i++){
//            System.out.printf("%d x %d = %d \n", n, i, n*i);
//        }
//    }
//---------------------------------------------------------------------------

      // P2
//    static void pattern1(int n){
//        for(int i = 0; i<=n; i++){
//            for(int j = 0; j<i-1; j++){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//    }
//-------------------------------------------------------------------------------------------------

       // P3
   static int sumRec(int n) {
       if (n == 1) {
           return 1;
       }
       return n + sumRec(n - 1);
   }

    public static void main(String[] args) {
     /* P1 : Write a java method to print multiplication
      table of a number n */
//        multiplication(7); //😎
//--------------------------------------------------------------------
     /* P2 : Print the pattern
         *
         * *
         * * *
         * * * *
      */
//      pattern1(5); //🚀
//-------------------------------------------------------------------------------------------------
    /* P3 : Write a recursive function to calculate sum of
       first natural numbers
     */
        int c = sumRec(3);
        System.out.println(c);
        }
    }