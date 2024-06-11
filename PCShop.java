
package 명품쇼핑몰;

import java.util.Scanner;

public class PCShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductCatalog catalog = new ProductCatalog();
        Cart cart = new Cart();

        while (true) {
            System.out.println("************************************");
            System.out.println("*  명품 쇼핑몰에 오신 것을 환영합니다  *");
            System.out.println("************************************");
            System.out.println("1. 제품 목록 보기");
            System.out.println("2. 장바구니 보기");
            System.out.println("3. 장바구니 비우기");
            System.out.println("4. 제품 추가 (장바구니)");
            System.out.println("5. 주문");
            System.out.println("0. 종료");
            System.out.print(">> 메뉴 선택: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("==== 제품 목록 ====");
                    catalog.displayProducts();
                    break;
                case 2:
                    System.out.println("==== 장바구니 ====");
                    cart.displayCart();
                    break;
                case 3:
                    cart.clearCart();
                    break;
                case 4:
                    System.out.print("추가할 제품 번호 입력: ");
                    String productId = scanner.next();
                    Product product = catalog.getProductById(productId);
                    if (product != null) {
                        cart.addProduct(product);
                    } else {
                        System.out.println("유효하지 않은 제품 번호입니다.");
                    }
                    break;
                case 5:
                    System.out.println("==== 주문 내역 ====");
                    cart.displayCart();
                    System.out.println("주문이 완료되었습니다.");
                    cart.clearCart();
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
                    break;
            }
            System.out.println();
        }
    }
}
