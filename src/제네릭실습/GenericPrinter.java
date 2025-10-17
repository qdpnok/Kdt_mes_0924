package 제네릭실습;

// T는 타입 변수를 의미한다. 예약어는 아님. (이름을 아무거나 지어도 되는데 T나 M 정도로 짓는게 관습임)
// 기본 타입은 올 수 없음.
public class GenericPrinter<T extends Material> {
    private T material;
    public void setMaterial(T material) {
        this.material = material;
    }
    public T getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return material.toString();
    }
}
