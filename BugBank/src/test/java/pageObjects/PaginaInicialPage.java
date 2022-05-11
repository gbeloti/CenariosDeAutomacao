package pageObjects;

import static utils.Functions.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PaginaInicialPage {

	// MAPEANDO O REGISTRO

	@FindBy(xpath = "//button[text()='Registrar']")
	private WebElement btnRegistrar;

	@FindBy(xpath = "//button[text()='Cadastrar']")
	private WebElement btnCadastrar;

	@CacheLookup
	@FindBy(xpath = "//div[@class='card__register']//input[@name='email']")
	private WebElement campoEmailReg;

	@CacheLookup
	@FindBy(name = "name")
	private WebElement campoNome;

	@CacheLookup
	@FindBy(xpath = "//div[@class='card__register']//input[@name='password']")
	private WebElement campoSenhaReg;

	@CacheLookup
	@FindBy(name = "passwordConfirmation")
	private WebElement campoSenhaConfirm;

	@FindBy(id = "toggleAddBalance")
	private WebElement btnCriarSaldo;

	@FindBy(id = "modalText")
	private WebElement msgAlerta;

	@FindBy(id = "btnCloseModal")
	private WebElement btnFecharConfirm;

	@FindBy(xpath = "(//img[@alt='Icon Close Eye'])[2]")
	private WebElement imgOlhoSenha;

	@FindBy(xpath = "(//img[@alt='Icon Close Eye'])[3]")
	private WebElement imgOlhoConfirmSenha;

	// MAPEANDO O LOGIN

	@CacheLookup
	@FindBy(xpath = "//div[@class='card__login']//input[@name='email']")
	private WebElement campoEmailLogin;

	@CacheLookup
	@FindBy(xpath = "//div[@class='card__login']//input[@name='password']")
	private WebElement campoSenhaLogin;

	@FindBy(xpath = "//button[text()='Acessar']")
	private WebElement btnAcessar;

	// LOGIN INVALIDO

	@FindBy(id = "btnCloseModal")
	private WebElement btnFecharLoginInvalido;

	// INSTRUCOES DO REGISTRO

	public void acionarBtnRegistro() {
		sleep(500);
		btnRegistrar.click();
	}

	public void informarEmailInvalido() {
		wait.until(ExpectedConditions.visibilityOf(campoEmailReg)).sendKeys(faker.name().firstName());
		sleep(500);
	}

	public void informarEmail() {
		wait.until(ExpectedConditions.visibilityOf(campoEmailReg)).sendKeys(faker.internet().emailAddress());
		sleep(500);
	}

	public void informarNome() {
		campoNome.sendKeys(faker.name().fullName());
		sleep(500);
	}

	public void informarSenha() {
		imgOlhoSenha.click();
		sleep(500);
		senha = faker.internet().password();
		campoSenhaReg.sendKeys(senha);
		obterSenha(senha);
		sleep(500);
	}

	public void informarConfirmacaoSenha() {
		imgOlhoSenha.click();
		sleep(500);
		campoSenhaConfirm.sendKeys(senha);
		sleep(500);
	}
	
	public void informarConfirmacaoSenhaIncorreta() {
		imgOlhoSenha.click();
		sleep(500);
		campoSenhaConfirm.sendKeys(faker.internet().password());
		sleep(500);
	}
	
	public void adicionarSaldo() {
		sleep(500);
		if (btnCriarSaldo.isSelected()) {
		} else {
			btnCriarSaldo.click();
		}
	}

	public void acionarBtnCadastrar() {
		sleep(500);
		btnCadastrar.click();
		conta = wait.until(ExpectedConditions.visibilityOf(msgAlerta)).getText();
		conta = conta.replaceAll("[^0-9]", "");
		System.out.println("	Conta: " + conta);
		obterNumConta(conta);
		obterNumDigito(conta);
		System.out.println("	Numero da conta: " + numConta);
		System.out.println("	Numero do digito: " + numDigito);
	}
	
	
	// INSTRUCOES DO LOGIN

}
