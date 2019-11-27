package co.com.choucair.certification.empleos.questions;

import co.com.choucair.certification.empleos.models.DataModel;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.List;
import static co.com.choucair.certification.empleos.userinterfaces.ChoucairTestingJobsPage.*;
import static co.com.choucair.certification.empleos.utils.Constantes.CERO;

public class TextoBuscarTrabajo implements Question<Boolean> {
    private List<DataModel> dataSet;

    public TextoBuscarTrabajo(List<DataModel> dataSet) {
        this.dataSet = dataSet;
    }

    public static TextoBuscarTrabajo es(List<DataModel> dataSet){
        return new TextoBuscarTrabajo(dataSet);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean valor = false;
        List<WebElementFacade> listOpciones = TEXTO_TITULO_CARGO.resolveAllFor(actor);
        List<WebElementFacade> listOpciones2 = TEXTO_CIUDAD_CARGO.resolveAllFor(actor);
        for (WebElementFacade opcionon : listOpciones) {
            if (opcionon.getText().trim().equals(dataSet.get(CERO).getNombreEmpleo())){
                valor = true;
            }
        }
        for (WebElementFacade opcionon2 : listOpciones) {
            //System.out.println(dato + opcion.getText().trim());
            if (opcionon2.getText().trim().equals(dataSet.get(CERO).getUbicacion())){
                valor = true;
            }
        }

        if(valor){
            return true;
        }else {
            return false;
        }

    }
}
