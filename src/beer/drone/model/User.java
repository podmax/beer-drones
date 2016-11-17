package beer.drone.model;

/**
 * User is an abstract class that represents a user in the system
 *
 * @author Edward Seymour
 * @version 1.0 (11/16/16)
 *
 */
public abstract class User {
  private String name;
  private String email;
  private String password;
  private Dispatch dispatch;

  /**
   * Constructs a user.
   *
   * @param name the name of the user
   * @param email the email of the user
   * @param password the password of the user
   */
  public User(String name, String email, String password, Dispatch dispatch) {
    this.name = name;
    this.email = email;
    this.password = password;
    this.dispatch = dispatch;
  }

  public void register() {
    dispatch.addUser(this);
  }
  /** @return returns name of user.
  */
  public String getName() {
    return name;
  }
  /** @return returns email of user.
  */
  public String getEmail() {
    return email;
  }
  /** @return returns password of user.
  */
  public String getPassword() {
    return password;
  }
  /** @return returns dispatch.
  */
  public Dispatch getDispatch() {
    return dispatch;
  }
}
