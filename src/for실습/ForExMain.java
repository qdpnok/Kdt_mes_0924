package for실습;

// 입력 받은 수의 범위 내의 짝수의 합 구하기 (입력받은 수 포함)

import java.util.Scanner;

public class ForExMain {
    public static void main(String[] args) {
        // 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);

        // 합을 저장할 변수 생성(초기화)
        int total = 0;

        System.out.println("=".repeat(5) + "문제1" + "=".repeat(5));
        System.out.print("시작 수 : ");
        int start = sc.nextInt();
        System.out.print("종료 수 : ");
        int end = sc.nextInt();

        // 범위 기반 반복문 생성
        for (int i=start; i < end+1; i++ ) {
            // 짝수 판별 조건 추가
            // 짝수인 경우 값을 누적
            if(i%2 == 0) total += i;
        }

        // 반복문 종료 후 결과 출력
        System.out.println("짝수의 합은 " + total + "입니다.");

        // 실습 문제 2번
        // 입력 받은 수의 범위 내의 5의 배수를 출력하기, 한줄에 10개씩 출력
        System.out.println("=".repeat(5) + "문제2" + "=".repeat(5));
        System.out.print("수 입력 : ");
        int num5 = sc.nextInt();
        for (int i=1; i*5<=num5; i++){
            System.out.print(i*5);
            if (i%10 == 0) System.out.println();
            else System.out.print(" ");
        }
        System.out.println();
        // 실습 문제 3번
        // 정수를 입력받아 입력받은 정수 * 정수 크기의 행렬을 출력하는 프로그램
        // 입력 : 4
        //  1  2  3  4
        //  5  6  7  8
        //  9 10 11 12
        // 13 14 15 16
        // %5d 같이 정렬하면 된대. 나는,, 걍 정렬햇는데
        System.out.println("=".repeat(5) + "문제3" + "=".repeat(5));
        System.out.print("정수 입력 : ");
        int pow = sc.nextInt();
        int max = pow * pow;
        int temp1 = max;
        int temp2 = 10;
        int space = 0;
        int maxSpace = 0;

        while(true) {
            temp1 /= 10;
            if(temp1 > 0) maxSpace += 1;
            else break;
        }

        for (int i=1; i<=max; i++) {

            if (i%temp2 == 0) {
                space += 1;
                temp2 *= 10;
            }
            for(int j=space; j<maxSpace; j++) System.out.print(" ");

            System.out.print(i);
            if (i%pow == 0) System.out.println();
            else System.out.print(" ");
        }
    }
}
