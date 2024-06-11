package LUXSHOP;

import java.util.List;

public class Admin {
    private String adminEmail;
    private String adminPassword;

    public Admin(String email, String password) {
        this.adminEmail = email;
        this.adminPassword = password;
    }

    public boolean login(String email, String password) {
        return this.adminEmail.equals(email) && this.adminPassword.equals(password);
    }

    public void addProduct(List<Product> productList, Product product) {
        productList.add(product);
        System.out.println("상품이 추가되었습니다: " + product.getName());
    }

    public void removeProduct(List<Product> productList, Product product) {
        productList.remove(product);
        System.out.println("상품이 삭제되었습니다: " + product.getName());
    }

    public void updateProduct(Product product, String name, String category, String description, double price, int stock) {
        product.setName(name);
        product.setDescription(description);
        product.setPrice(price);
        product.setStock(stock);
        System.out.println("상품이 업데이트되었습니다: " + product.getName());
    }
}
