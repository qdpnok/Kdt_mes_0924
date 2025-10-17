package 싱글톤;

public class Singleton {
    String name;
    int id;
    // private : 클래스에서만 접근, 외부에서 접근 x
    // static : 단 한번만 생성
    // singleton -> 참조변수라서 원래는 지역변수 영역에 만들어지는데 static 이 붙으니 static 영역에 만들어짐
    // 때문에 프로그램이 시작될 때 부터 끝날 때 까지 singleton 변수가 살아있음.
    // new Singleton 객체가 힙에 만들어짐
    private static Singleton singleton = new Singleton();
    private Singleton() {
        // 외부 생성을 막기 위해 private 접근 제한자 사용 ??근데 생성자인데 이래도 괜찮음?
        // 응 위에서 생성했어 new Singleton 할 때..
        name = "안유진";
        id = 100;
    }
    static Singleton getSingleton() {
        // getSingleton 메서드 호출 시 생성된 객체의 주소를 전달
        // 10군데에서 다 new Singleton 하는게 아니고 singleton 주소를 10군데에 전달만 해줌.
        return singleton;
    }
}
