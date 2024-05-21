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

  @texto @Admin @Job @ClickJob
  Escenario: Click en la lista de Jabs
    Dado que me logueo "Admin" "admin123"
    Y ingreso en admin
    Y ingreso en job
    Cuando voy a job title
    Cuando voy a job title y hago clicks en la lista de Jab Titles
    Entonces compruebo la coincidencia de los Job Description y Records Found

  @Test @Admin @Job @PayGrade
  Escenario: Click en la lista de Jabs
    Dado que me logueo "Admin" "admin123"
    Cuando ingreso en admin
    Cuando ingreso en job
    Cuando voy a job paygrades
    Y edito todos los registros de paygrades

  @Test @Admin @Job @AgregarTitle
  Escenario: Agrego un titulo
    Dado que me logueo "Admin" "admin123"
    Cuando ingreso en admin
    Cuando ingreso en job
    Y voy a job title
    Entonces agrego un nuevo titulo

  @Test @Admin @Job @AgregarPayGrade
    Escenario: Agrego paygrade
     Dado que me logueo "Admin" "admin123"
    Cuando ingreso en admin
    Cuando ingreso en job
    Y voy a job paygrades
    Entonces agrego un nuevo paygrade

  @Test @Admin @Job @EditarPayGrade
  Escenario: Editar paygrade
    Dado que me logueo "Admin" "admin123"
    Cuando ingreso en admin
    Cuando ingreso en job
    Y voy a job paygrades
    Entonces edito todos los paygrades

  @Test @Admin @Job @BorrarTodosPayGrades
  Escenario: Borrar todos los paygrades de job
    Dado que me logueo "Admin" "admin123"
    Cuando ingreso en admin
    Cuando ingreso en job
    Y voy a job paygrades
    Entonces borro todos los paygrades de job


  @Test @Admin @Job @AgregarEstado
  Escenario: Agregar estado de empleo
    Dado que me logueo "Admin" "admin123"
    Cuando ingreso en admin
    Cuando ingreso en job
    Y voy a Employment Status
    Entonces agrego estado de empleo "Corrido"
    #esto deberia verificar la alerta que aparece en verde

  @Test @Admin @Job @AgregarEstado
  Escenario: Agregar estado de empleo y verificar mediante texto
    Dado que me logueo "Admin" "admin123"
    Cuando ingreso en admin
    Cuando ingreso en job
    Y voy a Employment Status
    Y agrego estado de empleo "Corrido"
    Entonces verifico que aparezca en la lista "Corrido"

  @Test @Admin @Job @BorrarPrimerEstado
    Escenario: Se borra el primer estado de empleo
    Dado que me logueo "Admin" "admin123"
    Cuando ingreso en admin
    Cuando ingreso en job
    Y voy a Employment Status
    Entonces elimino primer estado de empleo
    #aqui podria hacer que verifique el mensaje de la alerta que fue eiminado con exito

  @Test @Admin @Job @BorrarTitles
  Escenario: Borrar todos los titulos de job
    Dado que me logueo "Admin" "admin123"
    Cuando ingreso en admin
    Cuando ingreso en job
    Y voy a Job Categories
    Entonces borro todos los titulos de job

  @Test @Admin @Job @BorrarCategorias
  Escenario: Borrar todas las categorias de job
    Dado que me logueo "Admin" "admin123"
    Cuando ingreso en admin
    Cuando ingreso en job
    Y voy a Job Categories
    Entonces borro todas las categorias

  @Test @Admin @Job @BorrarCategoriaPorPosicion
  Escenario: Borra la categoria en la posicion deseada
    Dado que me logueo "Admin" "admin123"
    Cuando ingreso en admin
    Cuando ingreso en job
    Y voy a Job Categories
    Entonces borro la posicion que contiene "Operatives"

  @Test @Admin @Job @OrdenarDeFormaDescendenteJobTitles
  Escenario: Se ordena de forma descendente todos los titulos
    Dado que me logueo "Admin" "admin123"
    Cuando ingreso en admin
    Cuando ingreso en job
    Y voy a job title
    Entonces ordenar en forma descendente

  @Test @Admin @Job @OrdenarDeFormaAscendenteJobTitles
  Escenario: Se ordena de forma descendente todos los titulos
    Dado que me logueo "Admin" "admin123"
    Cuando ingreso en admin
    Cuando ingreso en job
    Y voy a job title
    Entonces ordenar en forma ascendente

  @Test @Admin @Job @editarTodosLosEstados
  Escenario: Se edita todos los estados aleatoriamente
    Dado que me logueo "Admin" "admin123"
    Cuando ingreso en admin
    Cuando ingreso en job
    Y voy a Employment Status
    Entonces edito todos los estados a null

  @Test @Admin @Job @editarTurnosANoche
  Escenario: Se edita todos turnos a horario nocturnno
    Dado que me logueo "Admin" "admin123"
    Cuando ingreso en admin
    Cuando ingreso en job
    Y voy a Work Shifts
    Entonces edito todos los horarios de trabajo a turno noche de "14:00 PM" a "22:00 PM"


  @Test @Admin @Organizacion @EditarOrganizacion
  Escenario: Se edita la organizacion
    Dado que me logueo "Admin" "admin123"
    Cuando ingreso en admin
    Cuando ingreso en organization
    Y voy a general information
    Entonces edito todos los campos "Medrano Griselda" "417463988" "333" "4941536" "9999999999999" "griselda2@gmail.com" "pasaje beltrabn 55" "sm tuc 454" "alderetes" "tucuman" "4178" "flglfkglkfjajajaasgjfj"
    #Entonces verifico con el boton Success

  @Test @Admin @Organizacion @BuscarLocalidad
  Escenario: Se busca una localidad
    Dado que me logueo "Admin" "admin123"
    Cuando ingreso en admin
    Cuando ingreso en organization
    Y voy a locations
    Entonces busco una localidad "ALDERETES" "CRUZ ALTA" "A"

  @Test @Admin @Organizacion @AgregarLocalidad
  Escenario: Se agrega una localidad
    Dado que me logueo "Admin" "admin123"
    Cuando ingreso en admin
    Cuando ingreso en organization
    Y voy a locations
    Entonces agrego una localidad "ALDERETES" "CRUZ ALTA" "TUCUMAN" "4278" "435362622" "DSDGDSHGHSDGSD" "sndfjsgdhadsk" "notasjajaja"

  @Test @Admin @User @AgregarUsuario
  Escenario: Buscar un usuario en User Management
    Dado que me logueo "Admin" "admin123"
    Cuando ingreso en admin
    Cuando ingreso en User Management
    Y voy a Users
    Y completo los campos con los datos y busco "Griselda Medrano" "GRIKI"
    Entonces verifico que se encuentre el usuario