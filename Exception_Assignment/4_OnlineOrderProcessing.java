package Exception_Assignment;
class OutOfStockException extends Exception {}
class PaymentFailedException extends Exception {}

public class 4_OnlineOrderProcessing {
     static void placeOrder() throws OutOfStockException, PaymentFailedException {
        int x = (int)(Math.random()*3);
        if(x==0) throw new OutOfStockException();
        if(x==1) throw new PaymentFailedException();
        System.out.println("Order Placed Successfully!");
    }

    public static void main(String[] args) {
        try {
            placeOrder();
        } catch(OutOfStockException e){ System.out.println("Product Out of Stock!"); }
        catch(PaymentFailedException e){ System.out.println("Payment Failed!"); }
}
}