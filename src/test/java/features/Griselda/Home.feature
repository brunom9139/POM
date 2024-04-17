# language: es

Característica: Estos test solo tienen click a paginas de la home de demoqa


  @Test @home @CajaDeTexto
    Escenario: Entrega de datos en caja de texto
    Dado ingreso en elementos
    Cuando me dirijo a caja de texto
    Y completo los campos
    Entonces entrego los dato declarados


  @Test @home @DobleClickEnBoton
    Escenario: Verificar click doble en un boton
    Dado ingreso en elementos
    Cuando me dirijo a botones
    Y hago doble click en el el primer boton
    Entonces verifico que aparezca el texto "Has hecho un doble clic"


  @Test @home @TestCasillaVerificacion
Escenario: Validar la selección de todos los checkbox de la seccion hogar
Dado ingreso en elementos
Cuando me dirijo a casilla de verificacion
Y tildo todos los checkbox de hogar
Entonces  verifico que apareza el texto "You have selected :"

  @Test @Home @form
Escenario: Completar formulario de practica al azar
   Dado ingreso en forms
   Cuando me dirijo a formulario de practica
   Y completo los datos del formulario
   Entonces entrego los datos

