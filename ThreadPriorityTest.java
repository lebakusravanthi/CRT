import java.util.*;
class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " - Priority:" + getPriority() + " - Iteration: " + i);
            Thread.yield();
    }
}
}
public class ThreadPriorityTest {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Low Priority Thread");
        MyThread t2 = new MyThread("Medium Priority Thread");
        MyThread t3 = new MyThread("High Priority Thread");
        t1.setPriority(Thread.MIN_PRIORITY); 
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY); 
        t1.start();
        t2.start();
        t3.start();
    }
}