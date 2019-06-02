package gitHubTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class gitHubtest {
    @Test
	public void loginTest() throws IOException
	{
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //to take screenshot
		FileUtils.copyFile(src,  new File("C:\\Users\\DELL\\Desktop\\Monishaa_Selenium\\GithubTest\\Screenshot\\screen.jpeg"));
		
	}
}
