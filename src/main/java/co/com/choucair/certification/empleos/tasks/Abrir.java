package co.com.choucair.certification.empleos.tasks;

import co.com.choucair.certification.empleos.userinterfaces.ChoucairTestingHomePageUrl;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;


public class Abrir implements Task {

    private ChoucairTestingHomePageUrl choucairTestingHomePageUrl;


    public static Performable laPaginaDeChoucair() { return (Tasks.instrumented(Abrir.class));}


    @Override
    public <T extends Actor> void performAs(T actor ) {
        actor.attemptsTo(Open.browserOn(choucairTestingHomePageUrl));
    }
}
