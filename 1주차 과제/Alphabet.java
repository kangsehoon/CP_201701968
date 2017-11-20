package sehoon;

import java.util.Scanner;

public class Alphabet {
	public static void main(String args[]) {
		String al;
		Scanner sc=new Scanner(System.in);
		System.out.print("알파벳:");
		al=sc.next();
		switch(al) {
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":
		System.out.println("모음");
		break;
		default:
			System.out.println("자음");
			break;}
		sc.close();
	}

}
