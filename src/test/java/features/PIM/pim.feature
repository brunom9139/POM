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

  @Test @PIM @EditarUnUsuario
  Escenario: se agrega un nuevo empleado en pim
    Dado que me logueo "Admin" "admin123"
    Cuando ingreso en PIM
    Y busco el empleado "Christopher"
    Y edito los detalles de contacto "direc1" "direc2" "ciudadblaba" "provinhsdgsh" "1245" "4185689" "381495632" "4948596" "fjhjhj@fdghsdj.com" "jhfdjk@gg.com"
   # Y agrego un contacto de emergencia "Luis" "padre" "4941536" "382675456" "4581212"
    #Y agrego un dependiente "julia" "hija" "05/02/12"