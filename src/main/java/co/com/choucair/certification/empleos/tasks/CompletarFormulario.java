package co.com.choucair.certification.empleos.tasks;

import co.com.choucair.certification.empleos.interactions.SubirArchivo;
import co.com.choucair.certification.empleos.models.InscripcionModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static co.com.choucair.certification.empleos.userinterfaces.ChoucairTestingJobsInterna.*;
import static co.com.choucair.certification.empleos.utils.Constantes.CERO;

public class CompletarFormulario implements Task {

    private List<InscripcionModel>dataSet;
    public CompletarFormulario(List<InscripcionModel> dataSet) { this.dataSet = dataSet;  }

    public static CompletarFormulario deInscripcion(List<InscripcionModel> dataSet) {return Tasks.instrumented(CompletarFormulario.class, dataSet);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(VIDEO_JOBS),
                Click.on(BOTON_INSCRIBIRSE),
                Enter.theValue(dataSet.get(CERO).getNombre()).into(CAMPO_NOMBRE),
                Enter.theValue(dataSet.get(CERO).getCorreo()).into(CAMPO_CORREO_ELECTRONICO),
                Enter.theValue(dataSet.get(CERO).getCelular()).into(CAMPO_CELULAR_TELEFONO),
                Enter.theValue(dataSet.get(CERO).getEstudiosFormales()).into(AREA_ESTUDIOS_FORMALES),
                Enter.theValue(dataSet.get(CERO).getExperiencia()).into(AREA_TIEMPO_EXPERIENCIA),
                Enter.theValue(dataSet.get(CERO).getConoceAutomatizacion()).into(AREA_CONOCES_AUTOMATIZACION),
                Enter.theValue(dataSet.get(CERO).getAspiracionSalarial()).into(CAMPO_ASPIRACION_SALARIAL),
                SelectFromOptions.byVisibleText(dataSet.get(CERO).getDisponibilidadIngresar()).from(SELECT_DISPONIBILIDAD_TIEMPO),
                Enter.theValue(dataSet.get(CERO).getMensajeAdicional()).into(AREA_MENSAJE_ADICIONAL),
                Scroll.to(AREA_MENSAJE_ADICIONAL),
                SubirArchivo.desde(dataSet.get(CERO).getHojaVida())
        );
    }
}
