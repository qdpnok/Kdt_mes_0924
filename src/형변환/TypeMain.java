package 형변환;

// 형변환 : 정해진 형을 다른 형으로 바꾸는 것
// 명시적 : 개발자가 명확한 의도와 목적을 가지고 형을 변환하는 것
// 묵시적 : 컴파일러가 이득이 되는 방향으로 행을 알아서 변경하는 것
// 타입 변환 메서드 사용 : 문자열과 정수, 문자열과 실수 관계에서 사용하는 메서드

public class TypeMain {
    public static void main(String[] args) {
        int kor = 88;
        int eng = 88;
        int mat = 56;
        int total = kor + eng + mat;
        double avg = total / 3.0;

        System.out.println(avg);

        String val = "001234567.8999";
        double nVAl = Double.parseDouble(val);

        System.out.println(nVAl);

    }
}
