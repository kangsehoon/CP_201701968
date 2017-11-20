package sehoon;

import java.util.Scanner;

public class Letter {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("¾ËÆÄºª");
		int lt=sc.nextLine().charAt(0);
		if (lt>=97&&lt<=122) {
			System.out.println((char)(lt-32));
		}else if(lt>=65&&lt<=90) {
			System.out.println((char)(lt+32));
			sc.close();
		}
	}
}

	