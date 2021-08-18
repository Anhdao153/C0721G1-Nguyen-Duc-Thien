package class_and_object_in_java.thuc_hanh;

public class HCN {
    double rong,dai;
    public HCN(double rong, double dai){
        this.rong=rong;
        this.dai=dai;
    }
    public double getArea(){
        return this.rong*this.dai;
    }
    public double getPertimeter(){
        return (this.rong + this.dai) * 2;
    }
    public String display(){
        return "HCN{" +"chiều Rộng="+ rong +", Chiều dài=" + dai+"}";
    }

}
