package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.BasePage;
import pageObjects.InicialPage;

public class ExtratoSteps {

	@Quando("eu registro o usuario")
	public void euRegistroOUsuario() {
		Na(InicialPage.class).realizarRegistro("regina@gmail.com", "Regina", "123456", "123456");
	}

	@Quando("realizo o login")
	public void facoOLogin() {
		Na(InicialPage.class).realizarLogin("regina@gmail.com", "123456");
	}

	@E("aciono o botao de extrato")
	public void clicoNoBotaoDeExtrato() {
		Na(BasePage.class).acionarBotaoExtrato();
	}

	@Entao("o sistema mostra o extrato")
	public void oSistemaMostraOExtrato() {
		assertEquals(true, driver.findElement(By.id("textBalanceAvailable")).isEnabled());
	}

}
