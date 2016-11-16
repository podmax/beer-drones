package beer.drone.model;

/**
 * @author Edward Seymour
 */
public class CreditCard {
  private long cardNumber;
  private String cardName;
  private int cardVerification;

  /* TODO: Verify Validity */
  public CreditCard(long cardNumber, String cardName, int cardVerification) {
    this.cardNumber = cardNumber;
    this.cardName = cardName;
    this.cardVerification = cardVerification;
  }

  public long getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(long cardNumber) {
    this.cardNumber = cardNumber;
  }

  public String getCardName() {
    return cardName;
  }

  public void setCardName(String cardName) {
    this.cardName = cardName;
  }

  public int getCardVerification() {
    return cardVerification;
  }

  public void setCardVerification(int cardVerification) {
    this.cardVerification = cardVerification;
  }
}
