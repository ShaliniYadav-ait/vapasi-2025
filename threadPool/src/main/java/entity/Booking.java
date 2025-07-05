package entity;

public class Booking implements Runnable {
    String bookingName;

    Booking(String name) {
        this.bookingName = name;
    }

    @Override
    public void run() {
        BookingDetails b = new BookingDetails();
        b.bookingReceived(this.bookingName);
        b.paymentProcessed(this.bookingName);
        b.ticketConfirmation(this.bookingName);
    }
}

