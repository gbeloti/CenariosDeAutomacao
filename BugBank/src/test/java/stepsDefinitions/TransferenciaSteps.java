package stepsDefinitions;

import static utils.Utils.*;

import org.openqa.selenium.By;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.BasePage;
import pageObjects.InicialPage;

import static org.junit.Assert.assertEquals;
import static pageObjects.InicialPage.conta;

public class TransferenciaSteps {

	@Quando("eu registro o primeiro usuario")
	public void euRegistroOPrimeiroUsuario() {
		Na(InicialPage.class).realizarRegistro("fulano@gmail.com", "Fulano", "123", "123");
	}

	@Quando("eu registro o segundo usuario")
	public void euRegistroOSegundoUsuario() {
		Na(InicialPage.class).realizarRegistro("sicrano@gmail.com", "Sicrano", "321", "321");
	}

	@Quando("realizo o login do segundo usuario")
	public void realizoOLoginDoSegundoUsuario() {
		Na(InicialPage.class).realizarLogin("fulano@gmail.com", "123");
		Na(BasePage.class).numeroConta(conta); 
		// Funcao para obter o numero da conta, ja que ele e feito aleatoriamente a cada sessao.
	}

	@Quando("eu aciono o botao de transferencia")
	public void euAcionoOBotaoDeTransferencia() {
		Na(BasePage.class).acionarBotaoTransferencia();
	}

	@Quando("informo o numero da conta do primeiro usuario")
	public void informoONumeroDaContaDoPrimeiroUsuario() {
		Na(BasePage.class).informarNumeroConta(conta);
		Na(BasePage.class).informarNumeroDigito(conta);
	}

	@Quando("informo o valor da transferencia")
	public void informoOValorDaTransferencia() {
		Na(BasePage.class).informarValor("500");
	}

	@Quando("informo a descricao {string}")
	public void informoADescricao(String descricao) {
		Na(BasePage.class).informarDescricao(descricao);
	}

	@Quando("aciono o botao de transferir agora")
	public void acionoOBotaoDeTransferirAgora() {
		Na(BasePage.class).acionarBotaoTransferir();
	}

	@Entao("o sistema valida minha transferencia")
	public void oSistemaValidaMinhaTransferencia() {
		assertEquals(true, driver.findElement(By.id("modalText")).isEnabled());
		Na(BasePage.class).acionarBotaoFecharTransferencia();
	}

	@Entao("eu confiro o extrato")
	public void euConfiroOExtrato() {
		Na(BasePage.class).acionarBotaoVoltar();
		Na(BasePage.class).acionarBotaoExtrato();
		assertEquals(true, driver.findElement(By.id("textBalanceAvailable")).isEnabled());
	}

	@E("^informo o numero da conta errada do primeiro usuario$")
	public void informoONumeroDaContaErradaDoPrimeiroUsuario() {
		Na(BasePage.class).informarNumeroConta("0001");
		Na(BasePage.class).informarNumeroDigito("3");
	}

	@Entao("^o sistema nao valida minha transferencia$")
	public void oSistemaNaoValidaMinhaTransferencia() {
		assertEquals(true, driver.findElement(By.id("modalText")).isEnabled());
		Na(BasePage.class).acionarBotaoFecharTransferencia();
	}

	@E("^informo o valor da transferencia maior que o saldo$")
	public void informoOValorDaTransferenciaMaiorQueOSaldo() {
		Na(BasePage.class).informarValor("1500");
	}

}
