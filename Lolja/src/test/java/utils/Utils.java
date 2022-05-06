package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.core.api.Scenario;

public class Utils {

	public static WebDriver driver;

	// Chamando o chrome driver para acessar o sistema
	public static void acessarSistema() {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("user-data-dir = C:\\Users\\gbelo\\AppData\\Local\\Google\\Chrome\\User Data\\Default");
		options.addArguments("disable-infobars");
		options.addArguments("--user-agent=Mozilla/5.0");
		driver.manage().window().maximize(); // Abrir com tela maximizada
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // Esperar até 5 segundos para abrir o site
		
		driver.get("https://www.lolja.com.br/"); // Site pretendido
	}

	public static <T> T Na(Class<T> classe) { // Criação de uma classe genérica "Na"
		return PageFactory.initElements(driver, classe);
	}

	public static void capturarTela(Scenario scenario) { // Screenshots dos cenários após sua conclusão
		final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(screenshot, "image/png");
	}
	
}
