
public class SevenDaySubscriber extends NewsPaperSubscriber {

	
	public SevenDaySubscriber(String address) {
		super(address);
		setRate();
	}
	public void setRate() {
		this.rate = 10.5;
	}
	public String toString() {
		return "The seven day subscription is serviced to the address: " + this.getAddress() + " at a rate of: "+ this.getRate();
	}
}
