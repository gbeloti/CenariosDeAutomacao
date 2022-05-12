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
	
	@FindBy(xpath = "(//img[@alt='Icon Close Eye'])[1]")
	private WebElement imgOlhoSenhaLogin;

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
		gerarSenha(senha);
		campoSenhaReg.sendKeys(senha);
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
	}
	
	public void registrarContaSemSaldo(String emailGerado, String nomeGerado, String senhaGerada) {
		btnRegistrar.click();
		wait.until(ExpectedConditions.visibilityOf(campoEmailReg)).sendKeys(emailGerado);
		campoNome.sendKeys(nomeGerado);
		campoSenhaReg.sendKeys(senhaGerada);
		campoSenhaConfirm.sendKeys(senhaGerada);
		btnCadastrar.click();
		conta = wait.until(ExpectedConditions.visibilityOf(msgAlerta)).getText();
		conta = conta.replaceAll("[^0-9]", "");
		System.out.println("	Conta: " + conta);
		obterNumConta(conta);
		obterNumDigito(conta);
		System.out.println("	Numero da conta: " + numConta);
		System.out.println("	Numero do digito: " + numDigito);
		wait.until(ExpectedConditions.visibilityOf(btnFecharConfirm)).click();
	}
	
	public void registrarContaComSaldo(String emailGerado, String nomeGerado, String senhaGerada) {
		btnRegistrar.click();
		wait.until(ExpectedConditions.visibilityOf(campoEmailReg)).sendKeys(emailGerado);
		campoNome.sendKeys(nomeGerado);
		campoSenhaReg.sendKeys(senhaGerada);
		campoSenhaConfirm.sendKeys(senhaGerada);
		adicionarSaldo();
		btnCadastrar.click();
		conta = wait.until(ExpectedConditions.visibilityOf(msgAlerta)).getText();
		conta = conta.replaceAll("[^0-9]", "");
		System.out.println("	Conta: " + conta);
		obterNumConta(conta);
		obterNumDigito(conta);
		System.out.println("	Numero da conta: " + numConta);
		System.out.println("	Numero do digito: " + numDigito);
		wait.until(ExpectedConditions.visibilityOf(btnFecharConfirm)).click();
	}
	
	public void registrarSegundoUser() {
		sleep(1000);
		gerarEmail(email);
		gerarSenha(senha);
		btnRegistrar.click();
		wait.until(ExpectedConditions.visibilityOf(campoEmailReg)).sendKeys(email);
		campoNome.sendKeys(faker.name().fullName());
		imgOlhoSenha.click();
		campoSenhaReg.sendKeys(senha);
		imgOlhoSenha.click();
		campoSenhaConfirm.sendKeys(senha);
		adicionarSaldo();
		btnCadastrar.click();
		wait.until(ExpectedConditions.visibilityOf(btnFecharConfirm)).click();
		sleep(500);
		campoEmailLogin.sendKeys(email);
		campoSenhaLogin.sendKeys(senha);
		btnAcessar.click();
	}
	
	// INSTRUCOES DO LOGIN
	
	public void emailIncorreto() {
		sleep(500);
		campoEmailLogin.sendKeys(faker.internet().emailAddress());
	}
	
	public void senhaIncorreta() {
		sleep(500);
		imgOlhoSenhaLogin.click();
		campoSenhaLogin.sendKeys(faker.internet().password());
	}
	
	public void informarEmailLogin() {
		sleep(500);
		campoEmailLogin.sendKeys(email);
	}
	
	public void informarSenhaLogin() {
		sleep(500);
		campoSenhaLogin.sendKeys(senha);
	}
	
	public void acionarBtnAcessar() {
		sleep(500);
		btnAcessar.click();
	}
	
	public void realizarLogin() {
		campoEmailLogin.sendKeys(email);
		campoSenhaLogin.sendKeys(senha);
		btnAcessar.click();
	}

}
