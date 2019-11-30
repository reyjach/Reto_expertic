package co.com.choucair.certification.empleos.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.certification.empleos.userinterfaces.ChoucairTestingJobsPage.BOTON_PREPARARSE;

public class BotonPrepararseAplicar implements Task {


    public static BotonPrepararseAplicar botonPrepararseAplicar(){return Tasks.instrumented(BotonPrepararseAplicar.class);}

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BOTON_PREPARARSE));
    }

}
