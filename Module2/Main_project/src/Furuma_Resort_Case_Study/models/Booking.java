package Furuma_Resort_Case_Study.models;

import java.util.Calendar;
import java.util.Scanner;

public class Booking {
    Scanner in=new Scanner(System.in);
    private int bookingID;
    private Calendar FromDay;
    private Calendar UntilDay;
    private int IdCustomer;
    private String NamofService;
    private String TypeofService;
    public Booking(){}

    public Calendar getFromDay() {
        return FromDay;
    }

    public void setBooking(int bookingID) {
        this.bookingID = bookingID;
    }

    public int getBookingID() {
        return bookingID;
    }

    public Calendar getUntilDay() {
        return UntilDay;
    }

    public void setFromDay(Calendar fromDay) {
        FromDay = fromDay;
    }

    public void setUntilDay(Calendar untilDay) {
        UntilDay = untilDay;
    }

    public void setIdCustomer(int idCustomer) {
        IdCustomer = idCustomer;
    }

    public int getIdCustomer() {
        return IdCustomer;
    }

    public String getNamofService() {
        return NamofService;
    }

    public String getTypeofService() {
        return TypeofService;
    }

    public void setNamofService(String namofService) {
        NamofService = namofService;
    }

    public void setTypeofService(String typeofService) {
        TypeofService = typeofService;
    }
    public int IdCustomer(){
        IdCustomer= Integer.parseInt(in.nextLine());
        setIdCustomer(IdCustomer);
        return getIdCustomer();
    }
    public Calendar FromDay(){
         FromDay=Calendar.getInstance();
        System.out.println("Bắt đầu thuê từ ngày: "+FromDay.getTime());
         return getFromDay();
    }
    public Calendar UntilDay(){
        int songaythue=in.nextInt();
        FromDay.add(Calendar.DATE,songaythue);
        System.out.println("Cho đế ngày: "+FromDay.getTime());
        return getUntilDay();
    }
}
