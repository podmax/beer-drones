package beer.drone.model;

/**
 * @author Edward Seymour
 */
public class Customer extends User {
  private String address;
  private CreditCard card;

  public Customer(String name, String email, String password, String address, Dispatch dispatch) {
    this(name, email, password, address, null, dispatch);
  }

  public Customer(String name, String email, String password, String address, CreditCard card, Dispatch dispatch) {
    super(name, email, password, dispatch);
    this.address = address;
    this.card = card;
  }

  public void makeOrder(Order order) {
    this.getDispatch().makeOrder(order);
  }
}
