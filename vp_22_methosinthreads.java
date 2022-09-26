package com.vinayak;

class Thr1 extends Thread{
    public Thr1(String name){
        super(name);
    }
    public void run() {
        int i = 0;
        while (i<100) {
            System.out.println("Thank you " + this.getName());
            i++;
        }
    }
}

class Thr2 extends Thread{
    public void run(){
        while(true){
            System.out.println("Hi 3000 bro Vinayak ");
        }
    }
}
public class threads_methods {
    public static void main(String[] args) {
         Thr1 t1 = new Thr1("VInayak");
         Thr1 t2 = new Thr1("JOHN");
         t1.start();
         try{
         t1.join(); // it will not start t2 till t1 ends!!!!!!
         }
         catch (Exception e){
             System.out.println(e);
         }
         t2.start();
    }
}