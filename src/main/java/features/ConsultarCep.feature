# language: pt

Funcionalidade: Validar consultar dos Cep's do brasil
	
	@CT01
  Cenario: Consulta CEP valido
    Dado que o usu�rio inseri um CEP valido
    Quando o servi�o � consultado 
    Ent�o � retornado o CEP,logradouro,complemento,bairro,localidade,uf e ibge
    
  @CT02
  Cenario: Consulta CEP inexistente
    Dado que o usu�rio inseri um CEP que n�o exista na base dos Correios
    Quando o servi�o � consultado 
    Ent�o � um atributo erro
    
   @CT03
  	Cenario: Consulta CEP com formato inv�lido
    Dado que o usu�rio inseri um CEP com formato inv�lido
    Quando o servi�o � consultado 
    Ent�o � retornado uma mensagem de erro
    
    