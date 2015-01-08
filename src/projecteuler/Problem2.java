package projecteuler;

import java.util.ArrayList;
import java.util.List;

public class Problem2 {
	public static int sumOfFibs(int max){
		List<Integer> fibs = new ArrayList<Integer>();
		fibs.add(1);
		fibs.add(2);
		int next = fibs.get(fibs.size()-1) + fibs.get(fibs.size()-2);
		while (next<max){
			fibs.add(next);
			next = fibs.get(fibs.size()-1) + fibs.get(fibs.size()-2);
		}
		int total=0;
		for (int i: fibs){
			if (i%2==0){
				total+=i;
			}
		}
		
		return total;
	}
	
	public static void main(String[] args){
		System.out.println(sumOfFibs(4000000));
	}
	
}
