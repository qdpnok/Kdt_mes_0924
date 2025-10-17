package 열거클래스;

enum DevType {
    FRONTEND, BACKEND, FULLSTACK, MOBILE, AI
}

enum Career {
    JUNIOR, SENIOR
}

enum Gender {
    MALE, FEMALE
}

public class Developer {
    private String name;
    private DevType type;
    private Career career;
    private Gender gender;

    // 매개변수가 전부 있는 생성자 만들기
    public Developer (String name, DevType type, Career career, Gender gender) {
        this.name = name;
        this.type = type;
        this.career = career;
        this.gender = gender;
    }
    // 매개변수가 없는 생성자 만들기
    public Developer() {
        name = "이상미";
        type = DevType.FULLSTACK;
        career = Career.JUNIOR;
        gender = Gender.FEMALE;
    }

    // toString 오버라이딩해서 정보 출력하기
    @Override
    public String toString() {
        return "이름은 " + name + ". 업무는 " + type + ". 경력은 " + career + ". 성별은 " + gender + ".";
    }
}
