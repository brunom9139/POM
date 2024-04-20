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