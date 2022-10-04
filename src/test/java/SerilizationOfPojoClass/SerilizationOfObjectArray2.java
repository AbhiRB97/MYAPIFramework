package SerilizationOfPojoClass;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import geneicpojoclasses.Child1;
import geneicpojoclasses.EmployeeDataWithObjectArray;
import geneicpojoclasses.Spouse;

public class SerilizationOfObjectArray2 {
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		Spouse s=new Spouse("Wife", "@wife", "gadag");
		String [] arr= {"a.a@gmail.com", "a.a@yahoo.com"};
		Child1 ch1=new Child1("A", "a", "gdg");
		Child1 ch= new Child1("b", "b", "bjp");
		Object [] o= {ch1,ch};
		EmployeeDataWithObjectArray em=new EmployeeDataWithObjectArray("Abhi", "bca",arr, "banglore",s, o);
		
		ObjectMapper m=new ObjectMapper();
		m.writeValue(new File("./objArraywithChildren.json"), em);
		
	}

}
