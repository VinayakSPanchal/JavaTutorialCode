package com.vinayak;

interface sampleInterface{
    void meth1();
    void meth2();
}

interface childSampleInterface extends sampleInterface{
    void meth3();
    void meth4();
/* Class cannot extend a interface, but only implement it
  and only interface can inherit/ extend previous interface
 */
}

class AClass implements childSampleInterface{
    @Override
    public void meth1() {
        System.out.println("Hi my name is Vinayak");
    }

    @Override
    public void meth2() {
        System.out.println("I am 19 yrs old");
    }

    @Override
    public void meth3() {
        System.out.println("I love Java");
    }

    @Override
    public void meth4() {
        System.out.println("I wanna be Full Stack Developer");
    }
}
public class inheritance_in_interfaces {
    public static void main(String[] args) {
       AClass A = new AClass();
       A.meth1();
       A.meth2();
       A.meth3();
       A.meth4();
    }
}