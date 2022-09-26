package com.vinayak;

class Thr extends Thread{
    public Thr(String name){
         super(name);
    }
    public void run() {
        int i = 34;
        while (true) {
            System.out.println("Thank you " + this.getName());
        }
    }
}
public class priorityinthreads {
    public static void main(String[] args) {
        Thr t1 = new Thr("Jai Shree Ram");
        Thr t2 = new Thr("Aum Namah Shivaya");
        Thr t3 = new Thr("Shree Ganeshaya Namah");
        Thr t4 = new Thr("Aum Kali");
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}