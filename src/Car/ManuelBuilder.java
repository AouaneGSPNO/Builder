package Car;

public class ManuelBuilder implements Builder {

	private Manuel manuel;
	private int seats;
	private Engin engin;
	private String tripComputer;
	private String gps;


	@Override
	public void setSeats(int seats) {
		this.seats=seats;
	}

	@Override
	public void setTripComputer(String tripComputer) {
		this.tripComputer=tripComputer;
	}

	@Override
	public void setGPS(String gps) {
		this.gps=gps;
	}

	@Override
	public void setEngine(Engin engin) {
		this.engin=engin;
	}
	public Manuel getResult() {
		return new Manuel ( seats, engin,  tripComputer, gps);
	}
}
