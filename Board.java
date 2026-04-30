
public class Board {
	char [][]marking=new char[3][3];
	
	{
		for(int row=0;row<3;row++) {
			for(int col=0;col<3;col++) {
				marking[row][col]=' ';
			}
		}
	}
	
	public boolean isRowWin() {
		for(int i=0;i<3;i++) {
			if(marking[i][0]!=' ' && marking[i][0]==marking[i][1] && marking[i][1]==marking[i][2]) {
				return true;
			}
		}
		return false;
	}
	
	public boolean isColWin() {
		for(int i=0;i<3;i++) {
			if(marking[0][i]!=' ' && marking[0][i]==marking[1][i] && marking[1][i]==marking[2][i]) {
				return true;
			}
		}
		return false;
	}
	
	public boolean isDigWin() {
		if(marking[0][0]!=' ' && marking[0][0]==marking[1][1] && marking[1][1]==marking[2][2]) {
			return true;
		}
		
		if(marking[0][2]!=' ' && marking[0][2]==marking[1][1] &&marking[1][1]==marking[2][0]) {
			return true;
		}
		
		return false;
	}
	
	public void displayBoard() { 
		System.out.println("----------");
		for(int row=0;row<3;row++) {
			System.out.print("|");
			for(int col=0;col<3;col++) {
				System.out.print(marking[row][col]+" |");
			}
			System.out.println();
			System.out.println("----------");
		}
	}
	
	public static void main(String[] args) {
		Board b=new Board();
		b.displayBoard();
		System.out.println(b.isColWin());
		System.out.println(b.isRowWin());
		System.out.println(b.isDigWin());
				
				
	}

}
