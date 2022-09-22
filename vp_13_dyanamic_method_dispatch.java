package com.vinayak;

class Phone{
    public void greet(){
        System.out.println("Good Morning");
    }
    public void name(){
        System.out.println("My name is Java");
    }

}

class SmartPhone extends Phone{
    public void greet2(){
        System.out.println(" Welcome brother ");
    }
    @Override
    public void name(){
        System.out.println("My name is Java in Class Two");
    }
}
public class dynamic_method_dispatch {
    public static void main(String[] args) {
//        Phone obj = new Phone();
//        SmartPhone sm = new SmartPhone();
        Phone p = new SmartPhone(); // This is called dynamic method dispatch
          p.name();
         // p.greet2(); // method of Smartphone not allowed
        //SmartPhone sp = new Phone(); // not allowed
    }
}