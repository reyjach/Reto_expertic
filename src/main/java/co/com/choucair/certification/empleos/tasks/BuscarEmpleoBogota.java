package co.com.choucair.certification.empleos.tasks;

import co.com.choucair.certification.empleos.models.DataModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.choucair.certification.empleos.userinterfaces.ChoucairTestingJobsPage.*;
import static co.com.choucair.certification.empleos.utils.Constantes.CERO;

public class BuscarEmpleoBogota implements Task {

    private List<DataModel> dataSet;

    public BuscarEmpleoBogota(List<DataModel> dataSet) {
        this.dataSet = dataSet;
    }

    public static BuscarEmpleoBogota con(List<DataModel> dataSet) {
        return Tasks.instrumented(BuscarEmpleoBogota.class, dataSet);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(TEXTO_PALABRAS_CLAVE),
                Enter.theValue(dataSet.get(CERO).getNombreEmpleo()).into(TEXTO_PALABRAS_CLAVE),
                Click.on(TEXTO_UBICACION),
                Enter.theValue(dataSet.get(CERO).getUbicacion()).into(TEXTO_UBICACION),
                Click.on(BOTON_BUSCAR_TRABAJOS)
        );

    }
}

