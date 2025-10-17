package 영화표예매하기;

import java.util.Scanner;

public class MovieTicket {
    // TODO: 좌석 10개 대한 배열 생성, seat의 주소 변경을 막기 위해 final 지정
    private final int[] seat;

    // TODO: 좌석당 가격을 받기 위한 인스턴스 필드 생성, 외부에서 생성자를 통해서 주입받은 값이 변경되는 걸 막기 위해 final
    private final int price;

    // TODO: 입력용 스캐너 생성, 대입받는 스캐너의 주소를 고정하기 위해서 final 사용
    private final Scanner sc;

    // TODO: 생성자를 만들고 가격을 주입(매개변수) 받음
    public MovieTicket(int price) {
        // 생성자가 호출될 때 다양한 변수들을 초기화하는게 조금 더 좋은 방법인듯
        seat = new int[10];  // heap 영역에 배열을 할당하면 자동 초기화 됨 (자바)
        sc = new Scanner(System.in);
        this.price = price;
    }

    // TODO: 좌석 상태를 출력하는 메서드 생성 : 배열의 값이 0이면 [ ], 1이면 [V]
    public void printSeat() {
        for(int e : seat) {  // 향상된 for문으로 이터러블 객체를 자동 순회, e변수는 배열의 실제 값이 복사 됨
            System.out.print((e == 0 ? "[ ]" : "[V]"));
        }
        System.out.println();
    }

    /* public void showSeat() {
        System.out.println();
        System.out.println("현재 좌석 상태입니다.");
        String seatState="";
        for(int i=0; i< seat.length; i++) {
            if (seat[i] == 0) seatState += "[ ] ";
            else seatState += "[V] ";
        }
        System.out.println(seatState);
        System.out.println();
    }
    */

    // TODO: 좌석 번호 유효성 체크, 반환값이 boolean이기 때문에 true, false 값을 반환
    private boolean isValidPos(int seatPos) { return seatPos >= 1 && seatPos <= seat.length; }


    // TODO: 좌석 예매 메서드 (먼저 좌석 상태 보여주고, 예매 기능 처리하고, 변경된 좌석 상태 보여줌)
    public void selectSeat() {
        printSeat();
        System.out.print("예매할 좌석 번호(0 ~ 10) : ");
        int seatPos = sc.nextInt();

        // 유효성 검사
        if(!isValidPos(seatPos)) {
            System.out.println("좌석 번호는 1 ~ 10 사이로 입력하세요.");
        }
        // 예매 가능 여부를 확인
        if (seat[seatPos-1] == 0) {  // 배열의 인덱스는 0부터 시작하기 때문에 입력받은 값에서 1을 빼줌
            seat[seatPos-1] = 1; // 예약된 좌석 1로 변경
            System.out.println(seatPos + "번 좌석 예매 완료");
            printSeat(); // 변경된 좌석 상태를 보여줌
        } else {
            System.out.println("이미 예약된 좌석입니다. 다른 좌석을 선택하세요.");
        }
    }

    /* public void bookSeat() {
        showSeat();
        System.out.print("어떤 좌석을 예매하시겠습니까? (1~10) : ");
        int num = sc.nextInt();
        if(num <= 0 || num >= 10) System.out.println("좌석 번호 범위가 아닙니다.");
        else if(seat[num-1] == 1) System.out.println("이미 예약된 좌석입니다.");
        else {
            seat[num-1] = 1;
            showSeat();
        }
        System.out.println();
    }
     */

    // TODO: 좌석 취소 메서드 (먼저 좌석 상태 보여주고, 취소 기능 처리하고, 변경된 좌석 상태 보여줌)
    /* public void cancleSeat() {
        showSeat();
        System.out.print("어떤 좌석을 취소하시겠습니까? (1~10) : ");
        int num = sc.nextInt();
        if(num <= 0 || num >= 10) System.out.println("좌석 번호 범위가 아닙니다.");
        else if(seat[num-1] == 0) System.out.println("예약되지 않은 죄석입니다.");
        else {
            seat[num-1] = 1;
            showSeat();
        }
        System.out.println();
    } */

    public void cancelSeat() {
        printSeat();
        System.out.print("예매할 좌석 번호(0 ~ 10) : ");
        int seatPos = sc.nextInt();

        // 유효성 검사
        if(!isValidPos(seatPos)) {
            System.out.println("좌석 번호는 1 ~ 10 사이로 입력하세요.");
        }
        // 예매 가능 여부를 확인
        if (seat[seatPos-1] == 1) {  // 배열의 인덱스는 0부터 시작하기 때문에 입력받은 값에서 1을 빼줌
            seat[seatPos-1] = 0; // 예약된 좌석을 취소 상태인 0으로 변경
            System.out.println(seatPos + "번 좌석 취소 완료");
            printSeat(); // 변경된 좌석 상태를 보여줌
        } else {
            System.out.println("해당 좌석은 예매되지 않은 좌석입니다.");
        }
    }

    // TODO: 종료하기 선택 시 총 매출액 보여주기
    public int totalAmount() {
        int cnt = 0; // 예약된 좌석 수를 누적하기 위한 변수
        for (int e : seat) {
            if(e == 1) cnt++; // 예약된 좌석이면 cnt 증가
        }
        return price * cnt; // 가격 x 좌석 수
    }
    /* public void showMoney() {
        int sum = 0;
        for( int e : seat ) { if(e == 1) sum += price;}
        System.out.println("현재 예매된 좌석의 총 가격은 " + sum + "원 입니다.");
    } */
}
