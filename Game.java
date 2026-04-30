import java.util.Scanner;

public class Game {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Board b=new Board();
		
		System.out.print("Enter the first Player Name :");
		String name1=sc.next();
		System.out.println("Enter the Mark X or O");
		char mark=sc.next().charAt(0);
		
		Player p1=new Player(name1,mark,b);
		
		System.out.println("Enter the Second Player Name :");
		String name2=sc.next();
		char mark2;
		
		if(mark=='X') {
			mark2='O';
			
		}
		else {
			mark2='X';
		}
		
		Player p2=new Player(name2, mark2, b);
		
		System.out.println("Lets Play Start");
		b.displayBoard();
		Player p=p1;
		int count=0;
		
		while(true) {
			p.placeMark();
			count++;
			
			b.displayBoard();
			
			if(b.isRowWin()||b.isColWin()||b.isDigWin()) {
				System.out.println(p.name+" Wins");
				break;
			}
			
			if(count==9) {
				System.out.println("Rokesh Win!");
				break;
			}
			
			if(p==p1) {
				p=p2;
			}
			else {
				p=p1;
			}
		}
	}

}
