package beer.drone.model;

import java.util.Date;

/**
 * @author Edward Seymour
 */
public class Order {
  private Date timePlaced;
  private boolean delivered;
  private Beer beer;

  public Order(Beer beer){
    this.beer = beer;
    delivered = false;
    timePlaced = new Date();
  }
}
