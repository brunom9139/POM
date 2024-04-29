# language: es

          Característica: Acsedemos a los diferentes paginas del sitio
              @test @homeJuan @interacciones
              Escenario: Interactuamos con la pagina Interacciones del sitio
              Dado que ingreso SorTable
              Y cliqueo todo los botones de lista y tabla
              Y en lista arratro one a la ultima posicion y nine a la primera posicion


              @test @homeJuan @ClickSelectable
              Escenario: Hacemos diferentes click en los botones de pagina selectable del sitio
              Dado que me dirijo a Selectable
              Y voy a grit
              Y cliqueo en todos los botones
              Y voy a list y cliqueo todo los elementos
              Cuando desmarco todos los botones de grit y list
              Entonces cierro todo

              @test @homeJuan @regiBiblioteca
              Escenario: Completo mis datos para registrarme en la biblioteca del sitio
              Dado que me dirijo a biblioteca
              Y voy a login y trato de ingresar como "juan carlos" y contraseña "12345"
              Cuando trato de ingresar y no ingresa entonces voy a registrarme
              Y cargo mis datos como "Juan" "Carlos" "Brito" contraseña "12345"
              Entonces me registre y vuelvo al inicio

              @test @homeJuan @RecorroStory
              Escenario: Ampliando la vista que muestra los libros en biblioteca
              Dado que me dirijo a book store
              Y amplio las filas de mayor a menor
              Y luego busco en la biblioteca el libro "Speaking JavaScript"
              Entonces cierro todo y vuelvo a inicio

              @test @homeJuan @elijoMenu
              Escenario: Personalizo los widgets
              Dado que me dirijo a selec menu de la targeta widgets
              Y cargo mis opciones "soy Dr juan" "es mision"
              Y el resto de campo "soy juanka"

              @test @homeJuan @cargoForm
              Escenario: Cargo mis datos en el formulario practica
              Dado me dirijo al formulario
              Y cargo mis datos "Juan" "Carlos" y mi fontello "381234567" correo "qwert@gmail.com"
              Y "direccion" cargo mi archivo y subo "C:\Users\Juan Carlos\Pictures\motos\ybr azul.jpg"

