#language: pt
#encoding: UTF-8

@carrinho
Funcionalidade: Carrinho

Contexto: Acessar sistema
Dado que eu acesse o site

Cenario: Adicionar, editar e remover produtos do carrinho
Quando eu realizar uma busca de um produto
E selecionar o produto pretendido
E adicionar o produto ao carrinho
E retorno para a pagina inicial
E aciono o carrinho
E altero a quantidade de produtos
E removo o produto
Entao o sistema valida que o carinho esta vazio
