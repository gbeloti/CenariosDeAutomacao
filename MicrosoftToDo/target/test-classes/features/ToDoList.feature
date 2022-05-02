#language: pt
#encoding: UTF-8

Funcionalidade: Microsoft To Do

Contexto:
Dado que eu acesse o app Microsoft To Do

Cenario: Funcionalidades de listas e tarefas
E eu crie uma lista chamada "Lista1"
E edite o nome dessa lista para "ListaTeste"
E adiciono uma tarefa a essa lista chamada "Tarefa1"
E excluo a tarefa criada
E excluo a lista
Entao valido a exclusao