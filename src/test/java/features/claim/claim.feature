# language: es

Característica: Estos son los test de Cleam

  @Test @Cleam @CrearUnReclamo
  Escenario: se crea un reclamo de un empleado al azar
    Dado que me logueo "Admin" "admin123"
    Cuando ingreso en Cleam
    Entonces creo un reclamo al azar sin observaciones

  @Test @Cleam @AgregarExpensaTodos
  Escenario: se crea un reclamo de un empleado al azar
    Dado que me logueo "Admin" "admin123"
    Cuando ingreso en Cleam
    Y reviso todos los empleados
    Entonces agreago una expensa de "20000"
