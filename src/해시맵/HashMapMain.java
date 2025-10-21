package 해시맵;
// Map: Key-Value 쌍(Pair)으로 데이터를 저장하는 자료구조
// key는 중복될 수 없고, 값은 중복 가능
// List나 배열처럼 순차적 접근을 하지 않고, key를 통해 value를 조회

// 기본 메뉴 3개 추가하는 메서드
// [1]전체 조회 [2]메뉴 검색 [3]메뉴 추가 [4]메뉴 삭제 [5]메뉴 수정 [6]종료

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapMain {
    // final static Map 객체 생성
    final static Map<String, MenuMap> map = new HashMap<>();
    // final static Scanner 객체 생성
    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        initMenu();

        // while(true)로 반복 수행하는 메뉴 작성
        while(true) {
            System.out.println("[1]전체 조회 [2]메뉴 검색 [3]메뉴 추가 [4]메뉴 삭제 [5]메뉴 수정 [6]종료");
            System.out.print("선택: ");
            int code = sc.nextInt();
            sc.nextLine();

            switch (code) {
                case 1: printAll(); break;
                case 2: searchMenu(); break;
                case 3: insertMenu(); break;
                case 4: deleteMenu(); break;
                case 5: updateMenu(); break;
                case 6: System.out.println("종료합니다."); return;
                default: System.out.println("잘못된 입력입니다.");
            }
        }
    }

    // 기본 메뉴 추가하는 메서드 작성
    // map.put("아메리카노", new MenuMap("아메리카노", 2000, "음료", "기본 커피")
    static void initMenu() {
        map.put("카페 아메리카노", new MenuMap("카페 아메리카노", 4700, "에스프레소/커피",
                "진한 에스프레소에 뜨거운 물을 섞어 스타벅스의 깔끔하고 강렬한 에스프레소를 " +
                        "가장 부드럽게 잘 느낄 수 있는 커피"));
        map.put("카페 라떼", new MenuMap("카페 라떼", 5200, "에스프레소/커피",
                "풍부하고 진한 에스프레소가 신선한 스팀 밀크를 만나 부드러워진 커피 위에 우유 거품을 살짝 " +
                        "얹은 대표적인 커피 라떼"));
        map.put("스타벅스 클래식 밀크 티", new MenuMap("스타벅스 클래식 밀크 티", 6100,
                "티 음료",
                "스타벅스가 선보이는 클래식한 밀크 티로, 진하게 오래 우려낸 티바나 블랙 티의 깊은 풍미와 " +
                        "우유의 조화로움을 담아낸 '맛'에 집중한 밀크 티"));
    }

    // 전체 메뉴 조회는 키 값 기준으로 순회, for(String e : map.keySet())
    static void printAll() {
        // get(key) 키에 대한 값이 반환
        for(String e : map.keySet()) { System.out.println(map.get(e)); }
    }

    // 메뉴 검색은 map.containsKey()
    static void searchMenu() {
        System.out.print("검색할 메뉴 명을 입력: ");
        String name = sc.nextLine();
        System.out.println(map.containsKey(name) ? map.get(name):"없는 메뉴입니다.");
    }

    static MenuMap createMenu() {
        System.out.print("이름: ");
        String name = sc.nextLine();

        System.out.print("가격: ");
        int price = sc.nextInt();
        sc.nextLine();

        System.out.print("항목: ");
        String category = sc.nextLine();

        System.out.print("설명: ");
        String description = sc.nextLine();

        return new MenuMap(name, price, category, description);
    }

    // 새로운 키와 값을 추가 : map.put(키, 값)
    static void insertMenu() {
        MenuMap m = createMenu();
        if(!map.containsKey(m.getName())) {
            map.put(m.getName(), m);
        } else {
            System.out.println("해당 메뉴가 이미 존재합니다.");
        }
    }

    // 삭제 : map.remove(키)
    static void deleteMenu() {
        System.out.print("삭제할 메뉴의 이름을 입력: ");
        String key = sc.nextLine();
        if(map.containsKey(key)) map.remove(key); // 키를 입력 받아 entry(key, value)를 삭제
        else System.out.println("삭제할 메뉴가 없습니다.");
    }

    // 수정 : map.replace(키, 값)
    static void updateMenu() {
        System.out.print("수정할 메뉴의 이름을 입력: ");
        String name = sc.nextLine();
        if(map.containsKey(name)) map.replace(name, createMenu());
        else System.out.println("수정할 메뉴가 없습니다.");
    }
}
