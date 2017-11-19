package helloworld;

public class Test {
	void sub(int... v) {
		System.out.println("인수의 개수 : " + v.length);
		
		for (int x : v)
			System.out.println(x + " ");
		System.out.println();
	}

}
