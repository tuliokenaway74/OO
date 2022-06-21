package hostelapp.lecture;

public class CreditCardPayment extends CardPayment {
    private String issuer;

    public CreditCardPayment(double amount, String cardNumber, String nameOnCard, String issuer) {
        super(amount, cardNumber, nameOnCard);
        this.issuer = issuer;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public String getDetails() {
        String temp = "Payment details (credit card):\n" + super.getDetails() + "\n" + "Issuer.........: " + this.issuer + "\n";
        return temp;
    }
}