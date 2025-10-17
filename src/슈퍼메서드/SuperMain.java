package 슈퍼메서드;
// super : 부모의 필드값을 조회할 때 사용
// super() : 부모의 생성자를 호출할 때 사용, this() 메서드는 자신의 다른 생성자를 호출 시 사용

public class SuperMain {
    public static void main(String[] args) {
        Child child = new Child();

        child.display();
    }
}

class Parent {
    int x = 10;
    public Parent(int x) {
        this.x = x;
    }
    public Parent() {}
}

class Child extends Parent {
    int x = 20;
    int y = 40;

    public Child() {}

    public Child(int x, int y) {
        // 아무것도 없을 때, 부모의 생성자가 이미 호출되고 있었음. 숨겨진 기본 생성자가 있기 때문에.
        // super(x); // 부모의 생성자 호출
        this.y = y;
    }

    void display() {
        System.out.println("x = " + x); // 20
        System.out.println("this.x = " + this.x); // 20
        System.out.println("super.x = " + super.x); // 10
    }
}