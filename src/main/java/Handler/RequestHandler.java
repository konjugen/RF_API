package Handler;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

public class RequestHandler {
	
	public FileInputStream ClientRequest() {
		FileInputStream fStream = null;
		try {
			fStream = new FileInputStream(new File("./src/main/java/Payload.json"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return fStream; 
	}

}
