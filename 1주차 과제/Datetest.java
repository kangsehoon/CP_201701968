package sehoon;

import java.util.Scanner;

public class Datetest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Date d=new Date();
		System.out.print("�����Է�:");
		d.year=sc.nextInt();
		System.out.print("���Է�:");
		d.month=sc.nextInt();
		System.out.print("���Է�:");
		d.day=sc.nextInt();
		System.out.print("���糯¥:");
		d.printEastern();
		System.out.print("���糯¥:");
		d.printWestern();
		sc.close();
		

	}

}
