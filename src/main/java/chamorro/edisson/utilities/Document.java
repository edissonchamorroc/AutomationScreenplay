package chamorro.edisson.utilities;

import java.io.File;

public class Document {
	
	public static String getPath(String path) {
		
		File file = new File(path);
		    	
		return file.getAbsolutePath();
	}
}
