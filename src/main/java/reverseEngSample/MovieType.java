package reverseEngSample;

public abstract class MovieType {
    public static final int REGULAR = 0;
    public static final int CLASSIC = 1;
    public static final int RELEASE = 2;

    public static MovieType getInstance(int priceCode) {
        switch (priceCode) {
            case CLASSIC:
                return new ClassicMovieType();
            case RELEASE:
                return new ReleaseMovieType();
            case REGULAR:
            default:
                return new RegularMovieType();
        }
    }

    public abstract int getLineAmount(int daysRented);

    public abstract int getPriceCode();
}
