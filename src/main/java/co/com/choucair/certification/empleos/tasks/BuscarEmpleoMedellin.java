package co.com.choucair.certification.empleos.tasks;

import co.com.choucair.certification.empleos.models.DataModel;
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

    private List<DataModel> dataSet;

    public BuscarEmpleoMedellin(List<DataModel> dataSet) {
        this.dataSet = dataSet;
    }

    public static BuscarEmpleoMedellin con(List<DataModel> dataSet) {
        return Tasks.instrumented(BuscarEmpleoMedellin.class,dataSet);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BOTON_COOKIES),
                Scroll.to(TITULO_EMPLEOS_DISPONIBLES),
                Enter.theValue(dataSet.get(CERO).getNombreEmpleo()).into(TEXTO_PALABRAS_CLAVE),
                Enter.theValue(dataSet.get(CERO).getUbicacion()).into(TEXTO_UBICACION),
                Click.on(BOTON_BUSCAR_TRABAJOS)
        );

    }
}
