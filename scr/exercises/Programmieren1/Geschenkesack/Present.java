package exercises.Programmieren1.Geschenkesack;

public class Present {
    private final String description;
    private final double priceInEuro;
    private final Person sender;
    private final Person recipient;

    public Present(String description, double priceInEuro, Person sender, Person recipient) {
        this.description = description;
        this.priceInEuro = priceInEuro;
        this.sender = sender;
        this.recipient = recipient;
    }

    public double getPriceInEuro() {
        return priceInEuro;
    }

    @Override
    public String toString() {
        return "Present{name='" + description + "', price=" + priceInEuro + "€, giver=" + sender + ", receiver="
                + recipient + "}";
    }

}
