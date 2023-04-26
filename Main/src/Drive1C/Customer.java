package Drive1C;

public class Customer extends Person{


    private int creditCard;

    public Customer(String name, int age, int phoneNumber, int creditCard) {
        super(name, age, phoneNumber);
        this.creditCard = creditCard;
    }

    public void setCreditCard(int creditCard) {
        this.creditCard = creditCard;
    }

    public int getCreditCard() {
        return creditCard;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "creditCard=" + creditCard +
                '}';
    }
}
