package helloworld;

import java.util.Scanner;

public class ����1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int x;
		int h;
		int m;
		int s;
		int y;
		
		System.out.print("��ȯ�� �� �Է� : ");
		x = input.nextInt();
		y = x;
		
		if (x >= 3600)
			{h = x / 3600;
			x = x - h * 3600;
			}
		else h = 0;
		if (x >= 60)
			{m = x / 60;
			x = x - m * 60;
			}
		else m = 0;
		s = x;
		
		System.out.println(y + "�� �� "+ h + "�ð� " + m + "�� " +s+ "�� �Դϴ�.");
		
		input.close();
			
		
	}

}
