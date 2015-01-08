package projecteuler;

public class Problem9 {

	public static double specialTriplet(int num){
		for (double c=1; c<num; c++){
			for (double b=1; b<c; b++){
				for (double a=1; a<b; a++){
					if (Math.pow(a, 2)+Math.pow(b, 2)==Math.pow(c, 2)){
						if (a+b+c==num){
							System.out.println(a);
							System.out.println(b);
							System.out.println(c);
							return a*b*c;
						}
					}
				}
			}
		}
		return -1; 
	}

	public static void main(String[] args){
		System.out.println(specialTriplet(1000));
	}


}
