package stg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tset_2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver =new EdgeDriver();
		driver.get("https://maktoob.yahoo.com/?p=us");
		driver.findElement(By.xpath("//*[@id=\"ybarAccountProfile\"]/a")).click();
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[1]"));
		//driver.quit();
	}

}
