package projecteuler;

public class Problem6 {
	
	public static long squareOfSum(long n){
		long sum = n*(n+1)/2;
		return sum*sum;
	}
	
	public static long sumOfSquares(long n){
		return n*(n+1)*((2*n)+1)/6;
	}
	
	public static long difference(long n){
		return squareOfSum(n) - sumOfSquares(n);
	}
	
	public static void main(String[] args){
		System.out.println(difference(100));
	}
}
