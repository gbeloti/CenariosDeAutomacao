# BugBank
## Automação WEB


### Cenários de Automação - 33 cenários
- Registro de usuário (8):

	|#|Cenário|Resultado esperado|
	|:---:|:---:|:---:|
	|1|E-mail inválido|Erro de Registro|
	|2|Sem e-mail|Erro de Registro|
	|3|Sem nome|Erro de Registro|
	|4|Sem senha|Erro de Registro|
	|5|Sem confirmação de senha|Erro de Registro|
	|6|Senhas diferentes|Erro de Registro|
	|7|Conta Sem Saldo|Registro com sucesso|
	|8|Conta Com Saldo|Registro com sucesso|

- Login de usuário (8):

	|#	|Cenário	|Resultado esperado|
	|:---:	|:---:	|:---:|
	|1	|E-mail incorreto 	|Erro de login
	|2	|Senha incorreta	|Erro de login
	|3	|Login sem cadastro de usuário	|Erro de login
	|4	|Login sem e-mail	|Erro de login
	|5	|Login sem senha	|Erro de login
	|6	|Login sem e-mail e sem senha	|Erro de login
	|7	|Login com sucesso	|Login com sucesso
	|8	|Login e deslogin	|Deslogin com sucesso

- Realizar transferência (13):

	|#	|Cenário	|Resultado esperado|
	|:---:	|:---:	|:---:|
	|1	| Conta destino errada	|Erro de transferência
	|2	| Transferência para a própria conta	|Erro de transferência
	|3	| Conta destino inválida	|Erro de transferência
	|4	| Letras no lugar do número da conta	|Erro de transferência
	|5	| Dígito inválido	|Erro de transferência
	|6	| Letras no lugar do dígito da conta	|Erro de transferência
	|7	| Sem valor de transferência	|Erro de transferência
	|8	| Valor de transferência zero	|Erro de transferência
	|9	| Valor de transferência negativo	|Erro de transferência
	|10	| Sem descrição	|Transferência com sucesso e Extrato com "-" na descrição
	|11	| Saldo insuficiente para transferência	|Erro de transferência
	|12	| Transferência com sucesso - 50% do saldo	|Transferência com sucesso
	|13	| Transferência com sucesso - 100% do saldo	|Transferência com sucesso


- Conferir extrato (2):

	|#	|Cenário	|Resultado esperado|
	|:---:	|:---:	|:---:|
	|1	|Conta com Saldo	|Saldo R$ 1.000,00
	|2	|Conta sem Saldo	|Saldo R$ 0,00


- Abas em desenvolvimento pelo site (2):

	|#	|Cenário	|Resultado esperado|
	|:---:	|:---:	|:---:|
	|1	|Pagamento	|Funcionalidade em Desenvolvimento
	|2	|Saque	|Funcionalidade em Desenvolvimento


