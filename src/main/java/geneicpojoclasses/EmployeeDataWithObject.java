package geneicpojoclasses;

public class EmployeeDataWithObject {
	
	String ename;
	String empId;
	String [] email;
	String address;
	Object spouse;
	
	public EmployeeDataWithObject(String ename, String empId, String [] email, String address, Object spouse) {
		this.ename = ename;
		this.empId = empId;
		this.email = email;
		this.address = address;
		this.spouse=spouse;
	}
	
	
	public EmployeeDataWithObject()
	{
		
	}

	public Object getSpouse() {
		return spouse;
	}


	public void setSpouse(Object spouse) {
		this.spouse = spouse;
	}


	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String[]  getEmail() {
		return email;
	}

	public void setEmail(String [] email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
