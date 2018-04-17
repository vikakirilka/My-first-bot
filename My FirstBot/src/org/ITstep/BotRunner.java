package org.ITstep;

import org.ITstep.model.Account;
import org.ITstep.model.Good;
import org.ITstep.service.ImitatorService;
import org.ITstep.service.Timer;
import org.openqa.selenium.WebDriver;

public class BotRunner {

	public static void main(String[] args) {
		ImitatorService imService = new ImitatorService();
		Account acc = new Account("Vikkik", "Kirich", "Vikkik88776655@bk.com", "privetiki12345");
		WebDriver driver = null;
		boolean accIsNotLogined = true; 
		int counter = 0;
		
		do {
			counter++;
			driver = imService.loginAmazonAccount(acc);
			if(counter>3 || driver.getPageSource().contains("")) {
				Timer.waitSeconds(10);
				accIsNotLogined = false;
			}else {
				driver.quit();
			}
			
		} while (accIsNotLogined);
		
		driver = imService.addItemToWL(driver);
	
		driver.quit();
//		imService.registerAmazonAccount(acc);
//		Good good = imService.getItemData("cat toys", "B009YQ5IQC");
//		  System.out.println(good.getGoodUrl());
//		  System.out.println(good.getPosPage());
//		  System.out.println(good.getPosOnSite());
	}

}
