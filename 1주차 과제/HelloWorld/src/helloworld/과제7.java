package helloworld;

import java.util.Scanner;

public class ����7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BankAccount A = new BankAccount();
		BankAccount B = new BankAccount();
		
		System.out.println("���� 1 ���� �Է�");
		System.out.print("���¹�ȣ : ");
		A.accountNumber = input.nextLine();
		System.out.print("������ : ");
		A.owner = input.nextLine();
		System.out.print("�ʱ� �ܾ� : ");
		A.balance = input.nextInt();
		System.out.println("");
		
		System.out.println("���� 2 ���� �Է�");
		System.out.print("���¹�ȣ : ");
		B.accountNumber = input.nextLine();
		B.accountNumber = input.nextLine();
		System.out.print("������ : ");
		B.owner = input.nextLine();
		System.out.print("�ʱ� �ܾ� : ");
		B.balance = input.nextInt();
		System.out.println("");
		
		System.out.print("����1���� ����2�� �۱��� �ݾ� : ");
		int amount = input.nextInt();
		A.sendAccount(amount, B);
		
		System.out.println("============================");
		System.out.println("����1");
		System.out.print("���¹�ȣ : ");
		System.out.println(A.accountNumber);
		System.out.print("������ : ");
		System.out.println(A.owner);
		System.out.print("�ܾ� : ");
		System.out.println(A.toString());
		
		System.out.println("����2");
		System.out.print("���¹�ȣ : ");
		System.out.println(B.accountNumber);
		System.out.print("������ : ");
		System.out.println(B.owner);
		System.out.print("�ܾ� : ");
		System.out.println(B.toString());
		
		input.close();
	}

}
