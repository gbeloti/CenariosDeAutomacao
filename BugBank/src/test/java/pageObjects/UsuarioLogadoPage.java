package pageObjects;

import static utils.Functions.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class UsuarioLogadoPage {

	// MAPEAMENTO

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

	@FindBy(id = "btnExit")
	private WebElement btnSair;

	@FindBy(id = "btn-PAGAMENTOS")
	private WebElement btnPagamentos;

	@FindBy(id = "btn-SAQUE")
	private WebElement btnSaque;

	// INSTRUCOES

	public void acionarBtnSair() {
		sleep(1000);
		btnSair.click();
	}

	// EXTRATO

	public void acionarExtrato() {
		sleep(1000);
		btnExtrato.click();
	}

	// TRANSFERENCIA

	public void acionarTransferencia() {
		sleep(1000);
		btnTransferencia.click();
	}

	public void informarConta() {
		sleep(500);
		campoNumeroConta.sendKeys(numConta);
		sleep(500);
		campoNumeroDigito.sendKeys(numDigito);
	}

	public void informarContaErrada() {
		sleep(500);
		campoNumeroConta.sendKeys(faker.number().digits(3));
		sleep(500);
		campoNumeroDigito.sendKeys(numDigito);
	}
	
	public void informarContaInvalida() {
		sleep(500);
		campoNumeroConta.sendKeys(faker.number().digits(9));
		sleep(500);
		campoNumeroDigito.sendKeys(numDigito);
	}
	
	public void informarContaInvalidaLetras() {
		sleep(500);
		campoNumeroConta.sendKeys(faker.name().firstName());
		sleep(500);
		campoNumeroDigito.sendKeys(numDigito);
	}
	
	public void informarDigitoInvalido() {
		sleep(500);
		campoNumeroConta.sendKeys(conta);
		sleep(500);
		campoNumeroDigito.sendKeys(faker.number().digits(2));
	}
	
	public void informarDigitoInvalidoaLetras() {
		sleep(500);
		campoNumeroConta.sendKeys(numConta);
		sleep(500);
		campoNumeroDigito.sendKeys(faker.name().firstName());
	}

	public void informarValor() {
		sleep(500);
		campoValorTransferencia.sendKeys("500");
	}
	
	public void informarValorZero() {
		sleep(500);
		campoValorTransferencia.sendKeys("0");
	}
	
	public void informarValorNegativo() {
		sleep(500);
		campoValorTransferencia.sendKeys("-500");
	}
	
	public void informarValorTotal() {
		sleep(500);
		campoValorTransferencia.sendKeys("1000");
	}
	
	public void informarValorGrande() {
		sleep(500);
		campoValorTransferencia.sendKeys("2000");
	}
	
	public void informarDescricao() {
		sleep(500);
		campoDescricao.sendKeys("Teste Transferência");
	}
	
	public void acionarTransferir() {
		sleep(500);
		btnTransferir.click();
	}
	
	public void irParaExtrato() {
		sleep(500);
		btnFecharTransferencia.click();
		btnVoltar.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnExtrato)).click();
	}

	// PAGAMENTO

	public void acionarPagamento() {
		sleep(1000);
		btnPagamentos.click();
	}

	// SAQUE

	public void acionarSaque() {
		sleep(1000);
		btnSaque.click();
	}

}
