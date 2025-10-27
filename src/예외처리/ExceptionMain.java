package 예외처리;
// 예외 처리 : 프로그램이 예외 상황에 직면했을 때 비정상적으로 종료되는 것을 막고,
// 개발자가 의도한 대로 정상 실행이 되도록 하는 것.
// 자바는 checked 예외와 Unchecked 예외가 있음
// checked 예외는 컴파일러가 예외 처리 상황을 체크함
// unchecked 예외는 컴파일러가 예외 처리를 강제 하지 않음
// try ~ catch ~ finally

public class ExceptionMain {
    public static void main(String[] args) {
        // 실행 오류 예외 처리
        int[] arr = new int[5];
        try {
            for (int i = 0; i <= 5; i++) {
                arr[i] = i;
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("반복문 에러: " + e);
        } finally {
            System.out.println("예외 상황에 상관 없이 호출 됨");
        }
        
    }
}
