import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class MovieRatingApp {

	public static void main(String[] args) {
		
		
		// The ratings HashMap maps from a movie name
		// to a RatingStats object.
		HashMap<String, RatingStats> ratings = new HashMap<String, RatingStats>();
		
		
		
		try {
			Scanner sc = new Scanner(new FileInputStream("ratings.txt"));
			
			int numRatings = 0;
			String line = sc.nextLine();
			numRatings = Integer.parseInt(line);
			
			// Iterate through the HashMap
			
			
			for(int i = 0; i < numRatings; i++){
				String movieName = sc.nextLine();
				line = sc.nextLine();
				
				int rating = Integer.parseInt(line);
				if (!ratings.containsKey(movieName)){
					RatingStats rs = new RatingStats();
					rs.addRating(rating);
					ratings.put(movieName, rs);
				}
				else{
					RatingStats rs = ratings.get(movieName);
					rs.addRating(rating);
				}
				
			}
			sc.close();
			
		}catch (FileNotFoundException e) {
			System.out.println("File was not found, or could not be opened");
		}catch (IOException e) {
			System.out.println("Error reading from file");
		}	
		
		
		// and output the average for each movie.
		Set<String> movies = ratings.keySet();
		for (String m : movies)
			{
				RatingStats rs = ratings.get(m);
				double avg = Math.round(rs.getSumRatings() / (double) rs.getNumRatings() * 10d) / 10d;
			    System.out.println(m + ": " + rs.getNumRatings() + " reviews, average of " + avg + " / 5");
			}
	}
}
