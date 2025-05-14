Feature: je verifier la page d authentification
  En tant que utilisateur je souhaite m authentifier au site mercury

  @connexion
  Scenario: je verifier la page d authentification
     Given je me connecte sur lapplication Mercery
     When je saisi le Username "Test" 
     And je sasi le Password "Test"
     And je click sur le bouton submit
     Then je me redirige vers la page home "Login Successfully"
   

     
     