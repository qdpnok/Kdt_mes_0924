package 상속TV;
// PrototypeTV를 상속받음
// 볼륨을 오버라이드해서 0 ~ 200까지 확장
// 채널을 오버라이드해서 1 ~ 1999까지 확장 (setChannel)
// 매개변수가 있는 생성자와 없는 생성자 만들기
// 채널을 오버로딩해서 setChannel(boolean internet, int channel) 기능 확장
// - 인터넷 기능이 켜지면 채널 설정 정보는 무시하고 인터넷 티비로 동작
// 결과 출력은 toString 메서드를 오버라이딩해서 구현

public class ProductTV extends PrototypeTV {
    private boolean internet;

    public ProductTV(boolean power, int channel, int volume, boolean internet) {
        setPower(power);
        this.channel = channel;
        this.volume = volume;
        this.internet = internet;
    }

    public ProductTV(boolean power, int channel, int volume) {
        setPower(power);     // 부모의 인스턴스 필드가 private으로 접근 제한이 돼 있어, setter 메서드로 접근함
        this.channel = channel;
        this.volume = volume;
        this.internet = false;
    }

    public ProductTV() {
        setPower(false);
        this.channel = 1;
        this.volume = 20;
        internet = false;
    }

    @Override // 문법적으로 오버라이드 관계가 성립하는지 체크해줌. 오버라이드 할 때는 접근 제한자를 맞춰주기
    // 오버라이드 : 부모가 가진 메서드를 재정의 함 (자식이 재정의 하는 경우 자식 메서드가 호출 됨)
    public void setChannel(int channel) {
        if (channel >= 1 && channel <= 1999) {
            this.channel = channel;
            System.out.println("채널을 " + channel + "번으로 변경했습니다.");
        } else {
            System.out.println("유효한 채널이 아닙니다.");
        }
    }

    // 메서드 오버로딩 : 메서드 이름이 동일하고, 메서드의 매개변수의 개수 또는 타입으로 메서드를 구분해서 호출하는 것
    public void setChannel(boolean internet, int channel) {
        if (internet) {
            this.internet = true;
            System.out.println("인터넷 기능이 켜졌습니다.");
        } else if (this.internet) {
            System.out.println("인터넷 기능이 꺼졌습니다.");
            setChannel(channel);
        } else {
            setChannel(channel);
        }
    }

    @Override
    public void setVolume(int volume) {
        if(volume >= 0 && volume <= 200) {
            this.volume = volume;
            System.out.println("볼륨을 " + volume + "(으)로 변경했습니다.");
        } else {
            System.out.println("유효한 볼륨 값이 아닙니다.");
        }
    }

    @Override
    public String toString() {
        String title = "=".repeat(8) + "TV 정보" + "=".repeat(8) + "\n";
        String power =  "전원은 " + (isPower() ? "ON" : "OFF") + "입니다.\n";
        String cnl = (internet ? "인터넷 기능이 켜진 상태입니다.\n" : "채널은 " + channel + "번 입니다.\n");
        String vol = "볼륨은 " + volume + "입니다.\n";

        return title + power + cnl + vol;
    }
}
