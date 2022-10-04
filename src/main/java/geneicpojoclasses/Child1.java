package geneicpojoclasses;

public class Child1 {
	String cname;
	String cemail;
	String caddress;
	public Child1(String sname, String semail, String saddress) {
		super();
		this.cname = sname;
		this.cemail = semail;
		this.caddress = saddress;
	}
	public String getSname() {
		return cname;
	}
	public void setSname(String sname) {
		this.cname = sname;
	}
	public String getSemail() {
		return cemail;
	}
	public void setSemail(String semail) {
		this.cemail = semail;
	}
	public String getSaddress() {
		return caddress;
	}
	public void setSaddress(String saddress) {
		this.caddress = saddress;
	}

	
}
