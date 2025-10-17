package Super실습;
// 인스턴스 필드 : isTurbo(boolean)
// - 생성자:
//      - SportCar() : 부모의 기본 생성자 호출, turbo = false
//      - SportCar(String name) : super(280, "Red") 호출, turbo = true, 이름 지정
// - displayInfo() 오버라이드: turbo 여부까지 출력

public class SportCar extends Car{
    boolean isTurbo;

    public SportCar() {
        isTurbo = false;
    }

    public SportCar(String name) {
        super(280, "Red");
        isTurbo = true;
        setName(name);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("터보: " + isTurbo);
    }
}
