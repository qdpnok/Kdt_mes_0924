package 샘플;

public class SampleMain {
    public static void main(String[] args) {
        System.out.println("안녕하세요. 자바를 배워 보겠습니다.");
        char gender = '남';
        System.out.print((int)gender);

        // 변수 : 값을 저장하기 위해 메모리 공간을 확보하고 이름을 붙인 것
        // 변수를 선언만 하는 방법
        int age;
        int score = 99; // 변수의 선언과 동시에 값을 대입
        int total = 0; // 변수를 선언하고 초기화

        boolean isTrue; // 논리형 변수 선언: 참과 거짓으로만 구분

        // 정수형 변수 선언
        byte bNum; // 1byte 크기의 변수 선언 -128 ~ 127
        short sNum; // 2byte 크기의 변수 선언 -32,xxx ~ 32,xxx
        int iNum; // 4byte 크기의 변수 선언 -21억 ~ 21억
        long lNum; // 8byte

        // 실수형 변수 선언, 근사치 계산법으로 계산하기 때문에 정확한 값이 표현되지 않을 수도 있음.'
        float fNum; // 4byte (지수부, 허수부 포함)
        double dNum; //8

        // 문자형, 2byte이며, 음수가 존재하지 않음, 내부적으로는 정수 값이 사용 됨
        char ch = 'M'; // 문자형은 '' 작은 따옴표로 표시되고 내부적으로는 정수값으로 사용됨
        // 영문자 한자만 사용됨 그 이상은 오류

        // 문자열
        String str1;  // String은 참조타입이라 대문자로 시작. 참조타입이란?

        double num1 = 0.1;
        for(int i=0; i < 1000; i++) {
            num1 += 0.1;
        }
        System.out.println(num1);
    }
}

class NameCard { // 클래스 이름 대문자
    String name;
    int age;
    String addr;
}
