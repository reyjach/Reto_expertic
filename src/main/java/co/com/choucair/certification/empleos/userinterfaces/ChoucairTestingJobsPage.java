package co.com.choucair.certification.empleos.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairTestingJobsPage {
    private ChoucairTestingJobsPage() {
    }

    public static final Target BOTON_SER_CHOUCAIR = Target.the("enlace al contenido de ¿qué es ser choucair?").located(By.xpath("//a[@href='#ser'][img]"));
    public static final Target BOTON_CONVOCATORIAS = Target.the("enlace al contenido de convocatorias").located(By.xpath("//a[@href='#convocatorias'][img]"));
    public static final Target BOTON_PREPARARSE = Target.the("enlace al contenido de prepararse para aplicar").located(By.xpath("//a[@href='#preparse'][img]"));
    public static final Target TEXTO_PALABRAS_CLAVE = Target.the("campo para escribir las palabras claves a buscar").located(By.id("search_keywords"));
    public static final Target TEXTO_UBICACION = Target.the("campo para escribir la ubicación a buscar").located(By.id("search_location"));
    public static final Target BOTON_BUSCAR_TRABAJOS = Target.the("botón para buscar trabajos").located(By.xpath("//input[@value='Buscar trabajos']"));
    public static final Target TEXTO_TITULO_CARGO = Target.the("texto que contiene el título del cargo disponible").located(By.xpath("//ul//h3"));
    public static final Target TEXTO_CIUDAD_CARGO = Target.the("texto que contiene la ubicación del cargo disponible").located(By.xpath("//div[@class='location']"));
    public static final Target H2_SER_CHOUCAIR = Target.the("el texto de ser choucair").located(By.xpath("//h2[contains(text(),'SER CHOUCAIR')]"));
    public static final Target H2_CONVOCATORIAS = Target.the("el texto convocatorias").located(By.xpath("//h2[contains(text(),'CONVOCATORIAS')]"));
    public static final Target PREPARARSE_PARA_APLICAR = Target.the("el texto prepararse para aplicar").located(By.xpath("//h2[contains(text(),'PREPARARSE PARA APLICAR')]"));
    public static final Target TITULO_EMPLEOS_DISPONIBLES = Target.the("titulo de empleos disponibles").located(By.xpath("//h2[@class='elementor-heading-title elementor-size-default']"));
    public static final Target BOTON_COOKIES = Target.the("captcha").located(By.id("cookie_action_close_header"));
    public static final Target TEXTO_NO_JOBS_FOUND = Target.the("captcha").located(By.xpath("//li[@class='no_job_listings_found']"));
}
