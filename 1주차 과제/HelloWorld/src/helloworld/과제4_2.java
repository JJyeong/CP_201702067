package helloworld;

import java.util.Scanner;

public class 과제4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x;
		int y ;
		Scanner input = new Scanner(System.in);
		
		System.out.print("문자를 입력하세요. : ");
		x = input.nextLine();
		
		if (x.equals("a")||x.equals("e")||x.equals("i")||x.equals("o")||x.equals("u"))
			y = 0;
		else y = 1;
		
		switch (y) {
		case 0:
			System.out.println("모음입니다.");
			break;
		case 1:
			System.out.println("자음입니다.");
			break;
		}
		
		input.close();

	}

}
