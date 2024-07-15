package PageLayer;

import BaseLayer.BaseClass;

public class HomePage extends BaseClass {
	public static String validateTitle() {

		String actualTitle = driver.getTitle();

		return actualTitle;

	}
	
	public static String validateUrl() {
		
		String actualUrl=driver.getCurrentUrl();
		
		return actualUrl;
	}
}
