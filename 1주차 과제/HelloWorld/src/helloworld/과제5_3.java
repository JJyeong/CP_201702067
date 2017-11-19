package helloworld;

import java.util.Scanner;

public class 과제5_3 {

	public static void main(String[] args) {
		Date date = new Date();
		Scanner input = new Scanner(System.in);
		System.out.print("연도 입력 : ");
		date.year = input.nextInt();
		System.out.print("월 입력 : ");
		date.month = input.nextInt();
		System.out.print("일 입력 : ");
		date.day = input.nextInt();
		
		switch (date.month) {
		case 1:
			date.emonth = "January";
			break;
		case 2:
			date.emonth = "Fabruary";
			break;
		case 3:
			date.emonth = "March";
			break;
		case 4:
			date.emonth = "April";
			break;
		case 5:
			date.emonth = "May";
			break;
		case 6:
			date.emonth = "June";
			break;
		case 7:
			date.emonth = "July";
			break;
		case 8:
			date.emonth = "August";
			break;
		case 9:
			date.emonth = "September";
			break;
		case 10:
			date.emonth = "October";
			break;
		case 11:
			date.emonth = "November";
			break;
		case 12:
			date.emonth = "December";
			break;
		} 
		
		date.print();
		input.close();
	}

}
