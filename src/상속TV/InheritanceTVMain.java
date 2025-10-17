package 상속TV;

public class InheritanceTVMain {
    public static void main(String[] args) {
        ProductTV tv1 = new ProductTV();
        ProductTV tv2 = new ProductTV(true, 100, 30);

        tv1.setPower(true);
        tv2.setPower(false);



        tv1.setChannel(20);
        tv1.setChannel(true, 30);
        tv1.setVolume(45);
        tv1.setChannel(false, 11);

        System.out.println(tv1);
        System.out.println(tv2);

        ProductTV tvKang1 = new ProductTV(false, 11, 20, false);
        tvKang1.setChannel(false, 1200);
        tvKang1.setVolume(120);
        System.out.println(tvKang1);
    }
}
