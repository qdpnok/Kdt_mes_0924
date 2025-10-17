package 에어컨실습;

// 기능 설계
//  - 전원 ON/OFF 기능
//  - 온도 설정 기능 (1도 단위 설정)
//  - 냉방기 ON/OFF 기능
//  - 난방기 ON/OFF 기능
//  - 바람세기 설정 (1단계 / 2단계 / 3단계)

// 인스턴스 필드, 게터, 세터, 생성자 만들기

import java.util.Calendar;
import java.util.Scanner;

public class AirCon {
    private boolean isPower;    // 전원
    private int setTemp;        // 온도 설정
    private int currTemp;       // 현재 온도
    private boolean isCooler;   // 쿨러
    private boolean isHeater;   // 히터
    private int windStep;       // 바람 세기
    private Scanner sc = null;

    public AirCon(boolean power, int setTemp, boolean cooler, boolean heater, int step){
        // 시뮬레이션을 위해서 월 평균 기온을 배열로 저장
        final int[] monthArr = {-5, 3, 10, 15, 22, 28, 32, 30, 24, 16, 8, 4};
        Calendar now = Calendar.getInstance(); // 운영체제를 기준으로 현재 날짜와 시간 정보를 가져 옴
        int month = now.get(Calendar.MONTH);   // 현재가 몇 월인지 정보가 배열의 인덱스와 동일하게 넘어옴
        this.isPower = power;
        this.setTemp = setTemp;
        this.currTemp = monthArr[month];    // 현재 월에 대한 온도를 배열에서 가져옴
        this.isCooler = cooler;
        this.isHeater = heater;
        this.windStep = step;

        sc = new Scanner(System.in);
    }

    // 에어컨 정보 출력하기, 온도가 변경되면 정보를 출력
    public void airConInfo() {
        final String[] step = {"", "1단계", "2단계", "3단계"};
        System.out.println("=".repeat(10) + "에어컨 정보" + "=".repeat(10));
        System.out.println("전원 : " + (isPower ? "ON" : "OFF"));
        System.out.println("현재 온도 : " + currTemp);
        System.out.println("설정 온도 : " + setTemp);
        System.out.println("쿨러 : " + (isCooler ? "ON" : "OFF"));
        System.out.println("히터 : " + (isHeater ? "ON" : "OFF"));
        System.out.println("바람 세기 : " + step[windStep]);
    }

    // 전원 설정 기능, 세터
    public void setPower(boolean power) {
        this.isPower = power;
    }
    // 바람세기 설정 기능, 세터
    public void setWindStep(int step) {
        this.windStep = step;
    }
    // 온도 설정에 대한 세터
    public void setSetTemp(int temp) {
        this.setTemp = temp;
    }
    // 현재 온도 변경 기능 (시뮬레이션 동작), 세터
    public void setCurrTemp(int n) {
        currTemp += n;
    }

    // 현재 온도 확인, 게터
    public int getCurrTemp() {
        return currTemp;
    }
    // 설정 온도 확인, 게터
    public int getSetTemp() {
        return setTemp;
    }
    // 바람 세기 확인, 게터
    public int getWindStep() {
        return windStep;
    }
    // 쿨러, 게터
    public boolean isCooler() {
        return isCooler;
    }
    // 히터, 게터
    public boolean isHeater() {
        return isHeater;
    }

    // 에어컨 설정하기
    public void setAirCon() {
        // 현재 온도 알려주기
        System.out.println("현재 온도는 " +  getCurrTemp() + "도 입니다.");
        // 온도 설정
        System.out.print("온도 설정 : ");
        setSetTemp(sc.nextInt());
        System.out.println("설정 온도는 " +  getSetTemp() + "도 입니다.");
        // 바람 세기 설정
        System.out.print("바람 세기 설정(1/2/3) : ");
        setWindStep(sc.nextInt());
        // 조건에 따라서 히터와 쿨러 켜고 끄기
        // 현재 온도가 설정 온도보다 높으면 에어컨 쿨러 켜기, 히터 끄기
        // 둘이 같으면 둘 다 끄기
        if (getCurrTemp() > getSetTemp()) { // 현재 온도가 설정 온도보다 높은 상태
            System.out.println("Cooler가 동작합니다.");
            isCooler = true;
            isHeater = false;
        } else if (getCurrTemp() < getSetTemp()) {
            System.out.println("Heater가 동작합니다.");
            isHeater = true;
            isCooler = false;
        } else {
            isHeater = false;
            isCooler = false;
        }
    }

}
