import java.util.Scanner;


public class FibonacciCalculator {
	 public static void main(String args[]) {
		    Scanner sc = new Scanner(System.in);
		    
	       //ask for how many numbers to print out
	        System.out.println("Enter the number of Fibonacci set numbers you want to print: ");
	        int n = sc.nextInt();
	      
	        System.out.println("Fibonacci set up to " + n +" numbers: ");
	        //print out the series requested
	        for(int i = 0; i <= n-1; i++){
	        	if(i == 0 || (i+1) % 10 == 1 && (i+1) != 11){
	        		System.out.print((i+1) + "st Fibonacci number: " + fib(i) + "\n"); //add the proper ending
	        	}else if(i == 1 || (i+1) % 10 == 2 && (i+1) != 12){
	        		System.out.print((i+1) + "nd Fibonacci number: " + fib(i) + "\n"); //add the proper ending
	        	}else if(i == 2 || (i+1) % 10 == 3 && (i+1) != 13){
	        		System.out.print((i+1) + "rd Fibonacci number: " + fib(i) + "\n"); //add the proper ending
	        	}else{
	        		System.out.print((i+1) + "th Fibonacci number: " + fib(i) + "\n"); //add the proper ending
	        	} 
	        }
	        sc.close(); //close the scanner
	    } 

	    public static int fib(int n){
	    	//first number of set is always 0
	    	if(n == 0){
	    		return 0;
	    	}
	    	//second and third numbers of the set are always 1
	    	else if(n == 1 || n == 2){
	            return 1;
	        }
	    	else{
	    		return fib(n - 1) + fib(n - 2); //do math
	        }
	    }     
}
