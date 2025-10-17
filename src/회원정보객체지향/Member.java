package 회원정보객체지향;
// 이름, 나이, 성별, 직업

import java.util.Scanner;

// 클래스 이름은 대문자로 시작
public class Member {
    // private 접근제한자는 같은 클래스 내부에서만 접근 가능
    private String name; // 인스턴스 필드, 객체 생성 시 함께 생성됨.
    private int age;
    private char gender;
    private int job;
    private Scanner sc = new Scanner(System.in);

    // 이름을 입력 받는 메서드 구현
    public void setName() {
        System.out.print("이름 입력 : ");
        this.name = sc.nextLine();
    }

    // 나이를 입력 받는 메서드 구현
    // void는 반환 값이 없는 경우 사용
    public void setAge() {
        while (true) {
            System.out.print("나이 입력 : ");
            age = sc.nextInt();
            if (age >= 0 && age < 200) return; // 메서드를 반환, 메서드 종료
            System.out.println("0~199 사이의 숫자로 입력해주세요");
        }
    }

    // 성별을 입력 받는 메서드 구현
    public void setGender() {
        while (true) {
            System.out.print("성별 입력 : ");
            gender = sc.next().toLowerCase().charAt(0);
            if(gender == 'm' || gender == 'f') return;
            System.out.println("M 또는 F를 입력해주세요.");
        }
    }

    // 직업을 입력 받는 메서드 구현
    // public 접근제한자는 누구나 접근 가능
    public void setJob() {
        while (true) {
            System.out.print("직업 입력 : ");
            job = sc.nextInt();
            if(job > 0 && job < 5) return;
            System.out.println("직업 코드(1~4)를 입력해주세요.");
        }
    }

    public void viewMember() {
        // final을 사용해 문자열 배열의 내용을 변경할 수 없음을 지정
        // 문자열 0번 인덱스를 비운 이유는 입력받는 값과 맞추기 위해서
        final String[] jobStr = {"", "학생", "회사원", "주부", "무직"};
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("성별 : " + ((gender == 'm') ? "남성": "여성"));
        System.out.println("직업 : " + jobStr[job]);
    }
}
