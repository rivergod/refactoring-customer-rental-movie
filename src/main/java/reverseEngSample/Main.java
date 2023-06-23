package reverseEngSample;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Long> labs = new ArrayList<>();

		for (int lab = 100; lab > 0; lab--) {

			long start = System.currentTimeMillis();

			for (int i = 100000; i > 0; i--) {

				Customer me = new Customer("DO");

				me.addRental(new Rental(1, new Movie("Movie1", Movie.CLASSIC)));
				me.addRental(new Rental(1, new Movie("Movie2", Movie.REGULAR)));
				me.addRental(new Rental(1, new Movie("Movie3", Movie.RELEASE)));

				me.addRental(new Rental(2, new Movie("Movie1", Movie.CLASSIC)));
				me.addRental(new Rental(2, new Movie("Movie2", Movie.REGULAR)));
				me.addRental(new Rental(2, new Movie("Movie3", Movie.RELEASE)));

				me.addRental(new Rental(3, new Movie("Movie1", Movie.CLASSIC)));
				me.addRental(new Rental(3, new Movie("Movie2", Movie.REGULAR)));
				me.addRental(new Rental(3, new Movie("Movie3", Movie.RELEASE)));

				me.addRental(new Rental(4, new Movie("Movie1", Movie.CLASSIC)));
				me.addRental(new Rental(4, new Movie("Movie2", Movie.REGULAR)));
				me.addRental(new Rental(4, new Movie("Movie3", Movie.RELEASE)));

				me.addRental(new Rental(5, new Movie("Movie1", Movie.CLASSIC)));
				me.addRental(new Rental(5, new Movie("Movie2", Movie.REGULAR)));
				me.addRental(new Rental(5, new Movie("Movie3", Movie.RELEASE)));

				me.statement();

			}

			long end = System.currentTimeMillis();

			long diff = end - start;

			labs.add(diff);
		}

		System.out.printf("%f ms%n", labs.stream().mapToDouble(Long::doubleValue).average().orElse(-1));
	}
}
