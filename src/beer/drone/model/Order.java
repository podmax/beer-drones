package beer.drone.model;

import java.util.Date;

/**Public class representing the customers order.
 *
 * @author Edward Seymour
 * @version 1.0 (11/16/16)
 */
public class Order {
  private Date timePlaced;
  private boolean delivered;
  private Beer beer;
  /**
   * @param beer @see Beer class.
   */
  public Order(Beer beer){
    this.beer = beer;
    delivered = false;
    timePlaced = new Date();
  }
}
