package org.mmt.tes;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Flight {

	@FindBy(how=How.XPATH,using="//label[@for='switch__input_1") WebElement oneway;
	@FindBy(how=How.XPATH, using="//label[@for='switch__input_2']") WebElement roundtrip;
	@FindBy(xpath="//label[@for='switch__input_3']") WebElement multicity;
	@FindBy(xpath="//input[@id='hp-widget__sfrom']") WebElement from;
	@FindBy(xpath="//input[@id='hp-widget__sTo']") WebElement to;
	@FindBy(how=How.XPATH, using="//input[@id='hp-widget__depart']") WebElement depart;
	@FindBy(xpath="//input[@id='hp-widget__return']") WebElement retrun;
	@FindBy(how=How.XPATH, using="//span[@class='o-i-passengers']")  WebElement passenger_class;
	@FindBy(xpath="//button[@id='searchBtn']") WebElement searchbutton;
	@FindBy(how=How.XPATH,using="//p[@class='hmp-wallet-info-txt']") WebElement bestprice_text;
	@FindBy(how=How.XPATH,using="//p[@class='hmp-wallet-expire-txt']")  WebElement lowestfare_text;
	@FindBy(how=How.XPATH, using="//a[text()='KNOW MORE']") WebElement knowmore;
	@FindBy(how=How.XPATH, using="//span[@class='o-i-swap-button']") WebElement swapbutton;
	
	








}
