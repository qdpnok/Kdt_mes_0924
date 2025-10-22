package 컴페어러블;
// Comparable : 자기 자신과 전달받은 매개변수를 비교하는 인터페이스

import java.util.TreeSet;

public class CompMain {
    public static void main(String[] args) {
        TreeSet<Car> carTreeSet = new TreeSet<>();
        carTreeSet.add(new Car("싼타페", 2005, "White", 3000));
        carTreeSet.add(new Car("쏘렌토", 2005, "Gray", 3000));
        carTreeSet.add(new Car("그랜저", 2022, "Black", 4200));
        carTreeSet.add(new Car("GV80", 2025, "Blue", 8200));
        carTreeSet.add(new Car("G90", 2024, "Black", 12000));

        for( Car car : carTreeSet ) System.out.println(car);
    }

}
