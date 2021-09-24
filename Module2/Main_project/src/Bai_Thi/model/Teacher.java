package Bai_Thi.model;

public class Teacher extends Person {
    private String codeTeacher;
        public Teacher(){}
    public String getCodeTeacher() {
        return codeTeacher;
    }

    public void setCodeTeacher(String codeTeacher) {
        this.codeTeacher = codeTeacher;
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
        return "Teacher{" +
                "codeTeacher='" + codeTeacher + '\'' +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", gender='" + gender + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
    public Teacher(String name,String date, String phone, String gender,String codeTeacher) {
        this.name=name;
        this.date=date;
        this.phone=phone;
        this.gender=gender;
        this.codeTeacher = codeTeacher;
    }
    public String getStringToWrite(){
        return this.name+","+this.date+","+this.phone+","+this.gender+","+this.codeTeacher;
    }
}
