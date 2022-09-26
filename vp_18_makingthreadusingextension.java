package com.vinayak;

class MyThread1 extends Thread{
    @Override
    public void run(){
       while(true){
           System.out.println("I am cooking Rice....");
       }

    }
}

class MyThread2 extends Thread{
    @Override
    public void run() {
        while (true) {
            System.out.println("I am chatting with my friend...");
        }
    }
}
public class makingthreadbyextension {
    public static void main(String[] args) {
       MyThread1 t1 = new MyThread1();
       MyThread2 t2 = new MyThread2();
       t1.start();
       t2.start();
    }

}