# language: es

Característica: Estos son los test de PIM

  @Test @PIM @BuscarEmpleado
    Escenario: se busca un empleado por id
    Dado que me logueo "Admin" "admin123"
    Cuando ingreso en PIM
    Y busco empleado por id "0363"
    Entonces cambio su nombre a "Griselda" "Mariela" "Medrano"

  @Test @PIM @AgregarEmpleadoAleatoriamente
  Escenario: se agrega un nuevo empleado en pim
    Dado que me logueo "Admin" "admin123"
    Cuando ingreso en PIM
    Entonces agrego un empleado aleatoriamente

  @Test @PIM @AgregarEmpleadoAleatoriamenteYEditarlo
  Escenario: se agrega un nuevo empleado en pim
    Dado que me logueo "Admin" "admin123"
    Cuando ingreso en PIM
    Y agrego un empleado aleatoriamente
    Entonces edito su estado y rol