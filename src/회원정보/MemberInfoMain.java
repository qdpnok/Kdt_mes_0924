package 회원정보;

import java.util.Scanner;

public class MemberInfoMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        int age;
        char gender;
        int job;
        String gender_desc;
        String job_desc;

        System.out.print("이름 입력 : ");
        name = sc.nextLine();

        while(true) {
            System.out.print("나이 입력 (0~199) : ");
            age = sc.nextInt();

            if(age >= 0 && age < 200) break;

            System.out.println("유효하지 않은 숫자입니다.");
        }

        while(true) {
            System.out.print("성별 입력 (M/F) : ");
            gender = sc.next().charAt(0);

            if(gender == 'M' || gender == 'm') {
                gender = Character.toUpperCase(gender);
                gender_desc = "남성";
                break;
            } else if (gender == 'F' || gender == 'f') {
                gender = Character.toUpperCase(gender);
                gender_desc = "여성";
                break;
            }

            System.out.println("유효하지 않은 문자입니다.");
        }

        System.out.println("=".repeat(10));
        System.out.println("1. 학생");
        System.out.println("2. 회사원");
        System.out.println("3. 주부");
        System.out.println("4. 무직");
        System.out.println("=".repeat(10));

        while(true) {
            System.out.print("직업 (1~4) : ");
            job = sc.nextInt();

            if(job == 1) {
                job_desc = "학생";
                break;
            }
            if(job == 2) {
                job_desc = "회사원";
                break;
            }
            if(job == 3) {
                job_desc = "주부";
                break;
            }
            if(job == 4) {
                job_desc = "무직";
                break;
            }

            System.out.println("유효하지 않은 숫자입니다.");
        }

        System.out.println("당신의 이름은 " + name + "입니다.");
        System.out.println("당신은 " + age + "세의 " + gender_desc + "입니다.");
        System.out.println("당신의 직업은 " + job_desc + "입니다.");
    }
}
