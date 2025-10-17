package 자동차종합실습;

public class Sedan extends Car implements Audio, Aircon, AutoPilot{
    private static final int SedanSeats = 4;
    private static final int SedanFuelEfficiency = 12;
    private static final int SedanSpeed = 200;
    private static final int SedanFuelTank = 45;

    private boolean isAudio;
    private boolean isAircon;
    private boolean isAutoPilot;

    private boolean trunkModeOn;

    public void setAudio(boolean audio) {
        isAudio = audio;
    }


    public void setAircon(boolean aircon) {
        isAircon = aircon;
    }

    public void setAutoPilot(boolean autoPilot) {
        isAutoPilot = autoPilot;
    }

    public Sedan(String name) {
        super(SedanSpeed, SedanFuelEfficiency, SedanFuelTank, SedanSeats, name);
        this.trunkModeOn = false;
    }

    @Override
    public void setMode(boolean isOn) {
        this.trunkModeOn = isOn;
        if (isOn) {
            this.setSeats(this.getSeats() + 1);
            System.out.println(this.getName() + "의 트렁크 좌석화(부가 기능)가 켜졌습니다. 좌석 수: " + this.getSeats() + "석");
        } else {
            this.setSeats(SedanSeats);
            System.out.println(this.getName() + "의 트렁크 좌석화(부가 기능)가 꺼졌습니다. 좌석 수: " + this.getSeats() + "석");
        }
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

    @Override
    public void autoPilotOn() {
        setAutoPilot(true);
        setSpeed((int) (getSpeed()*0.9));
        System.out.println(getName() + ": 자율주행 ON");
    }

    @Override
    public void autoPilotOff() {
        setAutoPilot(false);
        System.out.println(getName() + ": 자율주행 OFF");
    }

    @Override
    public boolean getAutoPilot() {
        return isAutoPilot;
    }
}
