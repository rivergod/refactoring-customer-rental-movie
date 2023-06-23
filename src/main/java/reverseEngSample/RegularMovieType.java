package reverseEngSample;

public class RegularMovieType extends MovieType {

    @Override
    public int getPriceCode() {
        return MovieType.REGULAR;
    }
    @Override
    public int getLineAmount(int daysRented) {
        int lineAmount = 0;

        lineAmount += 2000;
        if (daysRented > 2) {
            lineAmount += (daysRented - 2) * 1500;
        }

        return lineAmount;
    }

    @Override
    public int getBonusPoints(int daysRented) {
        return 1;
    }
}
