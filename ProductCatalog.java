package 명품쇼핑몰;

import java.util.ArrayList;
import java.util.List;

public class ProductCatalog {
    private List<Product> products;

    public ProductCatalog() {
        this.products = new ArrayList<>();
        // 명품 의류 제품 리스트 초기화
        products.add(new Product("1001", "샤넬 재킷", "클래식 트위드 재킷, 블랙", 5000000));
        products.add(new Product("1002", "루이비통 핸드백", "네버풀 MM, 모노그램", 1500000));
        products.add(new Product("1003", "디올 드레스", "바이오니 컬렉션 드레스, 화이트", 8000000));
        products.add(new Product("1004", "버버리 트렌치코트", "헤리티지 트렌치코트, 베이지", 3000000));
        products.add(new Product("1005", "프라다 지갑", "사피아노 가죽 지갑, 블랙", 700000));
        products.add(new Product("2001", "구찌 스니커즈", "에이스 스니커즈, 화이트", 600000));
        products.add(new Product("2002", "펜디 클러치", "바게트 클러치, 레드", 1200000));
        products.add(new Product("2003", "셀린느 백", "트라이엄프 백, 브라운", 2500000));
        products.add(new Product("2004", "발렌시아가 셔츠", "오버사이즈 셔츠, 블루", 1500000));
        products.add(new Product("2005", "생로랑 선글라스", "레트로 선글라스, 블랙", 400000));
    }

    public void displayProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public Product getProductById(String id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }
}
