package com.api.retoservice.test.stepdefinitions;

import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.rest.SerenityRest;

import java.util.Map;

public class placeStepdefinitions {


    @Cuando("^Diego envia la información a la url \"([^\"]*)\"$")
    public void diegoEnviaLaInformaciónALaUrl(String url, Map<String, String> body) {
        SerenityRest.given().body(body).baseUri(url).header("accept","application/json").header("Content-Type","application/json").post();
    }

    @Entonces("^Se valida el servico (\\d+)$")
    public void seValidaElServico(int status) {
        SerenityRest.lastResponse().then().statusCode(status);

    }

}
