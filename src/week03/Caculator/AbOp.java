package week03.Caculator;

public abstract class AbOp {
    // 완성된 추상클래스
    abstract double abOp(int num1, int num2);
}
// 추상클래스는 하나이상의 추상 메서드를 가지고 있는 클래스
// 추상메서드는 상속받는 자식 클래스에 강제로 구현하게 하기 위해서.
// 추상메스드의 존재 이유 : 상속받는 자식 클래스들이 정의해야하는 메서드 이름과 받아야 하는
//                           매개변수를 강제하기 위해서