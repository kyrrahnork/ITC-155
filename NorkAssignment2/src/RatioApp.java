import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.ArithmeticException;
public class RatioApp {

	public static void main(String[] args) {
		
		//welcome message with request for numbers
		System.out.println("Welcome. Please enter two numbers. I will compute the ratio");
		

		try{
			//code that was provided that takes 2 numbers as input and divides them
			Scanner sc = new Scanner(System.in);
			int n1, n2;
			double r;
			n1 = sc.nextInt();
			n2 = sc.nextInt();
			
		//check to see if the denominator is 0	
			if(n2 != 0){
				r = (double) n1 / n2;
				System.out.println("The ratio r = " + r);
			}
			else{
				r = n1 / n2;
			}
			sc.close();
		}
		catch (InputMismatchException e){
			System.out.println("You must enter an integer...Try again");//exception if not an integer
		}	
		catch (ArithmeticException e){
			System.out.println("There was an exception: I cannot divide by 0...Try again");//exception if dividing by 0
		}
	}
}
