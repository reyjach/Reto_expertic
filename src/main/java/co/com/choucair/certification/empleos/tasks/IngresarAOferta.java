package co.com.choucair.certification.empleos.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;

import static co.com.choucair.certification.empleos.userinterfaces.ChoucairTestingJobsPage.*;

public class IngresarAOferta implements Task {
    public static IngresarAOferta deEmpleo() { return Tasks.instrumented(IngresarAOferta.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BOTON_COOKIES),
                Scroll.to(BOTON_BUSCAR_TRABAJOS),
                Click.on(TEXTO_TITULO_CARGO_UNO));
    }
}
