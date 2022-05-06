package utils;

import static utils.Utils.*;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Functions {

	// Fun��o usada para esperar determinadas condi��es, com limite de 10 segundos
	public static WebDriverWait wait = new WebDriverWait(driver, 10);  
	
	// Fun��o de a��o. No geral para o uso de .perform()
	public static Actions agir = new Actions(driver);  
	
	// Fun��o para o sistema aguardar at� come�ar a pr�xima a��o e melhor observa��o dos passos
	public static void sleep(int tempo) { 
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("Erro no sleep");
		}
	}
}

