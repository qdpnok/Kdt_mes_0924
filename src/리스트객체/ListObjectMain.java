package 리스트객체;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListObjectMain {
    private static final List<MenuInfo> menuInfos = new ArrayList<>();  // 클래스 필드
    private static final Scanner sc = new Scanner(System.in);           // 클래스 필드

    public static void main(String[] args) {
        initMenu();

        while(true) {
            System.out.println("[1] 전체 조회  [2] 메뉴 등록  [3] 메뉴 수정  [4] 메뉴 삭제  [5] 메뉴 검색  [6] 종료");
            System.out.print("어떤 동작을 수행하시겠습니까? : ");
            int work = sc.nextInt();
            sc.nextLine();

            System.out.println();

            switch (work) {
                case 1: searchAll(); break;
                case 2: addMenu(); break;
                case 3: editMenu(); break;
                case 4: deleteMenu(); break;
                case 5: searchMenu(); break;
                case 6: return;
                default: System.out.println("잘못된 입력입니다.");
            }
        }
    }

    // 메뉴 초기화
    private static void initMenu() {    // 클래스 메서드
        menuInfos.add(new MenuInfo("데리버거", 3700, "버거단품", "쇠고기패티에 달콤 짭짤한 데리소스를 더한 가성비 버거", true));
        menuInfos.add(new MenuInfo("리아 불고기", 5000, "버거단품", "두툼한 쇠고기패티와 한국적인 맛의 소스가 잘 조화된 롯데리아 대표 버거", true));
        menuInfos.add(new MenuInfo("리아 새우", 5000, "버거단품", "새우살을 가득넣어 더 맛있어진 오리지널 새우버거", true));
        menuInfos.add(new MenuInfo("핫크리스피치킨버거", 6200, "버거단품", "닭가슴살 패티로 만든 매콤 화끈한 프리미엄 치킨버거", true));
        menuInfos.add(new MenuInfo("클래식치즈버거(버터번)", 5500, "버거단품", "부드러운 치즈와 호주산 쇠고기패티의 본연의 맛을 느낄수 있는 치즈버거", true));
    }

    // 메뉴 보여주고, 번호 선택
    private static int selectMenu() {
        int count = 0;  // 인덱스 번호를 주기 위해서 변수 생성

        for(MenuInfo e : menuInfos) {
            System.out.println("[" + ++count + "] " + e.getName()); // ++count 선 증가 후 대입
        }

        System.out.print("메뉴 번호 입력: ");
        return (sc.nextInt() - 1);
    }

    // [1] 전체 조회
    private static void searchAll() {
        for(MenuInfo e : menuInfos) { System.out.println(e); }
        System.out.println();
    }

    /*
    *  1. 객체 만들어서 반환하는 메서드
    *  2. 객체를 list에 add하는 메서드
    *  3. 객체를 list에서 수정(set)하는 메서드
    *
    *  이렇게 구분해서 작성해도 된다. */

    // [2] 메뉴 등록
    private static void addMenu() {
        System.out.print("이름 : ");
        String name = sc.nextLine();

        System.out.print("가격 : ");
        int price = sc.nextInt();
        sc.nextLine();

        System.out.print("항목 : ");
        String category = sc.nextLine();

        System.out.print("설명 : ");
        String exp = sc.nextLine();

        System.out.print("세금 포함 여부 [1] 예 [2] 아니오 : ");
        int tax = sc.nextInt();
        sc.nextLine();

        menuInfos.add(new MenuInfo(name, price, category, exp, tax==1));
    }

    // [3] 메뉴 수정
    private static void editMenu() {
        System.out.println("어떤 메뉴를 수정하시겠습니까?");
        int idx = selectMenu();

        MenuInfo edit = menuInfos.get(idx);
        System.out.println(edit);
        System.out.println("[1] 이름  [2] 가격  [3] 항목  [4] 설명  [5] 세금포함여부");
        System.out.print("수정할 항목 번호를 입력하세요: ");
        idx = sc.nextInt();
        sc.nextLine();

        if (idx == 1) {
            System.out.print("이름 : ");
            String name = sc.nextLine();
            edit.setName(name);
            sc.nextLine();
        } else if (idx == 2) {
            System.out.print("가격 : ");
            int price = sc.nextInt();
            edit.setPrice(price);
        } else if (idx == 3) {
            System.out.print("항목 : ");
            String category = sc.nextLine();
            edit.setCategory(category);
            sc.nextLine();
        } else if (idx == 4) {
            System.out.print("설명 : ");
            String exp = sc.nextLine();
            edit.setExp(exp);
            sc.nextLine();
        } else if (idx == 5) {
            System.out.print("세금 포함 여부 [1] 예 [2] 아니오 : ");
            int tax = sc.nextInt();
            edit.setTax(tax == 1);
        } else {
            System.out.println("잘못된 입력입니다.");
        }
    }

    // [4] 메뉴 삭제
    private static void deleteMenu() {
        System.out.println("어떤 메뉴를 삭제하시겠습니까?");
        int idx = selectMenu();

        System.out.println(menuInfos.remove(idx));
    }

    // [5] 메뉴 검색
    private static void searchMenu() {
        System.out.println("어떤 메뉴를 검색하시겠습니까?");
        int idx = selectMenu();

        System.out.println(menuInfos.get(idx));
    }
}
