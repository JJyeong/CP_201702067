package helloworld;

import java.util.Scanner;

public class 과제7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BankAccount A = new BankAccount();
		BankAccount B = new BankAccount();
		
		System.out.println("계좌 1 정보 입력");
		System.out.print("계좌번호 : ");
		A.accountNumber = input.nextLine();
		System.out.print("예급주 : ");
		A.owner = input.nextLine();
		System.out.print("초기 잔액 : ");
		A.balance = input.nextInt();
		System.out.println("");
		
		System.out.println("계좌 2 정보 입력");
		System.out.print("계좌번호 : ");
		B.accountNumber = input.nextLine();
		B.accountNumber = input.nextLine();
		System.out.print("예급주 : ");
		B.owner = input.nextLine();
		System.out.print("초기 잔액 : ");
		B.balance = input.nextInt();
		System.out.println("");
		
		System.out.print("계좌1에서 계좌2로 송금할 금액 : ");
		int amount = input.nextInt();
		A.sendAccount(amount, B);
		
		System.out.println("============================");
		System.out.println("계좌1");
		System.out.print("계좌번호 : ");
		System.out.println(A.accountNumber);
		System.out.print("예금주 : ");
		System.out.println(A.owner);
		System.out.print("잔액 : ");
		System.out.println(A.toString());
		
		System.out.println("계좌2");
		System.out.print("계좌번호 : ");
		System.out.println(B.accountNumber);
		System.out.print("예금주 : ");
		System.out.println(B.owner);
		System.out.print("잔액 : ");
		System.out.println(B.toString());
		
		input.close();
	}

}
