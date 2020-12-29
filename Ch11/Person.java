package Horsy.com.company.Ch11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;


public class Person {
    String name;
    String address;
    int telephoneNumber;
    String email;

    public String toString(){
        name = "Terri";
        return "Class name: " + getClass().getSimpleName() +
                ", Person name: " + name;
    }
}

class Student extends Person {
    final String[] classStatus = {"Freshman","Sophomore", "Junior", "Senior" };
    ArrayList<String> status = new ArrayList<>(Arrays.asList(classStatus));

    @Override
    public String toString(){
        name = "Cami";
        return "Class name: " + getClass().getSimpleName() +
                ", Student name: " + name;
    }

}

class Employee extends Person {
    boolean hasOffice;
    double salary;
    Date dateHired;

    @Override
    public String toString(){
        name = "Tabby";
        return "Class name: " + getClass().getSimpleName() +
                ", Employee name: " + name;
    }

}

class Faculty extends Employee{
    int officeHours;
    int tierRank;

    @Override
    public String toString(){
        name = "Dominic";
        return "Class name: " + getClass().getSimpleName() +
                ", Faculty name: " + name;
    }
}

class Staff extends Employee{
    String title;

    @Override
    public String toString(){
        name = "Remi";
        return "Class name: " + getClass().getSimpleName() +
                ", Staff name: " + name;
    }
}

class Main{
    public static void main(String[] args) {
        Person Mark = new Person();
        object(new Person());
        object(new Student());
        object(new Employee());
        object(new Faculty());
        object(new Staff());

    }

    public static void object(Object x){
        System.out.println(x.toString());
    }
}
