package Furuma_Resort_Case_Study.models;

import java.util.Calendar;
import java.util.Scanner;

public class Booking {
    Facility facility;
    Customer customer;

    private int bookingID;
    //private Calendar fromday;
    //private Calendar untilday;
    public Booking(){}

    public Booking(Facility facility, Customer customer, int bookingID, Calendar fromday, Calendar untilday) {
        this.facility = facility;
        this.customer = customer;
        this.bookingID = bookingID;
      //  this.fromday = fromday;
      //  this.untilday = untilday;
    }
 public Booking(Customer customer,Facility facility, int bookingID) {
        this.facility = facility;
        this.customer = customer;
        this.bookingID = bookingID;

    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getBookingID() {
        return bookingID;
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

//    public Calendar getFromday() {
//        return fromday;
//    }
//
//    public void setFromday(Calendar fromday) {
//        this.fromday = fromday;
//    }

//    public Calendar getUntilday() {
//        return untilday;
//    }
//
//    public void setUntilday(Calendar untilday) {
//        this.untilday = untilday;
//    }
//
//    public Calendar FromDay(){
//         fromday =Calendar.getInstance();
//        System.out.println("Bắt đầu thuê từ ngày: "+ fromday.getTime());
//         return getFromday();
//    }
//    public Calendar UntilDay(){
//        Scanner in=new Scanner(System.in);
//        int songaythue=in.nextInt();
//        fromday.add(Calendar.DATE,songaythue);
//        System.out.println("Cho đế ngày: "+ fromday.getTime());
//        return getUntilday();
//    }

    @Override
    public String toString() {
        return "Booking{" +
                "facility=" + facility +
                ", customer=" + customer +
                ", bookingID=" + bookingID +
//                ", fromday=" + fromday +
//                ", untilday=" + untilday +
                '}';
    }

    public String getStringToWrite(){
        return customer.getStringToWrite()+","+facility.getStringToWrite()+","+
                this.bookingID;
//                +","+this.fromday+","+this.untilday;
    }
}
