package utils;

import static utils.Utils.*;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Functions {

	// Função usada para esperar determinadas condições, com limite de 10 segundos
	public static WebDriverWait wait = new WebDriverWait(driver, 10);  
	
	// Função de ação. No geral para o uso de .perform()
	public static Actions agir = new Actions(driver);  
	
	// Função para o sistema aguardar até começar a próxima ação e melhor observação dos passos
	public static void sleep(int tempo) { 
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("Erro no sleep");
		}
	}
}

