package Car;

public class Car {

  private final int seats;
  private final Engin engin;
  private final String tripComputer;
  private final String gps;

  @Override
  public String toString() {
    return "Car{" +
      "seats=" + seats +
      ", engin model, km, nbr cylindres =" + engin.getModel () +" "+engin.getKilometrage () +" "+engin.getCylindres () +
      ", tripComputer='" + tripComputer + '\'' +
      ", gps='" + gps + '\'' +
      '}';
  }

  public Car(int seats, Engin engin, String tripComputer, String gps) {
    this.seats = seats;
    this.engin = engin;
    this.tripComputer = tripComputer;
    this.gps = gps;
  }

  public int getSeats() {
    return seats;
  }

  public Engin getEngin() {
    return engin;
  }

  public String getTripComputer() {
    return tripComputer;
  }

  public String getGps() {
    return gps;
  }
}
