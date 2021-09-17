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

    public String getTieuchuanphong() {
        return tieuchuanphong;
    }

    public void setTieuchuanphong(String tieuchuanphong) {
        this.tieuchuanphong = tieuchuanphong;
    }


    public void setSotang(int sotang) {
        this.sotang = sotang;
    }

    public int getSotang() {
        return sotang;
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
    public String getStringToWrite(){
        return super.getStringToWrite()+","+this.squarehoboi+","+this.sotang+","+this.tieuchuanphong;
    }
}
