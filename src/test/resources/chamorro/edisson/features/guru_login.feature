Feature: Registrar nuevo custumer en guru99 de manera exitosa
  Yo como aprendiz de sophos academy 
  Necesito inciar sesion la pagina de guru
  Para validar que el mensaje de bienvenida sea correcto

  Background: Loger usuario en Guru99
    Given Necesita ingresar en la url "http://demo.guru99.com/V4/"
    And Ingresa usuario "mgr123" y password "mgr!23" en Guru

  Scenario: Registro de customer en Guru99
    Given Necesita entrar a la opcion "New Customer"
    When Insertar los datos de Registro
      | Name        | Gender Radio | Datebirth  | Address      | City     | State     | Pin    | Telephone  | Email             | Password  |
      | Darla Perez | f            | 18/12/1993 | cr 409 45 99 | medellin | antioquia | 124365 | 3007414339 | dperez2@gmail.com | 12ds56349 |
    Then Verificar el mensaje "Customer Registered Successfully!!!"
