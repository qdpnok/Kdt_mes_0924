package for반복문;
// 범위기반 for : for(초기값; 최종값; 증감값)


import java.util.Scanner;

public class ForMain {
    public static void main(String[] args) {
        // 입력 받은 수의 합 구하기
        Scanner sc = new Scanner(System.in); // 키보드 입력 위해 스캐너 객체 생성
        int total = 0;
        System.out.print("정수 입력 : ");
        int num = sc.nextInt();
        for(int i = 1; i <= num; i++) { // 1 ~ 입력받은 수와 같을 때 까지
            total += i; // total = total + i
        }
        System.out.println(total);
    }
}
