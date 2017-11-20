package sehoon;

import java.util.Scanner;

public class Day {
	public static void main(String args[]) {
		int year, day, month, Tday=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("년:");
		year=sc.nextInt();
		System.out.print("월:");
		month=sc.nextInt();
		System.out.print("일:");
		day=sc.nextInt();
		Tday+=(year-1900)*365;
		Tday+=(year-1900)/4;
		if ((year%4==0)&&(year%100!=0)||(year%400==0)) {
			if((month==1)||(month==2)) Tday+=-1;
		}
		switch(month) {
		case 1:
			Tday+=day;
			break;
		case 2:
			Tday+=31+day;
			break;
		case 3:
			Tday+=31+28+day;
			break;
		case 4:
			Tday+=31+28+31+day;
			break;
		case 5:
			Tday+=31+28+31+30+day;
			break;
		case 6:
			Tday+=31+28+31+30+31+day;
			break;
		case 7:
			Tday+=31+28+31+30+31+30+day;
			break;
		case 8:
			Tday+=31+28+31+30+31+30+31+day;
			break;
		case 9:
			Tday+=31+28+31+30+31+30+31+31+day;
			break;
		case 10:
			Tday+=31+28+31+30+31+30+31+31+30+day;
			break;
		case 11:
			Tday+=31+28+31+30+31+30+31+31+30+31+day;
			break;
		case 12:
			Tday+=31+28+31+30+31+30+31+31+30+31+30+day;
			break;
		case 13:
			Tday+=31+28+31+30+31+30+31+31+30+31+30+31+day;
			break;}
		System.out.print("요일:");
		switch(Tday%7) {
		case 0:
			System.out.print("일요일");
			break;
		case 1:
			System.out.print("월요일");
			break;
		case 2:
			System.out.print("화요일");
			break;
		case 3:
			System.out.print("수요일");
			break;
		case 4:
			System.out.print("목요일");
			break;
		case 5:
			System.out.print("금요일");
			break;
		case 6:
			System.out.print("토요일");
			break;
			
		}
		sc.close();
			}
			
		}



