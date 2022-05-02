package pageObjects;

import static utils.Utils.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InicialPage {

	WebDriverWait wait = new WebDriverWait(driver, 10); //Funcao usada para o sistema aguardar os elementos em tela aparecerem

	// MAPEANDO O REGISTRO

	@FindBy(xpath = "//button[text()='Registrar']")
	private WebElement btnRegistrar;

	@FindBy(xpath = "//button[text()='Cadastrar']")
	private WebElement btnCadastrar;

	@FindBy(xpath = "//div[@class='card__register']//input[@name='email']")
	private WebElement campoEmailReg;

	@FindBy(name = "name")
	private WebElement campoNome;

	@FindBy(xpath = "//div[@class='card__register']//input[@name='password']")
	private WebElement campoSenhaReg;

	@FindBy(name = "passwordConfirmation")
	private WebElement campoSenhaConfirm;

	@FindBy(id = "toggleAddBalance")
	private WebElement btnCriarSaldo;

	@FindBy(id = "modalText")
	private WebElement contaUsuario;

	@FindBy(id = "btnCloseModal")
	private WebElement btnFecharConfirm;

	// MAPEANDO O LOGIN

	@FindBy(xpath = "//div[@class='card__login']//input[@name='email']")
	private WebElement campoEmailLogin;

	@FindBy(xpath = "//div[@class='card__login']//input[@name='password']")
	private WebElement campoSenhaLogin;

	@FindBy(xpath = "//button[text()='Acessar']")
	private WebElement btnAcessar;

		// LOGIN INVALIDO

	@FindBy(id = "btnCloseModal")
	private WebElement btnFecharLoginInvalido;

	// INSTRUCOES DO REGISTRO

	public void acionarBotaoRegistrar() {
		btnRegistrar.click();
	}

	public void informarEmailReg(String email) {
		campoEmailReg.sendKeys(email);
	}

	public void informarNome(String nome) {
		campoNome.sendKeys(nome);
	}

	public void informarSenhaReg(String senha) {
		campoSenhaReg.sendKeys(senha);
	}

	public void informarSenhaConfirm(String senhaConfirm) {
		campoSenhaConfirm.sendKeys(senhaConfirm);
	}

	public void acionarBotaoCriarSaldo() {
		btnCriarSaldo.click();
	}

	public void acionarBotaoCadastrar() {
		btnCadastrar.click();
	}

	public void acionarBotaoFecharConfirm() {
		WebElement esperar = wait.until(ExpectedConditions.visibilityOf(btnFecharConfirm)); //Esperar ate o botao aparecer em tela
		btnFecharConfirm.click();
	}

	// INSTRUCOES DO LOGIN

	public void informarSenhaLogin(String senha) {
		campoSenhaLogin.clear();
		campoSenhaLogin.sendKeys(senha);
	}

	public void informarEmailLogin(String email) {
		campoEmailLogin.clear();
		campoEmailLogin.sendKeys(email);
	}

	public void acionarBotaoAcessar() {
		btnAcessar.click();
	}

		// LOGIN INVALIDO

	public void acionarBotaoFecharLoginInvalido() {
		WebElement esperar = wait.until(ExpectedConditions.visibilityOf(btnFecharLoginInvalido)); //Esperar ate o botao aparecer em tela
		btnFecharLoginInvalido.click();
	}

	// FUNCIONALIDADE REGISTRO E LOGIN
	public void realizarRegistro(String email, String nome, String senha, String senhaConfirm) {
		btnRegistrar.click();
		campoEmailReg.clear();
		campoEmailReg.sendKeys(email);
		campoNome.clear();
		campoNome.sendKeys(nome);
		campoSenhaReg.clear();
		campoSenhaReg.sendKeys(senha);
		campoSenhaConfirm.clear();
		campoSenhaConfirm.sendKeys(senhaConfirm);
		btnCriarSaldo.click();
		btnCadastrar.click();
		WebElement esperar = wait.until(ExpectedConditions.visibilityOf(contaUsuario)); //Esperar ate a conta aparecer em tela
		conta = contaUsuario.getText();//Obter o numero da conta
		conta = conta.replaceAll("[^0-9]", ""); //Retirando outros caracteres e obtendo apenas os numeros
		obterConta(conta);//Salvado o numero da conta em variavel externa
		btnFecharConfirm.click();
	}

	public static String conta;
	public String obterConta(String conta) {
		return conta;
	} //Funcao para guardar o numero da conta

	public void realizarLogin(String email, String senha) {
		campoSenhaLogin.clear();
		campoSenhaLogin.sendKeys(senha);
		campoEmailLogin.clear();
		campoEmailLogin.sendKeys(email);
		btnAcessar.click();
	}
}
