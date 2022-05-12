package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utils.Functions.*;
import static utils.Utils.*;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.UsuarioLogadoPage;

public class ExtratoSteps {

	@Quando("o usuario acessa sua conta sem saldo")
	public void oUsuarioAcessaSuaContaSemSaldo() {
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("textBalance"))));
		assertTrue(driver.findElement(By.id("textBalance")).getText().contains("R$ 0,00"));
	}

	@Quando("o usuario acessa sua conta com saldo")
	public void oUsuarioAcessaSuaContaComSaldo() {
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("textBalance"))));
		assertTrue(driver.findElement(By.id("textBalance")).getText().contains("R$ 1.000,00"));
	}

	@E("aciona o botao de extrato")
	public void acionaOBotaoDeExtrato() {
		Na(UsuarioLogadoPage.class).acionarExtrato();
	}

	@Entao("o sistema exibe o extrato sem saldo")
	public void oSistemaExibeOExtratoComSaldo() {
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("textBalanceAvailable"))));
		assertEquals("R$ 0,00", driver.findElement(By.id("textBalanceAvailable")).getText());
	}

	@Quando("o sistema exibe o extrato com saldo")
	public void oSistemaExibeOExtratoSemSaldo() {
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("textBalanceAvailable"))));
		assertEquals("R$ 1.000,00", driver.findElement(By.id("textBalanceAvailable")).getText());
	}

}
