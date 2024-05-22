# language: es

Característica: Estos son los test de PIM

  @Test @PIM @IngresarEnPim
    Escenario: se ingresa en pim
    Dado que me logueo "Admin" "admin123"
    Entonces ingreso en PIM

  @Test @PIM @BuscarEmpleado
    Escenario: se busca un empleado por id
    Dado que me logueo "Admin" "admin123"
    Cuando ingreso en PIM
    Y busco empleado por id "0363"
    Entonces cambio su nombre a "Griselda" "Mariela" "Medrano"