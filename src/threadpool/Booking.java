package threadpool;

class Booking implements Runnable{
    String bookingName;
    Booking(String name){
        this.bookingName = name;
    }

    @Override
    public void run() {
        System.out.println(this.bookingName + " Booking received");
        System.out.println(this.bookingName + " Payment processed");
        System.out.println(this.bookingName + " Ticket confirmed");
    }
}
