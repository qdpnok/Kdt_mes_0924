package 조건문;
// 제어문 : 프로그램이 원하는 결과를 얻기 위해 프로그램의 흐름을 제어하는 것
// 조건문 : 주어진 조건식에 따라 조건을 분기 하는 것
// 반복문 : 주어진 조건이 참인 동안 반복 수행

import java.util.Scanner;

public class ConditionMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 국어, 영어, 수학 성적을 입력받음
        // 이름을 입력받음
        // 국어, 영어, 수학 성적이 0 미만이거나 100 초과이면 입력 오류라고 출력
        // 정상적인 입력이면 총점과 평균을 구하고
        // 평균이 90점 이상이면 이름, 총점, 평균, 등급 A
        // 평균이 80점 이상이면 이름, 총점, 평균, 등급 B
        // 평균이 70점 이상이면 이름, 총점, 평균, 등급 C
        // 평균이 60점 이상이면 이름, 총점, 평균, 등급 D
        // 나머지는 이름, 총점, 평균, 등급 E

        System.out.print("당신의 이름: ");
        String name = sc.next();

        int kor, eng, mat;

        while (true) {
            System.out.print("국어 성적: ");
            kor = sc.nextInt();
            if (kor < 0 || kor > 100) System.out.println("국어 성적 입력 오류");
            else break;
        }

        while (true) {
            System.out.print("영어 성적: ");
            eng = sc.nextInt();
            if (eng < 0 || eng > 100) System.out.println("영어 성적 입력 오류");
            else break;
        }

        while (true) {
            System.out.print("수학 성적: ");
            mat = sc.nextInt();
            if (mat < 0 || mat > 100) System.out.println("수학 성적 입력 오류");
            else break;
        }

        int total = kor + eng + mat;
        double avg = total / 3.0;

        // 걍 C 언어 작성하듯이 하면 된다는
        if (avg >= 90) {
            System.out.print(name + "은(는) 총점 " + total + "점, 평균 ");
            System.out.printf("%.2f", avg);
            System.out.println("점으로 A등급입니다.");
        } else if (avg >= 80) {
            System.out.print(name + "은(는) 총점 " + total + "점, 평균 ");
            System.out.printf("%.2f", avg);
            System.out.println("점으로 B등급입니다.");
        } else if (avg >= 70) {
            System.out.print(name + "은(는) 총점 " + total + "점, 평균 ");
            System.out.printf("%.2f", avg);
            System.out.println("점으로 C등급입니다.");
        } else if (avg >= 60) {
            System.out.print(name + "은(는) 총점 " + total + "점, 평균 ");
            System.out.printf("%.2f", avg);
            System.out.println("점으로 D등급입니다.");
        } else {
            System.out.print(name + "은(는) 총점 " + total + "점, 평균 ");
            System.out.printf("%.2f", avg);
            System.out.println("점으로 E등급입니다.");
        }
    }
}
