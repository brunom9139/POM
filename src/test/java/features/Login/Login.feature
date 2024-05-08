# language: es

Característica: Estos son los test de logeo y deslogeo de la pagina

  @Test @Logeo @LogeoCorrecto
  Escenario: Se valida logeo exitoso
    Dado que me logueo "Admin" "admin123"
    Entonces valido que ingrese "Dashboard"


  @Test @Logeo @LogeoIncorrecto
  Escenario: Se valida logeo exitoso
    Dado que me logueo "Admin" "contraseniamal"
    Entonces Valido que no pude ingresar correctamente a la pagina "Invalid credentials"