package 스위치;
// switch 문 : 조건문의 일종. if문은 조건식이 올 수 있지만, 조건식이 올 수 없고 값만 올 수 있음
// 조건의 값으로는 정수, 문자, 문자열이 올 수 있고, 실수는 안됨
// 조건에 대한 수행 이후 반드시 break 문이 필요하다.

import java.util.Scanner;

public class SwitchMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("좋아한는 계절 입력 : ");
        String season = sc.next().toLowerCase(); // 입력받은 문자열을 소문자로 변경해서 대입

        switch (season) { // 조건값
            case "spring":
                System.out.println("장범준");
                break; // 탈출문이 필요, 없으면 아래의 조건이 실행됨
            case "summer":
                System.out.println("히사이시조");
                break;
            case "fall":
            case "autumn":
                System.out.println("나가죽을소년들");
                break;
            case "winter":
                System.out.println("머라이어캐리");
            default:
                System.out.println("흥");
        }

    }
}
