package rest;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class TesteViaCep {

	@Test
	public void consultaCepValido() {
		Response response = RestAssured.request(Method.GET, "https://viacep.com.br/ws/91060900/json/");
		Assert.assertTrue(!(response.getBody().asString().equals("Teste")));
		Assert.assertEquals(200,response.statusCode());
		//Response response2 = RestAssured.request(Method.GET, "https://viacep.com.br/ws/91060901/json/");
		//System.out.println(response2.getBody().asString());
		
		ValidatableResponse validacao = response.then();
		validacao.statusCode(200);
	}

	@Test
	public void consultaCepValido2() {
		//RestAssured.get("https://viacep.com.br/ws/91060900/json/").then().statusCode(200);
		
		RestAssured.given() //Pré condições
		.when() //Ação
			.get("https://viacep.com.br/ws/91060900/json/")
		.then() //Assertidas
			.statusCode(200); 
	}
}
