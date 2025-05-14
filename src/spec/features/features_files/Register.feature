@tag
Feature: je verifier la page de register
  En tant que utilisateur je souhaite registrer au site mercury
  
  
  @register
  Scenario: je verifier la page de register
    Given je me redirige vers la page register
    When je saisie le FirstName "jawher"
    And je sasie le LastName "hajri"
    And je sasie le Phone "29840761"
    And je sasie le Email "jawherhajri01@gmail.com"
    And je sasie le Address "nahj jinen kelibia"
    And je sasie le City "kelibia"
    And je sasie le State "tunis"
    And je sasie le PostalCode "8090"
    And je choisir le Country  "TUNISIA"  # Updated to include the country value
    And je saisie le UserName "jawher"
    And je saisie le Password "test"
    And je saisie le ConfirmPassword "test"
    And je click sur le bouton sub
    Then je me redirige vers la page register "https://demo.guru99.com/test/newtours/register_sucess.php"
