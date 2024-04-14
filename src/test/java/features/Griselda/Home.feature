# language: es

Característica: Estos test solo tienen click a paginas de la home de demoqa

 @TestCasillaVerificacion
Escenario: Validar la selección de todos los checkbox de la seccion hogar
Dado ingreso en elementos
Cuando me dirijo a casilla de verificacion
Y tildo todos los checkbox de hogar
Entonces  verifico que apareza el texto "You have selected :"

  @form
Escenario: Completar formulario de practica al azar
   Dado ingreso en forms
   Cuando me dirijo a formulario de practica
   Y completo los datos del formulario
   Entonces entrego los datos
