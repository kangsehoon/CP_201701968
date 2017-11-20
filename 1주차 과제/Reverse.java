package sehoon;

import java.util.Random;

public class Reverse {
	public static void main(String[] args) {
		Random ra=new Random();
		int num[] = new int[10];
		int max=num[0];
		int min=num[0];
		for(int i=0; i<1; i++) {
			num[i] = ra.nextInt(100);
			if(num[i]>=max)
				max=num[i];
				if(num[i]<=min)
					min=num[i];
			System.out.println("10개 중에 가장 큰 숫자:"+max);
			System.out.println("10개 중에 가장 작은 숫자:"+min);
			}
			}
	}