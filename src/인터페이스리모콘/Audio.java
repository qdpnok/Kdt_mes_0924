package 인터페이스리모콘;

// implements 키워드로 인터페이스 상속받음
public class Audio implements RemoteControl {
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("Audio를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio를 끕니다");
    }

    @Override
    public void setVolume(int volume) {
        if(volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("볼륨이 " + this.volume + "(으)로 변경되었습니다.");
    }

    @Override
    public void setMute(boolean mute) {
        if(mute) System.out.println("오디오를 무음 처리합니다.");
        else System.out.println("오디오 무음을 해제합니다.");
    }
}

class PS4 implements RemoteControl {
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("PS4를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("PS4를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if(volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if(volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("볼륨이 " + this.volume + "(으)로 변경되었습니다.");
    }
}

class Computer implements RemoteControl {
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("Computer를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("Computer를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if(volume > RemoteControl.MAX_VOLUME) {
            this.volume = MAX_VOLUME;
        } else if(volume < RemoteControl.MIN_VOLUME) {
            this.volume = MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("볼륨이 " + this.volume + "(으)로 변경되었습니다.");
    }
}