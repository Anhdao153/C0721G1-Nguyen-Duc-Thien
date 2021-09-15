package Furuma_Resort_Case_Study.services;

import Furuma_Resort_Case_Study.controllers.FuramaController;
import Furuma_Resort_Case_Study.models.Booking;
import Furuma_Resort_Case_Study.utils.ReadWriteCSV;

import java.util.Scanner;

import static Furuma_Resort_Case_Study.controllers.FuramaController.selectionmenu;

public class BookingServiceImlp implements BookingService {
    private int total;
    Scanner in = new Scanner(System.in);
    public void displayBookingMenu(){
        FuramaController furamaController = new FuramaController();
        int value = 0;
        while (true) {
            System.out.println("1 Add new booking\n" +
                    "2 Display list booking\n" +
                    "3 Create new constracts\n" +
                    "4 Display list contracts\n" +
                    "5 Edit contracts\n"+
                    "6 Return main menu");
            value = selectionmenu();
            switch (value) {
                case 1:
                    show();
                    break;
                case 2:
                    System.out.println("1. Add new house\n" + "2. Add new villa\n" + "3. Add new room\n" + "4. return FacilityMenu");
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

    }

    @Override
    public String edit() {
        return null;
    }

    @Override
    public void add(Object o) {
        Booking booking=new Booking();


    }
    @Override
    public void delete() {

    }


    public int KieuThue() {
        System.out.println("Chọn kiểu thuê \n1. Ngày\n2. Tháng\n3.Năm");
        int type = Integer.parseInt(in.nextLine());

        switch (type) {
            case 1:
                System.out.println("Nhập số lượng ngày thuê");
                int day = Integer.parseInt(in.nextLine());
                total = day;
                break;
            case 2:
                System.out.println("nhập số lượng tháng thuê");
                int month = Integer.parseInt(in.nextLine());
                total = month * 30;
                break;
            case 3:
                System.out.println("nhập số lượng năm thuê");
                int year = Integer.parseInt(in.nextLine());
                total = year * 365;
                break;
        }
        return total;
    }
}
