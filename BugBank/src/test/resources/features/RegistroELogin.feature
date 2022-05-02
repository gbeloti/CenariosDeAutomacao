#language: pt
#encoding: UTF-8

@registroELogin
Funcionalidade: Registro e Login

@loginInvalido
Cenario: Login Invalido

Quando informar o email de login "emailerrado@gmail.com"
E informar a senha de login "123456"
E clicar no botao acessar
Entao o sistema exibe a mensagem de usuario ou senha invalidos

@registrarSenhaErrada
Cenario: Registrar Primeiro Usuario 

Quando clicar no botao registrar
E informar o email "Dalessandro@gmail.com"
E informar o nome "Dalessandro"
E informar a senha "1909"
E informar a confirmacao da senha "1099"
E clicar no botao cadastrar
Entao o sistema exibe a mensagem de erro de senhas diferentes


@registrar
Cenario: Registrar Usuario com Sucesso 

Quando clicar no botao registrar
E informar o email "guilherme@gmail.com"
E informar o nome "Guilherme"
E informar a senha "123456"
E informar a confirmacao da senha "123456"
E clicar no botao de criar conta com saldo
E clicar no botao cadastrar
Entao o sistema exibe a mensagem de confirmacao de conta criada


@login
Cenario: Registrar e Realizar Login

#REGISTRO
Quando clicar no botao registrar
E informar o email "maria@gmail.com"
E informar o nome "Maria"
E informar a senha "654321"
E informar a confirmacao da senha "654321"
E clicar no botao de criar conta com saldo
E clicar no botao cadastrar
Entao o sistema exibe a mensagem de confirmacao de conta criada

#LOGIN
Quando informar o email de login "maria@gmail.com"
E informar a senha de login "654321"
E clicar no botao acessar
Entao o sistema exibe o usuario logado