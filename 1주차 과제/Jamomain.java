package sehoon;

import java.util.Scanner;

public class Jamomain {

	public static void main(String[] args) {
		Jamo Cv=new Jamo();
		Scanner sc=new Scanner(System.in);
		System.out.println("���ڿ�:");
		Cv.convo=sc.nextLine();
		System.out.print("����:"+Cv.con()+"����:"+Cv.vo());
		sc.close();

	}

}
