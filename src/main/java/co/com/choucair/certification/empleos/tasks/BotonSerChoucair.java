package co.com.choucair.certification.empleos.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.certification.empleos.userinterfaces.ChoucairTestingJobsPage.BOTON_SER_CHOUCAIR;

public class BotonSerChoucair implements Task {


    public static BotonSerChoucair botonSerChoucair(){return Tasks.instrumented(BotonSerChoucair.class);}

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BOTON_SER_CHOUCAIR));
    }

}
