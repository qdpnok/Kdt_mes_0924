package 정적멤버;
// static : 정적 멤버(필드) 및 메서드를 만들 때 사용, 클래스 생성 시 함께 생성되고, 객체 생성 시 생성되지 않음
// 은행을 5개 만들고 각각에 대해서 입금, 출금, 조회 기능 구현하기
// Bank 클래스 객체가 몇 개 생성되었는지를 확인하기 위해서 정적 메서드 호출해서 결과 확인

public class StaticMain {
    public static void main(String[] args) {
        Bank bank1 = new Bank("카카오", 1000);
        Bank bank2 = new Bank("농협", 2000);
        Bank bank3 = new Bank("신한", 3000);
        Bank bank4 = new Bank("국민", 4000);
        Bank bank5 = new Bank("토스", 5000);

        bank1.setDeposit(3000);
        bank1.setWithdraw(1200);
        bank1.viewAccount();

        bank2.setDeposit(3000);
        bank2.setWithdraw(5000);
        bank2.viewAccount();

        bank3.setDeposit(1000);
        bank3.setWithdraw(7000);
        bank3.viewAccount();

        bank4.setDeposit(3000);
        bank4.setWithdraw(1200);
        bank4.viewAccount();

        bank5.setDeposit(3000);
        bank5.setWithdraw(1200);
        bank5.viewAccount();

        System.out.println(Bank.getCount());
    }
}
