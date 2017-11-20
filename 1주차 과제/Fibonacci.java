package sehoon;

public class Fibonacci {
	public static void main(String args[]) {
		int x=0;
		int y=1;
		int z;
		for(int t=1; t<=10; t++) {
			z=x+y;
			System.out.println(z);
			x=y;
			y=z;
		}
	}

}
