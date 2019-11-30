package co.com.choucair.certification.empleos.stepdefinitions;

import co.com.choucair.certification.empleos.models.DataModel;
import co.com.choucair.certification.empleos.questions.TextoResultadoBusquedaEmpleo;
import co.com.choucair.certification.empleos.tasks.*;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.thucydides.core.annotations.Manual;

import java.util.List;

import static co.com.choucair.certification.empleos.userinterfaces.ChoucairTestingJobsInterna.MENSAJE_RECAPTCHA;
import static co.com.choucair.certification.empleos.userinterfaces.ChoucairTestingJobsPage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class ChoucairEmpleosStepDefinitions {

@Dado("^que (.*) quiere ingresar a la seccion empleos del sitio Choucair Testing$")
public void queIvanQuiereIngresarALaSeccionEmpleosDelSitioChoucairTesting(String ivan)  {
    theActorCalled(ivan).wasAbleTo(Abrir.laPaginaDeChoucair(),IngresarALaSeccion.empleos());
    
}

    @Cuando("^el da click en el boton que es ser choucair$")
    public void elDaClickEnElBotonQueEsSerChoucair()  {
        theActorInTheSpotlight().attemptsTo(BotonSerChoucair.botonSerChoucair());

    }

    @Entonces("^el verifica el titulo de que es SER CHOUCAIR$")
    public void elVerificaElTituloDeQueEsSERCHOUCAIR()  {
        theActorInTheSpotlight().should(seeThat(the(H2_SER_CHOUCAIR),isVisible()));
    }

    @Cuando("^el da click en el boton convocatorias$")
    public void elDaClickEnElBotonConvocatorias()  {
        theActorInTheSpotlight().attemptsTo(BotonConvocatoria.botonConvocatoria());
    }

    @Entonces("^el verifica el texto de CONVOCATORIAS$")
    public void elVerificaElTextoDeCONVOCATORIAS()  {
        theActorInTheSpotlight().should(seeThat(the(H2_CONVOCATORIAS),isVisible()));

    }

    @Cuando("^el da click en el boton prepararse para aplicar$")
    public void elDaClickEnElBotonPrepararseParaAplicar()  {
        theActorInTheSpotlight().attemptsTo(BotonPrepararseAplicar.botonPrepararseAplicar());
    }

    @Entonces("^el verifica el texto en PREPARARSE PARA APLICAR$")
    public void elVerificaElTextoEnPREPARARSEPARAAPLICAR()  {
        theActorInTheSpotlight().should(seeThat(the(PREPARARSE_PARA_APLICAR), isVisible()));

    }

    @Cuando("^el busca una oferta de analista en medellin$")
    public void elBuscaUnaOfertaDeAnalistaEnMedellin(List<DataModel>dataSet)  {
        theActorInTheSpotlight().attemptsTo(BuscarEmpleoMedellin.con(dataSet));
            }

    @Entonces("^el verifica las ofertas de empleo como analista en medellin$")
    public void elVerificaLasOfertasDeEmpleoComoAnalistaEnMedellin(List<DataModel>dataSet)  {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(TextoResultadoBusquedaEmpleo.es(dataSet)));

    }


    @Cuando("^el busca una oferta de psicologo de seleccion en Alemania$")
    public void elBuscaUnaOfertaDePsicologoDeSeleccionEnAlemania(List<DataModel>dataSet)  {
        theActorInTheSpotlight().attemptsTo(BuscarEmpleoAlemania.con(dataSet));

    }

    @Entonces("^el verifica que no hay ofertas de empleo$")
    public void elVerificaQueNoHayOfertasDeEmpleo()  {
        theActorInTheSpotlight().should(seeThat(the(TEXTO_NO_JOBS_FOUND),isVisible()));

    }

    @Dado("^él accede a una oferta de empleo$")
    public void élAccedeAUnaOfertaDeEmpleo()  {
        theActorInTheSpotlight().wasAbleTo(IngresarAOferta.deEmpleo());

    }

    @Cuando("^él llena el formulario de inscribirse al empleo$")
    public void élLlenaElFormularioDeInscribirseAlEmpleo(List<DataModel>dataSet)  {
        theActorInTheSpotlight().attemptsTo(CompletarFormulario.deInscripcion(dataSet));

    }
    @Entonces("^el ve en pantalla el mensaje de Por favor verifica el captcha$")
    public void elVeEnPantallaElMensajeDePorFavorVerificaElCaptcha()  {
        theActorInTheSpotlight().should(seeThat(the(MENSAJE_RECAPTCHA),isVisible()));

    }

    @Manual
    @Cuando("^él ingresa a los links de la seccion prepararse para aplicar$")
    public void élIngresaALosLinksDeLaSeccionPrepararseParaAplicar()  {

    }

    @Entonces("^el verifica que se abre una pestaña con el contenido adecuado$")
    public void elVerificaQueSeAbreUnaPestañaConElContenidoAdecuado()  {

    }

    @Cuando("^él reproduce el video de la seccion empleos$")
    public void élReproduceElVideoDeLaSeccionEmpleos()  {

    }

    @Entonces("^el verifica que el contenido del video está acorde con la sección$")
    public void elVerificaQueElContenidoDelVideoEstáAcordeConLaSección()  {

    }

}
