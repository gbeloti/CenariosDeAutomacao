package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PaginaInicialPage {
		
	//MAPEAMENTO 
	
	@FindBy(name = "q")
	private WebElement campoBusqueProduto;
	
	@FindBy(xpath = "//button[text()='Ok, entendi']")
	private WebElement btnCookies;

	@FindBy(xpath = "//a[@class='js-modal-open js-fullscreen-modal-open js-toggle-cart d-flex align-items-center']")
	private WebElement btnCarrinho;
	
	//INSTRUCOES
	
	public void pesquisarProduto() {
		btnCookies.click();
		campoBusqueProduto.sendKeys("camiseta preta");
		campoBusqueProduto.sendKeys(Keys.ENTER);
	}
	
	public void acionarCarrinho() {
		btnCarrinho.click();
	}

}
