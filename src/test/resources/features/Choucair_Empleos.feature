#language:es
@SeccionEmpleos
Característica: Choucair Testing seccion empleos
  como usuario quiero ingresar a la seccion empleos de choucair testing
  a buscar una oferta de empleo

  Antecedentes:
    Dado que Ivan quiere ingresar a la seccion empleos del sitio Choucair Testing

  @BotonRedireccionamiento
  Escenario: Usar botones de redireccionamiento

    Cuando el da click en el boton que es ser choucair
    Entonces  el verifica el titulo de que es SER CHOUCAIR

  @BotonRedireccionamiento
  Escenario: Usar botones de redireccionamiento
    Cuando el da click en el boton convocatorias
    Entonces  el verifica el texto de CONVOCATORIAS

  @BotonRedireccionamiento
  Escenario: Usar botones de redireccionamiento
    Cuando el da click en el boton prepararse para aplicar
    Entonces  el verifica el texto en PREPARARSE PARA APLICAR


  @BuscarEmpleoMedellin
  Escenario: Buscar un empleo en medellin
    Cuando el busca una oferta de analista en medellin
      | nombreEmpleo | Ubicacion |
      | analista     | Medellin  |
    Entonces  el verifica las ofertas de empleo como analista en medellin
      | nombreEmpleo | Ubicacion |
      | analista     | Medellín  |

  @BuscarEmpleoAlemania
  Escenario: Buscar un empleo en Alemania
    Cuando el busca una oferta de psicologo de seleccion en Alemania
      | nombreEmpleo | ubicacion |
      | psicologo     | Alemania  |
    Entonces  el verifica que no hay ofertas de empleo


  @FormularioInscripcion
  Escenario: llenar formulario con datos no validos
    Y él accede a una oferta de empleo
    Cuando él llena el formulario de inscribirse al empleo
      | nombre   | correo                 | celular     | estudiosFormales   | experiencia | conoceAutomatizacion | aspiracionSalarial | disponibilidadIngresar | mensajeAdicional                              | hojaVida         |
      | juan 123 | coreoflaso@gotmail.com | -3118961374 | tecnologo sistemas | 2 años      | si                   | 2.000.000          | Inmediata              | soy responsable, puntual. que me gusta probar | src/test/resources/PruebaHojaVida.png |

    Entonces el ve en pantalla el mensaje de Por favor verifica el captcha

  @Manual
  Escenario: Probar links
    Cuando él ingresa a los links de la seccion prepararse para aplicar
    Entonces el verifica que se abre una pestaña con el contenido adecuado

  @Manual
  Escenario: Probar video
    Cuando él reproduce el video de la seccion empleos
    Entonces el verifica que el contenido del video está acorde con la sección

