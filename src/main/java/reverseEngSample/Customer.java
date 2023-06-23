package reverseEngSample;

import java.util.ArrayList;

public class Customer {
	private final String name;
	private final ArrayList<Rental> rentals = new ArrayList<Rental>();

	public Customer(String name) {
		this.name = name;
	}

	public void addRental(Rental newRental) {
		rentals.add(newRental);
	}

	public String getName() {
		return this.name;
	}

	public String statement() {
		String rentalList = "Statement\n";
		int totalAmount = 0;
		int bonusPoints = 0;

		for (Rental rent : rentals) {
			int lineAmount = 0;

			// step 01: remove switch statements smell, move getLineAmount to rental
			lineAmount += rent.getLineAmount();

			// step 03: movie calc bonus points logic to Movie
			bonusPoints += rent.getBonusPoints();

			rentalList += rent.getMovie().getName() + "\t" + lineAmount + "\n";
			totalAmount += lineAmount;
		}
		rentalList += "Total\t" + totalAmount + "\n";
		rentalList += "Bonus Point:\t" + bonusPoints + "\n";
		return rentalList;
	}

}
