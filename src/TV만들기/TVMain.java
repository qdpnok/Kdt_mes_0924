package TV만들기;

import java.util.ArrayList;
import java.util.List;

public class TVMain {
    public static void main(String[] args) {
        Television tv1 = new Television(true, 100, 40);
        Television tv2 = new Television();
        Television tv3 = new Television(true);

        List<Television> tvList = new ArrayList<>();
        tvList.add(tv1);
        tvList.add(tv2);
        tvList.add(tv3);

        for(Television e : tvList) System.out.println(e);


    }
}
