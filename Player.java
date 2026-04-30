import java.util.Scanner;

public class Player {
	String name;
	char mark;
	Board b;
	
	public Player(String name, char mark, Board b) {
	
		this.name = name;
		this.mark = mark;
		this.b = b;
	}
	
	public void placeMark() {
		Scanner sc=new Scanner(System.in);
		boolean isMarkingDone=false;
		
		do {
			System.out.println(name+"Place your mark");
			int row=sc.nextInt();
			int col=sc.nextInt();
			
			if(isValidMark(row,col)) {
				b.marking[row][col]=mark;
				isMarkingDone=true;
			}
			else {
				System.out.println("you Had Entered a Wrong Input");
				System.out.println("Provide a valid Input");
			}
		} while (!isMarkingDone);
	}
	
	public boolean isValidMark(int row,int col) {
		if(row<0 || row>2 || col<0||col>2||b.marking[row][col]!=' ') {
			return false;
		}
		return true;
	}
	
	

}
