package ru.geekbrains.java1;

import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

public class Employee {
    private String name;
    private String position;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String phone, int salary, int age){
    }
    public String getName() {
        return name;
    }
    public String getPosition() {
        return position;
    }
    public String getPhone() {
        return phone;
    }
    public int getSalary() {
        return salary;
    }
    public int getAge() {
        return age;
    }
    public void namePos(){
        System.out.println(name + " " + position);
    }
}
