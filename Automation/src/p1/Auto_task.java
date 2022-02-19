package p1;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Auto_task {
	
	public static String stringgen() {
	    int leftLimit = 97; // letter 'a'
	    int rightLimit = 122; // letter 'z'
	    int targetStringLength = 10;
	    Random random = new Random();

	    String generatedString = random.ints(leftLimit, rightLimit + 1)
	      .limit(targetStringLength)
	      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
	      .toString();

	    return generatedString;
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Study\\Selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		//Account 1
		driver.findElement(By.linkText("Sign in")).click();
		String s= stringgen();
		driver.findElement(By.id("email_create")).sendKeys(s+"@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys(s);
		driver.findElement(By.id("customer_lastname")).sendKeys("Glen");
		String pass =stringgen();
		driver.findElement(By.id("passwd")).sendKeys(pass);
		Select d=new Select(driver.findElement(By.id("days")));
		d.selectByVisibleText("1");
		Select m=new Select(driver.findElement(By.id("months")));
		m.selectByVisibleText("January");
		Select y=new Select(driver.findElement(By.id("years")));
		y.selectByVisibleText("1990");
		driver.findElement(By.id("submitAccount")).click();
		driver.findElement(By.id("address1")).sendKeys("Shahbagh");
		driver.findElement(By.id("city")).sendKeys("Dhaka");
		Select st=new Select(driver.findElement(By.id("id_state")));
		st.selectByVisibleText("Florida");
		driver.findElement(By.id("postcode")).sendKeys("10000");
		driver.findElement(By.id("phone_mobile")).sendKeys("012345678");
		driver.findElement(By.id("alias")).sendKeys("Kakoli");
		driver.findElement(By.id("submitAccount")).click();
		driver.findElement(By.id("submitAccount")).click();
		driver.findElement(By.linkText("Sign out")).click();
		//Account 2
		driver.findElement(By.linkText("Sign in")).click();
		String s1= stringgen();
		driver.findElement(By.id("email_create")).sendKeys(s1+"@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys(s);
		driver.findElement(By.id("customer_lastname")).sendKeys("Glen");
		String pass1 =stringgen();
		driver.findElement(By.id("passwd")).sendKeys(pass1);
		Select d1=new Select(driver.findElement(By.id("days")));
		d1.selectByVisibleText("1");
		Select m1=new Select(driver.findElement(By.id("months")));
		m1.selectByVisibleText("January");
		Select y1=new Select(driver.findElement(By.id("years")));
		y1.selectByVisibleText("1990");
		driver.findElement(By.id("submitAccount")).click();
		driver.findElement(By.id("address1")).sendKeys("Shahbagh");
		driver.findElement(By.id("city")).sendKeys("Dhaka");
		Select st1=new Select(driver.findElement(By.id("id_state")));
		st1.selectByVisibleText("Florida");
		driver.findElement(By.id("postcode")).sendKeys("10000");
		driver.findElement(By.id("phone_mobile")).sendKeys("012345678");
		driver.findElement(By.id("alias")).sendKeys("Kakoli");
		driver.findElement(By.id("submitAccount")).click();
		driver.findElement(By.id("submitAccount")).click();
		driver.findElement(By.linkText("Sign out")).click();
		//Log in
		driver.findElement(By.id("email")).sendKeys(s1+"@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys(s1+"pass1");
		// casual dress 
		Actions actions = new Actions(driver);
		WebElement dress = driver.findElement(By.linkText("Dresses"));
		actions.moveToElement(dress);

		WebElement subdress = driver.findElement(By.linkText("Casual Dresses"));
		actions.moveToElement(subdress);
		actions.click().build().perform();
		//Signing out
		driver.findElement(By.linkText("Sign out")).click();
		
	}

}
