package beer.drone.model;

/**
 * @author Edward Seymour
 */
public class Admin extends User {
  public Admin(String name, String email, String password, Dispatch dispatch) {
    super(name, email, password, dispatch);
  }

  public void addDrone(Drone drone, int index) {
    getDispatch().getWarehouse(index).addDrone(drone);
  }
}
