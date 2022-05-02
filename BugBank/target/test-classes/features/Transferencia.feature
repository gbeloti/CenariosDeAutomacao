#language: pt
#encoding: UTF-8

@transferencia
Funcionalidade: Realizar Transferencia

@transferenciaValida
Cenario: realizar transferencia

Quando eu registro o primeiro usuario
E eu registro o segundo usuario
E realizo o login do segundo usuario 
E eu aciono o botao de transferencia
E informo o numero da conta do primeiro usuario
E informo o valor da transferencia
E informo a descricao "Teste transferencia"
E aciono o botao de transferir agora
E o sistema valida minha transferencia
Entao eu confiro o extrato

@contaErrada
Cenario: realizar transferencia para conta errada

Quando eu registro o primeiro usuario
E eu registro o segundo usuario
E realizo o login do segundo usuario 
E eu aciono o botao de transferencia
E informo o numero da conta errada do primeiro usuario
E informo o valor da transferencia
E informo a descricao "Teste Conta Errada"
E aciono o botao de transferir agora
Entao o sistema nao valida minha transferencia

@saldoInsuficiente
Cenario: realizar transferencia com saldo insuficiente

Quando eu registro o primeiro usuario
E eu registro o segundo usuario
E realizo o login do segundo usuario 
E eu aciono o botao de transferencia
E informo o numero da conta do primeiro usuario
E informo o valor da transferencia maior que o saldo
E informo a descricao "Teste Saldo Insuficiente"
E aciono o botao de transferir agora
Entao o sistema nao valida minha transferencia
