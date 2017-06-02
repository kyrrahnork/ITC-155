

public class RatingStats {
	
	private int numRatings, sumRatings;
	
	public RatingStats() {
		numRatings = 0;
		sumRatings = 0;
	}

	public int getNumRatings() {
		return numRatings;
	}

	public int getSumRatings() {
		return sumRatings;
	}

	public void addRating(int rating){
		numRatings++;
		sumRatings += rating;
	}

}
