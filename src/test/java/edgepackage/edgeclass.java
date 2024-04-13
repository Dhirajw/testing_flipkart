package edgepackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class edgeclass {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("edge","C:\\Users\\Dhiraj\\Desktop\\selinium_practice\\edgedriver\\edgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.className("Pke_EE")).sendKeys("shoes");
		driver.findElement(By.className("_2iLD__")).click();
		
		driver.findElement(By.className("_3ywSr_")).click();
		driver.findElement(By.xpath("//button[text(),'GO TO CART']"));
		driver.findElement(By.xpath("/html/head/body/div/div/div/div/div/div/div/ul/li/button")).click();
		driver.navigate().back();		//driver.findElement(By.xpath("//span[text(),'Login']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.className("card-text")).click();
//		driver.findElement(By.xpath("//span[contains(text(),'Sign In')]")).click();
//		driver.findElement(By.xpath("/html/body/div/div/header/div/div/ul/li[2]/div")).click();
//		driver.findElement(By.className("_381fS")).sendKeys("8975074093");
//		driver.findElement(By.className("a-ayg")).click();
//		driver.findElement(By.xpath("//label[contains(text),'One time password']")).sendKeys("207831");
	}
}
