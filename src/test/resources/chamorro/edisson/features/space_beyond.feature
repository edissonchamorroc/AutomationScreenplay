Feature: Comprar viaje hacia un planeta en pagina Space and Beyond
  Yo como automatizador
  Necesito comprar un viaje a un planeta
  Para validar que se puede realizar dicha compra online

  Scenario Outline: Pagar viaje de planeta de manera exitosa
    Given Necesita ingresar en la url "http://demo.testim.io/"
    When Selecciona los datos de viaje
      | FechaIda   | FechaRegreso   | NumeroAdultos   | NumeroNinos   | Precio   | Planeta   |
      | <FechaIda> | <FechaRegreso> | <NumeroAdultos> | <NumeroNinos> | <Precio> | <Planeta> |
    And Ingresa los datos de checkout
      | Nombre   | Email   | NumeroSeguridad   | Celular   | Documento   |
      | <Nombre> | <Email> | <NumeroSeguridad> | <Celular> | <Documento> |
    Then Verifica que se realice el pago

    Examples:

      | FechaIda  | FechaRegreso | NumeroAdultos | NumeroNinos | Precio | Planeta   | Nombre  | Email        | NumeroSeguridad | Celular     | Documento |
      | 1/2/2022 | 12/2/2022   | 2             | 1           | 243    | Shaheying | Edisson | john@hot.com | 223-34-3453     | 16102458685 | texto.txt |


