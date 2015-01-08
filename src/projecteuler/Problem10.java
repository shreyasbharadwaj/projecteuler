package projecteuler;

import java.util.ArrayList;
import java.util.List;

public class Problem10 {

	public static long sumOfPrimesUptil(int n){
		List<Integer> myList = primeNumbersUptil(n);
		return sumOfSeries(myList);
	}
	
	public static long sumOfSeries(List<Integer> list){
		long total = 0;
		for (Integer i: list){
			total+=i;
		}
		return total;
	}
	
	
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
	
	public static void main(String[] args){
		System.out.println(sumOfPrimesUptil(2000000)-1);
	}
	
}
