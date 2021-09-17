package Furuma_Resort_Case_Study.services;

import Furuma_Resort_Case_Study.controllers.FuramaController;
import Furuma_Resort_Case_Study.models.*;
import Furuma_Resort_Case_Study.utils.ReadWriteCSV;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Furuma_Resort_Case_Study.controllers.FuramaController.selectionmenu;

public class BookingServiceImlp implements BookingService {
    private int total;
    private boolean isCreated = false;
    Scanner in = new Scanner(System.in);
    final String PATH_CUSTOMER = "D:\\CODE\\C0721G1-Nguyen-Duc-Thien\\Module2\\Main_project\\src\\Furuma_Resort_Case_Study\\data\\customer_database.csv";
    final String PATH_BOOKING = "D:\\CODE\\C0721G1-Nguyen-Duc-Thien\\Module2\\Main_project\\src\\Furuma_Resort_Case_Study\\data\\booking.csv";
    final String PATH_HOUSE = "D:\\CODE\\C0721G1-Nguyen-Duc-Thien\\Module2\\Main_project\\src\\Furuma_Resort_Case_Study\\data\\house_database.csv";
    final String PATH_VILLA = "D:\\CODE\\C0721G1-Nguyen-Duc-Thien\\Module2\\Main_project\\src\\Furuma_Resort_Case_Study\\data\\villa_database.csv";
    final String PATH_ROOM = "D:\\CODE\\C0721G1-Nguyen-Duc-Thien\\Module2\\Main_project\\src\\Furuma_Resort_Case_Study\\data\\room.csv";
    Booking booking2 = new Booking();
    public void displayBookingMenu() {
        FuramaController furamaController = new FuramaController();
        int value = 0;
        while (true) {
            System.out.println("1 Add new booking\n" +
                    "2 Display list booking\n" +
                    "3 Create new constracts\n" +
                    "4 Display list contracts\n" +
                    "5 Edit contracts\n" +
                    "6 Return main menu");
            value = selectionmenu();
            switch (value) {
                case 1:
                    add(booking2);
                      break;
                case 2:
                    show();
                    break;
                case 4:
                    delete();
                    break;
                case 5:

                    break;
                case 6:
                    furamaController.displayMainMenu();
                    break;
            }
        }
    }
    @Override
    public void show() {
        List<Booking> bookingList= ReadWriteCSV.getListBookingFromCSV(PATH_BOOKING);
        for (int i = 0; i < bookingList.size(); i++) {
            System.out.println((i + 1) + ". " + bookingList.get(i));
        }
    }
    @Override
    public String edit() {
        return null;
    }

    @Override
    public void add(Object o) {
        Booking booking = new Booking();
        List<Booking> bookinglist=new ArrayList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chọn khách hàng cần tạo dịch vụ");
        List<Customer> customerList = ReadWriteCSV.getListCustomerFromtCSV(PATH_CUSTOMER);

        for (int i = 0; i < customerList.size(); i++) {
            System.out.println((i + 1) + ". " + customerList.get(i));
        }
        int choose = Integer.parseInt(scanner.nextLine());
        booking.setCustomer(customerList.get(choose-1));

        System.out.println("1. Choose house\n" + "2. Choose villa\n" + "3. Choose room\n"+"4. Return displayBookingMenu");
        choose = Integer.parseInt(scanner.nextLine());
        if (choose == 1) {
            List<House> houseList = ReadWriteCSV.getListHouseFromCSV(PATH_HOUSE);
            for (int i = 0; i < houseList.size(); i++) {
                System.out.println((i + 1) + ". " + houseList.get(i));
            }
            System.out.println("Chọn nhà khách đã thuê");
            choose=Integer.parseInt(scanner.nextLine());
            booking.setFacility(houseList.get(choose-1));
        } else if (choose == 2) {
            List<Villa> villaList = ReadWriteCSV.getListVillaFromCSV(PATH_VILLA);
            for (int i = 0; i < villaList.size(); i++) {
                System.out.println((i + 1) + ". " + villaList.get(i));
            }
            System.out.println("Chọn nhà khách đã thuê");
            choose=Integer.parseInt(scanner.nextLine());
            booking.setFacility(villaList.get(choose-1));
        } else if (choose == 3) {
            List<Room> roomList = ReadWriteCSV.getListRoomFromCSV(PATH_ROOM);
            for (int i = 0; i < roomList.size(); i++) {
                System.out.println((i + 1) + ". " + roomList.get(i));
            }
            System.out.println("Chọn nhà khách đã thuê");
            choose=Integer.parseInt(scanner.nextLine());
            booking.setFacility(roomList.get(choose-1));
        } else if(choose==4){
            displayBookingMenu();
        }
        System.out.println("Nhập mã bookingID: " + ((isCreated) ? booking.getBookingID() : " ") + ": ");
        booking.setBookingID(Integer.parseInt(scanner.nextLine()));

//        System.out.println("Nhập Ngày bắt đầu thuê: " + ((isCreated) ? booking.getFromday() : " ") + ": ");
//        booking.FromDay();
//
//        System.out.println("Nhập số ngày thuê: " + ((isCreated) ? booking.getUntilday() : " ") + ": ");
//        booking.UntilDay();

        if (!isCreated) {
            isCreated = true;
        }
        bookinglist.add(booking);
        System.out.println(booking.getStringToWrite());
        ReadWriteCSV.writeListBookingToCSV(bookinglist,PATH_BOOKING,true);
    }
    @Override
    public void delete() {
        List<Booking> bookingList= ReadWriteCSV.getListBookingFromCSV(PATH_BOOKING);
        Scanner scanner = new Scanner(System.in);
        show();
        System.out.println("chọn khách hàng cần xóa và không phục vụ nữa");
        int khongtiemnang = Integer.parseInt(scanner.nextLine());
        bookingList.remove(khongtiemnang-1);
        ReadWriteCSV.writeListBookingToCSV(bookingList, PATH_CUSTOMER,false);
        show();
    }
    public void choiceCustomer(){
        Scanner scanner=new Scanner(System.in);

        }
//    public int KieuThue() {
//        System.out.println("Chọn kiểu thuê \n1. Ngày\n2. Tháng\n3.Năm");
//        int type = Integer.parseInt(in.nextLine());
//
//        switch (type) {
//            case 1:
//                System.out.println("Nhập số lượng ngày thuê");
//                int day = Integer.parseInt(in.nextLine());
//                total = day;
//                break;
//            case 2:
//                System.out.println("nhập số lượng tháng thuê");
//                int month = Integer.parseInt(in.nextLine());
//                total = month * 30;
//                break;
//            case 3:
//                System.out.println("nhập số lượng năm thuê");
//                int year = Integer.parseInt(in.nextLine());
//                total = year * 365;
//                break;
//        }
//        return total;
//    }
}