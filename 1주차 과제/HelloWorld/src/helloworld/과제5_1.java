package helloworld;

import java.util.Scanner;

public class ����5_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x = 0; int y = 0;
		String s;
		
		System.out.print("���ڿ��� �Է��Ͻÿ�. : ");
		s = input.nextLine();
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a'||s.charAt(i) == 'e'||s.charAt(i) == 'i'||s.charAt(i) == 'o'||s.charAt(i) == 'u')
				x++;
			else y++;
			if (s.charAt(i) == '1'||s.charAt(i) == '2'||s.charAt(i) == '3'||s.charAt(i) == '4'||s.charAt(i) == '5'||s.charAt(i) == '5'||s.charAt(i) == '6'||s.charAt(i) == '7'||s.charAt(i) == '8'||s.charAt(i) == '9'||s.charAt(i) == '0')
				y--;
		}
		
		System.out.println("������ ���� : " + y);
		System.out.println("������ ���� : " + x);
		
		input.close();
	}

}
