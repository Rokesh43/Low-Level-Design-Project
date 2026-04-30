
public class LabAssistant extends Employee {
	private String labName;
	private int workingHours;
	
	public LabAssistant(int employeeId,String name,String department,double salary,String labName,int workingHours) {
		super(employeeId,name,department,salary);
		this.labName=labName;
		this.workingHours=workingHours;
	}

	public String getLabName() {
		return labName;
	}

	public void setLabName(String labName) {
		this.labName = labName;
	}

	public int getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(int workingHours) {
		this.workingHours = workingHours;
	}
	
	

}
