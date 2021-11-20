Feature: Comprar Producto en Pagina Advantage
  Yo como aprendiz de automatización
  Necesito realizar la comprar de un producto en la pagina Advantage
  Para validar que la compra fue efectiva con el numero de orden de la compra realizada

  Background: Ingreso a pagina Advantage
    Given Necesita ingresar en la url "https://www.advantageonlineshopping.com/#/"
    And Necesita entrar a la opcion "mice" en Advantage

  Scenario: Realizar Comprar efectiva de producto
    Given Elige el producto de acuerdo a las caracteristicas
      | Product                                           | Color | Quantity |
      | Kensington Orbit 72337 Trackball with Scroll Ring | BLUE  |        3 |
    And Ingresa usuario "edichamo" y password "1234Ed&" en Advantage
    When Realiza el pago con datos de tarjeta
      | CreditHolder | Card Number  | Select Month Card | Select Year Card | CVV Number |
      | Edisson      | 123476548321 |                05 |             2022 |        913 |
    Then Valida la compra con base el numero de orden
