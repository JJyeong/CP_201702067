package helloworld;

import java.util.Scanner;

public class ����3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		String x;
		int y = 0;
		int com;
		int win;
		int lose;
		int draw;
		
		win = 0; lose = 0; draw = 0;
		
		while (win < 7&&lose < 7) {
		y++;
		System.out.println(y + "��°");
		System.out.print("�Է��Ͻÿ� : ");
		x = input.nextLine();
		
		int userNum = (int)(Math.random()*10) + 1;
		if (userNum == 1||userNum == 4||userNum == 7) {
			System.out.println("��ǻ��: ����");
			com = 0;
		}
		else if (userNum == 2||userNum == 5||userNum == 8) {
			System.out.println("��ǻ��: ����");
			com = 1;
		}
		else {
			System.out.println("��ǻ��: ��");
			com = 2;
		}
			
			
		if (x.equals("����")&&com == 0)
			{System.out.println("������!");
			draw++;
			}
		else if (x.equals("����")&&com == 1)
			{System.out.println("�й�!");
			lose++;
			}
		else if (x.equals("����")&&com == 2)
			{System.out.println("�¸�!");
			win++;
			};
		
		if (x.equals("����")&&com == 0)
			{System.out.println("�¸�!");
			win++;
			}
		else if (x.equals("����")&&com == 1)
			{System.out.println("���º�!");
			draw++;
			}
		else if (x.equals("����")&&com == 2)
			{System.out.println("�й�!");
			lose++;
			};
		
		if (x.equals("��")&&com == 0)
			{System.out.println("�й�!");
			lose++;
			}
		else if (x.equals("��")&&com == 1)
			{System.out.println("�¸�!");
			win++;
			}
		else if (x.equals("��")&&com == 2)
			{System.out.println("���º�!");
			draw++;
			};
			
		System.out.println("stage " + y + " > user : " + win + "�� vs computer " + lose + "��, " + draw + "��");
		}
		if (win == 7)
			System.out.println("���� user!");
		else System.out.println("���� computer!");
		
		input.close();
		
	}

}
