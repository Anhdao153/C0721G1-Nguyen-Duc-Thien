package Test;

import java.util.Scanner;

public class Add {
    public static Student[] studentlist =new Student[100];
    static{
        studentlist[0]=new Student("thien",21);
    }
    public static void add(){


        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập tên của bạn:");

        String name = scanner.nextLine();

        System.out.println("nhập tuổi của bạn:");

        int age = Integer.parseInt(scanner.nextLine());

        Student student = new Student(name,age);


        for (int i=0;i<studentlist.length;i++){
            if (studentlist[i]==null){
                studentlist[i]= student;
                break;
            }
        }
        System.out.println(student);
        System.out.println("các dữ liệu hiện đang có sẫn");


    }
    public static void show() {
        for (int i = 0; i < studentlist.length - 1; i++) {
            System.out.println(studentlist[i].toString());
        }
    }








}
