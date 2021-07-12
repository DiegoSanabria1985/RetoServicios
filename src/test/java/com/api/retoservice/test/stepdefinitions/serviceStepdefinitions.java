package com.api.retoservice.test.stepdefinitions;

import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.rest.SerenityRest;

import java.util.Map;

public class serviceStepdefinitions {


    @Cuando("^Diego envia información al end point \"([^\"]*)\"$")
    public void diegoEnviaInformaciónAlEndPoint(String url, Map<String, String> cuerpo) {

        SerenityRest.given().body(cuerpo).baseUri(url).header("accept","application/json").header("Content-Type","application/json").post();
    }


    @Entonces("^Se valida que el servicio es correcto retornando (\\d+)$")
    public void seValidaQueElServicioEsCorrectoRetornando(int status) {
        SerenityRest.lastResponse().then().statusCode(status);
    }


}
