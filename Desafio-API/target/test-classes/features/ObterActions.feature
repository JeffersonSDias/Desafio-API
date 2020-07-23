#language:pt
Funcionalidade: Obter uma action atraves de uma requisicao GET

  Esquema do Cenario: Obter action informando um id
    Dado que envio uma requisicao para o "<endereco>" com o "<id>"
    Quando recebo o status <code>
    Entao valido o conteudo do campo "<name>"

    Exemplos: 
      | endereco                          | id                       | code | name         |
      | https://api.trello.com/1/actions/ | 592f11060f95a3d3d46a987a |  200 | Professional |
