package 생산관리프로그래밍기초JAVA;

public class Menu {
    String name;
    int price;

    public Menu(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + "|" + price;
    }
}
