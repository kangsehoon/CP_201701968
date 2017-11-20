package sehoon;

import java.util.Scanner;

public class Leapyear {
	public static void main(String args[]) {
		int YEAR;
		Scanner sc = new Scanner(System.in);
		System.out.print("년도: ");
		YEAR = sc.nextInt();
		
		if ((YEAR%4==0)&&(YEAR%100!=0)||(YEAR%400==0))
			System.out.println(YEAR+"년은 윤년입니다");
		else
			System.out.println(YEAR+"년은 유년이 아닙니다");
		sc. close();
	}

}
