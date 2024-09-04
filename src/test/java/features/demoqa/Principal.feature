# language: es

Característica: Estos son los test de demoqa, comienzan con click en pagina principal

  @Test @Elements @texbox
    Escenario: se completa formulario text box
    Dado que ingreso a elements
    Cuando me dirijo a text box
    Entonces completo los campos con los datos "Medrano Griselda" "griseldamedrano1@gmail.com" "Aeropuerto Benjamin Matienzo" "Pasaje 1° de mayo Alderetes" y envio


  @Test @Elements @checkboxTodos
    Escenario: se tildan todos las casillas desde hogar
    Dado que ingreso a elements
    Cuando me dirijo a checkbox
    Entonces tildo la casilla hogar

  @Test @Elements @checkboxDesktop
  Escenario: se tildan la casilla desktop
    Dado que ingreso a elements
    Cuando me dirijo a checkbox
    Entonces tildo la casilla desktop

  @Test @Elements @checkboxNote
  Escenario: se tilda la casilla note de desktop
    Dado que ingreso a elements
    Cuando me dirijo a checkbox
    Entonces tildo la casilla note

  @Test @Elements @checkboxCommands
  Escenario: se tilda la casilla commands de desktop
    Dado que ingreso a elements
    Cuando me dirijo a checkbox
    Entonces tildo la casilla commands

  @Test @Elements @checkboxAngular
  Escenario: se tilda la casilla angular de workspace documents
    Dado que ingreso a elements
    Cuando me dirijo a checkbox
    Entonces tildo la casilla angular