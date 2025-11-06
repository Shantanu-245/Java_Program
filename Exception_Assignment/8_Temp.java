package Exception_Assignment;
class InvalidTempException extends Exception {}

public class 8_Temp {
    public static void main(String[] args) {
        double c = -300;
        try {
            if(c < -273.15) throw new InvalidTempException();
            System.out.println("F = " + (c*9/5+32));
        } catch(Exception e){ System.out.println("Invalid Temperature!"); }
    }
}
