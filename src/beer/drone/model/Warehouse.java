package beer.drone.model;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author Edward Seymour
 */
public class Warehouse {
  private int capacity;
  private Location location;
  private ArrayList<Drone> drones;
  private ArrayList<Order> orders;
  private HashSet<Beer> beers;
  private Dispatch dispatch;

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

  public void makeOrder(Order order) {
    orders.add(order);
  }

  public void addDrone(Drone drone) {
    drones.add(drone);
  }

  public void addBeer(Beer beer) {
    beers.add(beer);
  }

  public int getCapacity() {
    return capacity;
  }

  public Location getLocation() {
    return location;
  }

  public Dispatch getDispatch() {
    return dispatch;
  }
}
