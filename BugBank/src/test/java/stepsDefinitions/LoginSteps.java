package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.InicialPage;

public class LoginSteps {

	@Quando("informar o email de login {string}")
	public void informarOEmailDeLogin(String email) {
		Na(InicialPage.class).informarEmailLogin(email);
	}

	@Quando("informar a senha de login {string}")
	public void informarASenhaDeLogin(String senha) {
		Na(InicialPage.class).informarSenhaLogin(senha);
	}

	@Quando("clicar no botao acessar")
	public void clicarNoBotaoAcessar() {
		Na(InicialPage.class).acionarBotaoAcessar();
	}

	@Entao("o sistema exibe o usuario logado")
	public void oSistemaExibeOUsuarioLogado() {
		assertEquals("Olá Maria,", driver.findElement(By.id("textName")).getText());
//	    System.out.println("-- Usuario Logado --");
	}

	@Entao("o sistema exibe a mensagem de usuario ou senha invalidos")
	public void oSistemaExibeAMensagemDeUsuarioOuSenhaInvalido() {
		assertEquals(true, driver.findElement(By.id("modalText")).isEnabled());
		Na(InicialPage.class).acionarBotaoFecharLoginInvalido();
//	    System.out.println("-- Login Invalido --");
	}
}
