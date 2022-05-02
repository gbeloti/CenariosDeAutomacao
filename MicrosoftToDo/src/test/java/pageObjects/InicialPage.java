package pageObjects;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class InicialPage {

	public InicialPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "com.microsoft.todos:id/email_phone_edit_text")
	private MobileElement campoEmail;

	@AndroidFindBy(id = "com.microsoft.todos:id/sign_in_button")
	private MobileElement btnSignInEmail;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Enter the password for teste.gbs@hotmail.com Enter password ']")
	private MobileElement campoSenha;
		
	@AndroidFindBy(accessibility = "Sign in")
	private MobileElement btnSignInSenha;
	
	@AndroidFindBy(id = "com.microsoft.todos:id/create_list_text_view")
	private MobileElement btnNewList;
	
	@AndroidFindBy(id = "com.microsoft.todos:id/edit_text")
	private MobileElement campoListTitle;
	
	@AndroidFindBy(id = "android:id/button1")
	private MobileElement btnCreatList;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='SAVE']")
	private MobileElement btnSave;
	
	@AndroidFindBy(accessibility = "More options")
	private MobileElement btnMoreOptions;
	
	@AndroidFindBy(xpath = "//android.widget.ListView//android.widget.LinearLayout")
	private List<MobileElement> menuOptions;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='DELETE']")
	private MobileElement btnDelete;
	
	@AndroidFindBy(accessibility = "Add a task")
	private MobileElement btnAddATask;
	
	@AndroidFindBy(id = "com.microsoft.todos:id/create_task_edit_text")
	private MobileElement campoAddATask;
	
	@AndroidFindBy(id = "com.microsoft.todos:id/task_title")
	private MobileElement iconeTarefaCriada;
	
	@AndroidFindBy(accessibility = "Delete task")
	private MobileElement btnDeleteTask;
	
	@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView//android.view.ViewGroup")
	private List<MobileElement> telaInicialList;
	

	public void informarEmail() throws Exception {
		campoEmail.sendKeys("teste.gbs@hotmail.com"); //e-mail que fiz para o desafio
		btnSignInEmail.click();
		Thread.sleep(5000);
	}
	
	public void informarSenha() throws Exception {
		campoSenha.sendKeys("leYmeEfnfARn"); //senha gerada aleatoriamente
		btnSignInSenha.click();
		Thread.sleep(5000);
	}

	public void criarLista(String title) throws Exception {
		btnNewList.click();
		Thread.sleep(500);
		campoListTitle.sendKeys(title);
		btnCreatList.click();
		Thread.sleep(500);
	}
	
	public void editarLista(String newTitle) throws Exception {
		btnMoreOptions.click();
		menuOptions.get(1).click();
		Thread.sleep(500);
		campoListTitle.sendKeys(newTitle);
		btnSave.click();
		Thread.sleep(500);
	}
	
	public void adicionarTarefa(String tarefa) throws Exception {
		btnAddATask.click();
		Thread.sleep(500);
		campoAddATask.sendKeys(tarefa);
		btnAddATask.click();
		Thread.sleep(500);
	}
	
	public void excluirTarefa() throws Exception {
		iconeTarefaCriada.click();
		btnDeleteTask.click();
		Thread.sleep(500);
		btnDelete.click();	
		Thread.sleep(500);
	}
	
	public void deletarLista() throws Exception {
		btnMoreOptions.click();
		menuOptions.get(13).click();
		Thread.sleep(500);
		btnDelete.click();	
		Thread.sleep(500);
	}
	
	public static int numElementos;
	public int capturarNumElementos(int numElementos) {
		return numElementos;
	}
	
	public void numeroElementosTelaInicio() {
		numElementos = telaInicialList.size();
	}
	
	public int numeroElementosTelaFim() {
		return telaInicialList.size();
	}
	
}
