#language:es
  @Tag0
Característica: Botones de redireccionamiento
  como usuario quiero ingresar a la seccion empleos de choucair testing
  a leer la información utilizando los botones de redirección

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
      | analista de pruebas | Panama    |
    Entonces  el verifica las ofertas de empleo como analista de pruebas en panama


  @Tag5
  Escenario: Buscar un empleo en medellin
    Cuando el busca una oferta de psicologo de seleccion en medellin
      | nombreEmpleo        | Ubicacion |
      | analista de pruebas | Medellin  |
    Entonces  el verifica las ofertas de empleo como psicologo de seleccion en medellin

  @Tag6
  Escenario: Buscar un empleo en panama
    Cuando el busca una oferta de analista de pruebas en bogota
      | nombreEmpleo        | ubicacion |
      | analista de pruebas | Bogota    |
    Entonces  el verifica las ofertas de empleo como analista de pruebas en bogota


  @Tag7
  Escenario: llenar formulario con datos correctos
    Y él accede a una oferta de empleo
    Cuando él llena el formulario de inscribirse al empleo
      | nombre              | correo                 | celular    | estudiosFormales   | experiencia | conoceAutomatizacion | aspiracionSalarial | disponibilidadIngresar | mensajeAdicional                              | hojaVida                                       |
      | pepe arturo lovezno | coreoflaso@gotmail.com | 3118961374 | tecnologo sistemas | 2 años      | si                   | 2.000.000          | Inmediata              | soy responsable, puntual. que me gusta probar | C:\Users\Ivan Jimenez\Desktop\Screenshot_1.png |

    Entonces el verifica que se carga la pantalla con el texto Double Click on Edit Icon to EDIT the Table Row


  @Tag8
  Escenario: llenar formulario con datos incorrectos
    Y él ingresa a una oferta de empleo
    Cuando él llena el formulario de inscripción al empleo
      | nombre       | correo                | celular     | estudiosFormales      | experiencia | conoceAutomatizacion | aspiracionSalarial | disponibilidadIngresar | mensajeAdicional          | hojaVida |
      | pepito perez | coreoflaso@correo.com | -3118961374 | gaminiar y hacer nada | ni chimba   | no                   | 15.000.000         | Inmediata              | soy del verde y soy feliz |          |

    Entonces el verifica que se carga la pantalla con el texto Double Click on Edit Icon to EDIT the Table Row

