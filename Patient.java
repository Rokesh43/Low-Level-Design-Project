
public class Patient {
	private static final String String = null;
	private int patientId;
	private String name;
	private int age;
	private String bloodgroup;
	private boolean admited;
	private String treatment;
	private int healthcare;
	
	public Patient(int patientId,String name,int age,String bloodgroup) {
		this.patientId=patientId;
		
		if (name==null || name.trim().isEmpty()) {
			System.out.println("\t\t\tInvalid name:Plaese enter the valid name");
			return;
		}
		else {
			this.name=name;
		}
		
		if(age>=0 && age<=120) {
			this.age=age;
		}
		
		if (isValidBloodgroup(bloodgroup)){
			this.bloodgroup=bloodgroup;
			
		}
		else {
			System.out.println("\t\t\tInvalid blood group");
			return;
		}
		
		admited=false;
		treatment=null;
		healthcare=0;
		
		
	}
	
	private boolean isValidBloodgroup(String bloodgroup) {
		return bloodgroup.equals("A+")
				|| bloodgroup.equals("A-")
				||bloodgroup.equals("B+")
				||bloodgroup.equals("B-")
				||bloodgroup.equals("AB+")
				||bloodgroup.equals("AB-")
				||bloodgroup.equals("O+")
				||bloodgroup.equals("O-");
	}
	
	public void admitted() {
		if (admited) {
			System.out.println("\t\t\tAlready Patient Admited ");
		}
		else {
			admited=true;
			System.out.println("\t\t\tPatient is admitted");
			
		}
		
	}
	
	public void treatment(String treatment) {
		if ((admited )&& (this.treatment == null || this.treatment.trim().isEmpty())) {
			this.treatment=treatment;
			System.out.println("\t\t\tTratment Assigned");
		}
		else {
			System.out.println("\t\t\tAdmitted first");
		}
		
	}
	
	public void healthScore(int healthcare) {
		if (admited) {
			if (healthcare>0 && healthcare<=120) {
				this.healthcare=healthcare;
				System.out.println("\t\t\t"+healthcare+" Update health Score");
				
			}
			else {
				System.out.println("\t\t\tInvalid Score");
			}
			
		}
		else {
			System.out.println("\t\t\tAdmitted first after update health Score");
		}
	}
	
	public String getHealthStatus() {
		if (admited) {
			
			if (healthcare>=40) {
				return "\t\t\tStable condition";
				
			}
			else {
				return "\t\t\tCritical condition";
			}
			
		}
		else {
			return "\t\t\tAdmited first";
		}
	}
	
	public int getPatientId(int patientId) {
		return patientId;
	}
	
	public String getPatientName(String name) {
		return name;
	}
	
	public String getTreatment(String treatment) {
		return treatment;
	}
	
	

}
