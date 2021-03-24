package rest;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class OlaMundo {
	public static void main(String[] args) {
		Response response = RestAssured.request(Method.GET, "https://viacep.com.br/ws/91060900/json/");
		System.out.println(response.getBody().asString().equals("Teste"));
		System.out.println(response.statusCode() == 200);
		//Response response2 = RestAssured.request(Method.GET, "https://viacep.com.br/ws/91060901/json/");
		//System.out.println(response2.getBody().asString());
		
		ValidatableResponse validacao = response.then();
		validacao.statusCode(300);
	}
}
