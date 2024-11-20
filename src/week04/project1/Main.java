package week04.project1;

public class Main {
    public static void main(String[] args) {
        boolean calculateEnded = false;
        // 구현 2.
        while (!calculateEnded) {
            try {
                // 트라이 캐치 문으로 예외를 잡아서 커스텀 예외 처리 해주기.
                calculateEnded = CalculatorApp.start();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
