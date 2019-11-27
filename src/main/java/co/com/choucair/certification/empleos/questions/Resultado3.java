package co.com.choucair.certification.empleos.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import static co.com.choucair.certification.empleos.userinterfaces.ChoucairTestingJobsPage.*;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;


public class Resultado3 implements Question<Boolean> {
    private String palabra;

    private Resultado3(String palabra) {
        this.palabra = palabra;
    }
    public  static Resultado3 esLa(String palabra){
        return new Resultado3(palabra);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        String texto = Text.of(PREPARARSE_PARA_APLICAR).viewedBy(actor).asString();
        return palabra.equals(texto);
    }

}
