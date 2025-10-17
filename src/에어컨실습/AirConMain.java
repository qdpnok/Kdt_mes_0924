package 에어컨실습;

import java.util.Scanner;

import static java.lang.Thread.sleep;

public class AirConMain {
    public static void main(String[] args) throws InterruptedException {
        AirCon lgAirCon = new AirCon(false, 24, false, false, 1);

        Scanner sc = new Scanner(System.in);

        System.out.print("에어컨 켜기 (yes / no) : ");
        String isON = sc.nextLine();
        if (isON.equalsIgnoreCase("yes")) { // 대소문자 구분 않고 yes면
            int elapsedTime = 0; // 경과 시간 계산하기
            boolean changedTemp = false; // 온도 변화 감지
            lgAirCon.setPower(true);     // 전원 켜기
            lgAirCon.setAirCon();        // 에어컨 설정
            while (true) {
                sleep(1000);        // 잠시 쉬고 있는 동안 interrupt를 걸면
                                          // 프로그램이 죽을 수  있으므로 throws로 예외처리
                elapsedTime++;
                switch(lgAirCon.getWindStep()) {
                    case 2: if(elapsedTime >= 30) changedTemp = true; break;
                    case 3: if(elapsedTime >= 20) changedTemp = true; break;
                    case 1:
                    default: if(elapsedTime >= 60) changedTemp = true;
                }
                if(changedTemp) {
                    if(lgAirCon.isHeater()) lgAirCon.setCurrTemp(1);
                    if(lgAirCon.isCooler()) lgAirCon.setCurrTemp(-1);
                    lgAirCon.airConInfo(); // 온도가 변경됐으므로 현재 상태를 보여줌
                    elapsedTime = 0;
                    changedTemp = false;
                }
                // 현재 온도와 설정 온도가 같은 경우
                if(lgAirCon.getCurrTemp() == lgAirCon.getSetTemp()) {
                    System.out.println("에어컨을 종료합니다.");
                    break;
                }
            }
        }
    }
}
