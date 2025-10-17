package 제네릭실습;

public class Powder extends Material{
    @Override
    public void doPrinting() {
        System.out.println("Powder 재료로 출력합니다.");
    }

    @Override
    public String toString() {
        return "재료는 Powder입니다.";
    }
}

class Plastic extends Material{
    @Override
    public void doPrinting() {
        System.out.println("Plastic 재료로 출력합니다.");
    }

    @Override
    public String toString() {
        return "재료는 Plastic입니다.";
    }
}

class Nylon extends Material{
    @Override
    public void doPrinting() {
        System.out.println("Nylon 재료로 출력합니다.");
    }

    @Override
    public String toString() {
        return "재료는 Nylon입니다.";
    }
}

class Water extends Material {
    @Override
    public void doPrinting() {
        System.out.println("Water 재료로 출력합니다.");
    }

    @Override
    public String toString() {
        return "재료는 Water입니다.";
    }
}