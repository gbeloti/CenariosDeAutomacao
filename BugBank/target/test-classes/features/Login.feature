#language: pt
#encoding: UTF-8

@login
Funcionalidade: Login

Contexto:
Dado que o usuario acesse o site BugBank

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
Quando informar a <senha> de login
E acionar o botao de acessar
Entao o sistema exibe a mensagem de campo obrigatorio para o email de login

@login_semSenha
Cenario: login sem senha
Quando o usuario informar o <email> de login
E acionar o botao de acessar
Entao o sistema exibe a mensagem de campo obrigatorio para a senha de login

@login_semEmail_SemSenha
Cenario: login sem email e sem senha
Quando acionar o botao de acessar
Entao o sistema exibe a mensagem de campos obrigatorios

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
