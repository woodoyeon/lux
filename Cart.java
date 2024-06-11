package 명품쇼핑몰;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> items;

    public Cart() {
        this.items = new ArrayList<>();
    }

    public void addProduct(Product product) {
        if (product != null) {
            items.add(product);
            System.out.println(product.getName() + "이(가) 장바구니에 추가되었습니다.");
        } else {
            System.out.println("유효하지 않은 제품입니다.");
        }
    }

    public void clearCart() {
        items.clear();
        System.out.println("장바구니가 비워졌습니다.");
    }

    public void displayCart() {
        if (items.isEmpty()) {
            System.out.println("장바구니가 비어 있습니다.");
        } else {
            System.out.println("장바구니 내용:");
            for (Product item : items) {
                System.out.println(item);
            }
        }
    }
}
