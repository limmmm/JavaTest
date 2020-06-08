package thread;

/**
 * @author Lim
 * @date 2020/4/4
 */
public class Test {
    private static Object obj = new Object();
    public static void main(String[] args) throws InterruptedException {

        //t
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t线程开始让出cpu");
                Thread.yield();
                System.out.println("t线程执行完成");
            }
        });
        //t1
        Thread t1 =new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println("t1线程开始让出cpu");
                Thread.yield();

                System.out.println("t1线程执行完成");
            }
        });
        t.start();
        t.join();
        t1.start();
        t1.join();
        System.out.println("i am "+Thread.currentThread());
    }
}
