package com.sophossolutions.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://automationpractice.com/index.php")
public class HomePageYourLogo extends PageObject {

	public static final Target DRESSES = Target.the("Seccion dresses")
			.locatedBy("//*[@id='block_top_menu']/ul/li[2]/a");
	public static final Target EVENING_DRESSES = Target.the("Subseccion Evening dresses")
			.locatedBy("//*[@id='block_top_menu']/ul/li[2]/ul/li[2]/a");
 
}
