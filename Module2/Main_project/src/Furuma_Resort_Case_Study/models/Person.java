package Furuma_Resort_Case_Study.models;

public abstract class Person {
    public  String name;
    public  int age;
    public  String address;
    public  int phone;
    public  int CMND;
    public  String gender;
    public  String email;
    public  long birthday;

    public long getBirthday() {
        return birthday;
    }

    public void setBirthday(long birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this. age = age;
    }

    public int getCMND() {
        return CMND;
    }

    public int getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public void setAddress(String address) {
        this. address = address;
    }

    public void setCMND(int CMND) {
        this.CMND = CMND;
    }

    public void setEmail(String email) {
        this. email = email;
    }

    public void setGender(String gender) {
        this.  gender = gender;
    }

    public void setPhone(int phone) {
    this.phone = phone;
    }
}
