# language: es

  Característica: Trabajo realizando mis test a partir de los ejemplos dados


    mal
    @Test @MisTest @Navegadores
    Escenario: Chequeo los navegadores de windows
      Dado que me dirijo a Frame & Windows
      Cuando Estoy en Browser Windows
      Y cliqueo los navegadores de abajo hacia arriba y me quedo en New Tab
      Entonces Verifico el mensaje "This is a sample page"
    mal
    @Teste @MisTest @Clicks
    Escenario: acciono los botones Clicks
      Dado que me dirijo a Frame & Windows
      Cuando estoy en la pagina Alert
      Y cliqueo todo los botones azules y cargo mi nombre en el ultimo "Juan Carlos"
      Entonces verifico la carga del nombre que cargue previamente "Juan Carlos"
    mal
    @test @MisTest @mensajes
    Escenario: Ventanas con dialogos largos y pequeños
      Dado que me dirijo a Frame & Windows
      Cuando estoy en la pagina Modals Dialogs Hago click en Smash Modals
      Y verifico el mensaje del primer renglon "Small Modal"
      Cuando hago click en Large Modals
      Y verifico el mensje del primer renglon "Large Modal"
      Entonces las verificaciones fueron aprovadas