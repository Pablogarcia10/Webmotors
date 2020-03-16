package testRunner;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Steps {

	Response url;

	@Dado("^que eu tenha acesso a API$")
	public void que_eu_tenha_acesso_a_API() throws Throwable {
		given().relaxedHTTPSValidation();
	}

	@Quando("^eu enviar um GET ao endpoit\"([^\"]*)\"$")
	public void eu_enviar_um_GET_ao_endpoit(String api) throws Throwable {
		url = when().get(api);

	}

	@Entao("^a API deve retornar o codigo (\\d+)$")
	public void a_API_deve_retornar_o_codigo(int response) throws Throwable {
		url.then().statusCode(200).contentType(ContentType.JSON);

	}

	@Quando("^eu enviar um GET para a \"([^\"]*)\"com um numero de (\\d+) a (\\d+)$")
	public void eu_enviar_um_GET_para_a_com_um_numero_de_a(String api, int minimo, int maximo) throws Throwable {
		for(int a = minimo; a < maximo; minimo ++){
			url = when().get(api);
			System.out.println(url);
		}
	}
}
