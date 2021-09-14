package Furuma_Resort_Case_Study.models;

public class House extends Facility {
    private int sotang;
    private String tieuchuanphong;

    public House() {
    }

    public House(double square, int sotang, int people, int kieuThue, double cost, String tendichvu, String tieuchuanphong) {
        this.square = square;
        this.sotang = sotang;
        this.people = people;
        this.kieuThue = kieuThue;
        this.cost = cost;
        this.tieuchuanphong = tieuchuanphong;
        this.tendichvu = tendichvu;
    }

    public void setTieuchuanphong(String tieuchuanphong) {
        this.tieuchuanphong = tieuchuanphong;
    }

    public String getTieuchuanphong() {
        return tieuchuanphong;
    }

    public int getSotang() {
        return sotang;
    }

    public void setSotang(int sotang) {
        this.sotang = sotang;
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

    @Override
    public String toString() {
        return "House{" +
                "sotang=" + sotang +
                ", tieuchuanphong='" + tieuchuanphong + '\'' +
                ", square=" + square +
                ", people=" + people +
                ", kieuThue=" + kieuThue +
                ", cost=" + cost +
                ", tendichvu='" + tendichvu + '\'' +
                '}';
    }
}
