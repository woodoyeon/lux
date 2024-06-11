package LUXSHOP;

import java.util.Scanner;

public class PCShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserCatalog userCatalog = new UserCatalog();
        ProductCatalog productCatalog = new ProductCatalog();
        Cart cart = new Cart();
        Support support = new Support();
        Admin admin = new Admin("admin@example.com", "adminPass");

        User currentUser = null;

        while (true) {
            if (currentUser == null) {
                System.out.println("1. 로그인");
                System.out.println("2. 회원가입");
                System.out.println("0. 종료");
                System.out.print(">> 선택: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("이메일: ");
                        String email = scanner.next();
                        System.out.print("비밀번호: ");
                        String password = scanner.next();
                        currentUser = userCatalog.loginUser(email, password);
                        break;
                    case 2:
                        System.out.print("이메일: ");
                        email = scanner.next();
                        System.out.print("비밀번호: ");
                        password = scanner.next();
                        System.out.print("이름: ");
                        String name = scanner.next();
                        userCatalog.addUser(email, password, name);
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
            } else {
                System.out.println("************************************");
                System.out.println("*  명품 쇼핑몰에 오신 것을 환영합니다  *");
                System.out.println("************************************");
                System.out.println("1. 제품 목록 보기");
                System.out.println("2. 장바구니 보기");
                System.out.println("3. 장바구니 비우기");
                System.out.println("4. 제품 추가 (장바구니)");
                System.out.println("5. 주문");
                System.out.println("6. 제품 검색");
                System.out.println("7. 회원 정보 수정");
                System.out.println("8. 고객 지원 문의");
                System.out.println("9. 로그아웃");
                System.out.println("0. 종료");
                System.out.print(">> 메뉴 선택: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("==== 제품 목록 ====");
                        productCatalog.displayProducts();
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
                        Product product = productCatalog.getProductById(productId);
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
                    case 6:
                        System.out.print("검색할 키워드 입력: ");
                        String keyword = scanner.next();
                        System.out.println("==== 검색 결과 ====");
                        productCatalog.searchProducts(keyword);
                        break;
                    case 7:
                        System.out.print("이름: ");
                        String name = scanner.next();
                        System.out.print("새로운 비밀번호: ");
                        String password = scanner.next();
                        userCatalog.updateUser(currentUser, name, password);
                        break;
                    case 8:
                        System.out.print("문의 내용: ");
                        scanner.nextLine();  // 버퍼 비우기
                        String query = scanner.nextLine();
                        support.submitQuery(currentUser.getEmail(), query);
                        break;
                    case 9:
                        currentUser = null;
                        System.out.println("로그아웃되었습니다.");
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
            }
            System.out.println();
        }
    }
}
