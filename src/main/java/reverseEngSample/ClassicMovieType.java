package reverseEngSample;

public class ClassicMovieType extends MovieType {

    @Override
    public int getPriceCode() {
        return MovieType.CLASSIC;
    }

    @Override
    public int getLineAmount(int daysRented) {
        int lineAmount = 0;

        lineAmount += 1500;
        if (daysRented > 3) {
            lineAmount += (daysRented - 3) * 1500;
        }

        return lineAmount;
    }
}
