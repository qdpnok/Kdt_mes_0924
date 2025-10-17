package Super실습;
// 인스턴스 필드: speed, color, name
//  - 생성자 오버로딩:
//      - Car() : 기본 speed = 100, color = "White", name = "BasicCar"
//      - Car(int speed, String color) : name = "CustomCar"
//      - displayInfo() : 자동차 정보 출력

public class Car {
    private int speed;
    private String color;
    private String name;

    public Car() {
        speed = 100;
        color = "White";
        name = "BasicCar";
    }

    public Car (int speed, String color) {
        this.speed = speed;
        this.color = color;
        name = "CustomCar";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("속도: " + speed);
        System.out.println("색상: " + color);
        System.out.println("이름: " + name);
    }
}
