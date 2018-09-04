import java.util.ArrayList;
import java.util.Scanner;

public class Subscriber {


	public static void main(String[] args) {
		boolean addMore = true;
		// declaring a new ArrayList object containing the different NewsPaperSubscriber objects
		ArrayList<NewsPaperSubscriber> subscribers = new ArrayList<NewsPaperSubscriber>(); 
		String address;
		int serviceSelection;
		Scanner scan = new Scanner(System.in);
		// initializing one NewsPaperSubscriber object for comparison
		System.out.println("Enter the address: ");
		address = scan.nextLine();
		System.out.println(" 1. Seven Day Subscription- $10.50/week \n 2. Weekday Subscription-$7.50/week \n 3. Weekend Subscription-$4.50/week");
		serviceSelection = scan.nextInt();
		scan.nextLine();
		if(serviceSelection == 1) {
			subscribers.add(new SevenDaySubscriber(address));
		}else if(serviceSelection == 2) {
			subscribers.add(new WeekdaySubscriber(address));
		}else if(serviceSelection == 3) {
			subscribers.add( new WeekendSubscriber(address));
		}
		System.out.println(subscribers.get(0).toString());
	// while the user wants to add more
		while(addMore) {
			System.out.println("Please enter another address: ");
			address = scan.nextLine();
			System.out.println(" 1. Seven Day Subscription- $10.50/week \n 2. Weekday Subscription-$7.50/week \n 3. Weekend Subscription-$4.50/week");
			serviceSelection = scan.nextInt();
			boolean sameAddress = false;
			// checks if address is already in used
			for(NewsPaperSubscriber sub: subscribers) {
				if(sub.getAddress().equals(address)){
					sameAddress = true;
					System.out.println("address already in use");
					break;
				}
			}
			if(!sameAddress) { // if the address is not in use
				switch(serviceSelection) {
				case 1: // Seven day Subscription
					SevenDaySubscriber sub1 = new SevenDaySubscriber(address);
					subscribers.add(sub1);
					break;
				case 2: // Weekday Subscription
					WeekdaySubscriber sub2 = new WeekdaySubscriber(address);
					subscribers.add(sub2);
					break;
				case 3: // Weekend Subscription
					WeekendSubscriber sub3 = new WeekendSubscriber(address);
					subscribers.add(sub3);
					
			}
		}
	
			// displaying each subscriber
			for(NewsPaperSubscriber sub: subscribers) {
				System.out.println(sub.toString());
			}
			// asking if the user wants to add more
			System.out.println("Do you want to add more? Enter 'false' for No or 'true' for YES");
			addMore = scan.nextBoolean();
			scan.nextLine();

		}
		// After While loop terminates
		scan.close();

	}
}
