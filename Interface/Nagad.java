package Interface;

public class Nagad implements OnlinePayment {


    @Override
    public float paymentCharge() {
        return 9.99f;
    }

    @Override
    public void paymentConfirmation() {
        System.out.println("Payment Confirm by Nagad");
    }
}
