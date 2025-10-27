package 예외처리2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx2Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rst = 0;
        while(true) {
            System.out.print("두개의 정수 업력 : ");
            try {
                int a = sc.nextInt();
                int b = sc.nextInt();
                rst = a / b;
                break;
            } catch (ArithmeticException e) {
                System.out.println("나눗셈 오류 : " + e);
            } catch (InputMismatchException e) {
                System.out.println("숫자만 입력하세요 : " + e);
                sc.nextLine();
                // nextInt에 숫자가 아닌 값이 입력되면 무한반복 되는 오류가 잇음.
                // 그래서 버퍼 비우기를 해줘야 함
            }
        }
        System.out.println("결과 : " + rst);
    }
}
