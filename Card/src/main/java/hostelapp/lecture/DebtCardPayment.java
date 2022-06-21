package hostelapp.lecture;

public class DebtCardPayment extends CardPayment {
    private String bankName;

    public DebtCardPayment(double amount, String cardNumber, String nameOnCard, String bankName) {
        super(amount, cardNumber, nameOnCard);
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getDetails() {
        String temp = "Payment details (debt card):\n" + super.getDetails() + "\n" + "Bank name......: " + this.bankName + "\n";
        return temp;
    }
}
