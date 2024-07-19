# language: es

Característica: Estos son los test de demoqa, comienzan con click en pagina principal

  @Test @Elements @texbox
    Escenario: se completa formulario text box
    Dado que ingreso a elements
    Cuando me dirijo a text box
    Entonces completo los campos con los datos "Medrano Griselda" "griseldamedrano1@gmail.com" "Aeropuerto Benjamin Matienzo" "Pasaje 1° de mayo Alderetes" y envio


  @Test @Elements @checkbox
    Escenario: se tildan todos las casillas desde hogar
    Dado que ingreso a elements
    Cuando me dirijo a checkbox
    Entonces tildo la casilla hogar