package 자동차종합실습;

public abstract class Car {
    private int speed;            // 속도
    private double fuelEfficiency;   // 연비
    private int fuelTank;         // 연료탱크 크기
    private int seats;            // 좌석 수
    private String name;          // 차량 이름

    // 기름값
    private static final int FUEL_PRICE = 2000;

    // 생성자
    public Car(int speed, int fuelEfficiency, int fuelTank, int seats, String name) {
        this.speed = speed;
        this.fuelEfficiency = fuelEfficiency;
        this.fuelTank = fuelTank;
        this.seats = seats;
        this.name = name;
    }

    // 추상 메서드 (부가 기능)
    public abstract void setMode(boolean isOn);

    // 게터 / 세터
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    public void setFuelEfficiency(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }

    public int getFuelTank() {
        return fuelTank;
    }

    public void setFuelTank(int fuelTank) {
        this.fuelTank = fuelTank;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //  총 연료 소모량 = 총 이동 거리 / 연비
    public double calculateFuelConsumption(double totalDistance) {
        // 상미님 메소드 호출
        double Fuelefficiency = this.getFuelEfficiency();
        return totalDistance/Fuelefficiency;
    }
    
    // 총 주유 횟수 = ceil(총 연료 소모량 / 연료탱크 크기)
    public int calculateRefuelingCount(double totalFuelConsumption) {
        double tankCapacity = this.getFuelTank();
        double Numberofrefueling = Math.ceil(totalFuelConsumption / tankCapacity);
        return (int) Numberofrefueling;
    }
    
    // 이동 시간 = (거리 / 속도) × 횟수 × 날씨 보정계수
    // 날씨 보정계수 : 1.0 (맑음), 1.2 (흐림/비), 1.4 (눈/안개)
    // 날씨 코드 int로 가정 : 1=맑음, 2=흐림/비, 3=눈/안개
    public double calculateTravelTime(double distance, double number, int weather){
        double speed = this.getSpeed();

        double weatherFactor;
        switch (weather) {
            case 1: // 맑음
                weatherFactor = 1.0;
                break;
            case 2: // 흐림, 비
                weatherFactor = 1.2;
                break;
            case 3: // 눈, 안개
                weatherFactor = 1.4;
                break;
            default:
                // 기본값 설정
                weatherFactor = 1.0;
                System.err.println("오류: 유효하지 않은 날씨 코드입니다. 기본값을 적용합니다.");
                break;
        }

        return (distance/speed) * number * weatherFactor;

    }


    public double numOfMove(int people) {
        return Math.ceil((double)people/this.getSeats());
    }

    public double totalDistance(double moveNum, int distance) {
        return distance * moveNum;
    }

    public double totalCoast(double calculateFuelConsumption) {
        return calculateFuelConsumption * FUEL_PRICE;
    }

    @Override
    public String toString() {
        return  "차량명: " + name +
                "\n속도: " + speed + "km/h" +
                "\n연비: " + fuelEfficiency + "km/L" +
                "\n연료탱크: " + fuelTank + "L" +
                "\n좌석 수: " + seats + "석";
    }
}
