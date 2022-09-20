package com.vinayak;
class Employee{ // access modifier is public by default
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.println("My id is  " + id);
        System.out.println("My name is " + name);
        System.out.println("My salary is " + salary);
    }
}
public class customClassinJava {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee John = new Employee(); // Instantiating a new Employee Object
        //Setting attributes for John 📌
        John.id = 45;
        John.name = "John Carter";
        John.salary = 12000;
        System.out.println(John.id);
        System.out.println(John.name);
        John.printDetails();

        Employee Peter = new Employee();
        // Setting attributes for Peter 📌
        Peter.id = 13;
        Peter.name = "Peter Parker";
        Peter.salary = 25000;
        Peter.printDetails();
    }
}
