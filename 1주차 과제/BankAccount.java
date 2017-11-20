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
		return "현재 잔액은"+balance+"입니다";
	}
	public String sendAccount(int amount, BankAccount otherAccount) {
		if(A1>=amount) {
			A1-=amount;
			otherAccount.A2+=amount;
			return "이체한 금액은"+amount+"입니다";
		}
		else {
		return "잔액이 부족합니다";
		}
	}

}
