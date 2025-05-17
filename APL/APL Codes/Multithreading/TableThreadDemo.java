class TablePrinter extends Thread {
    private int number;

    public TablePrinter(int number) {
        this.number = number;
    }

    
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number*i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class TableThreadDemo {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new TablePrinter(9));
        Thread thread2 = new Thread(new TablePrinter(10));

        thread1.start();
        thread2.start();
    }
}
