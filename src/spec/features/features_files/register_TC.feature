Feature: je verifier la page de register
  En tant que utilisateur je souhaite registrer au site mercury

  @module_register
  Scenario Outline: je verifier la page register
    Given je me connecte sur lapplication Mercery
    When je click sur le lien REGISTER
    And je saisie le FirstName "<firstName>"
    And je sasie le LastName "<lastName>"
    And je click sur le bouton sub
    Then je me redirige vers la page register

    Examples: 
      | firstName  | lastName |
      | jawher |     hajri |
      | wael |     Ben Othmen |
