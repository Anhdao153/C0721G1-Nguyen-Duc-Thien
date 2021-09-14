package Furuma_Resort_Case_Study.services;

import java.util.Scanner;

public class BookingServiceImlp implements BookingService {
    private int total;
    Scanner in = new Scanner(System.in);

    @Override
    public void show() {

    }

    @Override
    public String edit() {
        return null;
    }

    @Override
    public void add(Object o) {

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
