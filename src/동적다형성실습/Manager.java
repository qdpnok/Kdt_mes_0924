package 동적다형성실습;
// 3. Manager(배송 관리자) 클래스
// - 메서드 send(Delivery d)
// - 어떤 배송 방식이 오더라도, "OO회사가 배송을 진행합니다." 출력 후 d.delivery() 호출
public class Manager {
    String name;

    public Manager(String name) {
        this.name = name;
    }

    public void send(Delivery d) {
        System.out.println(d.getCompany() + " 택배가 배송을 진행합니다.");
        System.out.println("문제 발생 시 " + name + " 매니저에게 연락 바랍니다.");
        d.deliver();
    }
}
