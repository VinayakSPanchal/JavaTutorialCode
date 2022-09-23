package com.vinayak;

interface Bicycle{
        int a = 33;
        void applyBrake(int decrement);
        void speedUp(int increment);
    }
    interface HornBicycle{
        void blowHornK3G();
        void blowHornMHN();
    }

class AvonCycle implements Bicycle{
    public void applyBrake(int decrement){
        System.out.println("Applying brake...");
    }
    public void speedUp(int increment){
        System.out.println("Speeding up dhoom machale dhoom machale");
    }
    void blowHorn(){
        System.out.println("Pee Pee Pee Pee");
    }
}

    class AvonCycle1 implements Bicycle, HornBicycle{
        public void applyBrake(int decrement){
            System.out.println("Applying brake...");
        }
        public void speedUp(int increment){
            System.out.println("Speeding up dhoom machale dhoom machale");
        }
        public void blowHornK3G(){
            System.out.println("Kabhi khushi kabhi gam...");
        }
        public void blowHornMHN() {
            System.out.println("Main hu na...");
        }
    }

  public class abstract_vs_interfaces{
     public static  void main(String[] args){
        AvonCycle c = new AvonCycle();
        c.applyBrake(5);
        c.speedUp(5);
        /* You can create properties in Interfaces,
        But, You cannot modify the properties in Interfaces as they are final
         */
        System.out.println(c.a); // you cannot modify a
        // c.a = 45; // Throws a error
        AvonCycle1 newC = new AvonCycle1();
        newC.blowHornK3G();
        newC.blowHornMHN();
    }
}