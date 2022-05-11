#language: pt
#encoding: UTF-8

@transferencia
Funcionalidade: Realizar Transferencia

Contexto:
Dado que o usuario acesse o site BugBank
E acesse sua conta

@transferencia_contaErrada
Cenario: conta destino errada
Quando o usuario acionar o botao de transferencia
E infomar o numero da <conta> invalida
E infomar o <valor> da transferencia
E infomar a <descricao> da transferencia
E acionar o botao de transferir
Entao o usuario exibe a mensagem de conta invalida

@transferencia_saldoInsuficiente
Cenario: saldo insuficiente para transferencia
Quando o usuario acionar o botao de transferencia
E infomar o numero da <conta>
E infomar o <valor> da transferencia
E infomar a <descricao> da transferencia
E acionar o botao de transferir
Entao o usuario exibe a mensagem de saldo insuficiente

@transferencia_contaInvalida
Cenario: conta destino invalida
Quando o usuario acionar o botao de transferencia
E infomar o numero da <conta> invalida
E infomar o <valor> da transferencia
E infomar a <descricao> da transferencia
E acionar o botao de transferir
Entao o usuario exibe a mensagem de conta invalida

@transferencia_contaComLetras
Cenario: letras no lugar do numero da conta
Quando o usuario acionar o botao de transferencia
E infomar o numero da <conta> invalida
E infomar o <valor> da transferencia
E infomar a <descricao> da transferencia
E acionar o botao de transferir
Entao o usuario exibe a mensagem de conta invalida

@transferencia_digitoComLetras
Cenario: letras no lugar do digito da conta
Quando o usuario acionar o botao de transferencia
E infomar o numero da <conta> invalida
E infomar o <valor> da transferencia
E infomar a <descricao> da transferencia
E acionar o botao de transferir
Entao o usuario exibe a mensagem de conta invalida

@transferencia_semDescricao
Cenario: sem descricao
Quando o usuario acionar o botao de transferencia
E infomar o numero da <conta>
E infomar o <valor> da transferencia
E acionar o botao de transferir
E o sistema validar a transferencia
Entao o usuario valida a transferencia sem descricao pelo extrato

@transferencia_semValor
Cenario: valor de transferencia zero
Quando o usuario acionar o botao de transferencia
E infomar o numero da <conta>
E infomar o <valor> da transferencia
E infomar a <descricao> da transferencia
E acionar o botao de transferir
Entao o usuario exibe a mensagem NaN

@transferencia_valorZero
Cenario: valor de transferencia zero
Quando o usuario acionar o botao de transferencia
E infomar o numero da <conta>
E infomar o <valor> da transferencia
E infomar a <descricao> da transferencia
E acionar o botao de transferir
Entao o usuario exibe a mensagem de erro de valor

@transferencia_valorNegativo
Cenario: valor de transferencia negativo
Quando o usuario acionar o botao de transferencia
E infomar o numero da <conta>
E infomar o <valor> da transferencia
E infomar a <descricao> da transferencia
E acionar o botao de transferir
Entao o usuario exibe a mensagem de erro de valor

@transferencia_metadeSaldo
Cenario: transferencia com metade do saldo
Quando um segundo usuario for cadastrado
E o segundo usuario acessar sua conta
E acionar o botao de transferencia
E infomar o numero da <conta>
E infomar o <valor> da transferencia
E infomar a <descricao> da transferencia
E acionar o botao de transferir
E o sistema validar a transferencia
Entao o usuario valida a transferencia pelo extrato

@transferencia_saldoTotal
Cenario: transferencia com saldo total
Quando um segundo usuario for cadastrado
E o segundo usuario acessar sua conta
E acionar o botao de transferencia
E infomar o numero da <conta>
E infomar o <valor> da transferencia
E infomar a <descricao> da transferencia
E acionar o botao de transferir
E o sistema validar a transferencia
Entao o usuario valida a transferencia pelo extrato
