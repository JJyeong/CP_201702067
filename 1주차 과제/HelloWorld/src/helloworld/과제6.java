package helloworld;

public class ����6 {

	public static void main(String[] args) {
		int[] x = new int[10];
		int z;
		int v;
		for(int i = 0; i<10; i++) {
			int y = (int)(Math.random()*100);
			x[i] = y;
		}
		z = x[0];
		v = x[0];
		for(int i = 0; i<10; i++) {
			if(z<x[i])
				z = x[i];
			if(v>x[i])
				v = x[i];
		}
		System.out.println("10���� �� �� ���� ū ���� : " + z);
		System.out.println("10���� �� �� ���� ���� ���� : " + v);
	}

}
