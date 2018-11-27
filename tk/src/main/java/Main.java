

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Main {
By mycc =By.linkText("My Account");
WebDriver driver;
public Main(WebDriver driver) {
this.driver=driver;
}
public void clickonMyAcc()
{
	driver.findElement(mycc).click();
}
}
