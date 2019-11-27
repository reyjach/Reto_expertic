package co.com.choucair.certification.empleos.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.choucair.certification.empleos.userinterfaces.ChoucairTestingJobsPage.H2_SER_CHOUCAIR;

public class Resultado implements Question<Boolean> {
    private String palabra;

    private Resultado(String palabra) {
        this.palabra = palabra;
    }
    public  static Resultado esLa(String palabra){
        return new Resultado(palabra);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String texto = Text.of(H2_SER_CHOUCAIR).viewedBy(actor).asString();
        return palabra.equals(texto);
    }

}
