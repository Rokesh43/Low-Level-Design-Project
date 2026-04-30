import java.util.*;
public class PaitientClass {
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) {
		
		System.out.print("Enter the patient id :");
		int patientId=sc.nextInt();
		System.out.print("Enter the patient name :");
		String name=sc.next();
		System.out.print("Enter the patient age :");
		int age=sc.nextInt();
		System.out.print("Enter the patient blood group :");
		String bloodgroup=sc.next();
		
		
		Patient ram=new Patient(patientId,name,age,bloodgroup);
		String treatment=null;
		boolean flag=true;
		
		do {
			System.out.println("1.Admit Patient");
			System.out.println("2.Assign Treatment");
			System.out.println("3.Update HealthScore");
			System.out.println("4.HealthStatus");
			System.out.println("5.Get patientId");
			System.out.println("6.Get patientName");
			System.out.println("7.Get treatment");
			
			System.out.print("Enter Here");
			int input=sc.nextInt();
			switch(input) {
			case 1->{
				ram.admitted();
			}
			case 2->{
				System.out.println("Assign Treatment :");
				treatment=sc.next();
				ram.treatment(treatment);
			}
			case 3->{
				System.out.print("Enter the Health Score");
				int healthscore=sc.nextInt();
				ram.healthScore(healthscore);
			}
			case 4->{
				System.out.println("\t\t\tTreatment status :"+ram.getHealthStatus());
			}
			case 5->{
				System.out.println("\t\t\tPatient Id :"+ram.getPatientId(patientId));
			}
			case 6->{
				System.out.println("\t\t\tPatient Name :"+ram.getPatientName(name));
			}
			case 7->{
				System.out.println("\t\t\tPatient Treatment :"+ram.getTreatment(treatment));
			}
			case 8->{
				flag=false;
				System.out.println("\t\t\tThankYou");
			}
			}
			
		} while (flag);
	}

}
