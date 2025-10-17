package 표준입력실습;

// 이름(next), 전화번호(next), 주소(nextLine), 성별(char), 나이(int), 직업(next)을 입력받아 이쁘게 출력하기
// 성별은 'M' 또는 'F'로 입력받아 출력 시 남성과 여성으로 출력
// 스캐너 연속 입력 시 버퍼 비우기 필요할 수 있음 : sc.nextLine()

import java.util.Scanner;

public class InputExMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름 : ");
        String name = sc.next();

        System.out.print("전화번호 : ");
        String tel = sc.next();

        sc.nextLine();

        System.out.print("주소 : ");
        String addr = sc.nextLine();

        System.out.print("성별 : ");
        char gender = sc.next().charAt(0); // 문자열에서 0번째 문자 추출

        System.out.print("나이 : ");
        int age = sc.nextInt();

        System.out.print("직업 : ");
        String job = sc.next();

        System.out.println("=".repeat(10) + "회원 정보 출력" + "=".repeat(10) );
        System.out.println("이름은 " + name + "입니다.");
        System.out.println("전화번호는 " + tel + "입니다.");
        System.out.println("주소는 " + addr + "입니다.");
        System.out.println("성별은 " + ((gender=='M') ? "남성" : "여성") + "입니다.");
        System.out.println("나이는 " + age + "입니다.");
        System.out.println("직업은 " + job + "입니다.");
    }
}
