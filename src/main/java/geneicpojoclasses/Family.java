package geneicpojoclasses;

public class Family {
	String fn;
	String ln;
	String dob;
	Object wife;
	Object [] relations;
	public Family(String fn, String ln, String dob,Object wife,  Object[] relations) {
		super();
		this.fn = fn;
		this.ln = ln;
		this.dob = dob;
		this.wife = wife;
		this.relations = relations;
	}
	public Family() {}
	public String getFn() {
		return fn;
	}
	public Object getWife() {
		return wife;
	}
	public void setWife(Object wife) {
		this.wife = wife;
	}
	public void setFn(String fn) {
		this.fn = fn;
	}
	public String getLn() {
		return ln;
	}
	public void setLn(String ln) {
		this.ln = ln;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public Object[] getRelations() {
		return relations;
	}
	public void setRelations(Object[] relations) {
		this.relations = relations;
	}
	
	

}
