package Furuma_Resort_Case_Study.models;


import java.util.Scanner;

public class Villa extends Facility {
    private double squarehoboi;
    private int sotang;
    private String tieuchuanphong;

    public Villa() {
    }

    public Villa(double square, double squarehoboi, int sotang, String tieuchuanphong, String tendichvu, double cost, int kieuThue, int people) {
        this.sotang = sotang;
        this.squarehoboi = squarehoboi;
        this.square = square;
        this.people = people;
        this.kieuThue = kieuThue;
        this.cost = cost;
        this.tieuchuanphong = tieuchuanphong;
        this.tendichvu = tendichvu;
    }

    @Override
    public void setTendichvu(String tendichvu) {
        super.setTendichvu(tendichvu);
    }

    @Override
    public String getTendichvu() {
        return super.getTendichvu();
    }

    public String getTieuchuanphong() {
        return tieuchuanphong;
    }

    public void setTieuchuanphong(String tieuchuanphong) {
        this.tieuchuanphong = tieuchuanphong;
    }

    @Override
    public void setPeople(int people) {
        super.setPeople(people);
    }

    @Override
    public int getPeople() {
        return super.getPeople();
    }

    public void setSotang(int sotang) {
        this.sotang = sotang;
    }

    public int getSotang() {
        return sotang;
    }

    @Override
    public int getKieuThue() {
        return super.getKieuThue();
    }

    @Override
    public void setSquare(double square) {
        super.setSquare(square);
    }

    @Override
    public void setKieuThue(int kieuThue) {
        super.setKieuThue(kieuThue);
    }

    @Override
    public double getSquare() {
        return super.getSquare();
    }

    @Override
    public void setCost(double cost) {
        super.setCost(cost);
    }

    @Override
    public double getCost() {
        return super.getCost();
    }

    public double getSquarehoboi() {
        return squarehoboi;
    }

    public void setSquarehoboi(double squarehoboi) {
        this.squarehoboi = squarehoboi;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "squarehoboi=" + squarehoboi +
                ", sotang=" + sotang +
                ", tieuchuanphong='" + tieuchuanphong + '\'' +
                ", square=" + square +
                ", people=" + people +
                ", kieuThue=" + kieuThue +
                ", cost=" + cost +
                ", tendichvu='" + tendichvu + '\'' +
                '}';
    }
}
