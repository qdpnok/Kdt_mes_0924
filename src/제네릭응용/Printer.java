package 제네릭응용;

public class Printer extends Device{
    @Override
    public void turnOn() {
        System.out.println("Printer 의 전원이 켜졌습니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("Printer 의 전원이 꺼졌습니다.");
    }
}

class Monitor extends Device{
    @Override
    public void turnOn() {
        System.out.println("Monitor 의 전원이 켜졌습니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("Monitor 의 전원이 꺼졌습니다.");
    }
}

class KeyBoard extends Device{
    @Override
    public void turnOn() {
        System.out.println("KeyBoard 의 전원이 켜졌습니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("KeyBoard 의 전원이 꺼졌습니다.");
    }
}
