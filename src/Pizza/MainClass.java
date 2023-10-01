package Pizza;


public class MainClass {

	public static void main(String[] args) {

      Director director = new Director();
      PizzaBuilder mexicanPizza = new MexicanPizza ();
      PizzaBuilder italianPizza = new ItalianPizza ();
      director.setPizzaBuilder( mexicanPizza );
      director.constructPizza();
      Pizza pizza = director.getPizza();
      director.setPizzaBuilder( italianPizza );
      director.constructPizza();
      Pizza pizza1 = director.getPizza();
      System.out.println("\n*****************PIZZA ITALIENNE********************");
          System.out.println("\nItalian Pizza built:\n"+pizza1.toString ());

          System.out.println("\n*****************PIZZA MEXICAINE********************");
          System.out.println("\nMexican Pizza built:\n" +pizza.toString ());

    }

}
