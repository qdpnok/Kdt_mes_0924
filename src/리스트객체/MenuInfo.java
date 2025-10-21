package 리스트객체;
// 이름, String
// 가격, int
// 카테고리, String
// 설명, String
// 세금포함 여부 boolean

// 매개변수가 전부 있는 생성자
// toString 오버라이딩해서 정보 출력하기

public class MenuInfo {
    String name;
    int price;
    String category;
    String exp;
    boolean isTax;

    public MenuInfo(String name, int price, String category, String exp, boolean tax) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.exp = exp;
        this.isTax = tax;
    }

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public void setTax(boolean tax) {
        isTax = tax;
    }

    @Override
    public String toString() {
        return name + "|" + price + "|" + category
                + "|" + exp + "|" + (isTax ? "(세금 포함)":"(세금 별도)");
    }
}
