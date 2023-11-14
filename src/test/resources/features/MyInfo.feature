Feature: Yo quiero agregar los detalles un contacto en el modulo My Info

  @Regression
    @HU003
  Scenario Outline: add employee
    Given abrir el navegador
    And the user fill out user <userName> and password <password>
    And User goes to contact details
    And User creates a contact Street 1 <street1> Street 2 <street1> City <city> State/Province <state>
    When User search country <typeCountry>

    Examples:
      | userName | password | street1   | street1   | city   | state        | typeCountry |
      | Admin    | admin123 | Carrera 1 | Carrera 2 | Bogota | Cundinamarca | Colombia    |