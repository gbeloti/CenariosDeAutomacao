package pageObjects;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;
import static utils.Functions.*;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ResultadoPage {
	
	@FindBy(xpath = "//img[@alt[contains(.,'CAMISETA PRETA - DARKNESS')]]")
	private WebElement imgProduto;
	
//	@FindBy(xpath = "//div[@class='js-item-name item-name mb-1'][text()='CAMISETA PRETA - DARKNESS']")
//	private WebElement btnComprar;
	
	@FindBy(xpath = "//a[@title[contains(.,'CAMISETA PRETA - DARKNESS')]][text()='Comprar']")
	private WebElement btnComprar;
	
	public void selecionarProduto() {
		wait.until(ExpectedConditions.visibilityOf(imgProduto));
		agir.moveToElement(imgProduto).perform();
		wait.until(ExpectedConditions.visibilityOf(btnComprar));
		btnComprar.click();
	}

}
