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


  @Test @Logeo @FiltrarUsuario
    Escenario: buscamos el usuario FMLName1
    Dado que me logueo "Admin" "admin123"
    Cuando valido que ingrese "Dashboard"
    Y en admin busco al usuario "FMLName1" ESS "FName LName" Enabled
    Entonces verifico que FMLName se encuentre con el texto "(1) Record Found"

  @Test @Logeo @LimpiarCampos
  Escenario: buscamos el usuario FMLName1
    Dado que me logueo "Admin" "admin123"
    Cuando valido que ingrese "Dashboard"
    Y en admin filtro al usuario "FMLName1" ESS "FName LName" Enabled reseteandolos
    Entonces verifico que FMLName se encuentre con el texto "cord"



  @Test @Logeo @timejob
  Escenario: asdkasjkdjknasd
    Dado que me logueo "Admin" "admin123"
    Cuando valido que ingrese "Dashboard"
    Y ingreso en admin
    Y ingreso en job
    Y ingreso en job titles y agrego un job "titulo" "descripcion" "nota"
    Entonces verifico el texto "Job Titles"
