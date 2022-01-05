Feature: Comprar viaje hacia un planeta en pagina Space and Beyond
  Yo como automatizador
  Necesito comprar un viaje a un planeta
  Para validar que se puede realizar dicha compra

  Scenario Outline: Pagar viaje de planeta de manera exitosa
    Given Necesita ingresar en la url "http://demo.testim.io/"
    When Selecciona los datos de viaje
      | FechaIda      | <FechaIda>      |
      | FechaRegreso  | <FechaRegreso>  |
      | NumeroAdultos | <NumeroAdultos> |
      | NumeroNinos   | <NumeroNinos>   |
      | Precio        | <Precio>        |
      | Planeta       | <Planeta>       |
    And Ingresa los datos de checkout
      | Nombre          | <Nombre>          |
      | Email           | <Email>           |
      | NumeroSeguridad | <NumeroSeguridad> |
      | Celular         | <Celular>         |
      | Documento       | <Documento>       |
    Then Verifica que el planeta seleccionado sea "<Planeta> TEMPERATURES"

    Examples: 
      | FechaIda | FechaRegreso | NumeroAdultos | NumeroNinos | Precio | Planeta   | Nombre  | Email        | NumeroSeguridad | Celular     | Documento                                           |
      | 1/2/2022 | 12/2/2022    |             2 |           1 |    875 | Shaheying | Edisson | john@hot.com | 223-34-3453     | 16102458685 | C:\\Users\\marce\\Documents\\Edisson\\documento.txt |
