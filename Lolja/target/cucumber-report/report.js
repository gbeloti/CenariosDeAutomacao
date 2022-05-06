$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Carrinho.feature");
formatter.feature({
  "name": "Carrinho",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@carrinho"
    }
  ]
});
formatter.background({
  "name": "Acessar sistema",
  "description": "",
  "keyword": "Contexto"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que eu acesse o site",
  "keyword": "Dado "
});
formatter.match({
  "location": "CarrinhoSteps.queEuAcesseOSite()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Adicionar, editar e remover produtos do carrinho",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@carrinho"
    }
  ]
});
formatter.step({
  "name": "eu realizar uma busca de um produto",
  "keyword": "Quando "
});
formatter.match({
  "location": "CarrinhoSteps.euRealizarUmaBuscaDeUmProduto()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecionar o produto pretendido",
  "keyword": "E "
});
formatter.match({
  "location": "CarrinhoSteps.selecionarOProdutoPretendido()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "adicionar o produto ao carrinho",
  "keyword": "E "
});
formatter.match({
  "location": "CarrinhoSteps.adicionarOProdutoAoCarrinho()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "retorno para a pagina inicial",
  "keyword": "E "
});
formatter.match({
  "location": "CarrinhoSteps.retornoParaAPaginaInicial()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "aciono o carrinho",
  "keyword": "E "
});
formatter.match({
  "location": "CarrinhoSteps.acionoOCarrinho()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "altero a quantidade de produtos",
  "keyword": "E "
});
formatter.match({
  "location": "CarrinhoSteps.alteroAQuantidadeDeProdutos()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "removo o produto",
  "keyword": "E "
});
formatter.match({
  "location": "CarrinhoSteps.removoOProduto()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema valida que o carinho esta vazio",
  "keyword": "Entao "
});
formatter.match({
  "location": "CarrinhoSteps.oSistemaValidaQueOCarinhoEstVazio()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});