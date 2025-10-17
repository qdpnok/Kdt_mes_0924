package 영화표예매하기;

// 메뉴 : [1] 예매하기 [2] 취소하기 [3] 종료하기

import java.util.Scanner;

public class MovieMain {
    public static void main(String[] args) {
        boolean run = true;
        // TODO: 좌석당 가격을 생성자로 전달해서 객체 생성
        MovieTicket mt = new MovieTicket(13000);

        // TODO: 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);

        // TODO: while 반복문 생성 [1]예매하기 [2]취소하기 [3]종료하기
        /* while(run) {
            System.out.println("[1]예매하기 [2]취소하기 [3]종료하기");
            System.out.print("무엇을 하시겠습니까? : ");
            System.out.println();
            int n = sc.nextInt();
            switch(n) {
                case 1:
                    mt.bookSeat();
                    break;
                case 2:
                    mt.cancleSeat();
                    break;
                case 3:
                    mt.showMoney();
                    run = false;
                    break;
            }

        } */

        while(true) {
            System.out.println("=".repeat(8) + "영화표 예매하기" + "=".repeat(8));
            System.out.println("[1]예매하기 [2]취소하기 [3]종료하기");
            System.out.print("메뉴 선택 : ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1: mt.selectSeat(); break;
                case 2: mt.cancelSeat(); break;
                case 3: // break 대신 return 때려버려도 됨.
                    System.out.println("총 판매 금액: " + mt.totalAmount() + "원"); return;
                default: System.out.println("메뉴 선택이 잘못되었습니다.");
            }
        }
    }
}
