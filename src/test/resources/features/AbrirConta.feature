#language: pt
#enconding: UTF-8
#author: Jorge Luiz Dos Santos Junior

Funcionalidade: Criar conta

  Contexto:
    Dado que tenha acessado o site do original

  @ct01
  Esquema do Cenario: Validar campos da seção de cadastro
    Quando clico abrir conta na secao para voce
    E preencher os campos nome completo "<nomeCompleto>", celular "<celular>", email "<email>" e cpf "<cpf>"
    Então os campos sao validado com sucesso

    Exemplos:

      | nomeCompleto           | celular      | email                            | cpf            |
      | Marcio Athur Rodrigues | 84-997305689 | marcioarthurrodriguesinfo.com.br | 735.796.372-12 |
