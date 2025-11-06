package Exception_Assignment;
class ServiceOverdueException extends Exception {}
class InvalidMileageException extends Exception {}
public class 6_Vehicle {
    public static void main(String[] args) {
        int days = 40, km = 5000;
        try {
            if(km < 0) throw new InvalidMileageException();
            if(days > 30) throw new ServiceOverdueException();
            System.out.println("Maintenance OK");
        } catch(Exception e){ System.out.println("Maintenance Required"); }
    }
}
