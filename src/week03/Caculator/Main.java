package week03.Caculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 숫자를 입력해 주세요 : ");
            int firstNumber = sc.nextInt();
            sc.nextLine();

            System.out.print("연산자를 입력 해주세요. (+, -, *, /) : ");
            String operator = sc.nextLine();

            System.out.print("두 번째 숫자를 입력해 주세요 : ");
            int secondNumber = sc.nextInt();
            sc.nextLine();

            Cal samsik = new Cal();

            double answer = samsik.play(operator).abOp(firstNumber, secondNumber);

            System.out.println(firstNumber + " " + operator + " " + secondNumber + " = " + answer);
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exit = sc.nextLine();


            if (exit.equals("exit")) {
                System.out.println("프로그램이 종료됩니다.");
                break;
            }
        }
        sc.close();
    }
}
