package beer.drone.model;

import java.util.ArrayList;
import java.util.HashSet;

/**Public class representing the Warehouse.
 *
 * @author Edward Seymour
 * @version 1.0 (11/16/16)
 */
public class Warehouse {
  private int capacity;
  private Location location;
  private ArrayList<Drone> drones;
  private ArrayList<Order> orders;
  private HashSet<Beer> beers;
  private Dispatch dispatch;

    /**
   * Constructs a warehouse.
   *
   * @param capacity the capactity of the warehouse.
   * @param location location of warehouse.
   * @param drones drones at this warehouse.
   * @param orders orders from this warehouse.
   * @param beers beers at this warehouse.
   */
  public Warehouse(
          int capacity,
          Location location,
          ArrayList<Drone> drones,
          ArrayList<Order> orders,
          HashSet<Beer> beers,
          Dispatch dispatch) {
    this.capacity = capacity;
    this.location = location;
    this.drones = drones;
    this.orders = orders;
    this.beers = beers;
    this.dispatch = dispatch;
  }
  /**
   * @param order customers order.
   */
  public void makeOrder(Order order) {
    orders.add(order);
  }
  /**
   * @param drone drone to be added to warehouse.
   */
  public void addDrone(Drone drone) {
    drones.add(drone);
  }
  /**
   * @param beer beer to be added to warehouse.
   */
  public void addBeer(Beer beer) {
    beers.add(beer);
  }
  /**
   * @return returns the capacity in warehouse.
   */
  public int getCapacity() {
    return capacity;
  }
  /**
   * @return returns the location of the warehouse.
   */
  public Location getLocation() {
    return location;
  }
  /**
   * @return returns dispatch information from warehouse.
   */
  public Dispatch getDispatch() {
    return dispatch;
  }
}
