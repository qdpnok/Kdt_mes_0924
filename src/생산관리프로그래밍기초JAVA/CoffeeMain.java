package 생산관리프로그래밍기초JAVA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoffeeMain {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Menu> coffee = new ArrayList<>();
        List<Menu> tea = new ArrayList<>();
        List<Menu> blended = new ArrayList<>();

        // 메뉴 리스트 생성
        coffee.add(new Menu("아메리카노", 4700));
        coffee.add(new Menu("카페 라떼", 5200));
        coffee.add(new Menu("카라멜 마키아또", 6100));

        tea.add(new Menu("얼 그레이 바닐라 티 라떼", 6100));
        tea.add(new Menu("복숭아 아이스 티", 6100));
        tea.add(new Menu("스타벅스 클래식 밀크 티", 6100));

        blended.add(new Menu("자몽 허니 레몬 블렌디드", 6300));
        blended.add(new Menu("제주 말차 요거트 블렌디드", 6500));
        blended.add(new Menu("피치 요거트 블렌디드",  6500));

        while(true) {
            // 메뉴 선택
            System.out.println("[1] 커피 [2] 티 [3] 블렌디드 [4] 종료");
            System.out.print("메뉴를 골라주세요 : ");
            int category = sc.nextInt();
            if(category == 4) break;
            int option =0;
            int drink = 0;
            int totalPrice = 0;

            // 커피일 때
            if(category == 1) {
                // 음료 선택
                drink = selectDrink(coffee);
                if(drink == 4) continue;
                if(drink == 5) break;
                totalPrice += coffee.get(drink-1).price;

                // 옵션 선택
                System.out.println("[1] 1/2카페인 (+500) [2] 디카페인 (+300) [3] 없음 [4] 처음으로 [5] 종료");
                System.out.print("음료의 옵션을 선택해주세요 : ");
                option = sc.nextInt();
                if(option == 4) continue;
                if(option == 5) break;
                switch (option) {
                    case 1: totalPrice += 500; break;
                    case 2: totalPrice += 300; break;
                }
            // 티/블렌디드일 때
            } else if(category == 2 || category == 3) {
                List<Menu> list = switch (category) {
                    case 2 -> tea;
                    case 3 -> blended;
                    default -> null;
                };

                // 음료 선택
                drink = selectDrink(list);;
                if(drink == 4) continue;
                if(drink == 5) break;
                totalPrice += list.get(drink-1).price;
            }

            // 최종 결과 출력
            System.out.println("=".repeat(8) + "주문한 상품" + "=".repeat(8));
            if(category == 1) {
                System.out.println("커피");
                System.out.print(coffee.get(drink-1).name);

                if(option == 1) {
                    System.out.println(" 1/2카페인");
                } else if(option == 2) {
                    System.out.println(" 디카페인");
                }
            } else if(category == 2) {
                System.out.println("티(Tea)");
                System.out.print(tea.get(drink-1).name);
            }
            else {
                System.out.println("블렌디드");
                System.out.print(blended.get(drink-1).name);
            }
            System.out.println("가격 : " + totalPrice + "원\n");
        }
    }

    static int selectDrink(List<Menu> m) {
        int count = 1;
        for(Menu c : m) {
            System.out.print("[" + count + "] " + c + " ");
            count++;
        }

        System.out.println("[4] 처음으로 [5] 종료");

        System.out.print("음료를 골라주세요  : ");
        int drink = sc.nextInt();

        return drink;
    }
}

