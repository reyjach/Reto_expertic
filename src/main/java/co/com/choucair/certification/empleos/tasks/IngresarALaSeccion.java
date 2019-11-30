package co.com.choucair.certification.empleos.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.certification.empleos.userinterfaces.ChoucairTestingHomePage.BOTON_EMPLEOS;

public class IngresarALaSeccion implements Task {
    public static IngresarALaSeccion empleos() { return Tasks.instrumented(IngresarALaSeccion.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BOTON_EMPLEOS));
    }
}
