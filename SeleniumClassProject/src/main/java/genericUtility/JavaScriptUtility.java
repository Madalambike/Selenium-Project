package genericUtility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.internal.AbstractParallelWorker.Arguments;

import com.github.dockerjava.api.model.Driver;

public class JavaScriptUtility extends BaseClass{
	public void enteringDataIntoElement(WebElement element, String data) {
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		js.executeScript("Arguments[0].value = '"+data+"'", element);
		
	}
	public void clickingOnElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		js.executeScript("Arguments[0].click();",element);
	}
	
	
	public void scrollingThePage(int x, int y) {
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		js.executeScript("scrollBy("+x+","+y+")");
	}
}
