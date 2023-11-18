package genericUtility;

import java.awt.RenderingHints.Key;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertyUtility implements IAutoConstants{
	public String readingDataFromPropertyFile(String key) throws FileNotFoundException {
		FileInputStream fis = new FileInputStream(PROPERTY_FILE_PATHString);
		Properties ppt = new Properties();
		ppt.load(fis);
		return pptProperties.getProperty(key);
	}

}

