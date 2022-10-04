package geneicpojoclasses;

public class Array {
	String ename;
	String emailId;
	int [] a=new int[2];
	public Array(String ename, String emailId, int a) {
	
		this.ename = ename;
		this.emailId = emailId;
		this.a[0]=a;
		//this.a[1]=b;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public int[] getA() {
		return a;
	}
	public void setA(int[] a) {
		this.a = a;
	}
	
	
	

}
