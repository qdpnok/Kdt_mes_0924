package 컴페어러블실습;
// 이름, 학번(정수), 국어, 영어, 수학, 과학 과목을 필드로 하는 Student 클래스 생성
// Student 클래스 학생 10명에 대한 데이터를 입력 받음
// 총점과 평균 구하기
// 총점이 높은 학생순(내림차순)으로 정렬하고 총점이 같으면 학번순으로 정렬(오름차순)
// 출력 형태는 학번, 이름, 총점, 평균으로 출력

import java.util.*;

public class CompExMain {
    public static void main(String[] args) {
        // Set<Student> set = new TreeSet<>();
        List<Student> set = new ArrayList<>();


        set.add(new Student("안유진", 1, num(), num(), num(), num()));
        set.add(new Student("장원영", 2, num(), num(), num(), num()));
        set.add(new Student("가을", 3, num(), num(), num(), num()));
        set.add(new Student("이서", 4, num(), num(), num(), num()));
        set.add(new Student("레이", 5, num(), num(), num(), num()));
        set.add(new Student("리즈", 6, num(), num(), num(), num()));
        set.add(new Student("지수", 7, num(), num(), num(), num()));
        set.add(new Student("로제", 8, num(), num(), num(), num()));
        set.add(new Student("리사", 9, num(), num(), num(), num()));
        set.add(new Student("제니", 10, num(), num(), num(), num()));

        Collections.sort(set);

        for(Student s : set) System.out.println(s);

    }

    public static int num() {
        return (int) (Math.random() * 100) + 1;
    }
}

class Student implements Comparable<Student>{
    String name;
    int sCode;
    int kor;
    int eng;
    int math;
    int science;
    public Student(String name, int sCode, int kor, int eng, int math, int science) {
        this.name = name;
        this.sCode = sCode;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.science = science;
    }

    // 총점 만들기
    public int getTotal() {
        return kor + eng + math + science;
    }

    // 평균 만들기
    public double getAvg() {
        return getTotal() / 4.0;
    }

    @Override
    public int compareTo(Student o) {
        // 결과가 양수이면 왼쪽, 음수이면 오른쪽
        if(this.getTotal() != o.getTotal()) return o.getTotal() - this.getTotal();
        return this.sCode - o.sCode;
    }

    @Override
    public String toString() {
        return "학번: " + String.format("%03d", sCode) + "\n" +
                "이름: " + name + "\n" +
                "총점: " + getTotal() + "\n" +
                "평균: " + getAvg() + "\n" +
                "-".repeat(10);
    }
}