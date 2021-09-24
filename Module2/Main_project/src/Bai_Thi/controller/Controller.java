package Bai_Thi.controller;

import Bai_Thi.model.Student;

import java.util.Scanner;

public class Controller {
    public void displayMainMenu() {
        Scanner in = new Scanner(System.in);
        StudentImlp studentImlp = new StudentImlp();
        TeacherImlp teacherImlp = new TeacherImlp();
        int choice = 0;
        while (choice != 6) {

            System.out.println("1. Thêm mới sinh viên");
            System.out.println("2. Xóa sinh viên");
            System.out.println("3. Xem danh sách sinh viên");
            System.out.println("4. Xem thông tin giáo viên");
            System.out.println("5. Tìm kiếm sinh viên");
            System.out.println("6. Thoát");
            try {
                choice = Integer.parseInt(in.nextLine());
            } catch (Exception e) {
                System.out.println("ERRO!!!\nChỉ được nhập số\nNhập lại");
            }
            switch (choice) {
                case 1:
                    studentImlp.addStudent();
                    System.out.println("Đã thêm");
                    break;
                case 2:
                    studentImlp.removeStudent();
                    System.out.println("Đã xóa");
                    break;
                case 3:
                    studentImlp.show();
                    System.out.println("Đã show");
                    break;
                case 4:
                    teacherImlp.show();
                    System.out.println("Đã show");
                    break;
                case 5:
                    studentImlp.search();
                    break;
                case 6:
                    System.out.println("Bye~~~~~~~~");
                    break;
            }
        }
    }
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.displayMainMenu();
    }
}
