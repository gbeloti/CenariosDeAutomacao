package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import pageObjects.InicialPage;
import static pageObjects.InicialPage.numElementos;

public class ToDoSteps {
	
	InicialPage tela = new InicialPage(driver);
	
	@Dado("que eu acesse o app Microsoft To Do")
	public void queEuAcesseOAppMicrosoftToDo() throws Exception {
		tela.informarEmail();
		tela.informarSenha();
		tela.numeroElementosTelaInicio();
	}
	
	@E("eu crie uma lista chamada {string}")
	public void crieUmaListaChamada(String title) throws Exception {
		tela.criarLista(title);
		assertEquals(title, driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc='Lista1']")).getAttribute("content-desc"));
	}

	@E("edite o nome dessa lista para {string}")
	public void editeONomeDessaListaPara(String newTitle) throws Exception {
		tela.editarLista(newTitle);
		assertEquals(newTitle, driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc='ListaTeste']")).getAttribute("content-desc"));
	}

	@E("adiciono uma tarefa a essa lista chamada {string}")
	public void adicionoUmaTarefaAEssaLista(String tarefa) throws Exception {
		tela.adicionarTarefa(tarefa);
		assertEquals(tarefa, driver.findElement(By.id("com.microsoft.todos:id/task_title")).getText());
	}

	@E("excluo a tarefa criada")
	public void excluoATarefaCriada() throws Exception {
		tela.excluirTarefa();
	}

	@E("excluo a lista")
	public void excluoALista() throws Exception {
		tela.deletarLista();
	}

	@Entao("valido a exclusao")
	public void validoAExclusao() throws Exception {
		assertEquals(numElementos, tela.numeroElementosTelaFim());
		//Comparacao do numero de elementos em tela após o login e depois da exclusao da lista. 
		//Se o numero de elementos for igual, a lista foi apagada.
	}


}
