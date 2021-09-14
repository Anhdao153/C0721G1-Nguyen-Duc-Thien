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

    public Employee(int staffId, String name, int age, String address, int phone, int CMND, String gender, String email, double salary, long birthday, String position, String educateAndexperience) {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    @Override
    public long getBirthday() {
        return birthday;
    }
    @Override
    public void setBirthday(long birthday) {
        this.birthday = birthday;
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
    public String getGender() {
        return super.getGender();
    }

    @Override
    public void setGender(String gender) {
        super.setGender(gender);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public int getCMND() {
        return super.getCMND();
    }

    @Override
    public int getPhone() {
        return super.getPhone();
    }

    @Override
    public String getAddress() {
        return super.getAddress();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setAddress(String address) {
        super.setAddress(address);
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public void setCMND(int CMND) {
        super.setCMND(CMND);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setPhone(int phone) {
        super.setPhone(phone);
    }
    @Override
    public String toString() {
        return "Employee{" +
                "staffId=" + staffId +
                ", salary=" + salary +
                ", birthday=" + birthday +
                ", position='" + position + '\'' +
                ", educateAndexperience='" + educateAndexperience + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                ", CMND=" + CMND +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}