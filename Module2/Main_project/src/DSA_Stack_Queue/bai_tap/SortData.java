package DSA_Stack_Queue.bai_tap;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.*;
public class SortData {
    public static class Hocsinh implements Comparable<Hocsinh> {
        String name;
        int age;
        String sex;

        public Hocsinh() {

        }

        public Hocsinh(String name, int age, String sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

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

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        @Override
        public String toString() {
            return "hocsinh{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", sex='" + sex + '\'' +
                    '}';
        }


        @Override
        public int compareTo(Hocsinh o) {

            return o.getAge()- this.getAge();
        }
    }

    public static void main(String[] args) {
        List<Hocsinh> hocsinhlist = new ArrayList<>();

        hocsinhlist.add(new Hocsinh("nguyễn thanh tuấn", 15, "nam"));
        hocsinhlist.add(new Hocsinh("nguyễn thanh thúy", 25, "nữ"));
        hocsinhlist.add(new Hocsinh("nguyễn thanh mai", 29, "nữ"));

        Collections.sort(hocsinhlist);

        Queue Nam= new ArrayDeque();
        Queue Nu= new ArrayDeque();
        for (Hocsinh hocsinh:hocsinhlist){
            if(hocsinh.getSex().equals("nam")){
                Nam.add(hocsinh);
            } else{
                Nu.add(hocsinh);
            }
        }
        List hocsinhSort=new ArrayList();
        while (!Nu.isEmpty()){
            hocsinhSort.add(Nu.remove());
        }
        while (!Nam.isEmpty()) {
            hocsinhSort.add(Nam.remove());
        }
        for (Object person : hocsinhSort){
            System.out.println(person);
        }
    }


}
