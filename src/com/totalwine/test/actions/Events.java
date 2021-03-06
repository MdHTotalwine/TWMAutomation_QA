package com.totalwine.test.actions;

import org.openqa.selenium.WebDriver;
import com.totalwine.test.pages.PageGlobal;
import com.totalwine.test.pages.PageSignInModal;

public class Events {

	//**Sign in modal with credential which has pre-existing order history, shopping list etc.
	public static void CustomLogin (WebDriver driver) throws InterruptedException {
	    
	    driver.findElement(PageGlobal.TopNavAccount).click();
	    Thread.sleep(2000);
//	    driver.findElement(PageGlobal.SignInto).click();
//	    Thread.sleep(2000);

		driver.switchTo().frame("iframe-signin-overlay");
	    driver.findElement(PageSignInModal.ModalUsername).clear();
	    driver.findElement(PageSignInModal.ModalUsername).sendKeys("mhossain@totalwine.com");
	    driver.findElement(PageSignInModal.ModalPassword).clear();
	    driver.findElement(PageSignInModal.ModalPassword).sendKeys("grapes123");
	    driver.findElement(PageSignInModal.ModalSigninButton).click();
	    Thread.sleep(6000);  	    
	}
}
