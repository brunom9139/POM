# language: es

Característica: Estos son los test de Admin

  @Test @Admin @FiltrarUsuario
  Escenario: buscamos el usuario FMLName1
    Dado que me logueo "Admin" "admin123"
    Cuando valido que ingrese "Dashboard"
    Y en admin busco al usuario "FMLName1" ESS "FName LName" Enabled
    Entonces verifico que FMLName se encuentre con el texto "(1) Record Found"

  @Test @Admin @LimpiarCampos
  Escenario: buscamos el usuario FMLName1
    Dado que me logueo "Admin" "admin123"
    Cuando valido que ingrese "Dashboard"
    Y en admin filtro al usuario "FMLName1" ESS "FName LName" Enabled reseteandolos
    Entonces verifico que FMLName se encuentre con el texto "cord"


  @Test @Admin @timejob
  Escenario: asdkasjkdjknasd
    Dado que me logueo "Admin" "admin123"
    Cuando valido que ingrese "Dashboard"
    Y ingreso en admin
    Y ingreso en job
    Y ingreso en job titles y agrego un job "titulo" "descripcion" "nota"
    Entonces verifico el texto "Job Titles"

    @texto @Admin @JobTitle
      Escenario: Validar cantidad de job title
        Dado que me logueo "Admin" "admin123"
        Y ingreso en admin
        Y ingreso en job
        Cuando voy a job title
        Entonces compruebo la coincidencia de los Job Description y Records Found

  @texto @Admin @ClickJob
  Escenario: Click en la lista de Jabs
    Dado que me logueo "Admin" "admin123"
    Y ingreso en admin
    Y ingreso en job
    Cuando voy a job title
    Cuando voy a job title y hago clicks en la lista de Jab Titles
    Entonces compruebo la coincidencia de los Job Description y Records Found

  @texto @Admin @PayGrade
  Escenario: Click en la lista de Jabs
    Dado que me logueo "Admin" "admin123"
    Cuando ingreso en admin
    Cuando ingreso en job
    Cuando voy a job paygrades
    Y edito todos los registros de paygrades

  @Test @Logeo @posicionNombre
  Escenario: Encontrar posicion de texto
    Dado que me logueo "Admin" "admin123"
    Cuando ingreso en admin
    Y encuentro la posicion de "asdf12$"


  @Test @Logeo @subirArchivo
  Escenario: Encontrar posicion de texto
    Dado que me logueo "Admin" "admin123"
    Cuando ingreso en admin
    Y voy a corporate branding y subo un archivo


  @Test @Logeo @moverElementoColor
  Escenario: Encontrar posicion de texto
    Dado que me logueo "Admin" "admin123"
    Cuando ingreso en admin
    Y voy a corporate branding y muevo un color

  @Test @Logeo @moverporjs
  Escenario: Encontrar posicion de texto
    Dado que me logueo "Admin" "admin123"
    Cuando ingreso en admin
    Y voy a corporate branding y muevo un color JS