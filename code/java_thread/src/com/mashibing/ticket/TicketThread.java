package com.mashibing.ticket;

/**
 * @author: 马士兵教育
 * @create: 2019-09-28 21:10
 */
public class TicketThread extends Thread{

    private static int ticket = 5;

    @Override
    public void run() {
        for(int i = 0;i<100;i++){
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "正在出售第" + (ticket--) + "张票");
            }
        }
    }

    public static void main(String[] args) {
        TicketThread t1 = new TicketThread();
        TicketThread t2 = new TicketThread();
        TicketThread t3 = new TicketThread();
        TicketThread t4 = new TicketThread();

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
