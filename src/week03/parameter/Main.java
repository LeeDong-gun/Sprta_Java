package week03.parameter;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        // 기본형 매개변수
        char type = 'D';
        car.brakePedal(type);

        System.out.println("type = " + type);
        System.out.println("gear = " + car.gear);

        System.out.println();
        // 참조형 매개변수
        Tire tire = new Tire();
        tire.company = "금호";

        Tire carInstanceTire = car.setTire(tire);

        System.out.println("tire.company = " + tire.company);

        System.out.println("carInstanceTire.company = " + carInstanceTire.company);
    }

}
