
public abstract class NewsPaperSubscriber {
	protected String address;
	protected double rate;
	public NewsPaperSubscriber(String address) {
		this.address = address;
	}
	// getters
	public String getAddress() {
		return this.address;
	}
	public double getRate() {
		return this.rate;
	}
	// setters
	public void setAddress(String newAddress) {
		this.address = newAddress;
	}
	public abstract void setRate();
	// Equal() returns true if two NewsPaperSubscriber object contains the same address
	public boolean Equal(NewsPaperSubscriber nps) {
		boolean isEqual = false;
		if(this.address.equals(nps.getAddress())) {
			isEqual = true;
		}
		return isEqual;
	}
	
}

