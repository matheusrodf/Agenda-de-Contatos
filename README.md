# Agenda-de-Contatos
Programa teste que cadastra informações de um contato e salva em um banco de dados H2
O programa foi feito na IDE NetBeans, o que fez com que seja mais simples de adicionar janelas.


Ao abrir o programa, é apresentado um menu com 3 opções:
- Cadastro
- Pesquisa
- Banco de dados

![image](https://github.com/matheusrodf/Agenda-de-Contatos/assets/139105968/8919e612-60b9-4086-b875-7338d101c9b7)


Na opção de cadastro, é apresentado campos de texto para que se adicione informações do contato a ser salvo, como:
- Nome
- Telefone
- Celular
- Endereço
- E-mail
  
![image](https://github.com/matheusrodf/Agenda-de-Contatos/assets/139105968/f7f2c1e9-3ed9-407e-9e02-773d6cd3ab1c)

Ao clicar em cadastrar, o programa tenta se conectar com o banco de dados, e se conseguir, insere as informações lá.


Na parte de pesquisa, aparece uma tela com as mesmas informações do cadastro. É possível usar qualquer campo para pesquisar, se for digitado uma parte de uma entrada do banco de dados, ao clicar em pesquisar, é inserida todas as informações do contato se for encontrado.
Se um contato for encontrado, também é possível editar suas informações alterando o campo correspondente ao que se deseja editar e clicar em "editar". É possível também excluir a entrada clicando em excluir.
O botão limpar serve para limpar os campos para pesquisar outro contato.

![image](https://github.com/matheusrodf/Agenda-de-Contatos/assets/139105968/c31b2095-bbf8-426b-b217-540c151b7096)

![image](https://github.com/matheusrodf/Agenda-de-Contatos/assets/139105968/6ee5e398-cea8-4f1c-a253-f4235f78a55f)


Na opção de banco de dados, pede login e senha (que é hardcoded como "admin" "admin").

![image](https://github.com/matheusrodf/Agenda-de-Contatos/assets/139105968/707fb064-b68f-4941-bbee-ecc3ec345666)


E então abre uma tela para gerenciar o banco de dados, onde é possível limpar todo banco de dados, os visualizar todas as entradas em uma tabela.

![image](https://github.com/matheusrodf/Agenda-de-Contatos/assets/139105968/e9fb9bed-d29b-4547-8f22-a67e19a0e323)

![image](https://github.com/matheusrodf/Agenda-de-Contatos/assets/139105968/e4d3c3d3-9594-4261-9d82-7c646f4059b7)
