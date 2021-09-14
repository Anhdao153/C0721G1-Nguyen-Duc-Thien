package Furuma_Resort_Case_Study.models;


public abstract class Facility {
    public double square;
    public int people;
    public int kieuThue;
    public double cost;
    public String tendichvu;
    public double getCost() {
        return cost;
    }
    public double getSquare() {
        return square;
    }
    public int getKieuThue() {
        return kieuThue;
    }
    public int getPeople() {
        return people;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }
    public void setKieuThue(int kieuThue) {
        this.kieuThue = kieuThue;
    }
    public void setPeople(int people) {
        this.people = people;
    }
    public void setSquare(double square) {
        this.square = square;
    }

    public String getTendichvu() {
        return tendichvu;
    }

    public void setTendichvu(String tendichvu) {
        this.tendichvu = tendichvu;
    }
}
