package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:target/cucumber-report"},
		features = "src/test/resources/features",
		glue = "stepsDefinitions",
//		tags = "@registroELogin", //feature completa
//		tags = "@loginInvalido",
//		tags = "@saldoInsuficiente",
//		tags = "@registrarSenhaErrada",
//		tags = "@registrar",
//		tags = "@login",
//		tags = "@extrato", //feature completa
//		tags = "@transferencia", //feature completa
//		tags = "@transferenciaValida",
//		tags = "@contaErrada"
//		tags = "@saldoInsuficiente",
		snippets = SnippetType.CAMELCASE,
		monochrome = true,
		dryRun = false
		)

public class RunnerTest {}
