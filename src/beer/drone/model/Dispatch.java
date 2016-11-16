package beer.drone.model;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author Edward Seymour
 */
public class Dispatch {
  private HashSet<User> users;
  private ArrayList<Warehouse> warehouses;

  public Dispatch() {
    users = new HashSet<>();
    warehouses = new ArrayList<>();
  }

  public void makeOrder(Order order) {
    /* TODO: Select closest warehouse */
    for(Warehouse warehouse : warehouses) {
      warehouse.makeOrder(order);
      break;
    }
  }

  public void addWarehouse(Warehouse warehouse) {
    warehouses.add(warehouse);
  }

  public void addUser(User user) {
    users.add(user);
  }

  public Warehouse getWarehouse(int index) {
    return warehouses.get(index);
  }
}
