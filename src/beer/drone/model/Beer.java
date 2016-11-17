package beer.drone.model;

/**Public calss representing the variations of beer.
 * 
 * @author Edward Seymour
 * @version 1.0 (11/16/16)
 */
public class Beer {
  private int cost;
  private String description;
  private int kind;
  private int packSize;
  private int quantity;
  /**
   * Constructs a beer.
   *
   * @param cost the cost of the beer.
   * @param description description of beer.
   * @param kind type of beer.
   * @param packSize number of beers in a pack.
   & @param quantity number of beer available.
   */
  public Beer(int cost, String description, int kind, int packSize, int quantity) {
    this.cost = cost;
    this.description = description;
    this.kind = kind;
    this.packSize = packSize;
    this.quantity = quantity;
  }
}
