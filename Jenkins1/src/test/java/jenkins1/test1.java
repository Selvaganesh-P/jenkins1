package jenkins1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test1 {
	
	
	@Test
	public void chrome () {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://demo.automationtesting.in/Alerts.html");
		d.manage().window().maximize();
		WebElement FirstAlert = d.findElement(By.xpath("//button[@class='btn btn-danger']"));
		FirstAlert.click();
		Alert Alert1 = d.switchTo().alert();
		System.out.println(Alert1.getText());
		Alert1.accept();
		
		
	}

}
