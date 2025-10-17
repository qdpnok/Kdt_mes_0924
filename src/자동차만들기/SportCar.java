package 자동차만들기;

public class SportCar extends Car implements Aircon, Audio{
    private boolean airCon, audio;
    private double baseEff = -1;

    public SportCar(String name) {
        super(250, 8, 30, 2, name);
        airCon = false;
        audio = false;
    }

    @Override
    void setMode(boolean isMode) {
        if (isMode) maxSpeed *= 1.2;
    }

    @Override
    public void setAirCon(boolean on) {
        this.airCon = on;
        if (airCon) fuelEff *= 0.95;
    }

    @Override
    public boolean isAirConOn() {
        return airCon;
    }

    @Override
    public void setAudio(boolean on) {
        this.audio = on;
    }

    @Override
    public boolean isAudioOn() {
        return audio;
    }
}

class Sedan extends Car implements Aircon, Audio, AutoPilot {
    private boolean airCon, audio, auto;

    public Sedan(String name) {
        super(200, 12, 45, 4, name);
        airCon = false;
        audio = false;
        auto = false;
    }

    @Override
    void setMode(boolean isMode) {
        if(isMode) seatCnt += 1;
    }

    @Override
    public void setAirCon(boolean on) {
        this.airCon = on;
        if(airCon) fuelEff *= 0.95;
    }

    @Override
    public boolean isAirConOn() {
        return airCon;
    }

    @Override
    public void setAudio(boolean on) {
        this.audio = on;
    }

    @Override
    public boolean isAudioOn() {
        return audio;
    }

    @Override
    public void setAutoPilot(boolean on) {
        this.auto = on;
        if(auto) {
            maxSpeed = (int) Math.round(maxSpeed * 0.9);
        }
    }

    @Override
    public boolean isAutoPilotOn() {
        return this.auto;
    }
}

class Bus extends Car implements Aircon, AutoPilot{
    private boolean airCon, auto;

    public Bus(String name) {
        super(150, 5, 100, 20, name);
    }

    @Override
    void setMode(boolean isMode) {
        if(isMode) fuelTank += 30;
    }

    @Override
    public void setAirCon(boolean on) {
        this.airCon = on;
        if(airCon) fuelEff *= 0.95;
    }

    @Override
    public boolean isAirConOn() {
        return airCon;
    }

    @Override
    public void setAutoPilot(boolean on) {
        this.auto = on;
        if(auto) {
            maxSpeed = (int)Math.round(maxSpeed * 0.9);
        }
    }

    @Override
    public boolean isAutoPilotOn() {
        return this.auto;
    }
}