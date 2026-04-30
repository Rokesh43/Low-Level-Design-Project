import java.util.Scanner;

public class UserEmployee {
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) {
		Professor p=new Professor(1,"Rokesh","ECE",25000,"SignalSystem",2);
		LabAssistant l=new LabAssistant(2,"Dharun","Cse",2000,"Oops",2);
		
		boolean flag=true;
		do {
			System.out.println("1.Professor Employee ID ");
			System.out.println("2.LabAssistant Employee ID ");
			System.out.println("3.Professor publish Research Paper");
			System.out.print("Enter the here :");
			int input=sc.nextInt();
			
			switch(input) {
			case 1:{
				System.out.println(p.getEmployeeId());
			
			}
			case 2:{
				System.out.println(l.getEmployeeId());
			
			}
			case 3:{
				p.publishReasearchPaper();
				System.out.println("Published research Paper");
				
			
			}
			case 4:{
				System.out.println("Research Paper :"+p.getResearchpapers());
				break;
			
			}
			}
		} while (flag);
	}

}
