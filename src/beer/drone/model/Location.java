package beer.drone.model;

/**
 * Location represents a coordinate on Earth
 *
 * @author Edward Seymour
 * @version 1.0 (11/16/16)
 */
public class Location {
  private double latitude;
  private double longitude;
  private double altitude;

  public static final double EARTH_RADIUS = 6371; // In km

  /**
   * Creates a new instance of Location with altitude 0, and specified latitude and longitude.
   *
   * @param latitude the latitude in degrees
   * @param longitude the longitude in degrees
   */
  public Location(double latitude, double longitude) {
    this(latitude, longitude, 0.0);
  }

  /**
   * Creates a new instance of Location with specified lattitude, longitude and altitude.
   *
   * @param latitude the latitude in degrees
   * @param longitude the longitude in degrees
   * @param altitude the altitude of the location
   */
  public Location(double latitude, double longitude, double altitude) {
    this.latitude = latitude;
    this.longitude = longitude;
    this.altitude = altitude;
  }

  /**
   * Computes the distance between this and that.
   *
   * @param that the Location to compare to
   * @return the distance in miles
   */
  public double distanceFrom(Location that) {
    /* TODO: Implementation */
    throw new UnsupportedOperationException("Not implemented yet.");
  }
  /**
   * @return returns the latitude.
   */
  public double getLatitude() {
    return latitude;
  }
  /** @param latitude latitude.
  */
  public void setLatitude(double latitude) {
    this.latitude = latitude;
  }
  /**
   * @return returns the longitude.
   */
  public double getLongitude() {
    return longitude;
  }
  /** @param longitude longitude.
  */
  public void setLongitude(double longitude) {
    this.longitude = longitude;
  }
  /**
   * @return returns the altitude.
   */
  public double getAltitude() {
    return altitude;
  }
  /** @param altitude altitude.
  */
  public void setAltitude(double altitude) {
    this.altitude = altitude;
  }
}
