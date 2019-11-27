#language:es
  @BotonesRedireccionamiento
Característica: Botones de redireccionamiento
  como usuario quiero ingresar a la seccion empleos de choucair testing
  a leer la información utilizando los botones de redirección

  Antecedentes:
    Dado que Ivan quiere ingresar al sitio Choucair Testing
    Y que él quiere acceder a la sección de empleos

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