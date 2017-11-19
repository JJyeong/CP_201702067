package helloworld;

import java.util.Scanner;

public class 과제3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int year;
		int month;
		int day;
		int w = 0;
		int a;
		int b;
		int x;
		int y;
		int z;
		
		System.out.print("년은 입력하시오 : ");
		year = input.nextInt();
		
		System.out.print("월을 입력하시오 : ");
		month = input.nextInt();
		
		System.out.print("일을 입력하시오 : ");
		day = input.nextInt();
		
		for (x = 1900; x < year; x++) {
			a = x / 400;
			b = x - (a * 400);
			if (b == 0)
			w = w + 366;
			else {
				a = x / 100;
				b = x - (a * 100);
				if (b == 0)
					w = w + 365;
				else{
				a = x / 4;
				b = x - (a * 4);
				if (b == 0)
					w = w + 366;
			else w = w + 365;
				}
			}
		}
		
		
		for (x = 1; x < month; x++) {
			a = x / 2;
			b = x - (a * 2);
			if (a == 1&&b == 0) {
				y = year / 400;
				z = year - (y * 400);
				if (z == 0)
					w = w + 29;
				else {
					y = year / 100;
					z = year - (y * 100);
					if (z == 0)
						w = w + 28;
					else {
						y = year / 4;
						z = year - (y * 4);
						if (z == 0)
							w = w + 29;
					}
				}
			}
			else if(b == 0&&a < 4)
				w = w + 30;
			else if(b == 1&&a >= 4)
				w = w + 30;
			else w = w + 31;
		}
		
		w = w + (day - 1);
		
		System.out.println(w);
		
		w = w - ((w / 7) * 7);
		
		switch (w) {
		case 0:
			System.out.println("월요일");
			break;
		case 1:
			System.out.println("화요일");
			break;
		case 2:
			System.out.println("수요일");
			break;
		case 3:
			System.out.println("목요일");
			break;
		case 4:
			System.out.println("금요일");
			break;
		case 5:
			System.out.println("토요일");
			break;
		case 6:
			System.out.println("일요일");
			break;
		}
		
		
		input.close();
	}

}
