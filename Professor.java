
public class Professor extends Employee{
	
	private String subjectSpecialization;
	private int researchpapers;
	
	public Professor(int employeeId,String name,String department,double salary,String subjectSpecialization,int researchpapers) {
		super(employeeId,name,department,salary);
		this.subjectSpecialization=subjectSpecialization;
		this.researchpapers=researchpapers;
	}

	public String getSubjectSpecialization() {
		return subjectSpecialization;
	}

	public void setSubjectSpecialization(String subjectSpecialization) {
		this.subjectSpecialization = subjectSpecialization;
	}

	public int getResearchpapers() {
		return researchpapers;
	}

	public void setResearchpapers(int researchpapers) {
		this.researchpapers = researchpapers;
	}
	public int publishReasearchPaper() {
		return this.researchpapers++;
	}
	
	
	

}
