package sehoon;

import java.util.Scanner;

public class Leapyear {
	public static void main(String args[]) {
		int YEAR;
		Scanner sc = new Scanner(System.in);
		System.out.print("�⵵: ");
		YEAR = sc.nextInt();
		
		if ((YEAR%4==0)&&(YEAR%100!=0)||(YEAR%400==0))
			System.out.println(YEAR+"���� �����Դϴ�");
		else
			System.out.println(YEAR+"���� ������ �ƴմϴ�");
		sc. close();
	}

}
