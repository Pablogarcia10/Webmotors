#language: pt
#Autor: Pablo Alves Garcia
Funcionalidade: Validar o comportamento da API da WebMotors

  ######################################### MARCA ########################################################
  Esquema do Cenario: Validar o comportamento da API ao enviar um request para o endpoint
    Dado que eu tenha acesso a API
    Quando eu enviar um GET ao endpoit"<API>"
    Entao a API deve retornar o codigo 200

    Exemplos: 
      | API                                                            |
      | http://desafioonline.webmotors.com.br/api/OnlineChallenge/Make |

  ######################################### MODELO ########################################################
  Esquema do Cenario: Validar o comportamento da API ao enviar um request para o endpoint
    Dado que eu tenha acesso a API
    Quando eu enviar um GET para a "<API>"com um numero de 1 a 3
    Entao a API deve retornar o codigo 200

    Exemplos: 
      | API                                                                     |
      | http://desafioonline.webmotors.com.br/api/OnlineChallenge/Model?MakeID= |

  ######################################### VERSAO ########################################################
  Esquema do Cenario: Validar o comportamento da API ao enviar um request para o endpoint
    Dado que eu tenha acesso a API
    Quando eu enviar um GET para a "<API>"com um numero de 0 a 8
    Entao a API deve retornar o codigo 200

    Exemplos: 
      | API                                                                        |
      | http://desafioonline.webmotors.com.br/api/OnlineChallenge/Version?ModelID= |

  ######################################### VEICULO ########################################################
  Esquema do Cenario: Validar o comportamento da API ao enviar um request para o endpoint
    Dado que eu tenha acesso a API
    Quando eu enviar um GET para a "<API>"com um numero de 1 a 3
    Entao a API deve retornar o codigo 200

    Exemplos: 
      | API                                                                      |
      | http://desafioonline.webmotors.com.br/api/OnlineChallenge/Vehicles?Page= |
