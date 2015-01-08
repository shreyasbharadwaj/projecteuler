package projecteuler;


public class Problem1 {
	public static int sumOfMultiples(int num, int a, int b){
		int total=0;
		for (int i=0; i<num; i++){
			if (i%a == 0 || i%b == 0){
				total+=i;
			}
		}
		return total;
	}
	
	
	
	public static void main(String[] args){
		System.out.println(sumOfMultiples(1000,3,5));
	}
}
