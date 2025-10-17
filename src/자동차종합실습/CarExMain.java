package 자동차종합실습;

import java.text.NumberFormat;
import java.util.Scanner;

import static java.lang.Math.ceil;

public class CarExMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("✧･ﾟ: *✧･ﾟ:* *:･ﾟ✧*:･ﾟ✧✧･ﾟ: *✧･ﾟ");
        System.out.println("★ 이동 지역을 선택하세요 ★");
        System.out.println("[1]부산 [2]대전 [3]강릉 [4]광주 : ");
        int regionCode = sc.nextInt();

        System.out.println("★ 이동 할 승객 수를 입력하세요 ★ : ");
        int people = sc.nextInt();

        System.out.println("★ 이동할 차량을 선택하세요 ★");
        System.out.println("[1]스포츠카 [2]승용차 [3]버스 : ");
        int carCode = sc.nextInt();

        System.out.println("★ 부가 기능을 선택하세요 ★");
        System.out.println("[1]ON [2]OFF : ");
        boolean modeOn = (sc.nextInt() == 1);

        System.out.println("★ 날씨를 선택하세요 ★");
        System.out.println("[1]맑음 [2]비 [3]눈 : ");
        int weatherCode = sc.nextInt();

        int distance = 0;

        switch (regionCode) {
            case 1: distance = 400; break;
            case 2: distance = 150; break;
            case 3: distance = 250; break;
            case 4: distance = 300; break;
            default:
                System.out.println("※ 헉! 잘못된 지역 코드입니다! 다시 설정해주세요! ※");
                return;
        }

        Car car = null;
        String NAME;

        switch(carCode) {
            case 1:
                NAME = "폭스바겐 R";
                car = new SportsCar(NAME);
                break;
            case 2:
                NAME = "제네시스 G80";
                car = new Sedan(NAME);
                break;
            case 3:
                NAME = "고속버스 6600번";
                car = new Bus(NAME);
                break;
        }

        if(car instanceof Aircon ac) {
            System.out.print(car.getName() + " 에어컨 [1]ON [2]OFF : ");
            int isOn = sc.nextInt();
            if (isOn == 1) ac.airconOn();
            else ac.airconOff();
        }

        if(car instanceof Audio) {
            System.out.print(car.getName() + " 오디오 [1]ON [2]OFF : ");
            int isOn = sc.nextInt();
            if (isOn == 1) ((Audio) car).audioOn();
            else ((Audio) car).audioOff();
        }

        if(car instanceof AutoPilot) {
            System.out.print(car.getName() + " 자율주행 [1]ON [2]OFF : ");
            int isOn = sc.nextInt();
            if (isOn == 1) ((AutoPilot) car).autoPilotOn();
            else ((AutoPilot) car).autoPilotOff();
        }

        car.setMode(modeOn);

        double moveNum = car.numOfMove(people);
        double totalD = car.totalDistance(moveNum, distance);
        double totalFuelAmount = car.calculateFuelConsumption(totalD);
        double travelTime = car.calculateTravelTime(distance,moveNum,weatherCode);
        int hour = (int) travelTime;
        int minute = (int) ceil((travelTime - hour) * 60);


        NumberFormat nf = NumberFormat.getInstance();

        System.out.println("✧･ﾟ: *✧･ﾟ:*" + car.getName() + "*:･ﾟ✧*:･ﾟ✧");
        System.out.println("총 비용 : " + nf.format(car.totalCoast(totalFuelAmount)));
        System.out.println("총 주유 횟수 : " + car.calculateRefuelingCount(totalFuelAmount));
        System.out.println("총 이동 시간 : " + hour + "시 " + minute + "분");

        if(car instanceof Aircon ac) System.out.println("에어컨 : " + (ac.getAircon() ? "ON" : "OFF"));

        if(car instanceof Audio ad) System.out.println("오디오 : " + (ad.getAudio() ? "ON" : "OFF"));

        if(car instanceof AutoPilot ap) System.out.println("자율주행 : " + (ap.getAutoPilot() ? "ON" : "OFF"));


        System.out.println("✧･ﾟ: *✧･ﾟ:* *:･ﾟ✧*:･ﾟ✧✧･ﾟ: *✧･ﾟ");
    }
}