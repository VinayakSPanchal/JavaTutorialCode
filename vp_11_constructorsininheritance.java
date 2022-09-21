package com.vinayak;

class Vase{
    Vase(){
        System.out.println("I am a constructor");
    }
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class Inherited extends Vase{
    public int y;
    Inherited(){
        System.out.println("I am a derived class constructor");
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class constructorsinInheritance {
    public static void main(String[] args) {
         Vase v = new Vase();
         Inherited i = new Inherited(); // when inherited didn't had constructor it printed constructed of vase class
                                        // but when inherited class got its own constructor
                                      // then it printed vase class constructor + inherited vase class constructor + its own constructor
        
    }
}