package geneicpojoclasses;

public class EmployeeData {
	
	String ename;
	String empId;
	String email;
	String address;
	
	public EmployeeData(String ename, String empId, String email, String address) {
		this.ename = ename;
		this.empId = empId;
		this.email = email;
		this.address = address;
	}
	
	public EmployeeData()
	{
		
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
