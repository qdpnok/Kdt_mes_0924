package 접근제한자실습;

public class CapsuleExMain {
    public static void main(String[] args) {
        Student student = new Student("스텟먼", 21, "메카저그", "이건뭐야", "휴먼");
        Person person = new Person("알라라크", 542, "프로토스", "이게무야");

        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.addr);
        System.out.println(person.getSsn());

        System.out.println();

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.addr);
        System.out.println(student.getSsn());
        System.out.println(student.getSchool());
        student.showInfo();
    }
}
