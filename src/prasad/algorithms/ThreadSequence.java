package prasad.algorithms;

/**
 * Created by pputta on 1/30/18.
 */
public class ThreadSequence {


    public static void main(String[] args) {
    Foo f = new Foo();
        MyThread t1 = new MyThread(f);
        MyThread2 t2 = new MyThread2(f);
        MyThread3 t3 = new MyThread3(f);

        t2.start();
        t1.start();
        t3.start();
        MyThread t4 = new MyThread(f);

t4.start();
    }
}
