package week03.project;

public class Calculator {

    private Op operator;

    public Op getopertor() {
        return operator;
    }

    public Calculator(String operator) {
        this.operator = calculator(operator);
    }

    private Op calculator(String operator) {

        switch (operator) {
            case "+" :
                return new AddOp();

            case "-" :
                return new SubOp();

            case "*" :
                return new MultiOp();

            case "/" :
                return  new DivOp();

            case "%" :
                return new Sss();

            default:
                System.out.println("잘못된 연산자 입니다.");
        }
        return null;
    }
}
