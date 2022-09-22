package com.vinayak;

class A{
    public int a;
    public int meth1(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am meth2 of class A");
    }
}

class B extends A{
    public void meth3(){
        System.out.println("I am meth3 of class B");
    }
    @Override
    public void meth2(){
        System.out.println("I am a meth2 of class B i am overriding meth 2 of class A");
    }
}
public class methodoverriding {
    public static void main(String[] args) {
        //A a = new A();
        B b = new B();
         b.meth2(); // overriding meth2 in class A
        // Remember you cannot override static method and final method
    }
}