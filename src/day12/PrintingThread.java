package day12;

public class PrintingThread extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        PrintingThread thread = new PrintingThread();
        thread.start();
    }
}

