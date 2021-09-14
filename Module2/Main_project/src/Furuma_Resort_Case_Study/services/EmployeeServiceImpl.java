package Furuma_Resort_Case_Study.services;

import Furuma_Resort_Case_Study.controllers.FuramaController;
import Furuma_Resort_Case_Study.models.Employee;
import Furuma_Resort_Case_Study.utils.ReadWriteCSV;

import java.util.List;
import java.util.Scanner;

import static Furuma_Resort_Case_Study.controllers.FuramaController.selectionmenu;
import static Furuma_Resort_Case_Study.data.data.persons;

public class EmployeeServiceImpl implements EmployeeService {
    final String PATH_EMPLOYEE = "D:\\CODE\\C0721G1-Nguyen-Duc-Thien\\Module2\\Main_project\\src\\Furuma_Resort_Case_Study\\data\\employee_database.csv";
    private boolean isCreated = false;
    public Employee employee1 = new Employee();

    public void displayEmployeeMenu() {
        FuramaController furamaController=new FuramaController();
        int value=0;
        while (true) {
            System.out.println("1 Display list employees\n" +
                    "2 Add new employee\n" +
                    "3 Edit employee\n" +
                    "4 Fire employee\n"+
                    "5 Return main menu");
            value = selectionmenu();
            switch (value) {
                case 1:
                    show();
                    break;
                case 2:
                    add(employee1);
                    persons.add(employee1);
                    ReadWriteCSV.writeListEmployeeToCSV(persons, PATH_EMPLOYEE,true);
                    break;
                case 3:
                    System.out.println("Nhập id mà bạn muốn check:" );
                    edit();
                    break;
                case 4:
                    delete();
                    break;
                case 5:
                    furamaController.displayMainMenu();
                    break;
            }
        }
    }

    @Override
    public void show() {
        List<Employee> employeeList= ReadWriteCSV.getListEmployeeFromCSV(PATH_EMPLOYEE);
        for (int i = 0; i < employeeList.size(); i++) {
            System.out.println((i + 1) + ". " + employeeList.get(i));
        }
    }

    @Override
    public Object edit() {
        //muốn sửa nhiêu hơn thì thêm nhiều .setxxx vào
        List<Employee> employeeList= ReadWriteCSV.getListEmployeeFromCSV(PATH_EMPLOYEE);
        Scanner in = new Scanner(System.in);
        show();
        System.out.println("Chọn nhân viên cần sửa thông tin");
        int choose= Integer.parseInt(in.nextLine());
        System.out.println("Nhập chức danh mới");
        String newPosition=in.nextLine();
        System.out.println("Nhập lương mới");
        double newSalary= Double.parseDouble(in.nextLine());
        System.out.println("nhập địa chỉ mới");
        String newAddress=in.nextLine();
        employeeList.get(choose-1).setPosition(newPosition);
        employeeList.get(choose-1).setSalary(newSalary);
        employeeList.get(choose-1).setAddress(newAddress);
        ReadWriteCSV.writeListEmployeeToCSV(employeeList, PATH_EMPLOYEE,false);
        show();
        return employeeList;
    }
    @Override
    public void add(Object o) {
        Employee employee=new Employee();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your StaffId " + ((isCreated) ? employee.getStaffId() : " ") + ": ");
        employee.setStaffId(Integer.parseInt(sc.nextLine()));

        System.out.println("Enter your name " + ((isCreated) ? employee.name : " ") + ": ");
        employee.name = sc.nextLine();

        System.out.println("Enter your age " + ((isCreated) ? employee.age : " ") + ": ");
        employee.age = Integer.parseInt(sc.nextLine());

        System.out.println("Enter your address " + ((isCreated) ? employee.address : " ") + ": ");
        employee.address = sc.nextLine();

        System.out.println("Enter your phone " + ((isCreated) ? employee.phone : " ") + ": ");
        employee.phone = Integer.parseInt(sc.nextLine());

        System.out.println("Enter your CMND " + ((isCreated) ? employee.CMND : " ") + ": ");
        employee.CMND = Integer.parseInt(sc.nextLine());

        System.out.println("Enter your gender " + ((isCreated) ? employee.gender : " ") + ": ");
        employee.gender = sc.nextLine();

        System.out.println("Enter your email " + ((isCreated) ? employee.email : " ") + ": ");
        employee.email = sc.nextLine();

        System.out.println("Enter your salary " + ((isCreated) ? employee.getSalary() : " ") + ": ");
        employee.setSalary(Integer.parseInt(sc.nextLine()));

        System.out.println("Enter your birth year " + ((isCreated) ? employee.birthday : " ") + ": ");
        employee.birthday = Integer.parseInt(sc.nextLine());

        System.out.println("Enter your Position " + ((isCreated) ? employee.getPosition() : " ") + ": ");
        employee.setPosition(sc.nextLine());

        System.out.println("Enter your EducateAndexperience " + ((isCreated) ? employee.getEducateAndexperience() : " ") + ": ");
        employee.setEducateAndexperience(sc.nextLine());

        if (!isCreated) {
            isCreated = true;
        }
        employee1=employee;

    }

    @Override
    public void delete() {
        List<Employee> employeeList = ReadWriteCSV.getListEmployeeFromCSV(PATH_EMPLOYEE);
        Scanner scanner = new Scanner(System.in);
        show();
        System.out.println("chọn nhân viên cần xa thải");
        int duoiviec = Integer.parseInt(scanner.nextLine());
        employeeList.remove(duoiviec-1);
        ReadWriteCSV.writeListEmployeeToCSV(employeeList, PATH_EMPLOYEE,false);
        show();
    }

}
