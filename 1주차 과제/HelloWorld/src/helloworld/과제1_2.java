package helloworld;

import java.util.Scanner;

public class ����1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int x;
		int y;
		int z;
		boolean d;
		
		System.out.print("�⵵�� �Է� : ");
		x = input.nextInt();
		
		y = x / 400;
		z = x - 400 * y;
		
		if (z == 0)
			d = true;
		else {d = false;
		
			y = x / 100;
			z = x - 100 * y;
		
			if (z == 0)
				d = false;
			else {d = true;
		
				y = x / 4;
				z = x - 4 * y;
		
				if (z == 0)
					d = true;		
				else d = false;
				}
			}
		
		if (d == true)
		System.out.print(x + "���� �����Դϴ�.");
		else System.out.print(x + "���� ������ �ƴմϴ�.");
		
		input.close();
	}

}
