package week03.project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 스캐너 인스턴스
        Scanner sc = new Scanner(System.in);
        // 계산기 인스턴스
        Calculator calculator = new Calculator(new AddOp(), new SubOp(), new MultiOp(), new DivOp());

        // 데이터 입력
        System.out.println("첫 번째 숫자를 입력하세요");
        int firstNumber = sc.nextInt();
        sc.nextLine();

        System.out.println("연산자를 입력하세요 (+, -, *, /, %)");
        String operator = sc.nextLine();

        System.out.println("두 번째 숫자를 입력하세요");
        int secondNumber = sc.nextInt();

        double answer = calculator.calculator(operator, firstNumber, secondNumber);
        System.out.println(firstNumber + " " + operator + " " + secondNumber + " = " + answer);

        sc.close();
    }
}