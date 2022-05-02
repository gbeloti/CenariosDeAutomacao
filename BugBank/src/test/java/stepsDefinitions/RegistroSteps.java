package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.InicialPage;

public class RegistroSteps {

	@Quando("clicar no botao registrar")
	public void clicarNoBotaoRegistrar() {
		Na(InicialPage.class).acionarBotaoRegistrar();
	}

	@Quando("informar o email {string}")
	public void informarOEmail(String email) {
		Na(InicialPage.class).informarEmailReg(email);
	}

	@Quando("informar o nome {string}")
	public void informarONome(String nome) {
		Na(InicialPage.class).informarNome(nome);
	}

	@Quando("informar a senha {string}")
	public void informarASenha(String senha) {
		Na(InicialPage.class).informarSenhaReg(senha);
	}

	@Quando("informar a confirmacao da senha {string}")
	public void informarAConfirmacaoDaSenha(String senhaConfirm) {
		Na(InicialPage.class).informarSenhaConfirm(senhaConfirm);
	}

	@Quando("clicar no botao de criar conta com saldo")
	public void clicarNoBotaoDeCriarContaComSaldo() {
		Na(InicialPage.class).acionarBotaoCriarSaldo();
	}

	@Quando("clicar no botao cadastrar")
	public void clicarNoBotaoCadastrar() {
		Na(InicialPage.class).acionarBotaoCadastrar();
	}

	@Quando("o sistema exibe a mensagem de confirmacao de conta criada")
	public void oSistemaExibeAMensagemDeConfirmacaoDeContaCriada() {
		assertEquals(true, driver.findElement(By.id("modalText")).isEnabled());
		Na(InicialPage.class).acionarBotaoFecharConfirm();
	}

	@Entao("o sistema exibe a mensagem de erro de senhas diferentes")
	public void oSistemaExibeAMensagemDeErroDeSenhasDiferentes() {
		assertEquals(true, driver.findElement(By.id("modalText")).isEnabled());
		Na(InicialPage.class).acionarBotaoFecharLoginInvalido();
	}

}
