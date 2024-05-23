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

  @Test @Logeo @LogueoyDeslogueo
   Escenario: se loguea y desloguea
    Dado que me logueo "Admin" "admin123"
    Cuando valido que ingrese "Dashboard"
    Y me deslogueo
    Entonces verifico que me deslogueo con el texto "Login"





