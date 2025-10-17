package 동적다형성실습;

import java.util.Scanner;

// 1. 부모 클래스: Delivery
// - 필드: String company (배송회사 이름)
// - 메서드: deliver() (기본구현 "배송을 시작합니다.")
// 2. 자식 클래스: ParcelDelivery, QuickDelivery, AirDelivery
// - 각각 deliver() 메서드를 오버라이딩
// - ParcelDelivery: "택배 배송을 시작합니다. 2~3일 소요됩니다."
// - QuickDelivery: "퀵 배송을 시작합니다. 당일 도착 예정입니다."
// - AirDelivery: "항공 배송을 시작합니다. 해외로 출발합니다."
// 3. Manager(배송 관리자) 클래스
// - 메서드 send(Delivery d)
// - 어떤 배송 방식이 오더라도, "OO회사가 배송을 진행합니다." 출력 후 d.delivery() 호출
// 4. Main 클래스
// - Manager 객체를 생성
// - ParcelDelivery, QuickDelivery, AirDelivery를 하나씩 만들어 send()에 전달
public class PolyEx2Main {
    public static void main(String[] args) {
        Manager manager = new Manager("이소라");
        Scanner sc = new Scanner(System.in);

        System.out.print("배송 시스템 선택 [1]택배 배송 [2]퀵 배송 [3]항공 배송 : ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1 : manager.send(new ParcelDelivery("CJ대한통운")); break;
            case 2 : manager.send(new QuickDelivery("쿠팡로켓배송")); break;
            case 3 : manager.send(new AirDelivery("FedEx")); break;
            default: System.out.println("배송 시스템을 잘못 선택하셨습니다.");
        }
    }
}
