#language: pt
#encoding: UTF-8

@transferencia
Funcionalidade: Realizar Transferencia

Contexto:
Dado que o usuario acesse o site BugBank

@transferencia_contaErrada
Cenario: conta destino errada
Quando o usuario acionar o botao de transferencia
E infomar o numero da <conta> errada
E infomar o <valor> da transferencia
E infomar a <descricao> da transferencia
E acionar o botao de transferir
Entao o usuario exibe a mensagem de conta invalida

@transferencia_mesmaConta
Cenario: transferencia para a propria conta
Quando o usuario acionar o botao de transferencia
E infomar o numero da <conta>
E infomar o <valor> da transferencia
E infomar a <descricao> da transferencia
E acionar o botao de transferir
Entao o usuario exibe a mensagem nao pode transferir pra mesma conta

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
E infomar o numero da <conta> invalida com letras
E infomar o <valor> da transferencia
E infomar a <descricao> da transferencia
E acionar o botao de transferir
Entao o usuario exibe a mensagem de conta invalida

@transferencia_digitoInvalido
Cenario: digito invalido
Quando o usuario acionar o botao de transferencia
E infomar o numero da <conta> com digito invalido
E infomar o <valor> da transferencia
E infomar a <descricao> da transferencia
E acionar o botao de transferir
Entao o usuario exibe a mensagem de conta invalida

@transferencia_digitoComLetras
Cenario: letras no lugar do digito da conta
Quando o usuario acionar o botao de transferencia
E infomar o numero da <conta> com digito com letras
E infomar o <valor> da transferencia
E infomar a <descricao> da transferencia
E acionar o botao de transferir
Entao o usuario exibe a mensagem de conta invalida

@transferencia_semValor
Cenario: sem valor de transferencia
Quando o usuario acionar o botao de transferencia
E infomar o numero da <conta>
E infomar a <descricao> da transferencia
E acionar o botao de transferir
Entao o usuario exibe a mensagem NaN

@transferencia_valorZero
Cenario: valor de transferencia zero
Quando o usuario acionar o botao de transferencia
E infomar o numero da <conta>
E infomar o <valor> zero da transferencia
E infomar a <descricao> da transferencia
E acionar o botao de transferir
Entao o usuario exibe a mensagem de erro de valor

@transferencia_valorNegativo
Cenario: valor de transferencia negativo
Quando o usuario acionar o botao de transferencia
E infomar o numero da <conta>
E infomar o <valor> negativo da transferencia
E infomar a <descricao> da transferencia
E acionar o botao de transferir
Entao o usuario exibe a mensagem de erro de valor

@transferencia_semDescricao
Cenario: sem descricao
Quando um segundo usuario for cadastrado
E o segundo usuario acessar sua conta
E o usuario acionar o botao de transferencia
E infomar o numero da <conta>
E infomar o <valor> da transferencia
E acionar o botao de transferir
E o sistema validar a transferencia
Entao o usuario valida a transferencia sem descricao pelo extrato

@transferencia_saldoInsuficiente
Cenario: saldo insuficiente para transferencia
Quando um segundo usuario for cadastrado
E o segundo usuario acessar sua conta
E o usuario acionar o botao de transferencia
E infomar o numero da <conta>
E infomar o <valor> da transferencia maior que o saldo
E infomar a <descricao> da transferencia
E acionar o botao de transferir
Entao o usuario exibe a mensagem de saldo insuficiente

@transferencia_metadeSaldo
Cenario: transferencia com metade do saldo
Quando um segundo usuario for cadastrado
E o segundo usuario acessar sua conta
E o usuario acionar o botao de transferencia
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
E o usuario acionar o botao de transferencia
E infomar o numero da <conta>
E infomar o <valor> da transferencia como o saldo total
E infomar a <descricao> da transferencia
E acionar o botao de transferir
E o sistema validar a transferencia
Entao o usuario valida a transferencia total pelo extrato
