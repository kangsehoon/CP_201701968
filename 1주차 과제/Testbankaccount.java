package sehoon;

import java.util.Scanner;

public class Testbankaccount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		BankAccount B1=new BankAccount();
		BankAccount B2=new BankAccount();
		
		System.out.println("°èÁÂ1");
		System.out.print("°èÁÂ¹øÈ£ : ");
		sc.next();
		System.out.print("¿¹±İÁÖ : ");
		sc.next();
		System.out.println("ÀÜ¾×:"+B1.A1);
		System.out.println("°èÁÂ2");
		System.out.print("°èÁÂ¹øÈ£ : ");
		sc.next();
		System.out.print("¿¹±İÁÖ : ");
		sc.next();
		System.out.println("ÀÜ¾×:"+B2.A2);
		
		System.out.println("°èÁÂ1¿¡¼­ °èÁÂ2·Î ¼Û±İÇÒ ±İ¾×");
		int amount=sc.nextInt();
		System.out.println(B1.sendAccount(amount,B2));
		System.out.println("°èÁÂ1 ÀÜ¾×"+B1.A1);
		System.out.println("°èÁÂ2 ÀÜ¾×"+B2.A2);
		sc.close();

	}

}
