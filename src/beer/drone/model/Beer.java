package beer.drone.model;

/**
 * @author Edward Seymour
 */
public class Beer {
  private int cost;
  private String description;
  private int kind;
  private int packSize;
  private int quantity;

  public Beer(int cost, String description, int kind, int packSize, int quantity) {
    this.cost = cost;
    this.description = description;
    this.kind = kind;
    this.packSize = packSize;
    this.quantity = quantity;
  }
}
