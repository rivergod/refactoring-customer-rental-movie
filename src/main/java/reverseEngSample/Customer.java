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

	// step 04:  divide calc logics : long method
	public String statement() {

		String rentalList = "Statement\n";
		for (Rental rent : rentals) {
			rentalList += rent.getMovie().getName() + "\t" + rent.getLineAmount() + "\n";
		}
		rentalList += "Total\t" + calcTotalAmount() + "\n";
		rentalList += "Bonus Point:\t" + calcBonusPoints() + "\n";
		return rentalList;
	}

	// step 04:  divide calc logics : long method
	private int calcBonusPoints() {
		int bonusPoints = 0;
		for (Rental rent : rentals) {
			// step 03: movie calc bonus points logic to Movie
			bonusPoints += rent.getBonusPoints();
		}
		return bonusPoints;
	}

	// step 04:  divide calc logics : long method
	private int calcTotalAmount() {
		int totalAmount = 0;
		for (Rental rent : rentals) {
			// step 01: remove switch statements smell, move getLineAmount to rental
			totalAmount += rent.getLineAmount();
		}
		return totalAmount;
	}

}
