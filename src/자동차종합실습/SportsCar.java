package 자동차종합실습;

public class SportsCar extends Car implements Audio, Aircon{
    // 터보 기능
    private boolean turbo;

    private boolean isAudio;
    private boolean isAircon;

    public SportsCar(String name) {
        super(250, 8, 30, 2, name);
        this.turbo = false;
    }

    public boolean isAudio() {
        return isAudio;
    }

    public void setAudio(boolean audio) {
        isAudio = audio;
    }

    public boolean isAircon() {
        return isAircon;
    }

    public void setAircon(boolean aircon) {
        isAircon = aircon;
    }

    @Override
    public void setMode(boolean isOn) {
        this.turbo = isOn;
        if (isOn) {
            setSpeed((int)(getSpeed() * 1.2)); // 속도 20% 증가
            System.out.println(getName() + ": 터보 모드 ON (속도 20% 증가)");
        } else {
            System.out.println(getName() + ": 터보 모드 OFF");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\n터보 모드: " + (turbo ? "ON" : "OFF");
    }

    @Override
    public void audioOn() {
        setAudio(true);
        System.out.println(getName() + ": 오디오 ON");
    }

    @Override
    public void audioOff() {
        setAudio(true);
        System.out.println(getName() + ": 오디오 OFF");
    }

    @Override
    public boolean getAudio() {
        return isAudio;
    }

    @Override
    public void airconOn() {
        setAircon(true);
        System.out.println(getName() + ": 에어컨 ON");
    }

    @Override
    public void airconOff() {
        setAircon(false);
        System.out.println(getName() + ": 에어컨 OFF");
    }

    @Override
    public boolean getAircon() {
        return isAircon;
    }
}
