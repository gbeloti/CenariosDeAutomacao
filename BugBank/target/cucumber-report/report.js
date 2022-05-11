$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Registro.feature");
formatter.feature({
  "name": "Registro",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@registro"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Contexto"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que o usuario acesse o site BugBank",
  "keyword": "Dado "
});
formatter.match({
  "location": "RegistroSteps.queOUsuarioAcesseOSiteBugBank()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "conta sem saldo",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@registro"
    },
    {
      "name": "@registrar_contaSemSaldo"
    }
  ]
});
formatter.step({
  "name": "o usuario clicar no botao registrar",
  "keyword": "Quando "
});
formatter.match({
  "location": "RegistroSteps.oUsuarioClicarNoBotaoRegistrar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar o \u003cemail\u003e",
  "keyword": "E "
});
formatter.match({
  "location": "RegistroSteps.informarOEmail()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar o \u003cnome\u003e",
  "keyword": "E "
});
formatter.match({
  "location": "RegistroSteps.informarONome()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar a \u003csenha\u003e",
  "keyword": "E "
});
formatter.match({
  "location": "RegistroSteps.informarASenha()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar a \u003cconfirmacao da senha\u003e",
  "keyword": "E "
});
formatter.match({
  "location": "RegistroSteps.informarAConfirmacaoDaSenha()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no botao cadastrar",
  "keyword": "E "
});
formatter.match({
  "location": "RegistroSteps.clicarNoBotaoCadastrar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema exibe a mensagem de confirmacao de conta criada",
  "keyword": "Entao "
});
formatter.match({
  "location": "RegistroSteps.oSistemaExibeAMensagemDeConfirmacaoDeContaCriada()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});