package 코코아톡;

public class CocoaTalk {
    private String to;  // 상대방
    private String msg; // 전송할 메시디
    private NetAdapter adaptor; // 연결할 네으읔 ㅈ=ㄹ저ㅐ

    public CocoaTalk(String to, NetAdapter adaptor) {
        this.to = to;
        this.adaptor = adaptor;
    }

    public void writeMsg(String msg) {
        this.msg = msg;
    }

    public void send() {
        adaptor.connect();
        adaptor.send(to + " " + msg);
    }
}
