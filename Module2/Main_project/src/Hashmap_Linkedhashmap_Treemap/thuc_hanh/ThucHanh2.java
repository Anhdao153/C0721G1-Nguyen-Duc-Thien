package Hashmap_Linkedhashmap_Treemap.thuc_hanh;

import Test.Student;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ThucHanh2 {
    private String name;
    private int age;
    private String address;
    public ThucHanh2(){

    }
    public ThucHanh2(String name,int age,String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "ThucHanh2{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", address='" + getAddress() + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ThucHanh2 student1 = new ThucHanh2("Nam",20, "HN");
        ThucHanh2 student2 = new ThucHanh2("Hung",21, "HN");
        ThucHanh2 student3 = new ThucHanh2("Ha",22, "HN");
        Map<Integer,ThucHanh2> studentMap=new HashMap<Integer, ThucHanh2>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        studentMap.put(4,student1);
        for (Map.Entry<Integer,ThucHanh2> student:studentMap.entrySet()){
            System.out.println(student.toString());
        }

        System.out.println("...............set");
        Set<ThucHanh2> students= new HashSet<ThucHanh2>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);
        for (ThucHanh2 student: students){
            System.out.println(student.toString());
        }
    }
}
