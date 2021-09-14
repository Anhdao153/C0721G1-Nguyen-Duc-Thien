package Furuma_Resort_Case_Study.models;

import java.util.Scanner;

public class Customer extends Person {
    private int customerID;
    public Customer(){}
    public Customer( String name, int age, String address, int phone, int CMND, String gender, String email,int customerID,long birthday) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
        this.CMND = CMND;
        this.gender = gender;
        this.email = email;
        this.customerID=customerID;
        this.birthday = birthday;
    }

    @Override
    public long getBirthday() {
        return super.getBirthday();
    }

    @Override
    public void setBirthday(long birthday) {
        super.setBirthday(birthday);
    }
    @Override
    public String getName() {
        return name;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
    @Override
    public String getEmail() {
        return email;
    }
    @Override
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public int getAge() {
        return age;
    }
    @Override
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String getAddress() {
        return address;
    }
    @Override
    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public int getCMND() {
        return CMND;
    }
    @Override
    public void setCMND(int CMND) {
        this.CMND = CMND;
    }
    @Override
    public int getPhone() {
        return phone;
    }
    @Override
    public void setPhone(int phone) {
        this.phone = phone;
    }
    @Override
    public String getGender() {
        return gender;
    }
    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }
}
