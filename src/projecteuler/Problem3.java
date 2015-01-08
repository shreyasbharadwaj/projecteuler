package projecteuler;

import java.util.ArrayList;
import java.util.List;

public class Problem3 {
	public static List<Integer> primeNumbersUptil(int num){
		boolean[] possibleNumbers = new boolean[num+1];
		int p=2;
		for (int i=0;i<possibleNumbers.length; i++){
			possibleNumbers[i]=true;
		}
		boolean continued =true;
		while (continued){
			int i=2;
			while ((i*p)<possibleNumbers.length){
				possibleNumbers[i*p]=false;
				i++;
			}
			for (int j=p+1; j<=possibleNumbers.length; j++){
				if (j==possibleNumbers.length){
					continued=false;
					break;
				}
				if (possibleNumbers[j]){
					p=j;
					break;
				}
			}
		}
		List<Integer> primeNumbers = new ArrayList<Integer>();
		for (int i=0; i<possibleNumbers.length; i++){
			if (possibleNumbers[i]){
				primeNumbers.add(i);
			}
		}
		return primeNumbers;
		
	}
	
	public static long largestPrimeFactor(long number){
		List<Integer> primeNumbers = primeNumbersUptil((int) Math.sqrt(number)+1);
		for (int i=primeNumbers.size()-1; i>=0;i--){
			if (number%primeNumbers.get(i)==0){
				return primeNumbers.get(i);
			}
		}
		return 1;
		
	}
	
	public static void main(String[] args){
		long largeNum = 600851475143L;
		System.out.println(largestPrimeFactor(largeNum));
//		System.out.println(largeNum/3.0);
	}
	
}
