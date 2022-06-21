package hostelapp.lecture;

public class PaymentTest {
    public static void main(String[] args) {
        CreditCardPayment ccp = new CreditCardPayment(500, "123-1234-12345-12", "Túlio Sérgio", "VISA");
        processPayment(ccp);

        DebtCardPayment dcp = new DebtCardPayment(200.50, "8979.1234.123.12", "Túlio Sérgio", "Wells Fargo");
        processPayment(dcp);
    }

    public static void processPayment(CardPayment cp) {
        System.out.println("Processing the payment");

        if(cp instanceof CreditCardPayment) {
            CreditCardPayment ccp = (CreditCardPayment)cp;
            System.out.println(ccp.getIssuer());
        } else if(cp instanceof DebtCardPayment) {
            DebtCardPayment dcp = (DebtCardPayment)cp;
            System.out.println(dcp.getBankName());
        }
    }

//    public static void processPayment(CreditCardPayment ccp) {
//        System.out.println("Processing the payment");
//        System.out.println(ccp.getDetails());
//    }
//
//    public static void processPayment(DebtCardPayment dcp) {
//        System.out.println("Processing the payment");
//        System.out.println(dcp.getDetails());
//    }
}
