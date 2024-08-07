#language: es

Característica: compramos en tienda celulares


  @Test @TiendaCelulares @comproIphone6
  Escenario: compramos un iphone 6
    Dado que busco el "Iphone 6 32gb"
    Cuando agrego al carrito
    Y cargo mis datos para efectuar la compra "Juan Carlos" "El Corte" "Alderetes" "4372 6208 3645 8913" "$400" "2014"
    Entonces verifico que se efectuo la compra "Thank you for your purchase!"

    @Test @TiendaCelulares @compramayor
  Escenario: realizamos compras e eiliminacion de uno de los productos de nuestro carrito
      Dado que agrego a mi carrito "Sony xperia z5" , "Samsung galaxy s7" , "MacBook air" y "Apple monitor 24"
      Cuando voy a mi carrito
      Y elimino el producto "Samsung galaxy s7"
      Y cargo mis datos para efectuar la compra "Juan Carlos" "El Corte" "Alderetes" "4372 6208 3645 8913" "$400" "2014"
      Entonces verifico que se efectuo la compra "Thank you for your purchase!"

      @Test @TiendaCelulares @Inscribo
  Escenario: me inscribo y miro el video de precentacion
        Dado que voy a Sign up
        Y me inscribe con mis datos "juank_1" "dj2012_$1" a menos que ya este inscripto "This user already exist."
        Y voy a mirar el video sobre nosotros "7" segundos
        Entonces vuelvo a home

       @Test @TiendaCelulares @ExloroSitio
  Escenario: exploramos el sitio luego enviamos un mensaje de felicitaciones
        Dado que exploro todas las pestañas del encabezado y portadas, luego
        Cuando escloreo en todos los catalogos de productos
        Y envio el mensaje cargando mis datos"Juanka_12@gmail.com" "juanka mix" y envio "felicidades su tienda tiene muy buenos productos"
        Entonces verifico que el mensaje se envio con el mensaje "Thanks for the message!!"