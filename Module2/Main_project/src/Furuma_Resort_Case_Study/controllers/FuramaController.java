package Furuma_Resort_Case_Study.controllers;

import Furuma_Resort_Case_Study.services.EmployeeServiceImpl;

import java.util.Scanner;

public class FuramaController {
    Scanner in = new Scanner(System.in);
    EmployeeServiceImpl employeeService = new EmployeeServiceImpl();

    public void displayMainMenu() {
        System.out.println("1. Employee Management");
        System.out.println("2. Customer Management");
        System.out.println("3. Facility Management");
        System.out.println("4. Booking Management");
        System.out.println("5. Promotion Management");
        System.out.println("6. Exit");
        int choice = 0;
        while (choice != 6) {
            choice = Integer.parseInt(in.nextLine());
            switch (choice) {
                case 1:
                    employeeService.display();
                    break;
                case 2:
                    System.out.println("1.Display list customers");
                    System.out.println("2.Add new customer");
                    System.out.println("3.Edit customer");
                    System.out.println("4.Return main menu");
                    break;
                case 3:
                    System.out.println("1 Display list facility");
                    System.out.println("2 Add new facility");
                    System.out.println("3 Display list facility maintenance");
                    System.out.println("4 Return main menu");
                    break;
                case 4:
                    System.out.println("1.Add new booking");
                    System.out.println("2.Display list booking");
                    System.out.println("3.Create new constracts");
                    System.out.println("4.Display list contracts");
                    System.out.println("5.Edit contracts");
                    System.out.println("6.Return main menu");
                    break;
                case 5:
                    System.out.println("1.Display list customers use service");
                    System.out.println("2.Display list customers get voucher");
                    System.out.println("3.Return main menu");
                    break;
                case 6:
                    System.out.println("thank you for using our products and services (\"service\").");
                    break;
            }
        }
    }

    public static int selectionmenu() {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("nhap n = ");
        n = sc.nextInt();
        while(n<=0 || n > 4){
            System.out.print("nhap lai:");
            n = sc.nextInt();
        }

        return n;
    }

    public static void main(String[] args) {
        FuramaController furamaController = new FuramaController();
        furamaController.displayMainMenu();
    }
}
