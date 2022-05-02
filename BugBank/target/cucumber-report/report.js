$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Extrato.feature");
formatter.feature({
  "name": "Conferir extrato",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@extrato"
    }
  ]
});
formatter.scenario({
  "name": "efetuar registro e login para conferir extrato",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@extrato"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "eu registro o usuario",
  "keyword": "Quando "
});
formatter.match({
  "location": "ExtratoSteps.euRegistroOUsuario()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "realizo o login",
  "keyword": "E "
});
formatter.match({
  "location": "ExtratoSteps.facoOLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "aciono o botao de extrato",
  "keyword": "E "
});
formatter.match({
  "location": "ExtratoSteps.clicoNoBotaoDeExtrato()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema mostra o extrato",
  "keyword": "Entao "
});
formatter.match({
  "location": "ExtratoSteps.oSistemaMostraOExtrato()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/RegistroELogin.feature");
formatter.feature({
  "name": "Registro e Login",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@registroELogin"
    }
  ]
});
formatter.scenario({
  "name": "Login Invalido",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@registroELogin"
    },
    {
      "name": "@loginInvalido"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "informar o email de login \"emailerrado@gmail.com\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "LoginSteps.informarOEmailDeLogin(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar a senha de login \"123456\"",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.informarASenhaDeLogin(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no botao acessar",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.clicarNoBotaoAcessar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema exibe a mensagem de usuario ou senha invalidos",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginSteps.oSistemaExibeAMensagemDeUsuarioOuSenhaInvalido()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", null);
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Registrar Primeiro Usuario",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@registroELogin"
    },
    {
      "name": "@registrarSenhaErrada"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "clicar no botao registrar",
  "keyword": "Quando "
});
formatter.match({
  "location": "RegistroSteps.clicarNoBotaoRegistrar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar o email \"Dalessandro@gmail.com\"",
  "keyword": "E "
});
formatter.match({
  "location": "RegistroSteps.informarOEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar o nome \"Dalessandro\"",
  "keyword": "E "
});
formatter.match({
  "location": "RegistroSteps.informarONome(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar a senha \"1909\"",
  "keyword": "E "
});
formatter.match({
  "location": "RegistroSteps.informarASenha(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar a confirmacao da senha \"1099\"",
  "keyword": "E "
});
formatter.match({
  "location": "RegistroSteps.informarAConfirmacaoDaSenha(String)"
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
  "name": "o sistema exibe a mensagem de erro de senhas diferentes",
  "keyword": "Entao "
});
formatter.match({
  "location": "RegistroSteps.oSistemaExibeAMensagemDeErroDeSenhasDiferentes()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png", null);
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Registrar Usuario com Sucesso",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@registroELogin"
    },
    {
      "name": "@registrar"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "clicar no botao registrar",
  "keyword": "Quando "
});
formatter.match({
  "location": "RegistroSteps.clicarNoBotaoRegistrar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar o email \"guilherme@gmail.com\"",
  "keyword": "E "
});
formatter.match({
  "location": "RegistroSteps.informarOEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar o nome \"Guilherme\"",
  "keyword": "E "
});
formatter.match({
  "location": "RegistroSteps.informarONome(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar a senha \"123456\"",
  "keyword": "E "
});
formatter.match({
  "location": "RegistroSteps.informarASenha(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar a confirmacao da senha \"123456\"",
  "keyword": "E "
});
formatter.match({
  "location": "RegistroSteps.informarAConfirmacaoDaSenha(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no botao de criar conta com saldo",
  "keyword": "E "
});
formatter.match({
  "location": "RegistroSteps.clicarNoBotaoDeCriarContaComSaldo()"
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
formatter.embedding("image/png", "embedded3.png", null);
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Registrar e Realizar Login",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@registroELogin"
    },
    {
      "name": "@login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "clicar no botao registrar",
  "keyword": "Quando "
});
formatter.match({
  "location": "RegistroSteps.clicarNoBotaoRegistrar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar o email \"maria@gmail.com\"",
  "keyword": "E "
});
formatter.match({
  "location": "RegistroSteps.informarOEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar o nome \"Maria\"",
  "keyword": "E "
});
formatter.match({
  "location": "RegistroSteps.informarONome(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar a senha \"654321\"",
  "keyword": "E "
});
formatter.match({
  "location": "RegistroSteps.informarASenha(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar a confirmacao da senha \"654321\"",
  "keyword": "E "
});
formatter.match({
  "location": "RegistroSteps.informarAConfirmacaoDaSenha(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no botao de criar conta com saldo",
  "keyword": "E "
});
formatter.match({
  "location": "RegistroSteps.clicarNoBotaoDeCriarContaComSaldo()"
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
formatter.step({
  "name": "informar o email de login \"maria@gmail.com\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "LoginSteps.informarOEmailDeLogin(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar a senha de login \"654321\"",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.informarASenhaDeLogin(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no botao acessar",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.clicarNoBotaoAcessar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema exibe o usuario logado",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginSteps.oSistemaExibeOUsuarioLogado()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded4.png", null);
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/Transferencia.feature");
formatter.feature({
  "name": "Realizar Transferencia",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@transferencia"
    }
  ]
});
formatter.scenario({
  "name": "realizar transferencia",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@transferencia"
    },
    {
      "name": "@transferenciaValida"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "eu registro o primeiro usuario",
  "keyword": "Quando "
});
formatter.match({
  "location": "TransferenciaSteps.euRegistroOPrimeiroUsuario()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu registro o segundo usuario",
  "keyword": "E "
});
formatter.match({
  "location": "TransferenciaSteps.euRegistroOSegundoUsuario()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "realizo o login do segundo usuario",
  "keyword": "E "
});
formatter.match({
  "location": "TransferenciaSteps.realizoOLoginDoSegundoUsuario()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu aciono o botao de transferencia",
  "keyword": "E "
});
formatter.match({
  "location": "TransferenciaSteps.euAcionoOBotaoDeTransferencia()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo o numero da conta do primeiro usuario",
  "keyword": "E "
});
formatter.match({
  "location": "TransferenciaSteps.informoONumeroDaContaDoPrimeiroUsuario()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo o valor da transferencia",
  "keyword": "E "
});
formatter.match({
  "location": "TransferenciaSteps.informoOValorDaTransferencia()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo a descricao \"Teste transferencia\"",
  "keyword": "E "
});
formatter.match({
  "location": "TransferenciaSteps.informoADescricao(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "aciono o botao de transferir agora",
  "keyword": "E "
});
formatter.match({
  "location": "TransferenciaSteps.acionoOBotaoDeTransferirAgora()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema valida minha transferencia",
  "keyword": "E "
});
formatter.match({
  "location": "TransferenciaSteps.oSistemaValidaMinhaTransferencia()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu confiro o extrato",
  "keyword": "Entao "
});
formatter.match({
  "location": "TransferenciaSteps.euConfiroOExtrato()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded5.png", null);
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "realizar transferencia para conta errada",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@transferencia"
    },
    {
      "name": "@contaErrada"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "eu registro o primeiro usuario",
  "keyword": "Quando "
});
formatter.match({
  "location": "TransferenciaSteps.euRegistroOPrimeiroUsuario()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu registro o segundo usuario",
  "keyword": "E "
});
formatter.match({
  "location": "TransferenciaSteps.euRegistroOSegundoUsuario()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "realizo o login do segundo usuario",
  "keyword": "E "
});
formatter.match({
  "location": "TransferenciaSteps.realizoOLoginDoSegundoUsuario()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu aciono o botao de transferencia",
  "keyword": "E "
});
formatter.match({
  "location": "TransferenciaSteps.euAcionoOBotaoDeTransferencia()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo o numero da conta errada do primeiro usuario",
  "keyword": "E "
});
formatter.match({
  "location": "TransferenciaSteps.informoONumeroDaContaErradaDoPrimeiroUsuario()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo o valor da transferencia",
  "keyword": "E "
});
formatter.match({
  "location": "TransferenciaSteps.informoOValorDaTransferencia()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo a descricao \"Teste Conta Errada\"",
  "keyword": "E "
});
formatter.match({
  "location": "TransferenciaSteps.informoADescricao(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "aciono o botao de transferir agora",
  "keyword": "E "
});
formatter.match({
  "location": "TransferenciaSteps.acionoOBotaoDeTransferirAgora()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema nao valida minha transferencia",
  "keyword": "Entao "
});
formatter.match({
  "location": "TransferenciaSteps.oSistemaNaoValidaMinhaTransferencia()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded6.png", null);
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "realizar transferencia com saldo insuficiente",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@transferencia"
    },
    {
      "name": "@saldoInsuficiente"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "eu registro o primeiro usuario",
  "keyword": "Quando "
});
formatter.match({
  "location": "TransferenciaSteps.euRegistroOPrimeiroUsuario()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu registro o segundo usuario",
  "keyword": "E "
});
formatter.match({
  "location": "TransferenciaSteps.euRegistroOSegundoUsuario()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "realizo o login do segundo usuario",
  "keyword": "E "
});
formatter.match({
  "location": "TransferenciaSteps.realizoOLoginDoSegundoUsuario()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu aciono o botao de transferencia",
  "keyword": "E "
});
formatter.match({
  "location": "TransferenciaSteps.euAcionoOBotaoDeTransferencia()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo o numero da conta do primeiro usuario",
  "keyword": "E "
});
formatter.match({
  "location": "TransferenciaSteps.informoONumeroDaContaDoPrimeiroUsuario()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo o valor da transferencia maior que o saldo",
  "keyword": "E "
});
formatter.match({
  "location": "TransferenciaSteps.informoOValorDaTransferenciaMaiorQueOSaldo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo a descricao \"Teste Saldo Insuficiente\"",
  "keyword": "E "
});
formatter.match({
  "location": "TransferenciaSteps.informoADescricao(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "aciono o botao de transferir agora",
  "keyword": "E "
});
formatter.match({
  "location": "TransferenciaSteps.acionoOBotaoDeTransferirAgora()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema nao valida minha transferencia",
  "keyword": "Entao "
});
formatter.match({
  "location": "TransferenciaSteps.oSistemaNaoValidaMinhaTransferencia()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded7.png", null);
formatter.after({
  "status": "passed"
});
});