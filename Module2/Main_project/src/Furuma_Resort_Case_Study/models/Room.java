package Furuma_Resort_Case_Study.models;

import java.util.Scanner;

public class Room extends Facility {
    private String freeservice;
    public Room(){}
    public Room(double square, int people, int kieuThue, double cost, String tendichvu){
        this.square = square;
        this.people = people;
        this.kieuThue = kieuThue;
        this.cost = cost;
        this.tendichvu = tendichvu;
    }

    @Override
    public double getCost() {
        return super.getCost();
    }

    @Override
    public void setCost(double cost) {
        super.setCost(cost);
    }

    @Override
    public double getSquare() {
        return super.getSquare();
    }

    @Override
    public void setKieuThue(int kieuThue) {
        super.setKieuThue(kieuThue);
    }

    @Override
    public void setSquare(double square) {
        super.setSquare(square);
    }

    @Override
    public int getKieuThue() {
        return super.getKieuThue();
    }

    @Override
    public int getPeople() {
        return super.getPeople();
    }

    @Override
    public void setPeople(int people) {
        super.setPeople(people);
    }

    @Override
    public String getTendichvu() {
        return super.getTendichvu();
    }

    @Override
    public void setTendichvu(String tendichvu) {
        super.setTendichvu(tendichvu);
    }

    public String getFreeservice() {
        return freeservice;
    }

    public void setFreeservice(String freeservice) {
        this.freeservice = freeservice;
    }
}
