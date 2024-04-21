package org.example;

import java.util.*;
import java.util.stream.Collectors;

class Employee implements Comparable<Employee>{
    String id;
    int age;
    String firstName;
    String lastName;

    public Employee(String id, int age, String firstName, String lastName)  {
        this.id = id;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return  this.firstName.compareTo(o.getFirstName());
    }

    //static class SortingByAge implements Comparator<Employee>{


       // @Override
        //public int compare(Employee o1, Employee o2) {

            //if(o1.getAge() > o2.getAge()) return 1;
            //else if (o1.getAge() == o2.getAge()) return 0;
           // else return  -1;
        //}

    }
    //static class SortingByName implements  Comparator<Employee>{

      //  @Override
        //public int compare(Employee o1, Employee o2) {
        //    return Integer.compare(o1.age, o2.getAge());
       // }
    //}


public class PriorityQueueEx {
    public static void main(String[] args) {

        PriorityQueue<Employee> employees = new PriorityQueue<>();

        employees.add(new Employee("DDO1",20,"A","A"));
        employees.add(new Employee("DDO2",87,"B","B"));
        employees.add(new Employee("DDO3",26,"C","C"));


    }
}
