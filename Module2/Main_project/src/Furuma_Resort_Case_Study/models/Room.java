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

    public String getFreeservice() {
        return freeservice;
    }

    public void setFreeservice(String freeservice) {
        this.freeservice = freeservice;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeservice='" + freeservice + '\'' +
                ", square=" + square +
                ", people=" + people +
                ", kieuThue=" + kieuThue +
                ", cost=" + cost +
                ", tendichvu='" + tendichvu + '\'' +
                '}';
    }

    public String getStringToWrite(){
        return this.square+","+this.people+","+this.kieuThue+","+this.cost+","+this.tendichvu;
    }
}
