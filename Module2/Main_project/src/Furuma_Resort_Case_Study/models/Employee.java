package Furuma_Resort_Case_Study.models;

import java.util.Date;
import java.util.Scanner;

public class Employee extends Person {
    private String name;
    private int age;
    private String address;
    private int phone;
    private int CMND;
    private String gender;
    private int staffId;
    private double salary;
    private String email;
    private long birthday;
    private String position;
    private String educateAndexperience;

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

    public long getBirthday() {
        return birthday;
    }

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

    Scanner in=new Scanner(System.in);
    public Employee(){}
    public String getName() {
        return name;
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
    public long Brithday(){
        birthday =Date.parse(in.nextLine());
        return getBirthday();
    }
    public String EducateAndExperience() {
        System.out.println("Nhập trình độ học vấn Trung cấp, Cao đẳng, Đại học và sau đại học");
        System.out.println("Và kinh nghiệm làm việc, nếu có");
        System.out.println("Ghi theo format| (Trình độ học vấn) Và đã có (Kinh nghiệm làm việc)");
        educateAndexperience =in.nextLine();
        setEducateAndexperience(educateAndexperience);
        return getEducateAndexperience();
    }
    public String Position() {
        System.out.println("Nhập vị trí: Lễ tân, phục vụ, chuyên viên, giám sát, quản lý, giám đốc");
        position =in.nextLine();
        setPosition(position);
        return getPosition();
    }
    @Override
    public String Email() {
        System.out.println("Nhập Email nhân viên");
        email =in.nextLine();
        setEmail(email);
        return getEmail();
    }
    public double Salary(){
        System.out.println("Nhập tiền lương cho nhân viên");
        salary =Double.parseDouble(in.nextLine());
        setSalary(salary);
        return getSalary();
    }
    public int IDStaff(){
        System.out.println("nhập id của nhân viên");
        staffId =Integer.parseInt(in.nextLine());
        setStaffId(staffId);
        return getStaffId();
    }
    @Override
    public String Name() {
        System.out.println("Nhập tên nhân viên");
        name =in.nextLine();
        setName(name);
        return getName();
    }

    @Override
    public int Age() {
        System.out.println("Nhập độ tuổi");
        age =Integer.parseInt(in.nextLine());
        setAge(age);
        return getAge();
    }

    @Override
    public String Address() {
        System.out.println("Nhập địa chỉ cư trú");
        address =in.nextLine();
        setAddress(address);
        return getAddress();
    }

    @Override
    public int Phone() {
        System.out.println("Nhập số điện thoại");
        phone =Integer.parseInt(in.nextLine());
        setPhone(phone);
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
        gender =in.nextLine();
        setGender(gender);
        return getGender();
    }}
