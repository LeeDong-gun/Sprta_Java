package week03.Caculator;

public class Cal {


    public AbOp play(String operator) {
        if (operator.equals("+")) {
            return new AddOp2();
        } else if (operator.equals("-")) {
            return new SubOp2();
        } else if (operator.equals("*")) {
            return new MulOp2();
        } else if (operator.equals("/")) {
            return new DivOp2();
        } else {
            System.out.println("잘못된 연산자 입니다.");
            return null;
        }
    }
}
