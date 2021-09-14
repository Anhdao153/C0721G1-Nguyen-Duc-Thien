package Furuma_Resort_Case_Study.services;

import Furuma_Resort_Case_Study.models.Employee;

import java.util.Scanner;

import static Furuma_Resort_Case_Study.controllers.FuramaController.selectionmenu;
import static Furuma_Resort_Case_Study.data.data.persons;

public class EmployeeServiceImpl implements EmployeeService {
    private boolean isCreated = false;
    public Employee employee1 = new Employee();

    public void display() {
        int value=0;
        while (true) {
            System.out.println("1 Display list employees\n" +
                    "2 Add new employee\n" +
                    "3 Edit employee\n" +
                    "4 Return main menu");
            value = selectionmenu();
            switch (value) {
                case 1:
                    System.out.println(persons+"\n");
                    break;
                case 2:
                    add(employee1);
                    persons.add(employee1);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + value);
            }
        }
    }
    @Override
    public Object edit() {
        return null;
    }
    @Override
    public void add(Object o) {
        Employee employee=new Employee();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name " + ((isCreated) ? employee.name : " ") + ": ");
        employee.name = sc.nextLine();

        System.out.println("Enter your age " + ((isCreated) ? employee.age : " ") + ": ");
        employee.age = Integer.parseInt(sc.nextLine());

        System.out.println("Enter your email " + ((isCreated) ? employee.email : " ") + ": ");
        employee.email = sc.nextLine();

        System.out.println("Enter your address " + ((isCreated) ? employee.address : " ") + ": ");
        employee.address = sc.nextLine();

        System.out.println("Enter your phone " + ((isCreated) ? employee.phone : " ") + ": ");
        employee.phone = Integer.parseInt(sc.nextLine());

        System.out.println("Enter your CMND " + ((isCreated) ? employee.CMND : " ") + ": ");
        employee.CMND = Integer.parseInt(sc.nextLine());

        System.out.println("Enter your gender " + ((isCreated) ? employee.gender : " ") + ": ");
        employee.gender = sc.nextLine();

        System.out.println("Enter your birth year " + ((isCreated) ? employee.birthday : " ") + ": ");
        employee.birthday = Integer.parseInt(sc.nextLine());

        System.out.println("Enter your salary " + ((isCreated) ? employee.getSalary() : " ") + ": ");
        employee.setSalary(Integer.parseInt(sc.nextLine()));

        System.out.println("Enter your StaffId " + ((isCreated) ? employee.getStaffId() : " ") + ": ");
        employee.setStaffId(Integer.parseInt(sc.nextLine()));

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

    }

    @Override
    public void freefood() {

    }

    @Override
    public void freebeverage() {

    }
}
