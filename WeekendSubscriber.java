
public class WeekendSubscriber extends NewsPaperSubscriber {
	public WeekendSubscriber(String address) {
		super(address);
		setRate();
	}
	public void setRate() {
		this.rate = 4.5;
	}
	public String toString() {
		return "The weekend subscription is serviced to the address: " + this.getAddress() + " at a rate of: "+ this.getRate();
	}
}
