package co.com.choucair.certification.empleos.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.choucair.certification.empleos.userinterfaces.ChoucairTestingJobsPage.H2_CONVOCATORIAS;

public class Resultado2 implements Question<Boolean> {
    private String palabra;

    private Resultado2(String palabra) {
        this.palabra = palabra;
    }
    public  static Resultado2 esLa(String palabra){
        return new Resultado2(palabra);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String texto = Text.of(H2_CONVOCATORIAS).viewedBy(actor).asString();
        return palabra.equals(texto);
    }

}
