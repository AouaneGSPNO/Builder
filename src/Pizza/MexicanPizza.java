package Pizza;


public class MexicanPizza extends PizzaBuilder {
  public void buildPate() {
    pizza.setPate ("mexican pate");
  }

  public void buildGarniture() {
    pizza.setGarniture ("mexican garniture");
  }

}