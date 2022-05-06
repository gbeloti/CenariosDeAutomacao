package stepsDefinitions;

import static org.junit.Assert.assertTrue;
import static utils.Utils.*;
import org.openqa.selenium.By;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CarrinhoPage;
import pageObjects.PaginaInicialPage;
import pageObjects.ProdutoPage;
import pageObjects.ResultadoPage;

public class CarrinhoSteps {

	@Dado("que eu acesse o site")
	public void queEuAcesseOSite() {
		assertTrue(driver.findElement(By.xpath("//a[text()='Somos a Lolja!']")).getText().contains("Somos a Lolja!"));
	}

	@Quando("eu realizar uma busca de um produto")
	public void euRealizarUmaBuscaDeUmProduto() {
		Na(PaginaInicialPage.class).pesquisarProduto();
	}

	@E("selecionar o produto pretendido")
	public void selecionarOProdutoPretendido() {
		Na(ResultadoPage.class).selecionarProduto();
	}

	@E("adicionar o produto ao carrinho")
	public void adicionarOProdutoAoCarrinho() {
		assertTrue(driver.findElement(By.xpath("//span[@class='crumb active']")).getText()
				.contains("CAMISETA PRETA - DARKNESS"));
		Na(ProdutoPage.class).escolherDetalhesDoProduto();
	}

	@E("retorno para a pagina inicial")
	public void retornoParaAPaginaInicial() {
		Na(ProdutoPage.class).voltarPaginaInicial();
	}

	@E("aciono o carrinho")
	public void acionoOCarrinho() {
		assertTrue(driver.findElement(By.xpath("//a[text()='Somos a Lolja!']")).getText().contains("Somos a Lolja!"));
		Na(PaginaInicialPage.class).acionarCarrinho();
	}

	@E("altero a quantidade de produtos")
	public void alteroAQuantidadeDeProdutos() {
		assertTrue(driver.findElement(By.xpath("//div[text()[contains(.,'Carrinho de Compras')]]")).getText()
				.contains("Carrinho de Compras"));
		Na(CarrinhoPage.class).alterarQuantidade();
	}

	@E("removo o produto")
	public void removoOProduto() {
		Na(CarrinhoPage.class).excluirProduto();
	}

	@Entao("o sistema valida que o carinho esta vazio")
	public void oSistemaValidaQueOCarinhoEstVazio() {
		assertTrue(driver.findElement(By.xpath("//*[text()[contains(.,'vazio')]]")).isEnabled());
	}

	@E("o sistema valida que o produto foi adicionado")
	public void oSistemaValidaQueOProdutoFoiAdicionado() {
		assertTrue(driver.findElement(By.xpath("//input[@value='Finalizar Compra']")).getText()
			.contains("Finalizar Compra"));
}
}
