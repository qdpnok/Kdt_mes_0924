package 인터페이스리모콘;
// interface 키워드로 인터페이스 선언
public interface RemoteControl {
    // public static final 이 자동으로 추가되어 상수로 만들어짐
    // 설계 명세에서 범위값 정보를 클래스에 전달하는 용도
    // 인터페이스가 만들어질 때 생성되고, 객체를 만든다고 다시 생성되지 않음.
    // 인터페이스 소속이기 때문에 인터페이스이름.변수 식으로 직접 호출되어야함
    int MAX_VOLUME = 100;
    int MIN_VOLUME = 0;

    // public abstract 가 자동 추가, 왜냐면 기본적으로 인터페이스는 완전 추상화기 때문
    // 상속 받은 클래스에서 반드시 오버라이딩 해야 함
    void turnOn();
    void turnOff();
    void setVolume(int volume);

    default void setMute(boolean mute) {
        if(mute) System.out.println("무음 처리합니다.");
        else System.out.println("무음 해제합니다.");
    }

    // static이 붙어서 interface 소속이 되었음.
    // 이건 구현부를 만들어줘야함. 일반 함수처럼 동작. 하나만 만들고 여러군데서 호출
    // 이 인터페이스를 상속주더라도 상속되지 않음.
    static void changeBattery() {
        System.out.println("건전지를 교환합니다.");
    }
}
