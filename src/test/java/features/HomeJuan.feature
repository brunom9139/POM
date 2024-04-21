# language: es

  Característica: probando secciones de la pagina
    @test @homeJuan @interacciones
      Escenario: clickeamos en la pestaña de interacciones
      Dado que ingreso a widget
      Y clickeo los botones de list
      Y los de tablas tambien
      Entonces Vuelvo a list
      Y arratro one a la ultima posicion
      Y el nine a la primera posicion

      @test @homeJuan @ClickSelectable
      Escenario: clicque en los botones de selectable
        Dado que me dirijo a Selectable
        Y voy a grit
        Y cliqueo en todos los botones
        Y voy a list y cliqueo todo
        Cuando desmarco todos los botones de grit y list
        Entonces cierro todo

        @test @homeJuan @regiBiblioteca
        Escenario: me registro en la biblioteca
          Dado que me dirijo a biblioteca
          Y voy a login y trato de ingresar como "juan carlos" y contraseña "12345"
          Cuando trato de ingresar y no ingresa entonces voy a registrarme
          Y cargo mis datos como "Juan" "Carlos" "Brito" contraseña "12345"
          Entonces me registre y vuelvo al inicio