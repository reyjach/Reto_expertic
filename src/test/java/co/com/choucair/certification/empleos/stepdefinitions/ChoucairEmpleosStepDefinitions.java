package co.com.choucair.certification.empleos.stepdefinitions;

import co.com.choucair.certification.empleos.models.BuscarEmpleoModel;
import co.com.choucair.certification.empleos.models.InscripcionModel;
import co.com.choucair.certification.empleos.questions.Resultado;
import co.com.choucair.certification.empleos.questions.Resultado2;
import co.com.choucair.certification.empleos.questions.Resultado3;
import co.com.choucair.certification.empleos.questions.TextoBuscarTrabajo;
import co.com.choucair.certification.empleos.tasks.*;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ChoucairEmpleosStepDefinitions {

/*
    @Dado("^que (.*) quiere ingresar al sitio Choucair Testing$")
    public void queIvanQuiereIngresarAlSitioChoucairTesting(String ivan) {
        theActorCalled(ivan).wasAbleTo(Abrir.laPaginaDeChoucair());
    }

    @Dado("^que él quiere acceder a la sección de empleos$")
    public void queÉlQuiereAccederALaSecciónDeEmpleos() {
        theActorInTheSpotlight().wasAbleTo(Menu.empleo());
    }


    @Cuando("^el da click en el boton que es ser choucair$")
    public void elDaClickEnElBotonQueEsSerChoucair() {
        theActorInTheSpotlight().attemptsTo(Botones.boton());
    }

    @Entonces("^el verifica el titulo de que es (.*)$")
    public void elVerificaElTituloDeQueEsSerChoucair(String frase) {
        theActorInTheSpotlight().should(seeThat(Resultado.esLa(frase)));
    }

    @Cuando("^el da click en el boton convocatorias$")
    public void elDaClickEnElBotonConvocatorias() {
        theActorInTheSpotlight().attemptsTo(Botones2.boton());
    }

    @Entonces("^el verifica el texto de (.*)$")
    public void elVerificaElTextoDeConvocatorias(String frase) {
        theActorInTheSpotlight().should(seeThat(Resultado2.esLa(frase)));
    }

    @Cuando("^el da click en el boton prepararse para aplicar$")
    public void elDaClickEnElBotonPrepararseParaAplicar() {
        theActorInTheSpotlight().attemptsTo(Botones3.boton());
    }

    @Entonces("^el verifica el texto en (.*)$")
    public void elVerificaElTextoEnPrepararseParaAplicar(String frase) {
        theActorInTheSpotlight().should(seeThat(Resultado3.esLa(frase)));
    }


    @Cuando("^el busca una oferta de analista de pruebas en panama$")
    public void elBuscaUnaOfertaDeAnalistaDePruebasEnPanama(List<BuscarEmpleoModel> dataSet) {
        OnStage.theActorInTheSpotlight().attemptsTo(BuscarEmpleoPanama.con(dataSet));
    }

    @Entonces("^el verifica las ofertas de empleo como analista de pruebas en panama$")
    public void elVerificaLasOfertasDeEmpleoComoAnalistaDePruebasEnPanama(List<BuscarEmpleoModel> dataSet) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TextoBuscarTrabajo.es(dataSet)));
    }

    @Cuando("^el busca una oferta de psicologo de seleccion en medellin$")
    public void elBuscaUnaOfertaDePsicologoDeSeleccionEnMedellin(List<BuscarEmpleoModel> dataSet) {
        OnStage.theActorInTheSpotlight().attemptsTo(BuscarEmpleoMedellin.con(dataSet));
    }

    @Entonces("^el verifica las ofertas de empleo como psicologo de seleccion en medellin$")
    public void elVerificaLasOfertasDeEmpleoComoPsicologoDeSeleccionEnMedellin(List<BuscarEmpleoModel> dataSet) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TextoBuscarTrabajo.es(dataSet)));
    }

    @Cuando("^el busca una oferta de analista de pruebas en bogota$")
    public void elBuscaUnaOfertaDeAnalistaDePruebasEnBogota(List<BuscarEmpleoModel> dataSet) {
        OnStage.theActorInTheSpotlight().attemptsTo(BuscarEmpleoBogota.con(dataSet));
    }

    @Entonces("^el verifica las ofertas de empleo como analista de pruebas en bogota$")
    public void elVerificaLasOfertasDeEmpleoComoAnalistaDePruebasEnBogota(List<BuscarEmpleoModel> dataSet) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TextoBuscarTrabajo.es(dataSet)));
    }


    @Dado("^él quiere acceder a una oferta de empleo$")
    public void élQuiereAccederAUnaOfertaDeEmpleo() {
        theActorInTheSpotlight().wasAbleTo(IngresarAOferta.deEmpleo());
    }

    @Cuando("^él llena el formulario de inscribirse al empleo$")
    public void élLlenaElFormualrioDeInscribirseAlEmpleo(List<InscripcionModel> dataSet) {
        theActorInTheSpotlight().attemptsTo(CompletarFormulario.deInscripcion(dataSet));
    }

    @Entonces("^el verifica que se carga la pantalla con el texto Double Click on Edit Icon to EDIT the Table Row$")
    public void elVerificaQueSeCargaLaPantallaConElTextoDoubleClickOnEditIconToEDITTheTableRow() {

    }

    @Dado("^que carlos quiere llenar el formulario con datos incorrectos$")
    public void queCarlosQuiereLlenarElFormularioConDatosIncorrectos() {

    }

    @Cuando("^el llena el formualrio de la pagina$")
    public void elLlenaElFormualrioDeLaPagina(List<InscripcionModel> dataSet) {

    }


    @Dado("^que Ivan quiere acceder a una oferta de empleo en el sitio Choucair$")
    public void queIvanQuiereAccederAUnaOfertaDeEmpleoEnElSitioChoucair() {
        theActorInTheSpotlight().wasAbleTo(Abrir.laPaginaDeChoucair(), IngresarALaSeccion.empleos());
    }

    @Cuando("^él llena el formulario de inscribirse al empleo$")
    public void élLlenaElFormularioDeInscribirseAlEmpleo(List<InscripcionModel> dataSet) {
        theActorInTheSpotlight().attemptsTo(CompletarFormulario.deInscripcion(dataSet));

    }

    @Entonces("^el verifica que no hay mensajes de error$")
    public void elVerificaQueNoHayMensajesDeError() {

    }

    @Cuando("^el llena el formualrio en la pagina$")
    public void elLlenaElFormualrioEnLaPagina() {

    }

    @Cuando("^el verifica que hay mensajes de error$")
    public void elVerificaQueHayMensajesDeError() {

    }

*/
}
