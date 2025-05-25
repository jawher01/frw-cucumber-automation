Feature: je verifier la page de register
  En tant que utilisateur je souhaite registrer au site mercury

  @module_register
  Scenario Outline: je verifier la page register
    Given je me connecte sur lapplication Mercery
    When je click sur le lien REGISTER
    And je saisie le FirstName outline "<firstName>"
    And je sasie le LastName outline "<lastName>"
    And je sasie le Phone outline "<phone>"
    And je sasie le Email outline "<email>"
    And je sasie le Address outline "<address>"
    And je sasie le City outline "<city>"
    And je sasie le State outline "<state>"
    And je sasie le PostalCode outline "<postalCode>"
    And je choisir le Country outline  "<coutry>" # Updated to include the country value
    And je saisie le UserName outline "<userName>"
    And je saisie le Password outline "<password>"
    And je saisie le ConfirmPassword outline "<confirmPsw>"
    And je click sur le bouton sub 
    Then je me redirige vers la page register "https://demo.guru99.com/test/newtours/register_sucess.php"

    Examples: 
      | firstName  | lastName | phone | email | address | city | state | postalCode | coutry | userName | password | confirmPsw |
      | jawher | hajri | 29840761 | jawherhajri01@gmail.com | kelibia | tunis | tt | 8090 | TUNISIA | jawher | test123 | test123 | 
      | test | 2 | 29888765 | jawher@gmail.com | tunis | tunis | tt | 6090 | ALGERIA | test | test3 | test3 |