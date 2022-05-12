package pageObjects;

import static utils.Functions.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class UsuarioLogadoPage {

	//MAPEAMENTO
	
	@FindBy(id = "btn-EXTRATO")
	private WebElement btnExtrato;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnTransferir;

	@FindBy(id = "btn-TRANSFER�NCIA")
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
	
	// INSTRUCOES
	
	public void acionarBtnSair() {
		sleep(1000);
		btnSair.click();
	}
	
	// EXTRATO

	// TRANSFERENCIA
	
	// PAGAMENTO
	
	// SAQUE


}