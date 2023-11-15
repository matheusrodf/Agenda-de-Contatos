# Agenda-de-Contatos
Programa teste que cadastra informações de um contato e salva em um banco de dados H2
O programa foi feito na IDE NetBeans, o que fez com que seja mais simples de adicionar janelas.


Ao abrir o programa, é apresentado um menu com 3 opções:
- Cadastro
- Pesquisa
- Banco de dados

![image](https://github.com/matheusrodf/Agenda-de-Contatos/assets/139105968/9c773300-d271-4239-b8cf-ccd65199bf7e)


Na opção de cadastro, é apresentado campos de texto para que se adicione informações do contato a ser salvo, como:
- Nome
- Telefone
- Celular
- Endereço
- E-mail
  
![image](https://github.com/matheusrodf/Agenda-de-Contatos/assets/139105968/e3e86b09-cfa0-4966-8ed3-bb454699b89f)

Ao clicar em cadastrar, o programa tenta se conectar com o banco de dados, e se conseguir, insere as informações lá.


Na parte de pesquisa, aparece uma tela com as mesmas informações do cadastro. É possível usar qualquer campo para pesquisar, se for digitado uma parte de uma entrada do banco de dados, ao clicar em pesquisar, é inserida todas as informações do contato se for encontrado.
Se um contato for encontrado, também é possível editar suas informações alterando o campo correspondente ao que se deseja editar e clicar em "editar". É possível também excluir a entrada clicando em excluir.
O botão limpar serve para limpar os campos para pesquisar outro contato.

![image](https://github.com/matheusrodf/Agenda-de-Contatos/assets/139105968/4694cba7-3896-46e2-a1e9-f7321fa699ea)

![image](https://github.com/matheusrodf/Agenda-de-Contatos/assets/139105968/e6b0e961-0c8d-4426-a6d5-871a547e891b)


Na opção de banco de dados, pede login e senha (que é hardcoded como "admin" "admin").

![image](https://github.com/matheusrodf/Agenda-de-Contatos/assets/139105968/170f3ad3-0c0d-4cf7-9e7f-9f9340eaeec1)


E então abre uma tela para gerenciar o banco de dados, onde é possível limpar todo banco de dados, os visualizar todas as entradas em uma tabela.

![image](https://github.com/matheusrodf/Agenda-de-Contatos/assets/139105968/46cf0b84-7e19-433e-90dc-03e6a16832f6)

![image](https://github.com/matheusrodf/Agenda-de-Contatos/assets/139105968/77813231-69bb-49e9-ae05-775d1cc18b8e)
