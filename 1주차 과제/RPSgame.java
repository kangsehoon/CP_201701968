package sehoon;

import java.util.Scanner;

public class RPSgame {
	public static void main(String asrs[]) {
		Scanner sc = new Scanner(System.in);
		int user;
		System.out.print("����: ");
		user = sc.nextInt();
		switch(user) {
		case 1:
		case 4:
		case 7:
			System.out.println("����");
			break;
		case 2:
		case 5:
		case 8:
			System.out.println("����");
			break;
		case 3:
		case 6:
		case 9:
			System.out.println("��");
			break;}
		
		int com=(int)(Math.random()*10)+1;
		switch(com) {
		case 1:
		case 4:
		case 7:
			System.out.println(com+ "com: ����");
			break;
		case 2:
		case 5:
		case 8:
			System.out.println(com+ "com: ����");
			break;
		case 3:
		case 6:
		case 9:
			System.out.println(com+ "com: ��");
			break;}
		if(user==com) {
			System.out.print("�����ϴ�.");}
		else if((com==1&&user==2)||(com==1&&user==5)||(com==1&&user==8)||(com==4&&user==2)||(com==4&&user==5)
		||(com==4&&user==8)||(com==7&&user==2)||(com==7&&user==5)||(com==7&&user==8)||(com==2&&user==3)
		||(com==2&&user==6)||(com==2&&user==9)||(com==5&&user==3)||(com==5&&user==6)||(com==5&&user==9)
		||(com==8&&user==3)||(com==8&&user==6)||(com==8&&user==9)||(com==3&&user==1)||(com==3&&user==4)
		||(com==3&&user==7)||(com==6&&user==1)||(com==6&&user==4)||(com==6&&user==7)||(com==9&&user==1)
		||(com==9&&user==4)||(com==9&&user==7))
		{
			System.out.print("�̰���ϴ�.");}
		else {
			System.out.print("�����ϴ�");}
				sc.close();
		}
}
