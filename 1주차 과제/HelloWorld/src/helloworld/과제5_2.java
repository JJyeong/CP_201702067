package helloworld;

import java.util.Scanner;

public class ����5_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s;
		
		System.out.print("���ڿ��� �Է��Ͻÿ�. : ");
		s = input.nextLine();
		
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if (c <= 90&&c >= 65)
				c = (char)(c+32);
			else if (c <= 122&&c >= 97)
				c = (char)(c-32);
			System.out.print(c);
		}
		
		input.close();
	}

}
