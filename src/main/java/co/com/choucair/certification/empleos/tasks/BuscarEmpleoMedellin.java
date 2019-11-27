package co.com.choucair.certification.empleos.tasks;

import co.com.choucair.certification.empleos.models.BuscarEmpleoModel;
import co.com.choucair.certification.empleos.models.InscripcionModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import java.util.List;

import static co.com.choucair.certification.empleos.userinterfaces.ChoucairTestingJobsPage.*;
import static co.com.choucair.certification.empleos.utils.Constantes.CERO;

public class BuscarEmpleoMedellin implements Task {

    private List<BuscarEmpleoModel> dataSet;

    public BuscarEmpleoMedellin(List<BuscarEmpleoModel> dataSet) {
        this.dataSet = dataSet;
    }

    public static BuscarEmpleoMedellin con(List<BuscarEmpleoModel> dataSet) {
        return Tasks.instrumented(BuscarEmpleoMedellin.class,dataSet);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(TEXTO_PALABRAS_CLAVE),
                Click.on(TEXTO_PALABRAS_CLAVE),
                Enter.theValue(dataSet.get(CERO).getNombreEmpleo()).into(TEXTO_PALABRAS_CLAVE),
                Click.on(TEXTO_UBICACION),
                Enter.theValue(dataSet.get(CERO).getUbicacion()).into(TEXTO_UBICACION),
                Click.on(BOTON_BUSCAR_TRABAJOS)
        );

    }
}