package 자동차종합실습;

public class Bus extends Car implements Aircon, AutoPilot{
    private static final int SPEED = 150;
    private static final int EFFICIENCY = 5;
    private static final int TANK = 150;
    private static final int SEATS = 150;

    private boolean isAircon;
    private boolean isAutoPilot;

    public void setAircon(boolean aircon) {
        isAircon = aircon;
    }

    public void setAutoPilot(boolean autoPilot) {
        isAutoPilot = autoPilot;
    }

    public Bus(String name) {
        super(SPEED, EFFICIENCY, TANK, SEATS, name);
    }

    @Override
    public void setMode(boolean isOn) {
        if(isOn) setFuelTank(getFuelTank() + 30);
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
