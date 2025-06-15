import java.time.LocalDateTime;

public class Transaction {
    private final String id;
    private final Double amount;
    private final String merchantId;
    private final String creditCardId;
    private LocalDateTime timestamp;


    public Transaction(String id, double amount, String merchantId, String creditCardId, LocalDateTime now) {
        if (id == null || id.isBlank()){
            throw new InvalidTransactionIdException(id);
        }

        if (merchantId == null || merchantId.isBlank()){
            throw new InvalidMerchantIdException(id);
        }
        if (creditCardId == null || creditCardId.isBlank()){
            throw new InvalidCreditCardIdException(id);
        }

        this.id = id;
        this.amount = amount;
        this.merchantId = merchantId;
        this.creditCardId = creditCardId;
        this.timestamp = timestamp;
    }
    public String getId()
      {return id; }

    public String getMerchantId()
    {return merchantId;}

    public Double getAmount() {
        return amount;
    }

    public String getCreditCardId() {
        return creditCardId;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}
