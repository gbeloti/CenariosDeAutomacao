$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@login"
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
  "name": "login e deslogin",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@login_deslogin"
    }
  ]
});
formatter.step({
  "name": "o usuario informar o \u003cemail\u003e de login",
  "keyword": "Quando "
});
formatter.match({
  "location": "LoginSteps.oUsuarioInformarOEmailDeLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar a \u003csenha\u003e de login",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.informarASenhaDeLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "acionar o botao de acessar",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.acionarOBotaoDeAcessar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema exibe o usuario logado",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.oSistemaExibeOUsuarioLogado()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o usuario acionar o botao de sair",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.oUsuarioAcionarOBotaoDeSair()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema exibe o usuario deslogado",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginSteps.oSistemaExibeOUsuarioDeslogado()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});