package SerilizationOfPojoClass;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import geneicpojoclasses.Array;

public class SerilizationOfArray {
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		Array a=new Array("Abhishek","@gmail.com", 123456);
		ObjectMapper o=new ObjectMapper();
		o.writeValue(new File("./empArray."), a);
	}

}
