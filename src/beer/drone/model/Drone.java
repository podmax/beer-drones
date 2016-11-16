package beer.drone.model;

/**
 * @author Edward Seymour
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

  public Drone(double speed, double batteryCharge, Warehouse warehouse) {
    this.speed = speed;
    this.batteryCharge = batteryCharge;
    status = Status.WAITING;
    location = warehouse.getLocation();
    this.warehouse = warehouse;
  }

  /* TODO: Implementation */
  public boolean isOccupied() {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

  public double getSpeed() {
    return speed;
  }

  public double getBatteryCharge() {
    return batteryCharge;
  }

  public Status getStatus() {
    return status;
  }

  public Location getLocation() {
    return location;
  }

  public Warehouse getWarehouse() {
    return warehouse;
  }

  public void setWarehouse(Warehouse warehouse) {
    this.warehouse = warehouse;
  }
}
