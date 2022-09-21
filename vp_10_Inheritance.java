package com.vinayak;

class Base{
    int x;

    public int getX() {
        System.out.println("I am in base and setting x now");
        return x;
    }

    public void setX(int x) {
        System.out.println("Welcome to the base");
        this.x = x;
    }
}

class Derived extends Base{ // use extends keyword to inherit
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class inheritance {
    public static void main(String[] args) {
         //Base b = new Base();
//        b.setX(4);
//        System.out.println(b.getX());
        Derived d = new Derived(); // you can access setX through derived also
         d.setX(4);
        System.out.println(d.getX());
    }
}