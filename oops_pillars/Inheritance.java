package oops_demo;
/*
    Inheritance allows a new class (subclass/child) to acquire the properties
    and behavior of an existing class (superclass/parent) using the extends keyword.
*/



public class Inheritance {
    public static void main(String[] args){
        // Superclass
        class Employee {
            protected double salary = 50000;
        }

        // Subclass
        class Engineer extends Employee {
            private double bonus = 10000;

            public double getTotalCompensation() {
                return salary + bonus; // Inherits salary from Employee
            }
        }

        Engineer engineer = new Engineer();
        System.out.println(engineer.getTotalCompensation());
    }
}
