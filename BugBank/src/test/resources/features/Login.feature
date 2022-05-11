#language: pt
#encoding: UTF-8

@login
Funcionalidade: Login

Contexto:
Dado que o usuario acesse o site BugBank
E registre uma conta

@login_emailIncorreto
Cenario: email incorreto
Quando o usuario informar o <email> de login incorreto
E informar a <senha> de login
E acionar o botao de acessar
Entao o sistema exibe a mensagem de usuario ou senha invalidos

@login_senhaincorreta
Cenario: senha incorreta
Quando o usuario informar o <email> de login
E informar a <senha> de login incorreta
E acionar o botao de acessar
Entao o sistema exibe a mensagem de usuario ou senha invalidos

@login_semCadastro
Cenario: login sem cadastro
Quando o usuario informar o <email> de login incorreto
E informar a <senha> de login incorreta
E acionar o botao de acessar
Entao o sistema exibe a mensagem de usuario ou senha invalidos

@login_semEmail
Cenario: login sem email
Quando o usuario nao informar o <email> de login
E informar a <senha> de login
E acionar o botao de acessar
Entao o sistema exibe a mensagem de campo obrigatorio

@login_semSenha
Cenario: login sem senha
Quando o usuario informar o <email> de login
E nao informar a <senha> de login
E acionar o botao de acessar
Entao o sistema exibe a mensagem de campo obrigatorio

@login_semEmail_SemSenha
Cenario: login sem email e sem senha
Quando o usuario nao informar o <email> de login
E nao informar a <senha> de login
E acionar o botao de acessar
Entao o sistema exibe a mensagem de campo obrigatorio

@login_sucesso
Cenario: login com sucesso
Quando o usuario informar o <email> de login
E informar a <senha> de login
E acionar o botao de acessar
Entao o sistema exibe o usuario logado

@login_deslogin
Cenario: login e deslogin
Quando o usuario informar o <email> de login
E informar a <senha> de login
E acionar o botao de acessar
E o sistema exibe o usuario logado
E o usuario acionar o botao de sair
Entao o sistema exibe o usuario deslogado 
