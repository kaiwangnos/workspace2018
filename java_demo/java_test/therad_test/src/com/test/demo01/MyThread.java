package com.test.demo01;

public class MyThread implements Runnable {
    private int aaa = 100;
    Object obj = new Object();

    @Override
    public void run() {

        while (true) {
            synchronized (MyThread.class) {
                if (aaa < 1) {
                    break;
                }

                System.out.println(Thread.currentThread().getName() + ":" + aaa);
                aaa--;

            }
        }
    }


}
