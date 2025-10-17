package 향상된For;
// 배열 또는 이터러블(List, set)을 간단하게 순회할 때 사용
// 인덱스 관리가 필요 없고, 읽기 위주의 작업을 수행할 때 사용

public class EnhancedForMain {
    public static void main(String[] args) {
        int[] scores = {99, 67, 89, 100, 60};
        int total = 0;
        double avg = 0.0;
        // 기존의 for문을 사용하는 벙법 (총점과 평균 구하기)
        // 배열의 인덱스 기반 순회
//        for (int i = 0; i<scores.length; i++) {
//            total += scores[i]; // 배열의 값을 누적
//        }

        // 향상된 for 문을 사용하는 방법
        // 배열의 요소 값을 자동 순회. 파이썬 for ... in 이랑 비슷하다.
        // 배열의 값을 변경 불가, 무조건 배열 전체 순회.
        for ( int e : scores) {
            total += e;
        }

        avg = ( (double) total / scores.length);
        System.out.printf("총점 : %d, 평균 : %.2f\n", total, avg);
    }
}
