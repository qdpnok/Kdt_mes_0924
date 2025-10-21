package 로또번호중복제거;
// 1 ~ 45 사이의 임의의 수 6개 생성 (중복 되면 안됨)

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LottoMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        while(true) {
            int num = (int) (Math.random() * 45 + 1);
            if(!list.contains(num)) list.add(num);
            if(list.size() == 6) break;
        }

        for(int i : list) {
            System.out.print(i + " ");
        }
        System.out.println();

        Set<Integer> set = new HashSet<>();
        while(true) {
            int num = (int) (Math.random() * 45 + 1);
            Set<Integer> buff = new HashSet<>();
            buff.add(num);
            set.addAll(buff);
            if(set.size() == 6) break;
        }

        for(int i : set) {
            System.out.print(i + " ");
        }

    }

    // 1. List를 사용해 중복 제거 해보기
    // contains로 체크

    // 2. Set을 사용해 중복 제거 해보기
}
