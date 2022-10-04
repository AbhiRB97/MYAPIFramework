package deserilization;

import java.io.File;

import org.codehaus.jackson.map.ObjectMapper;

import geneicpojoclasses.Family;

public class FamilyDeserilization {
	public static void main(String[] args) throws Throwable, Throwable, Throwable {
		ObjectMapper o=new ObjectMapper();
		Family g = o.readValue(new File("./fam.json"), Family.class);
		System.out.println(g.getFn());
		System.out.println(g.getLn());
		System.out.println(g.getRelations());
		System.out.println(g.getDob());
		
	}

}
