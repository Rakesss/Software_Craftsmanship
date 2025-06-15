import java.util.ArrayList;
import java.util.List;

public class User {
    private final String id;
    public static String name;
    private final String email;
    private final String mobile;
    private final List<CreditCard> cards;

    public User(String id, String name, String email, String mobile) {
        if (id == null || id.isBlank() ){
            throw new InvalidUserIdException(id);
        }
        if (name == null || name.isBlank() || !name.matches("[a-zA-Z]")){
            throw new InvalidUserNameException(name);
        }
        if (email == null || email.isBlank() ) {
            throw new InvalidEmailException(email);
        }
        if (mobile == null || mobile.isBlank()){
            throw new InvalidMobileNumberException(mobile);
        }

        this.id = id;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.cards = new ArrayList<>();
    }
    public String getName(){
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

    public List<CreditCard> getCards() {
        return cards;
    }

    public void addCard(CreditCard card) {
        cards.add(card);
    }
}
