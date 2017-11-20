package sehoon;

import java.util.Scanner;

public class Jamomain {

	public static void main(String[] args) {
		Jamo Cv=new Jamo();
		Scanner sc=new Scanner(System.in);
		System.out.println("문자열:");
		Cv.convo=sc.nextLine();
		System.out.print("자음:"+Cv.con()+"모음:"+Cv.vo());
		sc.close();

	}

}
