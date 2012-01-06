package movierental;

/**
 * The rental class represents a customer renting a movie.
 */
public class Rental {

	Movie _movie;
	private int _daysRented;
	
	public Rental(Movie movie, int daysRented) {
		_movie = movie;
		_daysRented = daysRented;
	}

	public int getDaysRented() {
		return _daysRented;
	}

	public Movie getMovie() {
		return _movie;
	}

    double getCharge() {
        return _movie.getCharge(_daysRented);
    }

    int getFrequentRenterPoints() {
       return _movie.getFrequentRenterPoints(_daysRented);
   }

}
