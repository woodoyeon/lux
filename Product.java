package 명품쇼핑몰;

public class Product {
    private String id;
    private String name;
    private String details;
    private double price;

    public Product(String id, String name, String details, double price) {
        this.id = id;
        this.name = name;
        this.details = details;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDetails() {
        return details;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("[제품번호: %s, %s, %s, %.0f원]", id, name, details, price);
    }
}
