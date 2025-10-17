package Super실습;

public class SuperExMain {
    public static void main(String[] args) {
        SportCar sc = new SportCar();
        SportCar scn = new SportCar("붕붕이");
        Car nc = new Car();
        Car ncc = new Car(140, "Green");

        sc.displayInfo();
        System.out.println();
        scn.displayInfo();
        System.out.println();
        nc.displayInfo();
        System.out.println();
        ncc.displayInfo();

    }
}
