package 코코아톡;

import java.util.Scanner;

public class CocoaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NetAdapter adapter;
        CocoaTalk cocoaTalk;
        System.out.println("네트워크 선택 [1]WiFi [2]5G [3]LTE : ");
        int choice = sc.nextInt();

        // 생성자 호출로 객체 생성 시 상대방의 ㄹ,ㅁ거ㅣ dfmf 매개변수로 둔갑
        switch (choice) {
            case 1: adapter = new WiFi(); break;
            case 2: adapter = new FiveG(); break;
            case 3: adapter = new Lte (); break;
            default: adapter = null;
        }
        // 코코아톡 객체 생성
        cocoaTalk = new CocoaTalk("아이브", adapter);
        // 메시지 작성 메서드 호출
        cocoaTalk.writeMsg("신규 앨범 활동 잘 하세요");
        // 메시지 전송
        cocoaTalk.send();

    }
}
