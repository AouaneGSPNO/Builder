package Pizza;

public class Pizza {
  private String pate = "";
  private String garniture = "";

  public void setPate(String pate) {
    this.pate = pate;
  }

  public void setGarniture(String garniture) {
    this.garniture = garniture;
  }

  @Override
  public String toString() {
    return "Pizza{" +
      "pate='" + pate + '\'' +
      ", garniture='" + garniture + '\'' +
      '}';
  }
}
