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
    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
    @Override
    public String toString() {
        return "Customer{" +
                "customerID=" + customerID +
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
        return this.name+","+this.age+","+this.address+","+
                this.phone+","+this.CMND+","+this.gender+","+this.email+
                ","+this.customerID+","+ this.birthday;
    }
}
