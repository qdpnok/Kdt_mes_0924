package 접근제한자;
// public : 모든 접근 허용
// protected : 상속관계, 같은 패키지에 대한 접근 허용
// default : 키워드 없음, 같은 패키지 내에 대한 접근 허용
// private : 같은 클래스 내에서 접근 허용

import 자판기만들기.Parent;

// 클래스에 대한 접근제한자는 public이나 없음
public class CapsuleMain {
    public static void main(String[] args) {
        Child child = new Child();

        System.out.println(child.getName());
        System.out.println(child.getMoney());
        System.out.println(child.getAddr());
    }
}

class Child extends Parent {
    public String getName() {
        return this.name;
    }
    public String getMoney() {
        return this.money;
    }
    public String getAddr() {
        return this.addr;
    }
}