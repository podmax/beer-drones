package beer.drone.model;

import java.util.ArrayList;
import java.util.HashSet;

/**Public calss representing the dispatch system.
 * 
 * @author Edward Seymour
 * @version 1.0 (11/16/16)
 */
public class Dispatch {
  private HashSet<User> users;
  private ArrayList<Warehouse> warehouses;

  public Dispatch() {
    users = new HashSet<>();
    warehouses = new ArrayList<>();
  }
  /** @param order customers order. 
  */
  public void makeOrder(Order order) {
    /* TODO: Select closest warehouse */
    for(Warehouse warehouse : warehouses) {
      warehouse.makeOrder(order);
      break;
    }
  }
  /** @param warehouse warehouse. 
  */
  public void addWarehouse(Warehouse warehouse) {
    warehouses.add(warehouse);
  }
  /** @param user system user. 
  */
  public void addUser(User user) {
    users.add(user);
  }
  /** @param index customers order. 
  * @return warehouse number
  */
  public Warehouse getWarehouse(int index) {
    return warehouses.get(index);
  }
}
