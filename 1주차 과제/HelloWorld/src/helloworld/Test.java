package helloworld;

public class Test {
	void sub(int... v) {
		System.out.println("�μ��� ���� : " + v.length);
		
		for (int x : v)
			System.out.println(x + " ");
		System.out.println();
	}

}
