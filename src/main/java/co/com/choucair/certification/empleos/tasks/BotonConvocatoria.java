package co.com.choucair.certification.empleos.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.certification.empleos.userinterfaces.ChoucairTestingJobsPage.BOTON_CONVOCATORIAS;

public class BotonConvocatoria implements Task {


    public static BotonConvocatoria botonConvocatoria(){return Tasks.instrumented(BotonConvocatoria.class);}

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BOTON_CONVOCATORIAS));
    }

}
