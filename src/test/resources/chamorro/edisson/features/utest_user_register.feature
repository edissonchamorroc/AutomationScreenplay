#Author: john.chamorro@sophossolutions.com
Feature: Registrar Usuario en Págian Utest
  Yo como aprendiz de automatización
  Necesito registar un nuevo usuario en la página Utest
  Para mejorar mis conceptos de automatización web Screenplay

  Scenario: Registrar usuario en Utest
    Given Necesita ingresar en la url "https://www.utest.com/"
    And Necesita entrar a la opcion "Join Today" en Utest
    When Ingresa los demas datos requeridos para registro
      | Name | LastName | Email               | Select month | Select day | Select year | Select Country | Box City | PostalCode | Select Device | Select Reference | Select System | Password      | Confirm Password | Box Language | Box Language | Box Language |
      | John | Chamorro | jchamorro@gmail.com | November     |          2 |        1993 | Brazil         | Manaus   |       8031 | Oppo          | A57              | Android 10    | 1214720860Eg& | 1214720860Eg&    | Spanish      | French       | Italian      |
    Then Valida que se haya registrado "Welcome to the world's largest community of freelance software testers!"
