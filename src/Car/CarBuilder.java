package Car;

public class CarBuilder implements Builder{
	
	private Car car;
	private int seats;
	private Engin engin;
	private String tripComputer;
	private String gps;
	public Car getCar() {
		return this.car;
	}
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
	public Car getResult() {
		return new Car( seats, engin,  tripComputer, gps);
	}
}
