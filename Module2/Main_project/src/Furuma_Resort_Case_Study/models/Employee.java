package Furuma_Resort_Case_Study.models;

import java.util.Date;
import java.util.Scanner;

public class Employee extends Person {
    private String Name;
    private int Age;
    private String Address;
    private int Phone;
    private int CMND;
    private String Gender;
    private int StaffId;
    private double Salary;
    private String Email;
    private long Birthday;
    private String Position;
    private String EducateAndExperience;

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public long getBirthday() {
        return Birthday;
    }

    public void setBirthday(long birthday) {
        Birthday = birthday;
    }

    public String getEducateAndExperience() {
        return EducateAndExperience;
    }

    public void setEducateAndExperience(String educateAndExperience) {
        EducateAndExperience = educateAndExperience;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public int getStaffId() {
        return StaffId;
    }

    public void setStaffId(int staffId) {
        StaffId = staffId;
    }

    Scanner in=new Scanner(System.in);
    public Employee(){}
    public String getName() {
        return Name;
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
    public long Brithday(){
        Birthday=Date.parse(in.nextLine());
        return getBirthday();
    }
    public String EducateAndExperience() {
        System.out.println("Nhập trình độ học vấn Trung cấp, Cao đẳng, Đại học và sau đại học");
        System.out.println("Và kinh nghiệm làm việc, nếu có");
        System.out.println("Ghi theo format| (Trình độ học vấn) Và đã có (Kinh nghiệm làm việc)");
        EducateAndExperience=in.nextLine();
        setEducateAndExperience(EducateAndExperience);
        return getEducateAndExperience();
    }
    public String Position() {
        System.out.println("Nhập vị trí: Lễ tân, phục vụ, chuyên viên, giám sát, quản lý, giám đốc");
        Position=in.nextLine();
        setPosition(Position);
        return getPosition();
    }
    @Override
    public String Email() {
        System.out.println("Nhập Email nhân viên");
        Email=in.nextLine();
        setEmail(Email);
        return getEmail();
    }
    public double Salary(){
        System.out.println("Nhập tiền lương cho nhân viên");
        Salary=Double.parseDouble(in.nextLine());
        setSalary(Salary);
        return getSalary();
    }
    public int IDStaff(){
        System.out.println("nhập id của nhân viên");
        StaffId=Integer.parseInt(in.nextLine());
        setStaffId(StaffId);
        return getStaffId();
    }
    @Override
    public String Name() {
        System.out.println("Nhập tên nhân viên");
        Name=in.nextLine();
        setName(Name);
        return getName();
    }

    @Override
    public int Age() {
        System.out.println("Nhập độ tuổi");
        Age=Integer.parseInt(in.nextLine());
        setAge(Age);
        return getAge();
    }

    @Override
    public String Address() {
        System.out.println("Nhập địa chỉ cư trú");
        Address=in.nextLine();
        setAddress(Address);
        return getAddress();
    }

    @Override
    public int Phone() {
        System.out.println("Nhập số điện thoại");
        Phone=Integer.parseInt(in.nextLine());
        setPhone(Phone);
        return getPhone();
    }

    @Override
    public int CMND() {
        System.out.println("Nhập căn cước công dân");
        CMND=Integer.parseInt(in.nextLine());
        setCMND(CMND);
        return getCMND();
    }

    @Override
    public String Gender() {
        System.out.println("Nhập giới tính");
        Gender=in.nextLine();
        setGender(Gender);
        return getGender();
    }}
