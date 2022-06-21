package hostelapp;

public class PaymentTest {
    public static void main(String[] args) {
        CreditCardPayment ccp = new CreditCardPayment(500, "123-1234-12345-12", "Túlio Sérgio", "VISA");
        System.out.println(ccp.getDetails() + "\n");

        DebtCardPayment dcp = new DebtCardPayment(200.50, "8979.1234.123.12", "Túlio Sérgio", "Wells Fargo");
        System.out.println(dcp.getDetails());
    }
}
