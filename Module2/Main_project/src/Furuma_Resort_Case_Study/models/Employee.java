package Furuma_Resort_Case_Study.models;

import java.util.Date;
import java.util.Scanner;

public class Employee extends Person {
    private int staffId;
    private double salary;
    private String position;
    private String educateAndexperience;

    public Employee() {
    }

    public Employee(int staffId, String name, int age, String address, int phone, int CMND, String gender,
                    String email, double salary, long birthday, String position, String educateAndexperience) {
        this.birthday = birthday;
        this.salary = salary;
        this.staffId = staffId;
        this.name = name;
        this.age = age;
        this.address = address;
        this.position = position;
        this.phone = phone;
        this.CMND = CMND;
        this.gender = gender;
        this.educateAndexperience = educateAndexperience;
        this.email = email;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEducateAndexperience() {
        return educateAndexperience;
    }

    public void setEducateAndexperience(String educateAndexperience) {
        this.educateAndexperience = educateAndexperience;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "staffId=" + staffId +
                ", salary=" + salary +
                ", position='" + position + '\'' +
                ", educateAndexperience='" + educateAndexperience + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                ", CMND=" + CMND +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    public String getStringToWrite(){
        return this.staffId+","+this.name+","+this.age+","+this.address+","+
                this.phone+","+this.CMND+","+this.gender+","+this.email+","+this.salary+","+
                this.birthday+","+position+","+this.educateAndexperience;
    }
}