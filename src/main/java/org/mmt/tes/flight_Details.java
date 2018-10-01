package org.mmt.tes;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.WebElement;
public class flight_Details {

	@FindBy(how=How.XPATH, using="//span[@class='page_loader__text']") WebElement getting_flights_text;
}
