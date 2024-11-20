package week04.project;

public class Calculator {

    private Op operator;


    public Calculator(String opp) {
        this.operator = cc(opp);
        //    operator = new AddOp();
    }

    public Op getOperator() {
        return operator;
    }


    private Op cc(String opp2) {

        switch (opp2) {
            case "+":
                return new AddOp();

            case "-":
                return new SubOp();

            case "*":
                return new MultiOp();

            case "/":
                return new DivOp();

            case "%":
                return new Sss();

            default:
                System.out.println("잘못된 연산자 입니다.");
        }
        return null;
    }
}
