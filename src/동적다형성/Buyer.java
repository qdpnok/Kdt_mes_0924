package 동적다형성;

public class Buyer {
    int money = 1000;
    int bonusPoint = 0;
    void buy(Product p) { // 부모 클래스의 참조 변수
        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println("제품 구매 후 " + money + "가 남았습니다.");
        System.out.println("제품 구입으로 보너스 포인트가 " + bonusPoint + "만큼 쌓였습니다.");
    }
    void viewInfo() {
        System.out.println("잔액 : " + money);
        System.out.println("포인트 : " + bonusPoint);
    }
}
