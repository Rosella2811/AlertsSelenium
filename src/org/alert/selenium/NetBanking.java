package org.alert.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetBanking {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\EQ0063AU\\eclipse\\Library\\driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://netbanking.hdfcbank.com/netbanking/");
		 
		WebElement w= d.findElement(By.id("fldLoginUserId"));
		w.sendKeys("hvhvhguh");

		
		
		
		
		/*	d.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		
		WebElement e= d.findElement(By.id("DUMMY1"));
		e.sendKeys("Rose rovin");
		
		Robot r= new Robot ();
		r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	
	WebElement p= d.findElement(By.name("AuthenticationFG.USER_PRINCIPAL"));
	p.sendKeys("jghyvkn");
	
	WebElement o= d.findElement(By.name("AuthenticationFG.ACCESS_CODE"));
o.sendKeys("hjftf");

WebElement y= d.findElement(By.name("Action.VALIDATE_CREDENTIALS"));
y.click();   
*/
	}

}
