Feature: Yo quiero hacer las validaciones de la funcionalidad PIM

  @Regression
    @HU002
  Scenario Outline: add employee
    Given abrir el navegador
    And the user fill out user <userName> and password <password>
    And user gets to add employee
    When the user fill out firstName <firstName> middleName <middleName> lastName <lastName>

    Examples:
      | userName | password | firstName | middleName | lastName |
      | Admin    | admin123 | Daniela   | Alejandra  | Romero   |