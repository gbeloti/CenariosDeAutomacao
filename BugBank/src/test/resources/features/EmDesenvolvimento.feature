#language: pt
#encoding: UTF-8

@emDesenvolvimento
Funcionalidade: acessar funcionalidades em desenvolvimento

Contexto:
Dado que o usuario acesse o site BugBank
E acesse sua conta

@emDesenvolvimento_pagamento
Cenario: pagamento
Quando o usuario aciona o botao de pagamento
Entao o sistema exibe a mensagem de recurso em desenvolvimento

@emDesenvolvimento_saque
Cenario: saque
Quando o usuario aciona o botao de saque
Entao o sistema exibe a mensagem de recurso em desenvolvimento
