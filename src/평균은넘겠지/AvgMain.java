package 평균은넘겠지;

import java.util.Scanner;

public class AvgMain {
    // 입력을 받기 위한 스캐너 생성
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // 테스트 케이스 수 입력 받기
        int count = sc.nextInt();

        // 각 테스트에 케이스의 결과를 저장할 double type의 배열 생성
        // (처음에 테스트 케이스 개수 만큼)
        double[] testCase = new double[count];

        // 반복문을 돌면서 각 케이스에 대한 평균 구하는 메서드 호출
        for(int i=0; i<count; i++) {
            testCase[i] = avg();
        }

        // 향상된 for 문을 순회하면서 결과 출력
        for(double e : testCase)  System.out.printf("%.3f%%\n", e);

        sc.close(); // 스캐너 객체 닫기

    }

    // 각 테스트 케이스에서 평균이 넘는 비율을 계산하는 메서드 만들기
    static double avg() {
        int count = sc.nextInt();
        int[] score = new int[count];
        int avg = 0;

        for(int i=0; i<count; i++) {
            score[i] = sc.nextInt();
            avg += score[i];
        }

        avg /= count;
        int upCount = 0;

        for(int e : score) if (e > avg) upCount++;

        return upCount/(double) count*100;
    }
}
