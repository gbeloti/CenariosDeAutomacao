package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static utils.Utils.*;

public class BasePage {

	WebDriverWait wait = new WebDriverWait(driver, 10); //Funcao usada para o sistema aguardar os elementos em tela aparecerem

	@FindBy(id = "btn-EXTRATO")
	private WebElement btnExtrato;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnTransferir;

	@FindBy(id = "btn-TRANSFERÊNCIA")
	private WebElement btnTransferencia;

	@FindBy(name = "accountNumber")
	private WebElement campoNumeroConta;

	@FindBy(name = "digit")
	private WebElement campoNumeroDigito;

	@FindBy(name = "transferValue")
	private WebElement campoValorTransferencia;

	@FindBy(name = "description")
	private WebElement campoDescricao;

	@FindBy(id = "btnCloseModal")
	private WebElement btnFecharTransferencia;

	@FindBy(id = "btnBack")
	private WebElement btnVoltar;

	// EXTRATO
	public void acionarBotaoExtrato() {
		btnExtrato.click();
	}
	// TRANSFERENCIA

	public void acionarBotaoTransferencia() {
		btnTransferencia.click();
	}

	public String numeroConta(String conta) {
		Na(InicialPage.class).obterConta(conta);
//		System.out.println("Numero da conta para transferencia:" + conta);
		return conta;
	}

	public void informarNumeroConta(String conta) {
		conta = conta.substring(0, conta.length() - 1); //Retirando o digito do numero da conta
		campoNumeroConta.sendKeys(conta);
	}

	public void informarNumeroDigito(String conta) {
		conta = conta.substring(conta.length() - 1);//Retirando os numeros da conta e mantendo apenas o digito, ultimo numero
		campoNumeroDigito.sendKeys(conta);
	}

	public void informarValor(String valor) {
		campoValorTransferencia.sendKeys(valor);
	}

	public void informarDescricao(String descricao) {
		campoDescricao.sendKeys(descricao);
	}

	public void acionarBotaoTransferir() {
		btnTransferir.click();
	}

	public void acionarBotaoFecharTransferencia() {
		WebElement esperar = wait.until(ExpectedConditions.visibilityOf(btnFecharTransferencia)); //Esperar ate o botao aparecer em tela
		btnFecharTransferencia.click();
	}

	public void acionarBotaoVoltar() {
		btnVoltar.click();
	}

}
