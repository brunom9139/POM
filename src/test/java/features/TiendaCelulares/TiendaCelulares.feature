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