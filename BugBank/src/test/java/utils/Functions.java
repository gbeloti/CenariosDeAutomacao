package utils;

import static utils.Utils.driver;

import java.util.Locale;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.javafaker.Faker;

public class Functions {

	// Funcao usada para esperar determinadas condicoes, com limite de 5 segundos
	public static WebDriverWait wait = new WebDriverWait(driver, 5);

	// Funcao para o sistema aguardar ate comecar a proxima acao e melhor observacao
	// dos passos
	public static void sleep(int tempo) {
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("Erro no sleep");
		}
	}

	// Funcao para gerar nomes e email aleatorios
	public static Faker faker = new Faker(new Locale("pt-BR"));

	// Informacoes a serem coletadas e/ou geradas
	public static String nome;
	public static String email;
	public static String senha;
	public static String conta;
	public static String numConta;
	public static String numDigito;
	
	public static String gerarNome(String gerNome) {
		nome = faker.name().fullName();
		return nome;
	} // Funcao para gerar e guardar o nome
	
	public static String gerarEmail(String getEmail) {
		email = faker.internet().emailAddress();
		return email;
	} // Funcao para gerar e guardar o email
	
	public static String gerarSenha(String gerSenha) {
		senha = faker.internet().password();
		return senha;
	} // Funcao para gerar e guardar a senha

	public static String obterSenha(String obterSenha) {
		return senha;
	} // Funcao para guardar a senha
	
	public static String obterNumConta(String obterConta) {
		numConta = conta.substring(0, conta.length() - 1); // Retirando o digito do numero da conta
		return numConta;
	} // Funcao para guardar os numeros da conta

	public static String obterNumDigito(String obterNumero) {
		numDigito = conta.substring(conta.length() - 1);// Retirando os numeros da conta e mantendo apenas o digito, ultimo numero
		return numDigito;
	} // Funcao para guardar o digito

}
