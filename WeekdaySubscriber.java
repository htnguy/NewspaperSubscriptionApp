
public class WeekdaySubscriber extends NewsPaperSubscriber  {
	public WeekdaySubscriber(String address) {
		super(address);
		setRate();
	}
	public void setRate() {
		this.rate = 7.5;
	}
	public String toString() {
		return "The weekday subscription is serviced to the address: " + this.getAddress() + " at a rate of: "+ this.getRate();
	}
}
