package pageObjects;

import static utils.Functions.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CarrinhoPage {

	@FindBy(xpath = "//div[@class='js-ajax-cart-list cart-row']//span[3]")
	private WebElement btnMais;

	@FindBy(xpath = "//div[@class='js-ajax-cart-list cart-row']//span[1]")
	private WebElement btnMenos;

	@FindBy(xpath = "//div[@class='col-1 cart-item-delete text-right']//button[@type='button']")
	private WebElement btnLixeira;

	public void alterarQuantidade() {
		btnMais.click();
		sleep(2000); //funções de espera para a melhor observação dos passos
		wait.until(ExpectedConditions.visibilityOf(btnMais)).click();
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(btnMenos)).click();
		sleep(1000);
	}

	public void excluirProduto() {
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(btnLixeira)).click();
	}

}