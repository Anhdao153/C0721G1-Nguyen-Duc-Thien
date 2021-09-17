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
    public String getStringToWrite(){
        return super.getStringToWrite()+","+this.sotang+","+this.tieuchuanphong;
    }
}
