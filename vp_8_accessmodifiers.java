package com.vinayak;

// Problem 1
class Worker{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
       this.name = name;
    }
    public void setSalary(int n){
        this.salary = n;
    }
}

public class oopspracquestions{
    public static void main(String[] args) {
        /* Problem 1 : Create a class Worker with following
        properties and methods :-
        1) Salary(property)(int)
        2) getSalary(method returning int)
        3) name(property)(String)
        4) getName(method returning String)
        5) setName(method changing name)
         */
      Worker John = new Worker();
      John.setName("Hi I am John Carter");
        System.out.println(John.getName());
      John.setSalary(25000);
        System.out.println(John.getSalary());
    }
}