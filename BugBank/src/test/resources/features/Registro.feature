#language: pt
#encoding: UTF-8

@registro
Funcionalidade: Registro

Contexto:
Dado que o usuario acesse o site BugBank

@registrar_emailInvalido
Cenario: email invalido
Quando o usuario clicar no botao registrar
E informar o <email> invalido
E informar o <nome>
E informar a <senha>
E informar a <confirmacao da senha>
E clicar no botao cadastrar
Entao o sistema exibe a mensagem formato invalido

@registrar_semEmail
Cenario: sem email
Quando o usuario clicar no botao registrar
E informar o <nome>
E informar a <senha>
E informar a <confirmacao da senha>
E clicar no botao cadastrar
Entao o sistema exibe a mensagem de campo obrigatorio para o email

@registrar_semNome
Cenario: sem nome
Quando o usuario clicar no botao registrar
E informar o <email>
E informar a <senha>
E informar a <confirmacao da senha>
E clicar no botao cadastrar
Entao o sistema exibe a mensagem de nome nao pode ser vazio

@registrar_semSenha
Cenario: sem senha
Quando o usuario clicar no botao registrar
E informar o <email>
E informar o <nome>
E informar a <confirmacao da senha>
E clicar no botao cadastrar
Entao o sistema exibe a mensagem de campo obrigatorio para a senha

@registrar_semConfirmacaoDeSenha
Cenario: sem confirmacao de senha
Quando o usuario clicar no botao registrar
E informar o <email>
E informar o <nome>
E informar a <senha>
E clicar no botao cadastrar
Entao o sistema exibe a mensagem de campo obrigatorio para a senha de confirmacao

@registrar_senhasDiferentes
Cenario: senhas diferentes
Quando o usuario clicar no botao registrar
E informar o <email>
E informar o <nome>
E informar a <senha>
E informar a <confirmacao da senha> incorreta
E clicar no botao cadastrar
Entao o sistema exibe a mensagem de erro de senhas diferentes

@registrar_contaSemSaldo
Cenario: conta sem saldo
Quando o usuario clicar no botao registrar
E informar o <email>
E informar o <nome>
E informar a <senha>
E informar a <confirmacao da senha>
E clicar no botao cadastrar
Entao o sistema exibe a mensagem de confirmacao de conta criada

@registrar_contaComSaldo
Cenario: conta com saldo
Quando o usuario clicar no botao registrar
E informar o <email>
E informar o <nome>
E informar a <senha>
E informar a <confirmacao da senha>
E clicar no botao de criar conta com saldo
E clicar no botao cadastrar
Entao o sistema exibe a mensagem de confirmacao de conta criada

