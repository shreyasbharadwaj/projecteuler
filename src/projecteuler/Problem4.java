package projecteuler;

import java.util.HashSet;
import java.util.Set;

public class Problem4 {
	public static boolean isPalindrome(int num){
		String number = String.valueOf(num);
		String firstHalf = number.substring(0, (int) Math.floor(number.length()/2));
		String secondHalf = number.substring((int) Math.ceil(number.length()/2));
		for (int i=0; i<firstHalf.length(); i++){
			if (firstHalf.charAt(i)!=secondHalf.charAt(secondHalf.length()-i-1)){
				return false;
			}
		}
		return true;
	}
	
	public static int findMax(Set<Integer> set){
		int max = 0;
		for (int i: set){
			if (isPalindrome(i) && i>max){
				max=i;
			}
		}
		return max;
	}
	
	public static int findLargestPal(int a, int b){
		Set<Integer> myList = new HashSet<Integer>();
		for (int i=0; i<=a; i++){
			for (int j=0; j<=b; j++){
				myList.add(i*j);
			}
		}
		return findMax(myList);
		
	}
	
	public static void main(String[] args){
		System.out.println(findLargestPal(999,999));
	}
}
