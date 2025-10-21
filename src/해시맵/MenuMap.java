package 해시맵;
// 메뉴 이름, 가격, 분류, 설명
// 매개 변수가 전부 있는 생성자 추가
// 게터, 세터 추가
// toString 오버라이딩

public class MenuMap {
    String name;
    int price;
    String category;
    String desc;

    public MenuMap(String name, int price, String category, String desc) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
    return name + "|" + price + "|" + category + "|\n"
            + desc + "\n" +
            "-".repeat(10);
    }

}
