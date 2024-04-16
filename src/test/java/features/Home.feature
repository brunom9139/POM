# language: es
#lalalal
Característica: Estos test solo tienen click a paginas de la home de demoqa

  @home23 @testLogeo @FIX_23
  Escenario: Logeo
    Dado que ingreso a la seccion elements
    Entonces valido que aparece el texto "Please select an item from left to start practice."


  @home23
  Escenario: Logeo 2
    Dado que ingreso a la seccion elements
    Entonces valido que aparece el texto "Please select an item from left to start practice."


  @18
  Escenario: Logeo 3
    Dado que hago click en cada input

  @cambioVentana
  Escenario: Probar el cambio de ventana
    Dado que hago click en Join Now
    Y cambio a la nueva ventana
    Y hago click en el boton Tutorial
    Entonces regreso a la ventana principal
    Dado que hago click en Join Now
