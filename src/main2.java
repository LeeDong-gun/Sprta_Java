import java.util.Arrays;

public class main2 {

    public static void main(String[] args) {
        // 우리의 playground!
        // 래퍼 클래스(Wrapper Class 변수)
        int number = 21;

        Integer num = number; // boxing

        System.out.println(num.intValue()); // unboxing
    }
}