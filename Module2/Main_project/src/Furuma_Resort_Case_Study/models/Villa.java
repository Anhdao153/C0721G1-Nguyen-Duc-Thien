package Furuma_Resort_Case_Study.models;


import java.util.Scanner;

public class Villa extends Facility {
    Scanner in = new Scanner(System.in);
    private double square;
    private double cost;
    private int people=1;
    int time = 0;
    int total;
    public Villa(double square,double cost,int people,int time){
        this.people=people;
        this.cost=cost;
        this.square=square;
        this.time=time;
    }
    public Villa(){}

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    @Override
    public String TenDichVu() {
        return "Phòng hạng sang villa";
    }

    @Override
    public double DienTichPhong() {
        System.out.println("Nhập diện tích căn phòng muốn thuê");
        double Square= Double.parseDouble(in.nextLine());
        setSquare(Square);
        return getSquare();
    }

    @Override
    public double ChiPhiThue() {
        System.out.println("Tổng chi phí thuê của quý khách là: ");
        double Cost=getPeople()*getSquare()*total;
        setCost(Cost);
        return getCost();
    }

    @Override
    public int SoNguoiToida() {
        System.out.println("Tổng số người thuê 1 căn phòng");
        people=Integer.parseInt(in.nextLine());
        return getPeople();
    }

    @Override
    public int KieuThue() {
        System.out.println("Chọn kiểu thuê \n1. Ngày\n2. Tháng\n3.Năm");
        int type= Integer.parseInt(in.nextLine());

       switch (type){
           case 1:
               System.out.println("Nhập số lượng ngày thuê");
               int day = Integer.parseInt(in.nextLine());
               total=day;
               break;
           case 2:
               System.out.println("nhập số lượng tháng thuê");
               int month = Integer.parseInt(in.nextLine());
               total=month*30;
               break;
           case 3:
               System.out.println("nhập số lượng năm thuê");
               int year = Integer.parseInt(in.nextLine());
               total=year*365;
               break;
       }
        return total;
    }
}