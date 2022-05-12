package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
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

public class TransferenciaSteps {

	@Quando("o usuario acionar o botao de transferencia")
	public void oUsuarioAcionarOBotaoDeTransferencia() {
		Na(UsuarioLogadoPage.class).acionarTransferencia();
	}

	@Quando("um segundo usuario for cadastrado")
	public void umSegundoUsuarioForCadastrado() {
		Na(UsuarioLogadoPage.class).acionarBtnSair();
		Na(PaginaInicialPage.class).registrarSegundoUser();
	}

	@E("o segundo usuario acessar sua conta")
	public void oSegundoUsuarioAcessarSuaConta() {
		assertFalse(driver.findElement(By.id("textAccountNumber")).getText().contains(numConta));
		assertFalse(driver.findElement(By.id("textName")).getText().contains(nome));
	}

	@E("infomar o numero da <conta>")
	public void infomarONumeroDaConta() {
		Na(UsuarioLogadoPage.class).informarConta();
	}

	@E("infomar o numero da <conta> errada")
	public void infomarONumeroDaContaErrada() {
		Na(UsuarioLogadoPage.class).informarContaErrada();
	}

	@E("infomar o numero da <conta> invalida")
	public void infomarONumeroDaContaInvalida() {
		Na(UsuarioLogadoPage.class).informarContaInvalida();
	}

	@E("infomar o numero da <conta> invalida com letras")
	public void infomarONumeroDaContaInvalidaComLetras() {
		Na(UsuarioLogadoPage.class).informarContaInvalidaLetras();
	}

	@E("infomar o numero da <conta> com digito invalido")
	public void infomarONumeroDaContaComDigitoInvalido() {
		Na(UsuarioLogadoPage.class).informarDigitoInvalido();
	}

	@E("infomar o numero da <conta> com digito com letras")
	public void infomarONumeroDaContaComDigitoComLetras() {
		Na(UsuarioLogadoPage.class).informarDigitoInvalidoaLetras();
	}

	@E("infomar o <valor> da transferencia")
	public void infomarOValorDaTransferencia() {
		Na(UsuarioLogadoPage.class).informarValor();
	}

	@E("infomar o <valor> da transferencia maior que o saldo")
	public void infomarOValorDaTransferenciaMaiorQueOSaldo() {
		Na(UsuarioLogadoPage.class).informarValorGrande();
	}

	@E("infomar o <valor> da transferencia como o saldo total")
	public void infomarOValorDaTransferenciaComoOSaldoTotal() {
		Na(UsuarioLogadoPage.class).informarValorTotal();
	}

	@E("infomar o <valor> zero da transferencia")
	public void infomarOValorZeroDaTransferencia() {
		Na(UsuarioLogadoPage.class).informarValorZero();
	}

	@E("infomar o <valor> negativo da transferencia")
	public void infomarOValorNegativoDaTransferencia() {
		Na(UsuarioLogadoPage.class).informarValorNegativo();
	}

	@E("infomar a <descricao> da transferencia")
	public void infomarADescricaoDaTransferencia() {
		Na(UsuarioLogadoPage.class).informarDescricao();
	}

	@E("acionar o botao de transferir")
	public void acionarOBotaoDeTransferir() {
		Na(UsuarioLogadoPage.class).acionarTransferir();
	}

	@E("o sistema validar a transferencia")
	public void oSistemaValidarATransferencia() {
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("modalText"))));
		assertEquals("Transferencia realizada com sucesso", driver.findElement(By.id("modalText")).getText());
	}

	@Entao("o usuario exibe a mensagem de conta invalida")
	public void oUsuarioExibeAMensagemDeContaInvalida() {
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("modalText"))));
		assertEquals("Conta inválida ou inexistente", driver.findElement(By.id("modalText")).getText());
	}

	@Entao("o usuario exibe a mensagem nao pode transferir pra mesma conta")
	public void oUsuarioExibeAMensagemDeNaoPodeTransferirParaMesmaConta() {
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("modalText"))));
		assertEquals("Nao pode transferir pra mesmo conta", driver.findElement(By.id("modalText")).getText());
	}

	@Entao("o usuario exibe a mensagem NaN")
	public void oUsuarioExibeAMensagemNaN() {
		assertTrue(driver.findElement(By.xpath("(//p[@class='input__warging'])[3]")).getText().contains("NaN"));
	}

	@Entao("o usuario exibe a mensagem de erro de valor")
	public void oUsuarioExibeAMensagemDeErroDeValor() {
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("modalText"))));
		assertEquals("Valor da transferência não pode ser 0 ou negativo",
				driver.findElement(By.id("modalText")).getText());
	}

	@Entao("o usuario valida a transferencia sem descricao pelo extrato")
	public void oUsuarioValidaATransferenciaSemDescricaoPeloExtrato() {
		Na(UsuarioLogadoPage.class).irParaExtrato();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("textDescription"))));
		assertEquals("-", driver.findElement(By.xpath("(//p[@id='textDescription'])[2]")).getText());
	}

	@Entao("o usuario exibe a mensagem de saldo insuficiente")
	public void oUsuarioExibeAMensagemDeSaldoInsuficiente() {
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("modalText"))));
		assertEquals("Você não tem saldo suficiente para essa transação",
				driver.findElement(By.id("modalText")).getText());
	}

	@Entao("o usuario valida a transferencia pelo extrato")
	public void oUsuarioValidaATransferenciaPeloExtrato() {
		Na(UsuarioLogadoPage.class).irParaExtrato();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("textBalanceAvailable"))));
		assertEquals("R$ 500,00", driver.findElement(By.id("textBalanceAvailable")).getText());

	}

	@Entao("o usuario valida a transferencia total pelo extrato")
	public void oUsuarioValidaATransferenciaTotalPeloExtrato() {
		Na(UsuarioLogadoPage.class).irParaExtrato();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("textBalanceAvailable"))));
		assertEquals("R$ 0,00", driver.findElement(By.id("textBalanceAvailable")).getText());
	}

}
