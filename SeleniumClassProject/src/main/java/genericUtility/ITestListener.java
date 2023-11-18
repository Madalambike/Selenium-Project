package genericUtility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.commons.io.FileUtils;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;

public class ITestListener exetends BaseClass implements IAutoConstants {
	Public void onTestFailure(ITestResult result) {
		TakesScreenshot driver;
		TakesScreenshot tScreenshot=(TakesScreenshot) driver;
		File photo = tScreenshot.getScreenshotAs(OutputType.FILE);
		File file = new File(SS_PATH+result.getName()+".png");
		try {
			FileUtils.copyFile(photo, file);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
}

