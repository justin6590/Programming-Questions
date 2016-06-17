import java.util.Scanner;

public class SumOfSquares {

	public static void main(String[] args) {
	System.out.println("Enter a numner:");
	Scanner sr = new Scanner(System.in);
	int ns = sr.nextInt();
	SumOfSquares sumofsquares = new SumOfSquares();
	System.out.println("Some of the squares " +ns+" number is "+sumofsquares.sumSquare(ns));

	}
	public int sumSquare(int n){
		if(n==0)
			return 0;
		else
			return ((n*n)+sumSquare(n-1));
	}
}