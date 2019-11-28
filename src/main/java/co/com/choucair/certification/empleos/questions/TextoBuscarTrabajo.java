package co.com.choucair.certification.empleos.questions;

import co.com.choucair.certification.empleos.models.DataModel;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.List;

import static co.com.choucair.certification.empleos.userinterfaces.ChoucairTestingJobsPage.TEXTO_CIUDAD_CARGO;
import static co.com.choucair.certification.empleos.userinterfaces.ChoucairTestingJobsPage.TEXTO_TITULO_CARGO;
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
        List<WebElementFacade> listCargos = TEXTO_TITULO_CARGO.resolveAllFor(actor);
        List<WebElementFacade> listUbicaciones = TEXTO_CIUDAD_CARGO.resolveAllFor(actor);
        for (WebElementFacade cargo : listCargos) {
            if (!cargo.getText().trim().toLowerCase().contains(dataSet.get(CERO).getNombreEmpleo().toLowerCase())){
                return false;
            }
        }
        for (WebElementFacade ubicacion : listUbicaciones) {
            if (!ubicacion.getText().trim().toLowerCase().contains(dataSet.get(CERO).getUbicacion().toLowerCase())){
                return false;
            }
        }
       return true;
    }
}
