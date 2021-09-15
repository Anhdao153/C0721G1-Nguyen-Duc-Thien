package Furuma_Resort_Case_Study.controllers;

import Furuma_Resort_Case_Study.services.BookingServiceImlp;
import Furuma_Resort_Case_Study.services.CustomerServiceImpl;
import Furuma_Resort_Case_Study.services.EmployeeServiceImpl;
import Furuma_Resort_Case_Study.services.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {
    Scanner in = new Scanner(System.in);
    EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    CustomerServiceImpl customerService= new CustomerServiceImpl();
    FacilityServiceImpl facilityService=new FacilityServiceImpl();
    BookingServiceImlp bookingServiceImlp=new BookingServiceImlp();
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
                    employeeService.displayEmployeeMenu();
                    break;
                case 2:
                    customerService.displayCustomerMenu();
                    break;
                case 3:
                    facilityService.displayFacilityMenu();
                    break;
                case 4:
                    bookingServiceImlp.displayBookingMenu();
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
        System.out.print("nhập chức năng = ");
        n = sc.nextInt();
        while(n<=0 || n > 6){
            System.out.print("nhập lại:");
            n = sc.nextInt();
        }
        return n;
    }

    public static void main(String[] args) {
        FuramaController furamaController = new FuramaController();
        furamaController.displayMainMenu();
    }
}
