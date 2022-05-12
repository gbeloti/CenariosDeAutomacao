package stepsDefinitions;

import static utils.Utils.*;
import static utils.Functions.*;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import pageObjects.PaginaInicialPage;

public class Hooks {

	@Before(order = 0)
	public void abrirDriver() {
		acessarSistema();
	}

	@Before(value = "@extrato_comSaldo", order = 1)
	public void logarComSaldo() {
		// gerando valores de registro
		gerarNome(nome);
		gerarEmail(email);
		gerarSenha(senha);

		// começar o teste com uma conta registrada
		Na(PaginaInicialPage.class).registrarContaComSaldo(email, nome, senha);
	}

	@Before(value = "not @registro and not @extrato_comSaldo", order = 2)
	public void registrar() {
		gerarNome(nome);
		gerarEmail(email);
		gerarSenha(senha);
		Na(PaginaInicialPage.class).registrarContaSemSaldo(email, nome, senha);
	}

	@Before(value = "not @registro and not @login", order = 3)
	public void logar() {
		Na(PaginaInicialPage.class).realizarLogin();
	}

	@After
	public void tearDown(Scenario scenario) {
		sleep(2000);
		capturarTela(scenario);
		driver.quit();
	}

}
