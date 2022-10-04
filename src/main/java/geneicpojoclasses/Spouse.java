package geneicpojoclasses;

public class Spouse {
	String sname;
	String semail;
	String saddress;
	public Spouse(String sname, String semail, String saddress) {
		super();
		this.sname = sname;
		this.semail = semail;
		this.saddress = saddress;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSemail() {
		return semail;
	}
	public void setSemail(String semail) {
		this.semail = semail;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}

	
}
