package sehoon;

public class BankAccount {
	int accountNumber;
	String owner;
	int balance;
	int A1=30000;
	int A2=0;
	
	void deposit(int amount) {
		balance+=amount;
	}
	void wihtdraw(int amount) {
		balance-=amount;
	}
	public String toString() {
		return "���� �ܾ���"+balance+"�Դϴ�";
	}
	public String sendAccount(int amount, BankAccount otherAccount) {
		if(A1>=amount) {
			A1-=amount;
			otherAccount.A2+=amount;
			return "��ü�� �ݾ���"+amount+"�Դϴ�";
		}
		else {
		return "�ܾ��� �����մϴ�";
		}
	}

}
