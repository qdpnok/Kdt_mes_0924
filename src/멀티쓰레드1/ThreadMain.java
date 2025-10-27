package 멀티쓰레드1;
// 멀티쓰레드 : 하나의 Application에서 동시에 여러 가지 일을 수행하는 개념
// 자바 기만의 Spring Boot에서는 개발자가 Thread를 생성하지 않고 Spring Boot FrameWork가 이 일을 담당함.
//

public class ThreadMain {
    public static void main(String[] args) {
        Thread test1 = new TestThread();
        test1.start();

        Runnable test2 = new TestRunnable();
        Thread thread1 = new Thread(test2);
        thread1.start();

        int sum = 0;
        for (int i = 0; i <= 200; i++) {
            sum += i;
            System.out.println("부모 쓰레드 : " + sum);
        }
        System.out.println(Thread.currentThread() + "합 : " + sum);
    }
}

class TestThread extends Thread {
    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i <= 200; i++) {
            sum += i;
            System.out.println("자식1 쓰레드 : " + sum);
        }
        System.out.println(Thread.currentThread() + "합 : " + sum);
    }
}

class TestRunnable implements Runnable {

    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i <= 200; i++) {
            sum += i;
            System.out.println("자식2 쓰레드 : " + sum);
        }
        System.out.println(Thread.currentThread() + "합 : " + sum);
    }
}