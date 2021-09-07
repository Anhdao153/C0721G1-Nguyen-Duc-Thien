package Furuma_Resort_Case_Study.models;

public class Contract {
    private int IdContract;
    private int BookingId;
    private double PrePay;
    private double Bills;
    private int CustomerID;
    public Contract(){

    }

    public int getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(int customerID) {
        CustomerID = customerID;
    }

    public double getBills() {
        return Bills;
    }

    public void setBills(double bills) {
        Bills = bills;
    }

    public double getPrePay() {
        return PrePay;
    }

    public void setPrePay(double prePay) {
        PrePay = prePay;
    }

    public int getBookingId() {
        return BookingId;
    }

    public void setBookingId(int bookingId) {
        BookingId = bookingId;
    }

    public int getIdContract() {
        return IdContract;
    }

    public void setIdContract(int idContract) {
        IdContract = idContract;
    }
}
