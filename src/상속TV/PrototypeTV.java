package 상속TV;

// 시제품 TV 만들기
// 전원, 채널, 볼륨 기능을 가짐
// 채널은 1 ~ 999
// 볼륨은 0 ~ 100
// 생성자는 만들지 않음

// 상속을 주기 위한 시제품 TV
public class PrototypeTV {
    // 접근제한자 : public(모든 접근 허용), default(키워드 없음, 같은 패키지)
    //            protected(같은 패키지, 상속관계), private(같은 클래스)
//    protected boolean power;
//    protected int channel;
//    protected int volume;

    private boolean power; // 접근제한자가 private이기 때문에 자식 클래스에 접근 금지
    protected int channel;
    protected int volume;

    // 생성자를 생략하면 기본 생성자가 만들어짐(숨어있음)

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if(channel >= 1 && channel <= 999) {
            this.channel = channel;
            System.out.println("채널이 " + channel + "번으로 변경됐습니다.");
        } else {
            System.out.println("유효한 채널이 아닙니다.");
        }

    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if(volume >= 0 && volume <= 100) {
            this.volume = volume;
            System.out.println("볼륨이 " + volume + "(으)로 변경됐습니다.");
        } else {
            System.out.println("유효한 볼륨 값이 아닙니다.");
        }

    }
}
