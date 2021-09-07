package Furuma_Resort_Case_Study.models;

import java.util.Scanner;

public class Customer extends Person {
    private String Name;
    private int Age;
    private String Address;
    private int Phone;
    private int CMND;
    private String Gender;
    private String Email;
    private int CustomerID;
    public Customer(){}
 Scanner in=new Scanner(System.in);
    public String getName() {
        return Name;
    }

    public int getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(int customerID) {
        CustomerID = customerID;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getCMND() {
        return CMND;
    }

    public void setCMND(int CMND) {
        this.CMND = CMND;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int phone) {
        Phone = phone;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }
    public int CustomerID(){
        CustomerID=Integer.parseInt(in.nextLine());
        setCustomerID(CustomerID);
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
        Name=in.nextLine();
        setName(Name);
        return getName();
    }

    @Override
    public int Age() {
        Age=Integer.parseInt(in.nextLine());
        setAge(Age);
        return getAge();
    }

    @Override
    public String Address() {
        Address=in.nextLine();
        setAddress(Address);
        return getAddress();
    }

    @Override
    public int Phone() {
        Phone=Integer.parseInt(in.nextLine());
        setPhone(Phone);
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
        Gender=in.nextLine();
        setGender(Gender);
        return getGender();
    }

    @Override
    public String Email() {
        return null;
    }
}
