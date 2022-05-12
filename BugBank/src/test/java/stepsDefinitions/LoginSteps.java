package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static utils.Functions.*;
import static utils.Utils.*;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.PaginaInicialPage;
import pageObjects.UsuarioLogadoPage;

public class LoginSteps {

	@Quando("o usuario informar o <email> de login")
	public void oUsuarioInformarOEmailDeLogin() {
		Na(PaginaInicialPage.class).informarEmailLogin();
	}

	@Quando("o usuario informar o <email> de login incorreto")
	public void oUsuarioInformarOEmailDeLoginIncorreto() {
		Na(PaginaInicialPage.class).emailIncorreto();
		assertNotEquals(email,
				driver.findElement(By.xpath("//div[@class='card__login']//input[@name='email']")).getText());
	}

	@E("informar a <senha> de login")
	public void informarASenhaDeLogin() {
		Na(PaginaInicialPage.class).informarSenhaLogin();
	}

	@E("informar a <senha> de login incorreta")
	public void informarASenhaDeLoginIncorreta() {
		Na(PaginaInicialPage.class).senhaIncorreta();
		assertNotEquals(senha,
				driver.findElement(By.xpath("//div[@class='card__login']//input[@name='password']")).getText());
	}

	@E("acionar o botao de acessar")
	public void acionarOBotaoDeAcessar() {
		Na(PaginaInicialPage.class).acionarBtnAcessar();
	}

	@E("o usuario acionar o botao de sair")
	public void oUsuarioAcionarOBotaoDeSair() {
		Na(UsuarioLogadoPage.class).acionarBtnSair();
	}

	@Entao("o sistema exibe a mensagem de usuario ou senha invalidos")
	public void oSistemaExibeAMensagemDeUsuarioOuSenhaInvalidos() {
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("modalText"))));
		assertTrue(driver.findElement(By.id("modalText")).getText().contains("Usuário ou senha inválido"));
	}

	@Entao("o sistema exibe a mensagem de campo obrigatorio para o email de login")
	public void oSistemaExibeAMensagemDeCampoObrigatorioParaOEmailDeLogin() {
		assertEquals("É campo obrigatório",
				driver.findElement(By.xpath("(//p[@class='input__warging'])[1]")).getText());
	}

	@Entao("o sistema exibe a mensagem de campo obrigatorio para a senha de login")
	public void oSistemaExibeAMensagemDeCampoObrigatorioParaASenhaDeLogin() {
		assertEquals("É campo obrigatório",
				driver.findElement(By.xpath("(//p[@class='input__warging'])[2]")).getText());
	}

	@Entao("o sistema exibe a mensagem de campos obrigatorios")
	public void oSistemaExibeAMensagemDeCamposObrigatorios() {
		assertEquals("É campo obrigatório",
				driver.findElement(By.xpath("(//p[@class='input__warging'])[1]")).getText());
		assertEquals("É campo obrigatório",
				driver.findElement(By.xpath("(//p[@class='input__warging'])[2]")).getText());
	}

	@Entao("o sistema exibe o usuario logado")
	public void oSistemaExibeOUsuarioLogado() {
		assertTrue(driver.findElement(By.id("textAccountNumber")).getText().contains(numConta));
		assertTrue(driver.findElement(By.id("textName")).getText().contains(nome));
	}

	@Entao("o sistema exibe o usuario deslogado")
	public void oSistemaExibeOUsuarioDeslogado() {
		assertTrue(driver.findElement(By.xpath("//h1")).getText().contains("bugs e falhas"));
	}

}
