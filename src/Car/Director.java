package Car;

public class Director {

	public void BERLINE(Builder builder) {
		builder.setSeats(5);
		builder.setEngine(new Engin(300,"BERLINE", 2.00));
		builder.setTripComputer(" ACTIVE");
		builder.setGPS("Grand gps active");
	}

	public void CITADINE(Builder builder) {
		builder.setSeats(4);
		builder.setEngine(new Engin(200,"CITADINE", 1.4));
		builder.setTripComputer(" DESACTIVE");
		builder.setGPS("Grand gps active");
	}

	public void SUV(Builder builder) {
		builder.setSeats(7);
		builder.setEngine(new Engin(700,"SUV", 2.2));
		builder.setTripComputer(" ACTIVE");
		builder.setGPS("Grand gps active");
	}
}
