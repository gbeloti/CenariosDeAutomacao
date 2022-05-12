package stepsDefinitions;

import static utils.Utils.*;
import static utils.Functions.*;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import pageObjects.PaginaInicialPage;

public class Hooks {

	
	@Before(value = "@registro")
	public void inicioSemRegistros() {
		acessarSistema();
	}
	
	@Before(value = "not @registro")
	public void setUp() {
		acessarSistema();
		
		//gerando valores de registro
		gerarNome(nome);
		gerarEmail(email);
		gerarSenha(senha);
		//começar o teste com uma conta registrada
		Na(PaginaInicialPage.class).registrarConta(email, nome, senha);
	}

	@After
	public void tearDown(Scenario scenario) {
//		capturarTela(scenario);
//		driver.quit();
	}

}
