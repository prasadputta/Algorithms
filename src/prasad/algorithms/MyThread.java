package prasad.algorithms;

public class MyThread extends Thread {

    private Foo foo;

    public MyThread(Foo foo) {
        this.foo = foo;
    }

    public void run() {
            foo.first();
    }
}