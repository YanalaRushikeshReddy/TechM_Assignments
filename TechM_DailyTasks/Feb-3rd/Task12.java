package Feb3;

public class Task12 extends Thread {
    public void run() {
        System.out.println("Hello, Java!");
    }

    public static void main(String[] args) {
        Task12 thread = new Task12();
        thread.start();
    }
}

