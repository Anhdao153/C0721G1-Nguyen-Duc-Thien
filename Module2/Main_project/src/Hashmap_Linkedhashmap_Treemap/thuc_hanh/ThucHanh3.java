package Hashmap_Linkedhashmap_Treemap.thuc_hanh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ThucHanh3 implements Comparable<ThucHanh3> {

    private String name;
    private Integer age;
    private String address;

    public ThucHanh3(String name, Integer age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(ThucHanh3 student) {
        return this.getName().compareTo(student.getName());
    }
    public static class AgeComparator implements Comparator<ThucHanh3> {
        @Override
        public int compare(ThucHanh3 o1, ThucHanh3 o2) {
            if(o1.getAge() > o2.getAge()){
                return 1;
            }else if(o1.getAge() == o2.getAge()){
                return 0;
            }else{
                return -1;
            }
        }
    }
    public static void main(String[] args) {
        ThucHanh3 student = new ThucHanh3("Kien", 30, "HT");
        ThucHanh3 student1 = new ThucHanh3("Nam", 26, "HN");
        ThucHanh3 student2 = new ThucHanh3("Anh", 38, "HT" );
        ThucHanh3 student3 = new ThucHanh3("Tung", 38, "HT" );

        List<ThucHanh3> lists = new ArrayList<ThucHanh3>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        for(ThucHanh3 st : lists){
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists,ageComparator);
        System.out.println("So sanh theo tuoi:");
        for(ThucHanh3 st : lists){
            System.out.println(st.toString());
        }
    }
}
