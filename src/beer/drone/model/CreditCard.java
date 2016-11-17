package beer.drone.model;

/**Public calss representing the variations of beer.
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
   * Constructs a credit card.
   *
   * @param cardNumber number of the credit card.
   * @param cardName name on the credit card.
   * @param cardVerification cv numbers on back of credit card.
   */
  public CreditCard(long cardNumber, String cardName, int cardVerification) {
    this.cardNumber = cardNumber;
    this.cardName = cardName;
    this.cardVerification = cardVerification;
  }
  /** @return getCardNumber returns number on the credit card.
   */
  public long getCardNumber() {
    return cardNumber;
  }
  /** @param cardNumber number on the credit card.
   */
  public void setCardNumber(long cardNumber) {
    this.cardNumber = cardNumber;
  }
  /** @return getCardName returns name on the credit card.
   */
  public String getCardName() {
    return cardName;
  }
  /** @param cardName name on the credit card.
   */
  public void setCardName(String cardName) {
    this.cardName = cardName;
  }
  /** @return getCardverification returns cv numbers on the credit card.
   */
  public int getCardVerification() {
    return cardVerification;
  }
  /** @param cardverification cv number on the credit card.
   */
  public void setCardVerification(int cardVerification) {
    this.cardVerification = cardVerification;
  }
}
