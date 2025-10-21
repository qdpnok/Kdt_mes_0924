package 코테문제;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JeaSeokMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> result = new ArrayList<>();

        while(true) {
            int sum = 0;
            int input = sc.nextInt();
            if(input == 0) break;

            while(input > 0) {
                switch(input % 10) {
                    case 0: sum += 4; break;
                    case 1: sum += 2; break;
                    default: sum += 3;
                }
                sum++;
                input /= 10;
            }
            sum += 1;

            result.add(sum);
        }
        for (int e : result) System.out.println(e);
    }

}
