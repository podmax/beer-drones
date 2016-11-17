package beer.drone.model;

/**Public subcalss of the User super class representing the customer in the system.
 * 
 * @author Edward Seymour
 * @version 1.0 (11/16/16)
 */
public class Customer extends User {
  private String address;
  private CreditCard card;
  /**
   * Constructs a customer.
   *
   * @param name the name of the customer.
   * @param email the email of the customer.
   * @param password the password of the customer.
   * @param address the address of the customer.
   */
  public Customer(String name, String email, String password, String address, Dispatch dispatch) {
    this(name, email, password, address, null, dispatch);
  }
  /**
   * Constructs a customer.
   *
   * @param name the name of the customer.
   * @param email the email of the customer.
   * @param password the password of the customer.
   * @param address the address of the customer.
   * @param card the credit card of the customer.
   */
  public Customer(String name, String email, String password, String address, CreditCard card, Dispatch dispatch) {
    super(name, email, password, dispatch);
    this.address = address;
    this.card = card;
  }

  /** @param order customers order. 
  */
  public void makeOrder(Order order) {
    this.getDispatch().makeOrder(order);
  }
}
