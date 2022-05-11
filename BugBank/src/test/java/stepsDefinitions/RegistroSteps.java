package stepsDefinitions;

import static utils.Functions.*;
import static utils.Utils.*;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.PaginaInicialPage;

public class RegistroSteps {

	@Dado("que o usuario acesse o site BugBank")
	public void queOUsuarioAcesseOSiteBugBank() {
		assertTrue(driver.findElement(By.xpath("//h1")).getText().contains("bugs e falhas"));
	}

	@Quando("o usuario clicar no botao registrar")
	public void oUsuarioClicarNoBotaoRegistrar() {
		Na(PaginaInicialPage.class).acionarBtnRegistro();
	}

	@E("informar o <email>")
	public void informarOEmail() {
		Na(PaginaInicialPage.class).informarEmail();
	}

	@E("informar o <email> invalido")
	public void informarOEmailInvalido() {
		Na(PaginaInicialPage.class).informarEmailInvalido();
	}

	@E("informar o <nome>")
	public void informarONome() {
		Na(PaginaInicialPage.class).informarNome();
	}

	@E("informar a <senha>")
	public void informarASenha() {
		Na(PaginaInicialPage.class).informarSenha();
	}

	@E("informar a <confirmacao da senha>")
	public void informarAConfirmacaoDaSenha() {
		Na(PaginaInicialPage.class).informarConfirmacaoSenha();
		assertEquals(driver.findElement(By.xpath("//div[@class='card__register']//input[@name='password']")).getText(),
				driver.findElement(By.name("passwordConfirmation")).getText()); // conferindo se as senhas sao iguais
	}

	@E("informar a <confirmacao da senha> incorreta")
	public void informarAConfirmacaoDaSenhaIncorreta() {
		Na(PaginaInicialPage.class).informarConfirmacaoSenhaIncorreta();
	}
	
	@Quando("clicar no botao de criar conta com saldo")
	public void clicarNoBotaoDeCriarContaComSaldo() {
		Na(PaginaInicialPage.class).adicionarSaldo();
	}
	
	@E("clicar no botao cadastrar")
	public void clicarNoBotaoCadastrar() {
		Na(PaginaInicialPage.class).acionarBtnCadastrar();
	}

	@Entao("o sistema exibe a mensagem formato invalido")
	public void oSistemaExibeAMensagemFormatoInvalido() {
		assertEquals("Formato inválido", driver.findElement(By.xpath("(//p[@class='input__warging'])[3]")).getText());
	}

	@Entao("o sistema exibe a mensagem de campo obrigatorio para o email")
	public void oSistemaExibeAMensagemDeCampoObrigatorio() {
		assertEquals("É campo obrigatório",
				driver.findElement(By.xpath("(//p[@class='input__warging'])[3]")).getText());
	}

	@Entao("o sistema exibe a mensagem de campo obrigatorio para a senha")
	public void oSistemaExibeAMensagemDeCampoObrigatorioParaASenha() {
		assertEquals("É campo obrigatório",
				driver.findElement(By.xpath("(//p[@class='input__warging'])[5]")).getText());
	}
	
	@Entao("o sistema exibe a mensagem de campo obrigatorio para a senha de confirmacao")
	public void oSistemaExibeAMensagemDeCampoObrigatorioParaASenhaDeConfirmacao() {
		assertEquals("É campo obrigatório",
				driver.findElement(By.xpath("(//p[@class='input__warging'])[6]")).getText());
	}

	@Entao("o sistema exibe a mensagem de nome nao pode ser vazio")
	public void oSistemaExibeAMensagemDeNomeNaoPodeSerVazio() {
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("modalText"))));
		assertEquals("Nome não pode ser vazio.", driver.findElement(By.id("modalText")).getText());
	}
	
	@Entao("o sistema exibe a mensagem de erro de senhas diferentes")
	public void oSistemaExibeAMensagemDeErroDeSenhasDiferentes() {
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("modalText"))));
		assertEquals("As senhas não são iguais.", driver.findElement(By.id("modalText")).getText());
	}

	@Entao("o sistema exibe a mensagem de confirmacao de conta criada")
	public void oSistemaExibeAMensagemDeConfirmacaoDeContaCriada() {
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("modalText"))));
		assertTrue(driver.findElement(By.id("modalText")).getText().contains(numConta));
	}
}
