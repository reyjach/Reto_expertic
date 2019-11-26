#language:es
@Tag0
Característica: Choucair Testing seccion empleos
  como usuario quiero ingresar a la seccion empleos de choucair testing
  a probar todo (?

  Antecedentes:
    Dado que Ivan quiere ingresar al sitio Choucair Testing

  @Tag1
  Escenario: Usar botones de redireccionamiento
    Y que pepe quiere ver el contenido de la pagina de empleos
    Cuando el da click en el boton que es ser choucair
    Entonces  el verifica el texto de que es ser choucair
  @Tag2
  Escenario: Usar botones de redireccionamiento
    Y que pepe quiere ver el contenido de la pagina de empleos
    Cuando el da click en el boton convocatorias
    Entonces  el verifica el texto de convocatorias

  @Tag3
  Escenario: Usar botones de redireccionamiento
    Y que pepe quiere ver el contenido de la pagina de empleos
    Cuando el da click en el boton prepararse para aplicar
    Entonces  el verifica el texto de prepararse para aplicar

  @Tag4
  Escenario: Buscar un empleo en panama
    Y que pepe quiere acceder a la pagina de empleos
    Cuando el busca una oferta de analista de pruebas en panama
      |nombreEmpleo|Ubicacion|
      |analista de pruebas|Panama|
    Entonces  el verifica las ofertas de empleo como analista de pruebas en panama


  @Tag5
  Escenario: Buscar un empleo en medellin

  |nombreEmpleo|Ubicacion|
    |analista de pruebas|Medellin|
    Y que pepe quiere acceder a la pagina de empleos
    Cuando el busca una oferta de psicologo de seleccion en medellin

    Entonces  el verifica las ofertas de empleo como psicologo de seleccion en medellin

  @Tag6
  Escenario: Buscar un empleo en panama
    Y que pepe quiere acceder a la pagina de empleos
    Cuando el busca una oferta de analista de pruebas en bogota
    |nombreEmpleo|Ubicacion|
    |analista de pruebas|Bogota|
    Entonces  el verifica las ofertas de empleo como analista de pruebas en bogota
