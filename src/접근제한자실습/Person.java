package 접근제한자실습;

public class Person {
    public String name;
    protected int age;
    String addr;
    private String ssn;

//    public Person() {
//        name = "스텟먼";
//        age = 35;
//        addr = "이곤";
//        ssn = "뭐의 약자죠?";
//    }


    public Person(String name, int age, String addr, String ssn) {
        this.name = name;
        this.age = age;
        this.addr = addr;
        this.ssn = ssn;
    }

    public String getSsn() {
        return ssn;
    }
}
