package Car;

public class MainClass {

	public static void main(String[] args) {

      Director director = new Director();

      CarBuilder builder = new CarBuilder();
      director.BERLINE (builder);

      Car car = builder.getResult();
      System.out.println("Car built:\n" + car.toString ());

      ManuelBuilder manuelBuilder = new ManuelBuilder();

      director.CITADINE (manuelBuilder);
      Manuel manuel = manuelBuilder.getResult ();
      System.out.println("\nCar manual built:\n" + manuel.toString ());
	}

}
