package pack2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classtwo
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\MyRoot\\ComboOne\\SeleniumOne\\Files\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.co.in/");
			System.out.println("Hello Git");
			driver.quit();
	}
}
