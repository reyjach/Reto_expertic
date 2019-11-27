package co.com.choucair.certification.empleos.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static co.com.choucair.certification.empleos.userinterfaces.ChoucairTestingJobsInterna.CAMPO_HOJA_VIDA;

public class SubirArchivo implements Interaction {

    private String path;

    public SubirArchivo(String path) {
        this.path = path;
    }

    public static SubirArchivo desde(String path) { return Tasks.instrumented(SubirArchivo.class,path);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        BrowseTheWeb.as(actor)
                .upload(path)
                .to(CAMPO_HOJA_VIDA.resolveFor(actor));
    }
}
