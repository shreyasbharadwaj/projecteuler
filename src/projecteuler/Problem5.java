package projecteuler;

public class Problem5 {

	public static long leastCommonMultiple(long a, long b){
		return (a*b)/(gcd((Math.max(a, b)), Math.min(a, b)));
	}
	
	public static long gcd(long a, long b){
		if (a%b==0){
			return b;
		}
		else{
			return gcd(b, a%b);
		}
	}
	
	public static long smallestMultiple(int num){
		long multiple =1L; 
		for (long i=1L; i<=num; i++){
			multiple = leastCommonMultiple(multiple, i);
			System.out.println(i);
			
		}
		return multiple;
	}
	
	public static void main(String[] args){
		System.out.println(smallestMultiple(20));
	}
}
