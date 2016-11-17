package beer.drone.model;
/**Public calss representing the drones in the system.
 * 
 * @author Edward Seymour
 * @version 1.0 (11/16/16)
 */
public class Drone {
  enum Status {
    WAITING, CHARGING, LEAVING, DELIVERING, RETURNING
  }
  private double speed;
  private double batteryCharge;
  private Status status;
  private Location location;
  private Warehouse warehouse;

  /**
   * Constructs a drone.
   *
   * @param speed speed of the drone
   * @param batteryCharge power of the drone.
   * @param warehouse warehouse that the drone is located.
   * @see Warehouse
   */
  public Drone(double speed, double batteryCharge, Warehouse warehouse) {
    this.speed = speed;
    this.batteryCharge = batteryCharge;
    status = Status.WAITING;
    location = warehouse.getLocation();
    this.warehouse = warehouse;
  }

  /* TODO: Implementation */
  /** @throws UnsupportedOperationException if not implemented yet.
  */
  public boolean isOccupied() {
    throw new UnsupportedOperationException("Not implemented yet.");
  }
  /** @return returns speed.
  */
  public double getSpeed() {
    return speed;
  }
  /** @return returns battery power.
  */
  public double getBatteryCharge() {
    return batteryCharge;
  }
  /** @return returns status.
  */
  public Status getStatus() {
    return status;
  }
  /** @return returns location of drone.
  */
  public Location getLocation() {
    return location;
  }
  /** @return returns warehouse.
  */
  public Warehouse getWarehouse() {
    return warehouse;
  }
  /** @param warehouse warehouse.
  * @see Warehouse
  */
  public void setWarehouse(Warehouse warehouse) {
    this.warehouse = warehouse;
  }
}
