package Car;

public class Engin {
  private final int kilometrage;
  private final String model ;
  private final double cylindres;

  public Engin(int kilometrage, String model, double cylindres) {
    this.kilometrage = kilometrage;
    this.model = model;
    this.cylindres = cylindres;
  }

  public int getKilometrage() {
    return kilometrage;
  }

  public String getModel() {
    return model;
  }

  public double getCylindres() {
    return cylindres;
  }
}
