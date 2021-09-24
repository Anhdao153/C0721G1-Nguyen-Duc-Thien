package Bai_Thi.utils;

import Bai_Thi.model.Student;
import Bai_Thi.model.Teacher;
import Furuma_Resort_Case_Study.models.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteBaiThi {
    private static void writeListStringToCSV(List<String> stringList, String path, boolean append){
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file,append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String line: stringList){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Lỗi  ghi file");
        }
    }
    private static List<String> readCSV(String path){
        File file = new File(path);
        List<String> listString = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line="";
            while ((line=bufferedReader.readLine())!=null){
                listString.add(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Lỗi đọc  file");
        }
        return listString;
    }
    public static void writeListStudentToCSV(List<Student> studentList, String path, boolean append){
        List<String> stringList =new ArrayList<>();
        for (Student Student : studentList){
            stringList.add(Student.getStringToWrite());
        }
        writeListStringToCSV(stringList,path,append);
    }

    public static List<Student> getListStudentFromCSV(String path){
        List<Student> studentList =new ArrayList<>();
        List<String> stringList =readCSV(path);
        for (String line : stringList){
            String[] array = line.split(",");
            Student student = new Student(array[0],array[1],array[2],array[3],array[4],Integer.parseInt(array[5]));
            studentList.add(student);
        }
        return studentList;
    }
    public static void writeListTeacherToCSV(List<Teacher> teacherList, String path, boolean append){
        List<String> stringList =new ArrayList<>();
        for (Teacher teacher : teacherList){
            stringList.add(teacher.getStringToWrite());
        }
        writeListStringToCSV(stringList,path,append);
    }

    public static List<Teacher> getListTeacherFromCSV(String path){
        List<Teacher> teacherList =new ArrayList<>();
        List<String> stringList =readCSV(path);
        for (String line : stringList){
            String[] array = line.split(",");
            Teacher teacher = new Teacher(array[0],array[1],array[2],array[3],array[4]);
            teacherList.add(teacher);
        }
        return teacherList;
    }
}
