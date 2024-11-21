package week05.thread.stat.sleep.interrupt;

// - 쓰레드가 `start()` 된 후 동작하다 `interrupt()`를 만나 실행하면 interrupted 상태가 true가 됩니다.
public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            try {
                // sleep 도중 interrupt 발생 시, catch!
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("task : " + Thread.currentThread().getName());
        };

        Thread thread = new Thread(task, "Thread"); // NEW
        thread.start(); // NEW -> Runnable.

        thread.interrupt();

        System.out.println("thread.isInterrupted() = " + thread.isInterrupted());

    }
}


//public class Main {
//    public static void main(String[] args) {
//        Runnable task = () -> {
//            while (!Thread.currentThread().isInterrupted()) {
//                try {
//                    Thread.sleep(1000);
//                    System.out.println(Thread.currentThread().getName());
//                } catch (InterruptedException e) {
//                    break;
//                }
//            }
//            System.out.println("task : " + Thread.currentThread().getName());
//        };
//
//        Thread thread = new Thread(task, "Thread");
//        thread.start();
//
//        thread.interrupt();
//
//        System.out.println("thread.isInterrupted() = " + thread.isInterrupted());
//
//    }
//}
