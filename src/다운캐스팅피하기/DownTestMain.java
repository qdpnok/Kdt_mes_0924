package 다운캐스팅피하기;

import java.util.ArrayList;
import java.util.List;

public class DownTestMain {
    List<Animal> list = new ArrayList<>();
    public static void main(String[] args) {
        DownTestMain downTestMain = new DownTestMain();
        downTestMain.addAnimal();
    }
    public void addAnimal() {
        list.add(new Human());
        list.add(new Tiger());
        list.add(new Eagle());
        for (Animal animal: list) {
            animal.move();
            animal.specialAbility();
        }
    }
}
