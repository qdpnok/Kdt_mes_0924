package 예외처리3;

import java.io.IOException;

public class ExceptionEx3Main {
    public static void main(String[] args) throws IOException{
        IOSample sample = new IOSample();
        sample.input();
    }
}

class IOSample {
    private int num;

    // 이 메서드를 호출하는 쪽에서 예외처리를 무조건 해줘야만 함.
    public void input() throws IOException {
        num = System.in.read();
    }

//    public void input() {
//        try{
//            num = System.in.read();
//        } catch (IOException e) {
//            System.out.println("IO Read 예외처리...");
//        }
//    }

    public void output() {
        System.out.print(num);
    }
}