package com.vinayak;

abstract class Fif{   // Even if you have one abstract method in  a class, it will make the entire class abstract. Like a negative thought at the start of the day may make whole day bad
    public Fif(){
        System.out.println("I am a constructor from Fif class");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();

}

class Gig extends Fif{
    @Override // here I override it, but instead of this you can also make Gig abstract
    public void greet(){
        System.out.println("Good morning");
    }
}

class
public class abstractclass {
    public static void main(String[] args) {
     // object of abstract class cannot be made
        Gig g = new Gig();
    }
}
