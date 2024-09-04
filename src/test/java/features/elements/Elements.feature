# language: es

Característica: Estos test se basan en la parte Elements de demoqa

  @TEST
  Escenario: Se valida la carga del formulario de TextBox en Elements
    Dado que ingreso a la seccion element
    Cuando ingreso a la seccion TextBox
    Y completo el formulario "Alexis Medrano" "alexis@gmail.com" "Direccion1" "Direccion2"
    Entonces valido el nombre del "Alexis Medrano"

  @TEST
  Escenario: Se valida que se selecciono los check de la seccion checkbox
    Dado que ingreso a la seccion element
    Cuando ingreso a la seccion ChexBox
    Y selecciono todos los chexbox
    Entonces valido que aparezca el texto "You have selected"

  @TEST
  Escenario: Se valida que se selecciono el boton Yes de la seccion Radio
    Dado que ingreso a la seccion element
    Cuando ingreso a la seccion Radio
    Y selecciona el boton Yes
    Entonces Se valida que aparezca el mensaje "Yes"

  @TEST
  Escenario: Se valida que se selecciono el boton No de la seccion Radio
    Dado que ingreso a la seccion element
    Cuando ingreso a la seccion Radio
    Y selecciona el boton impressive
    Entonces Se valida que aparezca el mensaje "Impressive"

  @TEST
  Escenario: Buscar nombre en la tabla de la seccion Web Tables
    Dado que ingreso a la seccion element
    Cuando ingreso a la seccion Web Tables
    Y busca por el nombre "Cierra"
    Entonces Se valida que encontro el nombre "Cierra" en la tabla web tables

  @TEST
  Escenario: Eliminar nombre buscado de la seccion Web Tables
    Dado que ingreso a la seccion element
    Cuando ingreso a la seccion Web Tables
    Y busca por el nombre "Cierra"
    Y elimino la primera fila encontrada
    Entonces Se valida que aparece en Web Tables el mensaje "No rows found"

  @TEST
  Escenario: Editar el primer nombre buscado en la seccion Web Tables
    Dado que ingreso a la seccion element
    Cuando ingreso a la seccion Web Tables
    Y busca por el nombre "Cierra"
    Y edito el nombre Cierra por "Medrano"
    Entonces Se valida se edito el nombre "Medrano" de manera correcta

  @TEST
  Escenario: Validar todos los botones de la seccion Button
    Dado que ingreso a la seccion element
    Cuando ingreso a la seccion Button
    Y click en los tres botones
    Entonces Se valida los siguientes mensajes "You have done a double click" "You have done a right click" "You have done a dynamic click"