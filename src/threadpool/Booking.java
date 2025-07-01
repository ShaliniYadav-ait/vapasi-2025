package threadpool;

import java.util.concurrent.ExecutorService;

import static java.util.concurrent.Executors.newFixedThreadPool;

class Request implements Runnable{
    String bookingName;
    Request(String name){
        this.bookingName = name;
    }

    @Override
    public void run() {
        System.out.println(this.bookingName + " Booking received");
        System.out.println(this.bookingName + " Payment processed");
        System.out.println(this.bookingName + " Ticket confirmed");
    }
}

public class Booking {
    public static void main(String[] args){
        final int THREAD_POOL_SIZE = 3;
        final int NUMBER_OF_BOOKINGS = 5;
        ExecutorService pool = newFixedThreadPool(THREAD_POOL_SIZE);

        for (int i = 0; i < NUMBER_OF_BOOKINGS; i++){
            pool.execute(new Request("Booking " + (i+1)));
        }
        pool.shutdown();
    }
}
