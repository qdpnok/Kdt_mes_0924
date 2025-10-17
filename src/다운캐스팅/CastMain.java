package 다운캐스팅;
// 업캐스팅 : 자연스러운 방향이기 때문에 형 변환이 필요 없음 (부모 클래스의 참조 변수로 자식 객체를 바라보는 것)
// 다운캐스팅 : 업캐스팅 되었던 객체를 원래 자식 타입으로 되돌리는 것
// instanceof : 객체가 특정 클래스의 인스턴스(객체)인지 확인하는 연산자
//              결과가 true이면 다운캐스팅 가능

import java.util.ArrayList;
import java.util.List;

public class CastMain {
    List<Animal> list = new ArrayList<>(); // 배열과 유사하지만 훨씬 효율적인 리스트 사용
    public static void main(String[] args) {
        CastMain castMain = new CastMain();
        castMain.addAnimal();
        castMain.downCast();
    }
    public void addAnimal() {
        list.add(new Animal()); // list가 Animal 타입으로 지정되어 있으므로, Animal 클래스의 객체 또는 상속받은 객체는 올 수 있음
        list.add(new Human()); // 해당 클래스로 생성된 객체의 주소가 대입 됨
        list.add(new Tiger());
        list.add(new Eagle());

        for (Animal ani : list) {
            ani.move();
        }
    }
    public void downCast() {
        for (Animal animal : list) {
            if (animal instanceof Human) { // 객체와 클래스가 타입을 확인
                Human h = (Human) animal; // 다운캐스팅
                h.readBook(); // 부모 클래스의 참조 변수로는 접근이 되지 않기 때문에 원래의 타입으로 변환해서 접근
            } else if (animal instanceof Tiger) { // Tiger
                Tiger t = (Tiger) animal;
                t.hunting();
            } else if (animal instanceof Eagle) { // Eagle
                Eagle e = (Eagle) animal;
                e.flying();
            } else { // else에 대한 예외처리
                System.out.println("지원되지 않은 형입니다.");
            }
        }
    }

}
