package Furuma_Resort_Case_Study.models;

import java.util.Scanner;

public class House extends Facility {
    public House() {
    }

    Scanner in = new Scanner(System.in);
    private int total;
    private int sotang;
    private double Square;
    private int People;
    private double Cost;

    public double getSquare() {
        return Square;
    }

    public void setSquare(double square) {
        Square = square;
    }

    public double getCost() {
        return Cost;
    }

    public void setCost(double cost) {
        Cost = cost;
    }

    public int getPeople() {
        return People;
    }

    public void setPeople(int People) {
        this.People = People;
    }

    public int getSotang() {
        return sotang;
    }

    public void setSotang(int sotang) {
        this.sotang = sotang;
    }

    public int SoTang() {
        System.out.println("Nhập số tầng mà bạn muốn thuê");
        int sotang = Integer.parseInt(in.nextLine());
        setSotang(sotang);
        return getSotang();
    }

    @Override
    public String TenDichVu() {
        return "Phòng hạng thương gia House";
    }

    @Override
    public double DienTichPhong() {
        System.out.println("Nhập diện tích căn phòng muốn thuê");
        double Square = Double.parseDouble(in.nextLine());
        setSquare(Square);
        return getSquare();
    }

    @Override
    public double ChiPhiThue() {
        System.out.println("Tổng chi phí thuê của quý khách là: ");
        double Cost = getPeople() * 500000 + getSquare() * 50000 + total * 500000 + getSotang() * 500000;
        setCost(Cost);
        return getCost();
    }

    @Override
    public int SoNguoiToida() {
        System.out.println("Tổng số người thuê 1 căn phòng");
        People = Integer.parseInt(in.nextLine());
        setPeople(People);
        return getPeople();
    }

    @Override
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
