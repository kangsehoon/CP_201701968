package sehoon;

import java.util.Scanner;

public class Alphabet {
	public static void main(String args[]) {
		String al;
		Scanner sc=new Scanner(System.in);
		System.out.print("���ĺ�:");
		al=sc.next();
		switch(al) {
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":
		System.out.println("����");
		break;
		default:
			System.out.println("����");
			break;}
		sc.close();
	}

}
