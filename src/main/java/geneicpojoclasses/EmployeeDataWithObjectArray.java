package geneicpojoclasses;

public class EmployeeDataWithObjectArray {
	
	String ename;
	String empId;
	String [] email;
	String address;
	Object spouse;
	Object [] children;
	
	public EmployeeDataWithObjectArray(String ename, String empId, String [] email, String address, Object spouse, Object [] children) {
		this.ename = ename;
		this.empId = empId;
		this.email = email;
		this.address = address;
		this.spouse=spouse;
		this.children=children;
	}
	
	
	public Object[] getChildren() {
		return children;
	}


	public void setChildren(Object[] children) {
		this.children = children;
	}


	public EmployeeDataWithObjectArray()
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
