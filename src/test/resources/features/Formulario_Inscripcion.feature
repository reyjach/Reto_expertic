#language:es
  @FormularioInscripcion
Característica: Formulario de Inscripcion a empleo
  como usuario quiero ingresar a una oferta de empleo
  a completar el formulario de inscripción a empleo

  Antecedentes:
    Dado que Ivan quiere ingresar al sitio Choucair Testing
    Y que él quiere acceder a la sección de empleos

  @Tag7
  Escenario: llenar formulario correctos
    Y él quiere acceder a una oferta de empleo
    Cuando él llena el formulario de inscribirse al empleo
      | nombre  | correo | celular | estudiosFormales | experiencia | conoceAutomatizacion | aspiracionSalarial | disponibilidadIngresar | mensajeAdicional | hojaVida |
      | pepe arturo lovezno  | coreoflaso@gotmail.com | 3118961374 | tecnologo sistemas | 2 años | si | 2.000.000 | Inmediata | soy responsable, puntual. que me gusta probar | C:\Users\Ivan Jimenez\Desktop\Screenshot_1.png |

    Entonces el verifica que se carga la pantalla con el texto Double Click on Edit Icon to EDIT the Table Row


  @Tag8
  Escenario: llenar formulario incorrectos
    Dado que carlos quiere llenar el formulario con datos incorrectos
    Cuando el llena el formualrio de la pagina
      | nombre  | correo | celular | estudiosFormales | experiencia | conoceAutomatizacion | aspiracionSalarial | disponibilidadIngresar | mensajeAdicional | hojaVida |
      | pepito perez  | coreoflaso@correo.com | -3118961374 | gaminiar y hacer nada | ni chimba  | no | 15.000.000 | Inmediata | soy del verde y soy feliz |  |

    Entonces el verifica que se carga la pantalla con el texto Double Click on Edit Icon to EDIT the Table Row

