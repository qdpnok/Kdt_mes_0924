package 문자열실습;
// 실습문제 1: Knuth-Morris-Pratt => KMP, Korea-Standard => KS,

import java.util.Scanner;

public class StringExMain {
    public static void main(String[] args) {
        String ex1 = "Knuth-Morris-Pratt";
        String ex2 = "Korea-Standard";
        // 실습문제 1 :
        // [1] 대문자만 골라냄, charAt()
        System.out.println("=".repeat(5) + 1 + "=".repeat(5));
        for(int i = 0; i < ex1.length(); i++) {
            if (ex1.charAt(i) == ex1.toUpperCase().charAt(i) && ex1.charAt(i) != '-' ) {
                System.out.print(ex1.charAt(i));
            }
        }
        System.out.println();

        for(int i = 0; i < ex2.length(); i++) {
            // if (ex1.charAt(i) >= 'A' && name.charAt(i) <= 'Z')
            if (ex2.charAt(i) > 65 && ex2.charAt(i) < 91 ) System.out.print(ex2.charAt(i));
        }
        System.out.println();

        // [2] 문자열의 0번째 인덱스 출력, '-'다음에 오는 문자 출력
        System.out.println("=".repeat(5) + 2 + "=".repeat(5));
        System.out.print(ex1.charAt(0));
        for(int i = 0; i < ex1.length(); i++) if (ex1.charAt(i) == '-') System.out.print(ex1.charAt(i+1));
        System.out.println();

        System.out.print(ex2.charAt(0));
        for(int i = 0; i < ex2.length(); i++) if (ex2.charAt(i) == '-') System.out.print(ex2.charAt(i+1));
        System.out.println();


        // [3] "-" 기준삼아 split으로 자르고, 0번째 인덱스 출력
        System.out.println("=".repeat(5) + 3 + "=".repeat(5));
        String[] buff = ex1.split("-");
        for(String e : buff ) System.out.print(e.charAt(0));
        System.out.println();

        buff = ex2.split("-");
        for(String e : buff ) System.out.print(e.charAt(0));
        System.out.println();

        // [4] 문자열을 문자 배열로 변경하고, 향상된 for문으로 순회하면 해당 문자가 대문자 구간이면 출력
        System.out.println("=".repeat(5) + 4 + "=".repeat(5));
        char[] forEX = ex1.toCharArray();
        for (char e : forEX) if(e >= 'A' && e <= 'Z') System.out.print(e);
        System.out.println();
        forEX = ex2.toCharArray();
        for (char e : forEX) if(e > 65 && e < 91) System.out.print(e);

        // 입력 받은 문자열에서 대문자는 소문자, 소문자는 대문자로 변환
        // AbCd => aBcD
        System.out.println();

        String upAndLow = "AbCd";

//        for(int i=0; i < upAndLow.length(); i++) {
//            if(upAndLow.charAt(i) >= 'A' && upAndLow.charAt(i) <= 'Z') {
//                System.out.print(upAndLow.toLowerCase().charAt(i));
//            } else {
//                System.out.print(upAndLow.toUpperCase().charAt(i));
//            }
//        }
        // (char)(name.charAt(i) + ('a' - 'A'))

        for (int i = 0; i < upAndLow.length(); i++) {
            if (upAndLow.charAt(i) < 'a') System.out.print(Character.toLowerCase(upAndLow.charAt(i)));
            else System.out.print(Character.toUpperCase(upAndLow.charAt(i)));
        }

        // 입력 받은 문자열을 반대로 출력하기
        // ABCD => DCBA
        System.out.println();

        for(int i = upAndLow.length(); i > 0; i--) {
            System.out.print(upAndLow.charAt(i-1));
        }
    }
}
