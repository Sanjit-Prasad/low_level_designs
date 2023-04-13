package BookMyShow;

import java.util.List;

public class Booking {

    Show show;
    List<Seat> bookedSeats;
    Payment payment;

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public List<Seat> getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(List<Seat> bookedSeats) {
        this.bookedSeats = bookedSeats;
    }
}
