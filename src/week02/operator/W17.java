package week02.operator;

import java.util.Scanner;

public class W17 {

    // 구구단!!!!!!!
    public static void main(String[] args) {
        // 입력하는 단을 제외하고 출력!!
        Scanner sc = new Scanner(System.in);
        int passNum = sc.nextInt(); // 출력을 제외할 구구단 수 값

        for(int i = 2; i <= 9; i++) {
            if (i != passNum) {  // != : 특정한 단 만 출력 , == : 출력을 제외할 구구단 수의 값
                continue;
            }
            for(int j = 2; j <= 9; j++ ) {
                System.out.println(i + "곱하기 " + j + "는 " + (i * j) + "입니다.");
            }
            System.out.println("--------------");
        }
    }
}
