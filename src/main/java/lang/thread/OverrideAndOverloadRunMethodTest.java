package lang.thread;

/**
 * Created by srapolu on 2/17/17.
 */
public class TestOverrideAndOverloadRunMethod{
    public static void main(String[] args) {
        Thread thread = new OverrideAndOverloadRunMethodThread();
        thread.start();
    }
}
class OverrideAndOverloadRunMethodThread extends Thread{
    @Override
    public void run() {
        int i=0;
        System.out.println("no-arg run");
    }

    /**
     * overloaded run method that gets executed
     * only by explicitly calling run method with args */
    public void run(int i){
        System.out.println("int-arg run");
    }
}