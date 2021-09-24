package Bai_Thi.controller;

import Bai_Thi.model.Student;
import Bai_Thi.utils.ReadWriteBaiThi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentImlp {
    final String PATH_STUDENT = "C:\\Users\\This PC\\Desktop\\Thien\\Code\\Thien 2\\C0721G1-Nguyen-Duc-Thien\\Module2\\Main_project\\src\\Bai_Thi\\data\\student.csv";
    private boolean isCreated = false;
    int check = 1;

    public void show() {
        List<Student> studentList = ReadWriteBaiThi.getListStudentFromCSV(PATH_STUDENT);
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println((i + 1) + ". " + studentList.get(i));
        }
    }

    public void addStudent() {
        Student student = new Student();
        List<Student> studentList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("nhập tên học sinh " + ((isCreated) ? student.getName() : " ") + ": ");
        student.setName(sc.nextLine());
        //String dateregex="[0-9]\d";
        System.out.println("nhập ngày tháng năm sinh " + ((isCreated) ? student.getDate() : " ") + ": ");
        student.setDate(sc.nextLine());
        // String phonenumberRegex = "090\\d([0-9]{7,10})";
        System.out.println("Nhập số điện thoại " + ((isCreated) ? student.getPhone() : " ") + ": ");
        String phone = "0";
        // while (check1) {
        phone = sc.nextLine();
        //if (phone.matches(phonenumberRegex)) {
        student.setPhone(phone);
        //  check1 = false;
        // } else {
        //   System.out.println("Nhập lại số điện thoại");
        //  }
        // }
        System.out.println("nhập giới tính " + ((isCreated) ? student.getGender() : " ") + ": ");
        student.setGender(sc.nextLine());
        // String nameclassregex = "^[CAP]{1}\\d{4}[GHIKLM]";
        String nameclass = "null";
        System.out.println("Nhập mã lớp học" + ((isCreated) ? student.getCodeclass() : " ") + ": ");
//        boolean check2 = true;
//        while (check2) {
        nameclass = sc.nextLine();
//            if (nameclass.matches(nameclassregex)) {
        student.setCodeclass(nameclass);
//                check2 = false;
//            } else {
//                System.out.println("Nhập lại");
//            }
//        }
        System.out.println("Số thứ tự danh sách " + student.getCodeStudent());

        student.setCodeStudent(check++);

        if (!isCreated) {
            isCreated = true;
        }
        studentList.add(student);
        ReadWriteBaiThi.writeListStudentToCSV(studentList, PATH_STUDENT, true);
    }

    public void removeStudent() {
        List<Student> studentList = ReadWriteBaiThi.getListStudentFromCSV(PATH_STUDENT);
        Scanner scanner = new Scanner(System.in);
        show();
        System.out.println("chọn sinh viên cần xóa");
        int xoa = Integer.parseInt(scanner.nextLine());
        boolean check1 = true;
        while (check1)
            try {
                studentList.get(xoa - 1);
                System.out.println("bạn có chắc xóa sv này?\n1: Xác nhận\n2: Không\n3: về menu");
                int check = Integer.parseInt(scanner.nextLine());
                if (check == 1) {
                    studentList.remove(xoa - 1);
                    ReadWriteBaiThi.writeListStudentToCSV(studentList, PATH_STUDENT, false);
                    show();
                } else if (check == 2) {
                    removeStudent();
                } else {
                    Controller controller = new Controller();
                    controller.displayMainMenu();
                }
                check1 = false;
            } catch (Exception e) {
                System.out.println("Không tồn tại");
                break;
            }
    }

    public void search() {
        List<Student> studentList = ReadWriteBaiThi.getListStudentFromCSV(PATH_STUDENT);
        Scanner scanner = new Scanner(System.in);
        show();
        System.out.println("chọn sinh viên cần tìm");
        String namestudent = scanner.nextLine();
        for (int i = 0; i < studentList.size(); i++) {
            if (namestudent.equals(studentList.get(i).getName())) {
                System.out.println(studentList.get(i));
            } else {
                System.out.println("không tìm thấy");
            }
        }
    }
}