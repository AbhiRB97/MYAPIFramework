package crudSerilization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import crudusingpojo.AddProject;

public class Add {
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		AddProject a=new AddProject("Abhishek","v12312", "Created", 3);
		ObjectMapper o=new ObjectMapper();
		o.writeValue(new File("./jsonFiles/prodetails.json"), a);
	}

}
