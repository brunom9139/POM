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

#deberia hacer un escenario donde entre en jobs,para reutilizarlo?
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

  @Test @Admin @PayGrade
  Escenario: Click en la lista de Jabs
    Dado que me logueo "Admin" "admin123"
    Cuando ingreso en admin
    Cuando ingreso en job
    Cuando voy a job paygrades
    Y edito todos los registros de paygrades

  @Test @Admin @AgregarPayGrade
    Escenario: Agrego paygrade
     Dado que me logueo "Admin" "admin123"
    Cuando ingreso en admin
    Cuando ingreso en job
    Y voy a job paygrades
    Entonces agrego un nuevo paygrade

  @Test @Admin @BorrarPrimerEstado
    Escenario: Se borra el primer estado de empleo
    Dado que me logueo "Admin" "admin123"
    Cuando ingreso en admin
    Cuando ingreso en job
    Y voy a Employment Status
    Entonces elimino primer estado de empleo
    #aqui podria hacer que verifique el mensaje de la alerta que fue eiminado con exito

  @Test @Admin @BorrarCategorias
  Escenario: Borrar todas las categorias de job
    Dado que me logueo "Admin" "admin123"
    Cuando ingreso en admin
    Cuando ingreso en job
    Y voy a Job Categories
    Entonces borro todas las categorias