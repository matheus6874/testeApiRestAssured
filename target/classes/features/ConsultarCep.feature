# language: pt

Funcionalidade: Validar consultar dos Cep's do brasil
	
	@CT01
  Cenario: Consulta CEP valido
    Dado que o usuário inseri um CEP valido
    Quando o serviço é consultado 
    Então é retornado o CEP,logradouro,complemento,bairro,localidade,uf e ibge
    
  @CT02
  Cenario: Consulta CEP inexistente
    Dado que o usuário inseri um CEP que não exista na base dos Correios
    Quando o serviço é consultado 
    Então é um atributo erro
    
   @CT03
  	Cenario: Consulta CEP com formato inválido
    Dado que o usuário inseri um CEP com formato inválido
    Quando o serviço é consultado 
    Então é retornado uma mensagem de erro
    
    