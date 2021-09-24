package Bai_Thi.model;

public class Student extends Person {

    private String codeclass;
    private int codeStudent=0;
    public Student(){}
    public Student(String name,String date, String phone, String gender,String codeclass, int codeStudent) {
        this.name=name;
        this.date=date;
        this.phone=phone;
        this.gender=gender;
        this.codeclass = codeclass;
        this.codeStudent = codeStudent;
    }

    public String getCodeclass() {
        return codeclass;
    }

    public void setCodeclass(String codeclass) {
        this.codeclass = codeclass;
    }

    public int getCodeStudent() {
        return codeStudent;
    }

    public void setCodeStudent(int codeStudent) {
        this.codeStudent = codeStudent;
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getPhone() {
        return super.getPhone();
    }

    @Override
    public void setGender(String gender) {
        super.setGender(gender);
    }

    @Override
    public String getGender() {
        return super.getGender();
    }

    @Override
    public String getDate() {
        return super.getDate();
    }

    @Override
    public void setDate(String date) {
        super.setDate(date);
    }

    @Override
    public void setPhone(String phone) {
        super.setPhone(phone);
    }

    @Override
    public String toString() {
        return "Student{" +
                "codeclass='" + codeclass + '\'' +
                ", codeStudent=" + codeStudent +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", gender='" + gender + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }




    public String getStringToWrite(){
        return this.name+","+this.date+","+this.phone+","+this.gender+","+this.codeclass+","+this.codeStudent;
    }
}
