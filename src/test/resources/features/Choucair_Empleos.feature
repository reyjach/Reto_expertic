#language:es
@Tag0
Característica: Choucair Testing seccion empleos
  como usuario quiero ingresar a la seccion empleos de choucair testing
  a probar todo (?

  Antecedentes:
    Dado que Ivan quiere ingresar a la seccion empleos del sitio Choucair Testing

  @Tag1
  Escenario: Usar botones de redireccionamiento

    Cuando el da click en el boton que es ser choucair
    Entonces  el verifica el titulo de que es SER CHOUCAIR

  @Tag2
  Escenario: Usar botones de redireccionamiento
    Cuando el da click en el boton convocatorias
    Entonces  el verifica el texto de CONVOCATORIAS

  @Tag3
  Escenario: Usar botones de redireccionamiento
    Cuando el da click en el boton prepararse para aplicar
    Entonces  el verifica el texto en PREPARARSE PARA APLICAR

  @Tag4
  Escenario: Buscar un empleo en panama
    Cuando el busca una oferta de analista de pruebas en panama
      | nombreEmpleo        | Ubicacion |
      | analista de pruebas | Panamá    |
    Entonces  el verifica las ofertas de empleo como analista de pruebas en panama
      | nombreEmpleo        | Ubicacion |
      | analista de pruebas Panamá | Panamá    |


  @Tag5
  Escenario: Buscar un empleo en medellin
    Cuando el busca una oferta de psicologo de seleccion en medellin
      | nombreEmpleo        | Ubicacion |
      | analista de pruebas | Medellin  |
    Entonces  el verifica las ofertas de empleo como psicologo de seleccion en medellin
      | nombreEmpleo        | Ubicacion |
      | analista de pruebas Medellín | Medellin  |

  @Tag6
  Escenario: Buscar un empleo en Alemania
    Cuando el busca una oferta de analista de pruebas en Alemania
      | nombreEmpleo        | ubicacion |
      | analista de pruebas | Alemania    |
    Entonces  el verifica que no hay ofertas de empleo
      | nombreEmpleo        | ubicacion |
      | analista de pruebas Alemania | Alemania    |

  @Tag7
  Escenario: llenar formulario con datos correctos
    Y él accede a una oferta de empleo
    Cuando él llena el formulario de inscribirse al empleo
      | nombre              | correo                 | celular    | estudiosFormales   | experiencia | conoceAutomatizacion | aspiracionSalarial | disponibilidadIngresar | mensajeAdicional                              | hojaVida                                       |
      | pepe arturo lovezno | coreoflaso@gotmail.com | 3118961374 | tecnologo sistemas | 2 años      | si                   | 2.000.000          | Inmediata              | soy responsable, puntual. que me gusta probar | C:\Users\Ivan Jimenez\Desktop\Screenshot_1.png |

    Entonces el ve en pantalla el mensaje de Por favor verifica el captcha

