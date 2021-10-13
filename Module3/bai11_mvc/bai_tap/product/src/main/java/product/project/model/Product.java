package product.project.model;

public class Product {
    private int id;
    private String nameProduct;
    private String brandProduct;
    private float price;

    public Product() {
    }

    public Product(int id, String nameProduct, String brandProduct, float price) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.brandProduct = brandProduct;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getBrandProduct() {
        return brandProduct;
    }

    public void setBrandProduct(String brandProduct) {
        this.brandProduct = brandProduct;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
