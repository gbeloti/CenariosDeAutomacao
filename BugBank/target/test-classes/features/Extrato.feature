#language: pt
#encoding: UTF-8

@extrato
Funcionalidade: extrato

Contexto:
Dado que o usuario acesse o site BugBank

@extrato_semSaldo
Cenario: extrato conta sem saldo
Quando o usuario acessa sua conta sem saldo
E aciona o botao de extrato
Entao o sistema exibe o extrato

@extrato_comSaldo
Cenario: extrato conta com saldo
Quando o usuario acessa sua conta com saldo
E aciona o botao de extrato
Entao o sistema exibe o extrato