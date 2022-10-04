package geneicpojoclasses;

public class Relations {
	String name;
	String relationship;
	public Relations(String name, String relationship) {
		super();
		this.name = name;
		this.relationship = relationship;
	}
//	
//	public Relations()
//	{
//		
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRelationship() {
		return relationship;
	}
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
	

}
