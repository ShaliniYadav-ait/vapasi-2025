package threadpool;

import java.util.concurrent.ExecutorService;

import static java.util.concurrent.Executors.newFixedThreadPool;

public class BookingSimulator {
    final static int THREAD_POOL_SIZE = 3;
    final static int NUMBER_OF_BOOKINGS = 5;

    public static void main(String[] args) {
        ExecutorService pool = newFixedThreadPool(THREAD_POOL_SIZE);
        System.out.println("Starting Booking simulator... ");
        for (int i = 0; i < NUMBER_OF_BOOKINGS; i++) {
            pool.execute(new Booking("Booking " + (i + 1) + " - "));
        }
        pool.shutdown();
        System.out.println("Booking simulator finished.");
    }
}
