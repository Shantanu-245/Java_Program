package Exception_Assignment;
import java.util.*;
public class 3_LoginSystem {
    public static void main(String[] args){
        String username = "Ankush";
        String password = "12345678";
        Scanner sc = new Scanner(System.in);
        String n = sc.nextInt();
        try{
            if(!n.equals(password)) throw new Exception("InvalidCredentialsException");

        }
        catch(InvalidCredentialsException e){
            System.out.println("Try again");
        }
    }
}
