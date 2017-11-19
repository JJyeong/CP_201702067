package helloworld;

public class Date {
	int year; int month; int day;
	String emonth;
	
	public void print() {
		System.out.println("동양식 날짜 푠현 : "+year+"."+month+"."+day);
		System.out.println("서양식 날짜 표현 : "+emonth+" "+day+", "+year);
	}

}
