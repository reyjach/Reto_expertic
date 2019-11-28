package co.com.choucair.certification.empleos.stepdefinitions;

import co.com.choucair.certification.empleos.models.DataModel;
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

import javax.xml.crypto.Data;
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


    @Dado("^que pepe quiere ver el contenido de la pagina de empleos$")
    public void quePepeQuiereVerElContenidoDeLaPaginaDeEmpleos() {
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

    @Dado("^que pepe quiere acceder a la pagina de empleos$")
    public void quePepeQuiereAccederALaPaginaDeEmpleos()  {
        theActorInTheSpotlight().wasAbleTo(Menu.empleo());
    }

    @Cuando("^el busca una oferta de analista de pruebas en panama$")
    public void elBuscaUnaOfertaDeAnalistaDePruebasEnPanama(List<DataModel>dataSet) {
        OnStage.theActorInTheSpotlight().attemptsTo(BuscarEmpleoPanama.con(dataSet));
    }

    @Entonces("^el verifica las ofertas de empleo como analista de pruebas en panama$")
    public void elVerificaLasOfertasDeEmpleoComoAnalistaDePruebasEnPanama(List<DataModel>dataSet) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TextoBuscarTrabajo.es(dataSet)));
    }

    @Cuando("^el busca una oferta de psicologo de seleccion en medellin$")
    public void elBuscaUnaOfertaDePsicologoDeSeleccionEnMedellin(List<DataModel>dataSet) {
        OnStage.theActorInTheSpotlight().attemptsTo(BuscarEmpleoMedellin.con(dataSet));
    }

    @Entonces("^el verifica las ofertas de empleo como psicologo de seleccion en medellin$")
    public void elVerificaLasOfertasDeEmpleoComoPsicologoDeSeleccionEnMedellin(List<DataModel>dataSet) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TextoBuscarTrabajo.es(dataSet)));
    }

    @Cuando("^el busca una oferta de analista de pruebas en bogota$")
    public void elBuscaUnaOfertaDeAnalistaDePruebasEnBogota(List<DataModel>dataSet) {
        OnStage.theActorInTheSpotlight().attemptsTo(BuscarEmpleoBogota.con(dataSet));
    }

    @Entonces("^el verifica las ofertas de empleo como analista de pruebas en bogota$")
    public void elVerificaLasOfertasDeEmpleoComoAnalistaDePruebasEnBogota(List<DataModel>dataSet) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TextoBuscarTrabajo.es(dataSet)));
    }

    @Dado("^que pepe quiere ingresar a la seccion empleos$")
    public void quePepeQuiereLlenarElFormularioConSusDatos() {
        theActorInTheSpotlight().wasAbleTo(IngresarALaSeccion.empleos());
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
*/
@Dado("^que (.*) quiere ingresar a la seccion empleos del sitio Choucair Testing$")
public void queIvanQuiereIngresarALaSeccionEmpleosDelSitioChoucairTesting(String ivan)  {
    theActorCalled(ivan).wasAbleTo(Abrir.laPaginaDeChoucair(),IngresarALaSeccion.empleos());
    
}

    @Cuando("^el da click en el boton que es ser choucair$")
    public void elDaClickEnElBotonQueEsSerChoucair()  {
        theActorInTheSpotlight().attemptsTo(Botones.boton());

    }

    @Entonces("^el verifica el titulo de que es (.*)$")
    public void elVerificaElTituloDeQueEsSERCHOUCAIR(String frase)  {
        theActorInTheSpotlight().should(seeThat(Resultado.esLa(frase)));
    }

    @Cuando("^el da click en el boton convocatorias$")
    public void elDaClickEnElBotonConvocatorias()  {
        theActorInTheSpotlight().attemptsTo(Botones2.boton());


    }

    @Entonces("^el verifica el texto de (.*)$")
    public void elVerificaElTextoDeCONVOCATORIAS(String frase)  {
        theActorInTheSpotlight().should(seeThat(Resultado2.esLa(frase)));

    }

    @Cuando("^el da click en el boton prepararse para aplicar$")
    public void elDaClickEnElBotonPrepararseParaAplicar()  {
        theActorInTheSpotlight().attemptsTo(Botones3.boton());


    }

    @Entonces("^el verifica el texto en (.*)$")
    public void elVerificaElTextoEnPREPARARSEPARAAPLICAR(String frase)  {
        theActorInTheSpotlight().should(seeThat(Resultado3.esLa(frase)));

    }

    @Cuando("^el busca una oferta de analista de pruebas en panama$")
    public void elBuscaUnaOfertaDeAnalistaDePruebasEnPanama(List<DataModel>dataSet)  {
        OnStage.theActorInTheSpotlight().attemptsTo(BuscarEmpleoPanama.con(dataSet));
    }

    @Entonces("^el verifica las ofertas de empleo como analista de pruebas en panama$")
    public void elVerificaLasOfertasDeEmpleoComoAnalistaDePruebasEnPanama(List<DataModel>dataSet)  {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TextoBuscarTrabajo.es(dataSet)));

    }

    @Cuando("^el busca una oferta de psicologo de seleccion en medellin$")
    public void elBuscaUnaOfertaDePsicologoDeSeleccionEnMedellin(List<DataModel>dataSet)  {
        OnStage.theActorInTheSpotlight().attemptsTo(BuscarEmpleoMedellin.con(dataSet));
            }

    @Entonces("^el verifica las ofertas de empleo como psicologo de seleccion en medellin$")
    public void elVerificaLasOfertasDeEmpleoComoPsicologoDeSeleccionEnMedellin(List<DataModel>dataSet)  {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TextoBuscarTrabajo.es(dataSet)));

    }

    @Cuando("^el busca una oferta de analista de pruebas en bogota$")
    public void elBuscaUnaOfertaDeAnalistaDePruebasEnBogota(List<DataModel>dataSet)  {
        OnStage.theActorInTheSpotlight().attemptsTo(BuscarEmpleoBogota.con(dataSet));

    }

    @Entonces("^el verifica las ofertas de empleo como analista de pruebas en bogota$")
    public void elVerificaLasOfertasDeEmpleoComoAnalistaDePruebasEnBogota(List<DataModel>dataSet)  {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TextoBuscarTrabajo.es(dataSet)));

    }

    @Dado("^él accede a una oferta de empleo$")
    public void élAccedeAUnaOfertaDeEmpleo()  {
        theActorInTheSpotlight().wasAbleTo(IngresarAOferta.deEmpleo());

    }

    @Cuando("^él llena el formulario de inscribirse al empleo$")
    public void élLlenaElFormularioDeInscribirseAlEmpleo(List<DataModel>dataSet)  {
        theActorInTheSpotlight().attemptsTo(CompletarFormulario.deInscripcion(dataSet));

    }

    @Entonces("^el verifica que se carga la pantalla con el texto Double Click on Edit Icon to EDIT the Table Row$")
    public void elVerificaQueSeCargaLaPantallaConElTextoDoubleClickOnEditIconToEDITTheTableRow()  {


    }

    @Dado("^él ingresa a una oferta de empleo$")
    public void élIngresaAUnaOfertaDeEmpleo()  {
        theActorInTheSpotlight().wasAbleTo(IngresarAOferta.deEmpleo());

    }

    @Cuando("^él llena el formulario de inscripción al empleo$")
    public void élLlenaElFormularioDeInscripciónAlEmpleo(List<DataModel>dataSet)  {

        theActorInTheSpotlight().attemptsTo(CompletarFormulario.deInscripcion(dataSet));
    }


}
