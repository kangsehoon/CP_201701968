package sehoon;

import java.util.Scanner;

public class Testbankaccount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		BankAccount B1=new BankAccount();
		BankAccount B2=new BankAccount();
		
		System.out.println("����1");
		System.out.print("���¹�ȣ : ");
		sc.next();
		System.out.print("������ : ");
		sc.next();
		System.out.println("�ܾ�:"+B1.A1);
		System.out.println("����2");
		System.out.print("���¹�ȣ : ");
		sc.next();
		System.out.print("������ : ");
		sc.next();
		System.out.println("�ܾ�:"+B2.A2);
		
		System.out.println("����1���� ����2�� �۱��� �ݾ�");
		int amount=sc.nextInt();
		System.out.println(B1.sendAccount(amount,B2));
		System.out.println("����1 �ܾ�"+B1.A1);
		System.out.println("����2 �ܾ�"+B2.A2);
		sc.close();

	}

}
