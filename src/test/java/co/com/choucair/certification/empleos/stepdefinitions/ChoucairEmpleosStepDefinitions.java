package co.com.choucair.certification.empleos.stepdefinitions;

import co.com.choucair.certification.empleos.models.DataModel;
import co.com.choucair.certification.empleos.tasks.Abrir;
import co.com.choucair.certification.empleos.tasks.CompletarFormulario;
import co.com.choucair.certification.empleos.tasks.IngresarALaSeccion;
import co.com.choucair.certification.empleos.tasks.IngresarAOferta;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ChoucairEmpleosStepDefinitions {
    @Dado("^que Ivan quiere ingresar al sitio Choucair Testing$")
    public void queIvanQuiereIngresarAlSitioChoucairTesting() {
        OnStage.theActorCalled("brandon").wasAbleTo(Abrir.laPaginaDeChoucair());
    }


    @Dado("^que pepe quiere ver el contenido de la pagina de empleos$")
    public void quePepeQuiereVerElContenidoDeLaPaginaDeEmpleos() {

    }

    @Cuando("^el da click en el boton que es ser choucair$")
    public void elDaClickEnElBotonQueEsSerChoucair() {

    }

    @Entonces("^el verifica el texto de que es ser choucair$")
    public void elVerificaElTextoDeQueEsSerChoucair()  {

    }

    @Cuando("^el da click en el boton convocatorias$")
    public void elDaClickEnElBotonConvocatorias()  {

    }

    @Entonces("^el verifica el texto de convocatorias$")
    public void elVerificaElTextoDeConvocatorias()  {

    }

    @Cuando("^el da click en el boton prepararse para aplicar$")
    public void elDaClickEnElBotonPrepararseParaAplicar() {

    }

    @Entonces("^el verifica el texto de prepararse para aplicar$")
    public void elVerificaElTextoDePrepararseParaAplicar() {

    }

    @Dado("^que pepe quiere acceder a la pagina de empleos$")
    public void quePepeQuiereAccederALaPaginaDeEmpleos()  {

    }

    @Cuando("^el busca una oferta de analista de pruebas en panama$")
    public void elBuscaUnaOfertaDeAnalistaDePruebasEnPanama()  {

    }

    @Entonces("^el verifica las ofertas de empleo como analista de pruebas en panama$")
    public void elVerificaLasOfertasDeEmpleoComoAnalistaDePruebasEnPanama() {

    }

    @Cuando("^el busca una oferta de psicologo de seleccion en medellin$")
    public void elBuscaUnaOfertaDePsicologoDeSeleccionEnMedellin() {

    }

    @Entonces("^el verifica las ofertas de empleo como psicologo de seleccion en medellin$")
    public void elVerificaLasOfertasDeEmpleoComoPsicologoDeSeleccionEnMedellin() {

    }

    @Cuando("^el busca una oferta de analista de pruebas en bogota$")
    public void elBuscaUnaOfertaDeAnalistaDePruebasEnBogota() {

    }

    @Entonces("^el verifica las ofertas de empleo como analista de pruebas en bogota$")
    public void elVerificaLasOfertasDeEmpleoComoAnalistaDePruebasEnBogota() {

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
    public void élLlenaElFormualrioDeInscribirseAlEmpleo(List<DataModel> dataSet) {
        theActorInTheSpotlight().attemptsTo(CompletarFormulario.deInscripcion(dataSet));
    }

    @Entonces("^el verifica que se carga la pantalla con el texto Double Click on Edit Icon to EDIT the Table Row$")
    public void elVerificaQueSeCargaLaPantallaConElTextoDoubleClickOnEditIconToEDITTheTableRow() {

    }

    @Dado("^que carlos quiere llenar el formulario con datos incorrectos$")
    public void queCarlosQuiereLlenarElFormularioConDatosIncorrectos() {

    }
}
