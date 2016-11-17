package beer.drone.model;
/**Public calss representing the customers creditcard.
 * 
 * @author Edward Seymour
 * @version 1.0 (11/16/16)
 */
public class CreditCard {
  private long cardNumber;
  private String cardName;
  private int cardVerification;

  /* TODO: Verify Validity */
    /**
   * Constructs a creditcard.
   *
   * @param cardNumber number on the credicard.
   * @param cardName name on the creditcard.
   * @param cardVerification CVV number on the back of the card.
   */
  public CreditCard(long cardNumber, String cardName, int cardVerification) {
    this.cardNumber = cardNumber;
    this.cardName = cardName;
    this.cardVerification = cardVerification;
  }
  /** @return returns cardNumber.
  */
  public long getCardNumber() {
    return cardNumber;
  }
  /** @param cardNumber number on the creditcard.
  */
  public void setCardNumber(long cardNumber) {
    this.cardNumber = cardNumber;
  }
  /** @return returns cardName.
  */
  public String getCardName() {
    return cardName;
  }
  /** @param cardName name on the creditcard.
  */
  public void setCardName(String cardName) {
    this.cardName = cardName;
  }
  /** @return returns CVV number.
  */
  public int getCardVerification() {
    return cardVerification;
  }
  /** @param cardVerification CVV number on the back of the creditcard.
  */
  public void setCardVerification(int cardVerification) {
    this.cardVerification = cardVerification;
  }
}
