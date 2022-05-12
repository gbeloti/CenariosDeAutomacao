package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Functions.*;
import static utils.Utils.*;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.UsuarioLogadoPage;

public class EmDesenvolvimentoSteps {

	@Quando("o usuario aciona o botao de pagamento")
	public void oUsuarioAcionaOBotaoDePagamento() {
		Na(UsuarioLogadoPage.class).acionarPagamento();
	}

	@Quando("o usuario aciona o botao de saque")
	public void oUsuarioAcionaOBotaoDeSaque() {
		Na(UsuarioLogadoPage.class).acionarSaque();
	}

	@Entao("o sistema exibe a mensagem de recurso em desenvolvimento")
	public void oSistemaExibeAMensagemDeRecursoEmDesenvolvimento() {
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("modalText"))));
		assertEquals("Funcionalidade em desenvolvimento", driver.findElement(By.id("modalText")).getText());
	}

}
