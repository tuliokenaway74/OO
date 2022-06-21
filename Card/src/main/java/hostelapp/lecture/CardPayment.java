package hostelapp.lecture;

public class CardPayment {
    private double amount;
    private String cardNumber;
    private String nameOnCard;

    public CardPayment(double amount, String cardNumber, String nameOnCard) {
        this.amount = amount;
        this.cardNumber = cardNumber;
        this.nameOnCard = nameOnCard;
    }

//    public CardPayment() {
//    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getNameOnCard() {
        return nameOnCard;
    }

    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }

    public String getDetails() {
        String temp = "Total amount...: $" + this.getAmount() + "\n" + "Number.........: " + this.getCardNumber() + "\n" + "Name on card...: " + this.getNameOnCard();
        return temp;
    }
}
