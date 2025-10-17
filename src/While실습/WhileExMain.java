package While실습;
// 두 개의 주사위를 던져 같은 수가 나오면 값을 보여주고 무인도 탈출
// Math.random() : 0 ~ 1 미만의 무작위 실수값 생성, 0.0001 ~ 0.9999
// int val = (int) (Math.random() * 6 ) + 1

public class WhileExMain {
    public static void main(String[] args) {
        System.out.println("주사위를 굴리는 중...");
        int count = 0;
        while(true) {
            count++;
            int dice1 = (int) (Math.random() * 6 ) + 1;
            int dice2 = (int) (Math.random() * 6 ) + 1;

            System.out.println( count + "번 째 주사위는 " + dice1 + " " + dice2 + "이(가) 나왔습니다");

            if(dice1 == dice2) {
                System.out.println("무인도 탈출~");
                break;
            }
        }
    }
}
