package 추상클래스기본;

public class AndroidPhone extends Phone{
    public AndroidPhone(String name) {
        super(name);    // 부모의 생성자 호출
    }

    @Override
    public void call() {
        System.out.println("추상 메서드를 상속받아 Call 기능을 구현합니다.");
    }

    @Override
    public void store() {
        System.out.println("Google Store 기능을 추가합니다.");
    }
}
