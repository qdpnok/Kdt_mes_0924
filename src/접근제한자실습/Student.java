package 접근제한자실습;

public class Student extends Person{
    private String school;

//    public Student() {
//        school = "휴먼교육센터";
//    }


    public Student(String name, int age, String addr, String ssn, String school) {
        super(name, age, addr, ssn);
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

//    public String showInfo() {
//        return "이름은 " + name + ", 나이는 " + age + ", 주소는 " + addr +
//                ", Ssn은 " + getSsn() + "학교는 " + school + "입니다.";
//    }

    public void showInfo() {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("주소: " + addr);
        System.out.println("주민번호: " + getSsn());
        System.out.println("학교: " + school);
    }
}
