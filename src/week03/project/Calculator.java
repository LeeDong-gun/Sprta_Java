package week03.project;

public class Calculator {

    private final AddOp addOp;
    private final SubOp subOp;
    private final MultiOp multiOp;
    private final DivOp divOp;

    public Calculator(AddOp addOp, SubOp subOp, MultiOp multiOp, DivOp divOp) {
        this.addOp = addOp;
        this.subOp = subOp;
        this.multiOp = multiOp;
        this.divOp = divOp;
    }

    public double calculator(String operator, int firstNumber, int secondNumber) {
        double answer = 0;

        switch (operator) {
            case "+":
                answer = addOp.addOp(firstNumber, secondNumber);
                break;
            case "-":
                answer = subOp.subOp(firstNumber, secondNumber);
                break;
            case "*":
                answer = multiOp.multiOp(firstNumber, secondNumber);
                break;
            case "/":
                answer = divOp.divOp(firstNumber, secondNumber);
                break;
            default:
                System.out.println("잘못된 연산자 입니다.");
        }

        return answer;
    }
}
