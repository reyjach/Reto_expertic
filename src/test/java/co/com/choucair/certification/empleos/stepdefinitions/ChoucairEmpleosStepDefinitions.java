package co.com.choucair.certification.empleos.stepdefinitions;

import co.com.choucair.certification.empleos.models.DataModel;
import co.com.choucair.certification.empleos.questions.TextoBuscarTrabajo;
import co.com.choucair.certification.empleos.tasks.*;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;

import java.util.List;

import static co.com.choucair.certification.empleos.userinterfaces.ChoucairTestingJobsInterna.MENSAJE_RECAPTCHA;
import static co.com.choucair.certification.empleos.userinterfaces.ChoucairTestingJobsPage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class ChoucairEmpleosStepDefinitions {

@Dado("^que (.*) quiere ingresar a la seccion empleos del sitio Choucair Testing$")
public void queIvanQuiereIngresarALaSeccionEmpleosDelSitioChoucairTesting(String ivan)  {
    theActorCalled(ivan).wasAbleTo(Abrir.laPaginaDeChoucair(),IngresarALaSeccion.empleos());
    
}

    @Cuando("^el da click en el boton que es ser choucair$")
    public void elDaClickEnElBotonQueEsSerChoucair()  {
        theActorInTheSpotlight().attemptsTo(Botones.boton());

    }

    @Entonces("^el verifica el titulo de que es SER CHOUCAIR$")
    public void elVerificaElTituloDeQueEsSERCHOUCAIR()  {
        theActorInTheSpotlight().should(seeThat(the(H2_SER_CHOUCAIR),isVisible()));
    }

    @Cuando("^el da click en el boton convocatorias$")
    public void elDaClickEnElBotonConvocatorias()  {
        theActorInTheSpotlight().attemptsTo(Botones2.boton());


    }

    @Entonces("^el verifica el texto de CONVOCATORIAS$")
    public void elVerificaElTextoDeCONVOCATORIAS()  {
        theActorInTheSpotlight().should(seeThat(the(H2_CONVOCATORIAS),isVisible()));

    }

    @Cuando("^el da click en el boton prepararse para aplicar$")
    public void elDaClickEnElBotonPrepararseParaAplicar()  {
        theActorInTheSpotlight().attemptsTo(Botones3.boton());
    }

    @Entonces("^el verifica el texto en PREPARARSE PARA APLICAR$")
    public void elVerificaElTextoEnPREPARARSEPARAAPLICAR()  {
        theActorInTheSpotlight().should(seeThat(the(PREPARARSE_PARA_APLICAR), isEnabled()));

    }

    @Cuando("^el busca una oferta de analista de pruebas en panama$")
    public void elBuscaUnaOfertaDeAnalistaDePruebasEnPanama(List<DataModel>dataSet)  {
        theActorInTheSpotlight().attemptsTo(BuscarEmpleoPanama.con(dataSet));
    }

    @Entonces("^el verifica las ofertas de empleo como analista de pruebas en panama$")
    public void elVerificaLasOfertasDeEmpleoComoAnalistaDePruebasEnPanama(List<DataModel>dataSet)  {
        theActorInTheSpotlight().should(seeThat(TextoBuscarTrabajo.es(dataSet)));

    }

    @Cuando("^el busca una oferta de psicologo de seleccion en medellin$")
    public void elBuscaUnaOfertaDePsicologoDeSeleccionEnMedellin(List<DataModel>dataSet)  {
        theActorInTheSpotlight().attemptsTo(BuscarEmpleoMedellin.con(dataSet));
            }

    @Entonces("^el verifica las ofertas de empleo como psicologo de seleccion en medellin$")
    public void elVerificaLasOfertasDeEmpleoComoPsicologoDeSeleccionEnMedellin(List<DataModel>dataSet)  {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(TextoBuscarTrabajo.es(dataSet)));

    }


    @Cuando("^el busca una oferta de analista de pruebas en Alemania$")
    public void elBuscaUnaOfertaDeAnalistaDePruebasEnAlemania(List<DataModel>dataSet)  {
        theActorInTheSpotlight().attemptsTo(BuscarEmpleoBogota.con(dataSet));

    }

    @Entonces("^el verifica que no hay ofertas de empleo$")
    public void elVerificaQueNoHayOfertasDeEmpleo(List<DataModel>dataSet)  {
        theActorInTheSpotlight().should(seeThat(TextoBuscarTrabajo.es(dataSet)));

    }

    @Dado("^él accede a una oferta de empleo$")
    public void élAccedeAUnaOfertaDeEmpleo()  {
        theActorInTheSpotlight().wasAbleTo(IngresarAOferta.deEmpleo());

    }

    @Cuando("^él llena el formulario de inscribirse al empleo$")
    public void élLlenaElFormularioDeInscribirseAlEmpleo(List<DataModel>dataSet)  {
        theActorInTheSpotlight().attemptsTo(CompletarFormulario.deInscripcion(dataSet));

    }
    @Entonces("^el ve en pantalla el mensaje de (.*)$")
    public void elVeEnPantallaElMensajeDePorFavorVerificaElCaptcha(String mensaje)  {
        theActorInTheSpotlight().should(seeThat(the(MENSAJE_RECAPTCHA),isVisible()));

    }



}
