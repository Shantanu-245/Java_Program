package Exception_Assignment;
class SeatAlreadyBookedException extends Exception {}

public class 10_Movie {
     public static void main(String[] args) {
        boolean seat = true;
        try {
            if(seat) throw new SeatAlreadyBookedException();
            System.out.println("Seat Booked");
        } catch(Exception e){ System.out.println("Seat Already Booked!"); }
    }
}
