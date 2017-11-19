package helloworld;

import java.util.Scanner;

public class 과제3_1 {

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
		System.out.println(y + "판째");
		System.out.print("입력하시오 : ");
		x = input.nextLine();
		
		int userNum = (int)(Math.random()*10) + 1;
		if (userNum == 1||userNum == 4||userNum == 7) {
			System.out.println("컴퓨터: 가위");
			com = 0;
		}
		else if (userNum == 2||userNum == 5||userNum == 8) {
			System.out.println("컴퓨터: 바위");
			com = 1;
		}
		else {
			System.out.println("컴퓨터: 보");
			com = 2;
		}
			
			
		if (x.equals("가위")&&com == 0)
			{System.out.println("무슨부!");
			draw++;
			}
		else if (x.equals("가위")&&com == 1)
			{System.out.println("패배!");
			lose++;
			}
		else if (x.equals("가위")&&com == 2)
			{System.out.println("승리!");
			win++;
			};
		
		if (x.equals("바위")&&com == 0)
			{System.out.println("승리!");
			win++;
			}
		else if (x.equals("바위")&&com == 1)
			{System.out.println("무승부!");
			draw++;
			}
		else if (x.equals("바위")&&com == 2)
			{System.out.println("패배!");
			lose++;
			};
		
		if (x.equals("보")&&com == 0)
			{System.out.println("패배!");
			lose++;
			}
		else if (x.equals("보")&&com == 1)
			{System.out.println("승리!");
			win++;
			}
		else if (x.equals("보")&&com == 2)
			{System.out.println("무승부!");
			draw++;
			};
			
		System.out.println("stage " + y + " > user : " + win + "승 vs computer " + lose + "승, " + draw + "무");
		}
		if (win == 7)
			System.out.println("승자 user!");
		else System.out.println("승자 computer!");
		
		input.close();
		
	}

}
