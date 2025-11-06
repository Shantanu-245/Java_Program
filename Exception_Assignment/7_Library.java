package Exception_Assignment;
class BookNotAvailableException extends Exception {}

public class 7_Library {
     public static void main(String[] args) {
        boolean available = false;
        try {
            if(!available) throw new BookNotAvailableException();
            System.out.println("Book Borrowed");
        } catch(Exception e){ System.out.println("Book Not Available"); }
    }
}
