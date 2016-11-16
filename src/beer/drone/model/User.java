package beer.drone.model;

/**
 * User is an abstract class that represents a user in the system
 *
 * @author Edward Seymour
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

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  public String getPassword() {
    return password;
  }

  public Dispatch getDispatch() {
    return dispatch;
  }
}
