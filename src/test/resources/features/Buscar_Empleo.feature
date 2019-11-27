#language:es
  @BuscarEmpleo
Característica: Buscar un empleo
  como usuario quiero ingresar a la seccion empleos de choucair testing
  a buscar una oferta de empleo disponible

  Antecedentes:
    Dado que Ivan quiere ingresar al sitio Choucair Testing
    Y que él quiere acceder a la sección de empleos

  @Tag4
  Escenario: Buscar un empleo en panama
    Cuando el busca una oferta de analista de pruebas en panama
      |nombreEmpleo|Ubicacion|
      |analista de pruebas|Panama|
    Entonces  el verifica las ofertas de empleo como analista de pruebas en panama


  @Tag5
  Escenario: Buscar un empleo en medellin


    Cuando el busca una oferta de psicologo de seleccion en medellin
      |nombreEmpleo|Ubicacion|
      |analista de pruebas|Medellin|
    Entonces  el verifica las ofertas de empleo como psicologo de seleccion en medellin

  @Tag6
  Escenario: Buscar un empleo en panama
    Cuando el busca una oferta de analista de pruebas en bogota
      |nombreEmpleo|ubicacion|
      |analista de pruebas|Bogota|
    Entonces  el verifica las ofertas de empleo como analista de pruebas en bogota