package main.java;

public class SleepWaitInterview {

    public static void main(String[] args) throws InterruptedException {
        /*
        1、这两个方法来自不同的类分别是Thread和Object
        2、最主要是sleep方法没有释放锁，而wait方法释放了锁，使得其他线程可以使用同步控制块或者方法。
        3、wait，notify和notifyAll只能在同步控制方法或者同步控制块里面使用，而sleep可以在任何地方使用（使用范围）
        4、sleep， wait 必须捕获异常，而notify和notifyAll不需要捕获异常
        5、sleep是Thread类的静态方法。sleep的作用是让线程休眠制定的时间，在时间到达时恢复，也就是说sleep将在接到时间到达事件事恢复线程执行。
          wait是Object的方法，也就是说可以对任意一个对象调用wait方法，
          调用wait方法将会将调用者的线程挂起，直到其他线程调用同一个对象的notify
         方法才会重新激活调用者
         */
        // The thread does not lose ownership of any monitors, 没有释放锁.
        Thread.sleep(1);
    }

    public synchronized void testa() throws InterruptedException {
        // the current thread must own this object's monitor. The thread
        //     * releases ownership of this monitor and waits until another thread
        //     * notifies threads waiting on this object's monitor to wake up
        //     * either through a call to the {@code notify} method or the
        //     * {@code notifyAll} method
        wait();
        notify();
        notifyAll();

    }

}
