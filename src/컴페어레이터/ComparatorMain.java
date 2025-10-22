package 컴페어레이터;
// Comparator : 두 매개변수를 비교하는 인터페이스

import java.util.Set;
import java.util.TreeSet;

public class ComparatorMain {
    public static void main(String[] args) {
        Set<Fruit> fruits = new TreeSet<>(new FruitCompare().reversed());
        fruits.add(new Fruit("포도", 5000));
        fruits.add(new Fruit("수박", 20000));
        fruits.add(new Fruit("딸기", 5000));

        for(Fruit e: fruits) System.out.println("|이름: " + e.getName() + " |가격: " + e.getPrice());
    }
}
