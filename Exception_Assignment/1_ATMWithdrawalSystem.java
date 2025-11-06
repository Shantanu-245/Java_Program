import java.util.*;
package Exception_Assignment;
public class 1_ATMWithdrawalSystem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int balance = 10000;
        int amount = 12000;

        try {
            if (amount > balance) {
                throw new Exception("Insufficient balance!");
            } else {
                balance -= amount;
                System.out.println("Withdrawal successful. Remaining balance: ₹" + balance);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
