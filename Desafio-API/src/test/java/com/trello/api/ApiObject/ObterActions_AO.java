package com.trello.api.ApiObject;
/**
 * Essa classe contém os métodos responsáveis por enviar o request e manusear o response
 */
import static io.restassured.RestAssured.given;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ObterActions_AO {
	JsonPath jPath;
	Response response;

	public JsonPath enviarRequisicao(String endereco, String id) {
		String enderecoCompleto = endereco + id;

		jPath = given().header("Accept", "application/json").get(enderecoCompleto).andReturn().jsonPath();
		response = given().header("Accept", "application/json").get(enderecoCompleto);
		return jPath;
	}

	public Integer statusCodeRecebido() {
		return response.getStatusCode();
	}

}
