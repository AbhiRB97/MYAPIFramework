package deserilization;

import java.io.File;

import org.codehaus.jackson.map.ObjectMapper;

import geneicpojoclasses.EmployeeDataWithObjectArray;

public class ObjectArr {

	public static void main(String[] args) throws Throwable, Throwable, Throwable {
		ObjectMapper o=new ObjectMapper();
		  EmployeeDataWithObjectArray ar = o.readValue(new File("./objArraywithChildren.json"), EmployeeDataWithObjectArray.class);
		  System.out.println(ar.getAddress());
		
	
		 Object[] ch = ar.getChildren();
		 for (int i = 0; i < ch.length; i++) {
			 System.out.println(ch[i]);
		
			
		}
	}
}
