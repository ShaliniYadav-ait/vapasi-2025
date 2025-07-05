
package entity;

public class BookingDetails {
    public void bookingReceived(String name) {
        System.out.println(name + "Booking received");
    }

    public void paymentProcessed(String name) {
        System.out.println(name + "Payment processed");
    }

    public void ticketConfirmation(String name) {
        System.out.println(name + "Ticket confirmed");
    }
}