package 매쓰응용문제;
// 1. 주사위 두 개 굴리기
// - 두 주사위의 값을 출력
// - 합계를 출력
// - 두 주사위의 값이 같은 수면 "더블!" 문구 출력

// 2. 절대값 계산기
// - Scanner로 정수 두 개 입력받기
// - 두 수의 차이를 절대값으로 출력 => "두 수의 차이는 XX입니다."

// 3. 점수 반올림 프로그램
// - 실수형으로 점수를 입력받음
// - 입력받은 점수를 내림, 올림, 반올림한 점수 출력하기

import java.util.Scanner;

public class MathExMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=".repeat(8) + " 1. 주사위 두 개 굴리기 " + "=".repeat(8));
        while (true) {
            int dice1 = (int) ((Math.random()*6) + 1);
            int dice2 = (int) ((Math.random()*6) + 1);

            System.out.println(dice1 + " " + dice2);
            System.out.println(dice1+dice2);
            if(dice1 == dice2) {
                System.out.println("더블!");
                break;
            }
        }

        System.out.println("=".repeat(8) + " 2. 절대값 계산기 " + "=".repeat(8));
        System.out.print("정수를 입력해주세요 : ");
        int int1 = sc.nextInt();
        System.out.print("정수를 입력해주세요 : ");
        int int2 = sc.nextInt();
        System.out.println("두 수의 차이는 " + Math.abs(int1 - int2) + "입니다.");

        System.out.println("=".repeat(8) + " 3. 점수를 올릴까 내릴까 올리지말고내릴까 " + "=".repeat(8));
        System.out.print("점수를 입력해주세요 (실수) : ");
        double score = sc.nextDouble();
        System.out.println("내림: " + Math.floor(score) + " 올림: " + Math.ceil(score) + " 반올림: " + Math.round(score));
        // 수학적인 연산을 총해서 구하기
        System.out.println("소수점 두번째 자리 출력: " + Math.round(score *100) / 100.0);
        // 서식지정자를 이용
        System.out.printf("소수점 두 번째 자리 출력 : %.2f\n)", score);
    }
}
