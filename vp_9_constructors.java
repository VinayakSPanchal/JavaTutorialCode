package com.vinayak;
class Teammates2{
    private int rollNo;
    private String petName;
    public Teammates2( String myName){
        rollNo = 9999999;
        petName = myName;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}
public class constructors2 {
    public static void main(String[] args) {


        Teammates2 Peter = new Teammates2("Peter Panchal");
        System.out.println(Peter.getPetName());
        System.out.println(Peter.getRollNo());
    }
}