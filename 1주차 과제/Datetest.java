package sehoon;

import java.util.Scanner;

public class Datetest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Date d=new Date();
		System.out.print("연도입력:");
		d.year=sc.nextInt();
		System.out.print("월입력:");
		d.month=sc.nextInt();
		System.out.print("일입력:");
		d.day=sc.nextInt();
		System.out.print("동양날짜:");
		d.printEastern();
		System.out.print("서양날짜:");
		d.printWestern();
		sc.close();
		

	}

}
