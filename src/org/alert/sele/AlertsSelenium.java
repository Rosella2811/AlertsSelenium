package org.alert.sele;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsSelenium {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\EQ0063AU\\eclipse\\Library\\driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
	/*	d.get("https://netbanking.hdfcbank.com/netbanking/");
		
		WebElement e = d.findElement(By.name("fldLoginUserId"));
		e.sendKeys("mjghug");
		
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB); 
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement p = d.findElement(By.name("fldLoginUserId"));
		p.sendKeys("hyfyf");
		
		for(int j=0; j<5;j++)
		{
			r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		}

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Alert a= d.switchTo().alert();
		a.accept();   */
		
//		d.findElement(By.xpath("//a[@onclick='fnShowContent('errorCode','english')")).click();
		
/*		Robot r = new Robot();
	{
		for(int i=0;i<10;i++)
		{
			r.keyPress(KeyEvent.VK_TAB);
r.keyRelease(KeyEvent.VK_TAB);
		}
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}	
		d.findElement(By.id("Button2")).click();
		Alert  al= d.switchTo().alert();
		al.accept();					*/
		
		
		
		
		
	/*	for(int j=0;j<5;j++)
		{
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		*/
		
	d.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
		
	d.findElement(By.xpath("//input[@value='SIGN IN']")).click();
		
		Alert a= d.switchTo().alert();
		
		String s=a.getText();
		System.out.println(s);
		Thread.sleep(2000);
		a.accept();    
		
			
	}
	

}
