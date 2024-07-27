# language: es

Característica: realizaremos compras en el sitio

  @test @compra @iphone6
    Escenario: buscamos el iphone 6 y lo compramos
      Dado que busco el phone
      Cuando agrego al carrito
      Y realizo la compra cargando los datos
      Entonces verifico que la compra se realizo correctamente
