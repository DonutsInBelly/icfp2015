package jsonHandler;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.*;


public class jsonParser 
{
	public void parseJSON(File jsonFile) throws FileNotFoundException
	{
		BufferedReader br = new BufferedReader(new FileReader(jsonFile));
	}
}
