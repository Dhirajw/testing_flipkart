package edgepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class search_testing {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("search_using_edge","C:\\\\Users\\\\Dhiraj\\\\Desktop\\\\selinium_practice\\\\edgedriver\\\\edgedriver.exe");
 WebDriver driver = new EdgeDriver();
	 
		
		driver.get("https://www.flipkart.com/account/login?signup=true");
		 driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("8975074093");
		 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
	 
	
		
	 Thread.sleep(1000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]")).sendKeys("8975074093");
		
		
	}
}
      