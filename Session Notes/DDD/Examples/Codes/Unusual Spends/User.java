public class User {
    private final String id;
    private String name;
    private String email;
    private String mobile;
    private List<CreditCard> cards;

    public User(String id, String name, String email, String mobile) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.cards = new ArrayList<>();
    }

    public void addCard(CreditCard card) {
        cards.add(card);
    }

    public void spend(double amount) {
        // Implement logic to record spend (maybe through a transaction service)
    }
}