package io_binary.bai_tap.product_manager.model;

public class Product {
    int id;
    String Brand;
    double price;

    public Product() {
    }

    public Product(int id, String Brand, double price) {
        this.id = id;
        this.Brand = Brand;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        this.Brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", Brand='" + Brand + '\'' +
                ", price=" + price +
                '}';
    }
    public String getStringToWrite(){
        return this.id+","+this.Brand +","+this.price;
    }

}
