# language: es

Característica: Testeamos la pagina de informacion de usuario

  @test @MyInfo @EditoPerfil
  Escenario: Cargamos nombre y foto
    Dado que me logueo "Admin" "admin123"
    Cuando voy a MyInfo
    Y cargo mi foto y mi nombre "Juan""Carlos""Brito"
    Entonces verifico que se aya cargado el apellido "Brito"

  @test @MyInfo @CargamosDatos
  Escenario: Cargamos nivel lista
    Dado que me logueo "Admin" "admin123"
    Cuando voy a Leave
    Y cargo las fechas "1998-01-01" "2000-10-22"
    Y guardamos con todos los datos ya cargados "James  Butler"



