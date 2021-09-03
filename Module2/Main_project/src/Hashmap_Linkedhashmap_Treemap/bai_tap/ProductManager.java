package Hashmap_Linkedhashmap_Treemap.bai_tap;

import java.util.Comparator;

public class ProductManager implements Comparator<ProductManager> {
        private String product;
        private double money;
        private int id;
        public ProductManager(String product,double money,int id){
            this.product=product;
            this.money=money;
            this.id=id;

        }
public ProductManager(){}

    public void setProduct(String product) {
        this.product = product;
    }

    public String getProduct() {
        return product;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getMoney() {
        return money;
    }
    public void changeProduct(String product,double money,int id){
            this.product=product;
            this.money=money;
            this.id=id;
    }
    @Override
    public String toString() {
        return "\nProductManager{" +
                "product='" + getProduct() + '\'' +
                ", money=" + getMoney() +
                ", id=" + getId() +
                '}';
    }


    @Override
    public int compare(ProductManager o1, ProductManager o2) {
        if (o1.getMoney() > o2.getMoney()) {
            return 1;
        }
        return -1;
    }

}

