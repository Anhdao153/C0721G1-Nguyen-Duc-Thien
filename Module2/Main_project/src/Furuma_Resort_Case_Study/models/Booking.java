package Furuma_Resort_Case_Study.models;

import java.util.Calendar;
import java.util.Scanner;

public class Booking {
    Scanner in=new Scanner(System.in);
    private int bookingID;
    private Calendar fromday;
    private Calendar untilday;
    private int idcustomer;
    private String nameofservice;
    private String typeofservice;
    public Booking(){}

    public Calendar getFromday() {
        return fromday;
    }

    public void setBooking(int bookingID) {
        this.bookingID = bookingID;
    }

    public int getBookingID() {
        return bookingID;
    }

    public Calendar getUntilday() {
        return untilday;
    }

    public void setFromday(Calendar fromday) {
        this.fromday = fromday;
    }

    public void setUntilday(Calendar untilday) {
        this.untilday = untilday;
    }

    public void setIdcustomer(int idcustomer) {
        this.idcustomer = idcustomer;
    }

    public int getIdcustomer() {
        return idcustomer;
    }

    public String getNameofservice() {
        return nameofservice;
    }

    public String getTypeofservice() {
        return typeofservice;
    }

    public void setNameofservice(String nameofservice) {
        this.nameofservice = nameofservice;
    }

    public void setTypeofservice(String typeofservice) {
        this.typeofservice = typeofservice;
    }
    public int IdCustomer(){
        idcustomer = Integer.parseInt(in.nextLine());
        setIdcustomer(idcustomer);
        return getIdcustomer();
    }
    public Calendar FromDay(){
         fromday =Calendar.getInstance();
        System.out.println("Bắt đầu thuê từ ngày: "+ fromday.getTime());
         return getFromday();
    }
    public Calendar UntilDay(){
        int songaythue=in.nextInt();
        fromday.add(Calendar.DATE,songaythue);
        System.out.println("Cho đế ngày: "+ fromday.getTime());
        return getUntilday();
    }
}
