package 배열실습;
// 평균점수 구하기
// 수강생이 5명, 각 학생의 점수 40 미만이면 보충학습을 듣는 조건으로 40점으로 변경
// 55, 65, 30, 45, 25 => 55, 65, 40, 45, 40

import java.util.Scanner;

public class ArrayExMain {
    public static void main(String[] args) {
        // 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);
        // 5명의 학생의 성적으로 저장하는 배열 생성
        int[] scores = new int[5];
        int total = 0;

        // 5명의 성적을 입력받기 (배열)
        // 40점 미만의 성적은 40점으로 변경해서 평균 구하기
        for(int i=0; i<5; i++) {
            scores[i] = sc.nextInt();
            if (scores[i] < 40 ) scores[i] = 40;
        }

        for(int e : scores) {
            total += e;
        }

        System.out.printf("5명의 성적 평균은 %.2f\n", total/5.0);

        // 실습 문제 2번
        // 7자리의 로또 번호 생성하기 ( 배열과 Math.random() 사용 ), 1 ~ 45 사이의 임의의 수 7개를 생성해 배열에 저장하기
//        int[] lotto = new int[7];
//        int cnt = 0;
//        boolean flag = true;
//
//        while(true) {
//            if(cnt == 7) break;
//            lotto[cnt] = (int) (Math.random() * 45) + 1;
//
//            for(int i=0; i<cnt; i++) {
//                if(lotto[i] == lotto[cnt]) {
//                    flag = false;
//                    break;
//                } else flag = true;
//            }
//
//            if(flag) cnt++;
//        }
//
//        for(int e : lotto) System.out.print(e + " ");

        int[] lotto = new int[7];
        int rand;
        int index = 0;
        boolean isExist = false;
        while(true) {
            rand = (int) (Math.random() * 45) + 1;
            for(int i=0; i<7; i++) {
                if(lotto[i] == rand) isExist = true;
            }
            if(!isExist) lotto[index++] = rand;
            if(index == 7) break;
            isExist = false;
        }
        for(int e : lotto) System.out.print(e + " ");
    }
}
