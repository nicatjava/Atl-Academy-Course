package lesson53;

public class Main {
    public static void main(String[] args) {
        MyThread myRunnable = new MyThread();

        Thread thread1 = new Thread(myRunnable, "Thread 1");
        Thread thread2 = new Thread(myRunnable, "Thread 2");
        thread2.setPriority(Thread.MAX_PRIORITY);

        //thread1.start();
        //thread2.start();

        MyScondThread myScondRunnable = new MyScondThread();
        String name = myScondRunnable.call();
        //System.out.println(name);



        Thread thread4 = new Thread(new MyThread(){
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + ": " + i);
                }
            }
        });
        thread4.start();

    }
}
