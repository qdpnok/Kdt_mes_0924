package 연산자;
// 연산자는 프로그램에서 변수의 값을 계산하거나 비교하는 역할을 함
// 산술 연산자 : +, -, *, /, %
// 대입 연산자 : =, +=, -=, /=, *=, %=
// 증감 연산자 : ++, --
// 비교 연산자 : >, <, >=, <=, !=, ==
// 논리 연산자 : ||(or), &&(and), !(not)
// 삼항 연산자 : 조건식 ? 참인경우 : 거짓인겅우
// 비트 연산자 : 비트 단위의 연산 수행

import java.util.Scanner;

public class OperateMain {
    public static void main(String[] args) {
        int x = 10, y = 4;
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y); // 정수끼리 나눗셈은 몫을 구하는 연산이 됨

        System.out.println((double) x / y); // Real 나눗셈

        System.out.println(x % y); // % 나머지 연산자, 몫을 구하고 남는 나머지를 구하는 연산

        // 대입 연산자 =, +=, -=, /=, *=, %=
        // 대입은 변수에 우변값을 집어넣는 것
        System.out.println(x += 2); // x = x + 2
        System.out.println(x -= 2);
        System.out.println(x *= 2);
        System.out.println(x /= 2);
        System.out.println(x %= 2);

        // 증감 연산지 : 단항연산자, 피연산자의 값을 1씩 증가 또는 감소시킴
        // 연산자의 위치에 따라 결과가 달라짐
        int z = 10;
        System.out.println(z++); // 선 대입 후 증가
        System.out.println(z);

        // 비교 연산자 : 비교결과를 참과 거짓으로 반환
        int num1 = 10, num2 = 20;
        System.out.println(num1 > num2); // false
        System.out.println(num1 < num2); // true
        System.out.println(num1 >= num2); // false
        System.out.println(num1 <= num2); // true
        System.out.println(num1 != num2); // true

        // 논리연산자 : 연산식을 비교해서 참과 거짓을 판단
        // && : and, 좌우 모두 참이면 참
        // || : or, 둘 중 하나만 참이면 참
        // ! : not, 현재의 조건을 부정함
        System.out.println(num1 > 0 && num1 > num2);    // false // 비교 연산자가 논리 연산자보다 우선순위가 높음
        System.out.println(num1 > 0 || num1 > num2);    // true
        System.out.println(!(num1 > 0 || num1 > num2)); // false

        // 삼항연산자 : 항이 3개인 연산자, 간단한 조건문을 대체할 수 있음

        // 실습문제 1
        // 1000의 자리 정수를 입력받아 4개의 변수에 나누어 담고, 가장 큰 수 출력하기
        Scanner sc = new Scanner(System.in);

        System.out.print("1000의 자리 정수를 입력 : ");
        int number = sc.nextInt();
        int a, b, c, d;
        a = number / 1000;
        b = number % 1000 / 100;
        c = number % 100 / 10;
        d = number % 10;

        int max = a;

        if (max < b) max = b;
        if (max < c) max = c;
        if (max < d) max = d;

        System.out.println("가장 큰 숫자는 " + max + "입니다.\n");

//        System.out.print("1번째 정수 : ");
//        int int1 = sc.nextInt();
//        System.out.print("2번째 정수 : ");
//        int int2 = sc.nextInt();
//        System.out.print("3번째 정수 : ");
//        int int3 = sc.nextInt();
//        System.out.print("4번째 정수 : ");
//        int int4 = sc.nextInt();
//
//        System.out.print("가장 큰 정수는 ");
//        System.out.print((int1 >= int2 && int1 >= int3 && int1 >= int4) ? int1 : "");
//        System.out.print((int2 >= int1 && int2 >= int3 && int2 >= int4) ? int2 : "");
//        System.out.print((int3 >= int1 && int3 >= int2 && int3 >= int4) ? int3 : "");
//        System.out.print((int4 >= int1 && int4 >= int2 && int4 >= int3) ? int4 : "");
//        System.out.println("입니다.\n");

        // 실습문제 2
        // 스캐너로 나이를 입력받아 나이가 20살 이상이면 나이와 성인이라고 출력, 아니면 나이와 미성년자 출력 (3항 연산자)
        System.out.print("나이를 입력 : ");
        int age = sc.nextInt();

        System.out.println("나이는 " + age + "살이고, " + (age>=20 ? "성인" : "미성년자") + "입니다.");
    }
}
