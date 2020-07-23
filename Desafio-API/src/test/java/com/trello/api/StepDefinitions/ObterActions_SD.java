package com.trello.api.StepDefinitions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.trello.api.ApiObject.ObterActions_AO;

import io.cucumber.java.pt.*;
import io.restassured.path.json.JsonPath;

public class ObterActions_SD {
	JsonPath jPath;
	ObterActions_AO obterActions = new ObterActions_AO();

	@Dado("que envio uma requisicao para o {string} com o {string}")
	public void queEnvioUmaRequisicaoParaOComO(String endereco, String id) {
		// Write code here that turns the phrase above into concrete actions throw new
		// io.cucumber.java.PendingException();
		jPath = obterActions.enviarRequisicao(endereco, id);
	}

	@Quando("recebo o status {int}")
	public void receboOStatus(Integer statusCodeEsperado) {
		// Write code here that turns the phrase above into concrete actions throw new
		// io.cucumber.java.PendingException();
		int statusCodeRecebido = obterActions.statusCodeRecebido();

		assertEquals(statusCodeEsperado, statusCodeRecebido);
	}

	@Então("valido o conteudo do campo {string}")
	public void validoOConteudoDoCampo(String nameEsperado) {
		// Write code here that turns the phrase above into concrete actions throw new
		// io.cucumber.java.PendingException();
		String nameRecebido;
		nameRecebido = jPath.getString("data.list.name");
		
		assertEquals(nameEsperado, nameRecebido);
	}

}
