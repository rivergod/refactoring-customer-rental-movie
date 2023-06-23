package reverseEngSample;

public class ReleaseMovieType extends MovieType {

    @Override
    public int getPriceCode() {
        return MovieType.RELEASE;
    }

    @Override
    public int getLineAmount(int daysRented) {
        int lineAmount = 0;

        lineAmount += (daysRented * 3000);

        return lineAmount;
    }

    @Override
    public int getBonusPoints(int daysRented) {
        int bonusPoints = 1;
        if (daysRented > 1) bonusPoints++;
        return bonusPoints;
    }
}
