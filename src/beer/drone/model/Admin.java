package beer.drone.model;
/**Public subcalss of the User super class representing the admin in the system.
 * 
 * @author Edward Seymour
 * @version 1.0 (11/16/16)
 */
public class Admin extends User {

  /**
   * Constructs an admin.
   *
   * @param name the name of the admin
   * @param email the email of the admin
   * @param password the password of the admin
   */
  public Admin(String name, String email, String password, Dispatch dispatch) {
    super(name, email, password, dispatch);
  }

  /**
   * Constructs a user.
   *
   * @param drone ...
   * @param index ...
   */
  public void addDrone(Drone drone, int index) {
    getDispatch().getWarehouse(index).addDrone(drone);
  }
}
