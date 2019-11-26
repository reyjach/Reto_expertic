package co.com.choucair.certification.empleos.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairTestingJobsInterna {
    public static final Target BOTON_INSCRIBIRSE = Target.the("botón para desplegar el formulario de inscripción").located(By.xpath("//input[@class='application_button button']"));
    public static final Target CAMPO_NOMBRE = Target.the("Campo para escribir el nombre completo").located(By.name("your-name"));
    public static final Target CAMPO_CORREO_ELECTRONICO = Target.the("Campo para escribir el correo electrónico").located(By.name("your-email"));
    public static final Target CAMPO_CELULAR_TELEFONO = Target.the("Campo para escribir el celular o telefono de contacto").located(By.name("tel"));
    public static final Target AREA_ESTUDIOS_FORMALES = Target.the("Area para escribir los estudios formales").located(By.name("estudios"));
    public static final Target AREA_TIEMPO_EXPERIENCIA = Target.the("Area para escribir el tiempo de experiencia").located(By.name("exp"));
    public static final Target AREA_CONOCES_AUTOMATIZACION = Target.the("Area para escribir si tiene conocimientos en automatización de pruebas").located(By.name("auto"));
    public static final Target CAMPO_ASPIRACION_SALARIAL = Target.the("Area para escribir la aspiración salarial").located(By.name("salario"));
    public static final Target SELECT_DISPONIBILIDAD_TIEMPO = Target.the("Desplegable para seleccionar la disponibilidad de tiempo para aceptar el empleo").located(By.name("curso"));
    public static final Target AREA_MENSAJE_ADICIONAL = Target.the("Area para escribir el mensaje adicional").located(By.name("your-message"));
    public static final Target CAMPO_HOJA_VIDA = Target.the("Campo para subir el archivo con la hoja de vida").located(By.name("file-736"));
    public static final Target RECAPTCHA = Target.the("captcha").located(By.id("recaptcha-anchor-label"));
    public static final Target BOTON_ENVIAR = Target.the("botón para enviar los datos del formulario").located(By.id("//input[@value='Enviar']"));

}
