#language: pt
#Autor: Pablo Alves Garcia
####################################### WEBMOTORS ###########################################
Funcionalidade: Validar o comportamento do site Webmotors.

  Esquema do Cenario: Validar o campo de busca Marca
    Dado que eu entre no site Webmotors
    Quando digitar a marca "<Marca>"
    E clicar no resultado principal
    Entao o site deve mostrar os veiculos desta marca

    Exemplos: 
      | Marca |
      | Honda |

  Esquema do Cenario: Validar o campo de busca Modelo
    Dado que eu entre no site Webmotors
    Quando digitar a marca "<Modelo>"
    E clicar no resultado principal
    Entao o site deve mostrar os veiculos desta marca

    Exemplos: 
      | Modelo |
      | City   |

  Esquema do Cenario: Validar o campo de busca Marca
    Dado que eu entre no site Webmotors
    Quando digitar a marca "<Marca>" e o modelo "<Modelo>"
    E clicar no resultado principal
    Entao o site deve mostrar os veiculos desta marca

    Exemplos: 
      | Marca | Modelo |
      | Honda | City   |
