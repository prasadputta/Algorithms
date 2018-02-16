package prasad.algorithms;

public class MyThread3 extends Thread {
    private Foo foo;

    public MyThread3(Foo foo) {
        this.foo = foo;
    }

    public void run() {
        foo.third();
    }
}