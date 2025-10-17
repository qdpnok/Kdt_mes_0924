package 너의BMI가들려;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("키(cm) : ");
        int heightCm = sc.nextInt();
        System.out.print("몸무게(kg) : ");
        int weight = sc.nextInt();

        double heightM = heightCm / 100.0;

        double BMI = weight / (heightM * heightM);

        // 걍 C 언어 문자열 출력하는 것처럼 해도 되네 얼마나 인상깊었으면 문제 푼거마다 적어놨어
        if (BMI < 18.5) {
            System.out.print("당신의 BMI는 ");
            System.out.printf("%.2f", BMI);
            System.out.println("이며, 저체중입니다.");
        } else if(BMI < 23) {
            System.out.print("당신의 BMI는 ");
            System.out.printf("%.2f", BMI);
            System.out.println("이며, 정상입니다.");
        } else if(BMI < 25) {
            System.out.print("당신의 BMI는 ");
            System.out.printf("%.2f", BMI);
            System.out.println("이며, 과체중입니다.");
        } else {
            System.out.print("당신의 BMI는 ");
            System.out.printf("%.2f", BMI);
            System.out.println("이며, 비만입니다.");
        }
    }
}
