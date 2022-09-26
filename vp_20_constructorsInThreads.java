package com.vinayak;

class MyThr extends Thread{
    public MyThr(String name ){
        super(name);
    }
    public void run(){
        int i = 12;
        System.out.println("thank you");
//        while(true){
//            System.out.println("I am a thread");
//        }
    }
}
public class threadconstructor {
    public static void main(String[] args) {
        MyThr t = new MyThr("Vinayak");
        t.start();
        System.out.println("The id of the thread is:- " + t.getId());
        System.out.println("The id of the thread is:- " + t.getName());
    }
}