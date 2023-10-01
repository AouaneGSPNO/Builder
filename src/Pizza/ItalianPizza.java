package Pizza;

public class ItalianPizza extends PizzaBuilder {
  public void buildPate() {
    pizza.setPate("pate italienne");
  }

  public void buildGarniture() {
    pizza.setGarniture("garniture italienne");
  }

}

