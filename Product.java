package LUXSHOP;

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

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        // 카테고리를 설정하는 메소드 추가 (필요 시)
    }

    public void setDescription(String description) {
        this.details = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStock(int stock) {
        // 재고를 설정하는 메소드 추가 (필요 시)
    }

    @Override
    public String toString() {
        return String.format("[제품번호: %s, %s, %s, %.0f원]", id, name, details, price);
    }
}
