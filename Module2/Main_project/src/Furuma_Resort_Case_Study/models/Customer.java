package Furuma_Resort_Case_Study.models;

import java.util.Scanner;

public class Customer extends Person {
    private String name;
    private int age;
    private String address;
    private int phone;
    private int CMND;
    private String gender;
    private String email;
    private int customerID;
    public Customer(){}
 Scanner in=new Scanner(System.in);
    public String getName() {
        return name;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCMND() {
        return CMND;
    }

    public void setCMND(int CMND) {
        this.CMND = CMND;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public int CustomerID(){
        customerID =Integer.parseInt(in.nextLine());
        setCustomerID(customerID);
        return getCustomerID();
    }
    public String TypeCustomer(){
        int Type=Integer.parseInt(in.nextLine());
        String typecustomer="null";
        switch (Type){
            case 1:
                System.out.println("Khách hạng Diamound");
                typecustomer="Khách hạng Diamound";
                break;
            case 2:
                System.out.println("Khách hạng Plantinium");
                typecustomer="Khách hạng Plantinium";
                break;
            case 3:
                System.out.println("Khách hạng Gold");
                typecustomer="Khách hạng Gold";
                break;
            case 4:
                System.out.println("Khách hạng Silver");
                typecustomer="Khách hạng Silver";
                break;
            case 5:
                System.out.println("Khách hạng Member");
                typecustomer="Khách hạng Member";
                break;
        }
        return typecustomer;
    }
    @Override
    public String Name() {
        name =in.nextLine();
        setName(name);
        return getName();
    }

    @Override
    public int Age() {
        age =Integer.parseInt(in.nextLine());
        setAge(age);
        return getAge();
    }

    @Override
    public String Address() {
        address =in.nextLine();
        setAddress(address);
        return getAddress();
    }

    @Override
    public int Phone() {
        phone =Integer.parseInt(in.nextLine());
        setPhone(phone);
        return getPhone();
    }

    @Override
    public int CMND() {
        CMND=Integer.parseInt(in.nextLine());
        setCMND(CMND);
        return getCMND();
    }

    @Override
    public String Gender() {
        gender =in.nextLine();
        setGender(gender);
        return getGender();
    }

    @Override
    public String Email() {
        return null;
    }
}
