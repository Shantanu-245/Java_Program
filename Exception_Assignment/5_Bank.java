package Exception_Assignment;

class NegativeAmountException extends Exception {}
class InsufficientFundsException2 extends Exception {}

public class 5_Bank {
    public static void main(String[] args) {
        int balance = 5000, amt = -100;
        try {
            if(amt < 0) throw new NegativeAmountException();
            if(amt > balance) throw new InsufficientFundsException2();
            System.out.println("Transaction Done");
        } catch(Exception e){ System.out.println("Transaction Failed"); }
    }
}

