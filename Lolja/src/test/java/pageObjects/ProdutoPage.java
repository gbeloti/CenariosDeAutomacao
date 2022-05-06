package pageObjects;

import static utils.Functions.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProdutoPage {

	@FindBy(xpath = "//a[@data-value='P']")
	private WebElement btnTamanhoP;

	@FindBy(xpath = "//a[@data-value='FEMININO']")
	private WebElement btnFeminino;

	@FindBy(xpath = "//input[@type='submit'][@value='Comprar']")
	private WebElement btnComprar;
	
	@FindBy(xpath = "//input[@value='Finalizar Compra']")
	private WebElement btnFinalizarCompra;	
	
	@FindBy(xpath = "//div[normalize-space()='Carrinho de Compras']//span[@class='modal-close']//*[name()='svg']")
	private WebElement btnX;	
	
	@FindBy(xpath = "//img[contains(@class,'transition-soft-slow')]")
	private WebElement btnLolja;	
	
	public void escolherDetalhesDoProduto() {
		btnTamanhoP.click();
		sleep(500);
		btnFeminino.click();
		sleep(500);
		btnComprar.click();
	}

	public void voltarPaginaInicial() {
		sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(btnX)).click();
		sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(btnLolja)).click();
		sleep(1000);
	}
 }
