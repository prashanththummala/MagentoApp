

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import com.abc.magentoobject.*;


public class MagentoTest {
	public static void main(String[] args) throws Exception {
		String url = "http://www.magento.com";
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		Main m = new Main(driver);
		m.clickonMyAcc();
		Thread.sleep(2000);
		Login l = new Login(driver);
		l.typeEmail("sucheendra.abc@gmail.com");
		l.typePassword("Welcome123");
		l.clickonLogin();
		Thread.sleep(2000);
		Logout logout = new Logout(driver);
		logout.clickonLogout();
		Thread.sleep(5000);
		driver.quit();
	}

}
