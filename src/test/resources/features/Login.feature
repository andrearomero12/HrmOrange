#Proyecto de pruebas y cargado en Github
#27/01/2020
#Jhonatan Medina Blanco
Feature: Yo como usuario quiero logearme

  @Regression
    @HU001
  Scenario Outline: Login success
    Given abrir el navegador
    When the user fill out user <userName> and password <password>

    Examples:
      | userName | password |
      | Admin    | admin123 |