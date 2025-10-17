package 제네릭응용;

import java.util.Scanner;

public class GenericExMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int code;
        DeviceController<Device> deviceController = new DeviceController<>();

        while (true) {
            System.out.print("[1]프린터 [2]모니터 [3]키보드\n기기선택: ");
            code = sc.nextInt();
            if(code < 1 || code > 3) {
                System.out.println("잘못된 값을 입력하셨습니다.");
            } else {
                switch(code) {
                    case 1: deviceController.setDevice(new Printer()); break;
                    case 2: deviceController.setDevice(new Monitor()); break;
                    case 3: deviceController.setDevice(new KeyBoard()); break;
                }
                break;
            }
        }

        deviceController.powerOn();
        deviceController.powerOff();
    }
}
