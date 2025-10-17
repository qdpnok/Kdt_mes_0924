package 열거클래스;
// 열거 타입 : 한정된 상수 집합을 정의할 수 있는 참조타입
// - 비교시 값뿐만 아니라 타입도 검사
// - 기존의 public static final 상수를 대체하기도 함.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EnumMain {
    public static void main(String[] args) {
        // 스캐너로 개발자 5명에 대해서 정보를 입력받아 한번에 출력하기
        List<Developer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i=0; i<5; i++) {
            System.out.println("[" + (i+1)+ "번째 개발자 입력]");
            // 이름 입력
            System.out.print("이름 입력: ");
            String name = sc.nextLine();

            // 개발 업무 선택: [1]FRONTEND [2]BACKEND [3]FULLSTACK [4]MOBILE [5]AI
            System.out.print("[1]FRONTEND [2]BACKEND [3]FULLSTACK [4]MOBILE [5]AI\n개발 업무 입력: ");
            int in = sc.nextInt();
            DevType dt = null;
            switch (in) {
                case 1: dt = DevType.FRONTEND; break;
                case 2: dt = DevType.BACKEND; break;
                case 3: dt = DevType.FULLSTACK; break;
                case 4: dt = DevType.MOBILE; break;
                case 5: dt = DevType.AI; break;
                default: System.out.println("업무를 잘 못 선택하셨습니다.");
            }

            // 경력 입력 : [1]JUNIOR [2]SENIOR
            System.out.print("[1]JUNIOR [2]SENIOR\n경력 입력: ");
            in = sc.nextInt();
            Career c = null;
            c = (in == 1) ? Career.JUNIOR : Career.SENIOR;

            // 성별 입력 : [1]MALE [2]FEMALE
            System.out.print("[1]MALE [2]FEMALE\n성별 입력: ");
            in = sc.nextInt();
            Gender g = null;
            g = (in == 1) ? Gender.MALE : Gender.FEMALE;

            sc.nextLine();

            list.add(new Developer(name, dt, c, g));
        }

        // 개발자 목록 출력
        for(Developer e : list) {
            System.out.println(e);
        }
    }
}
