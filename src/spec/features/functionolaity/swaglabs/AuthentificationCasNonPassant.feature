@swaglabs
Feature: Je souhaite verifier la page de connexion de l application SWAGLABS - cas de test non passant
  
  En tant que utilisateure je souhaite me connecter sur l application SWAGLABS

  @cnx_nonPassant
  Scenario: Je verifie la page de connexion - cas de test non passant
    Given Je me connecte sur l application SWAGLABS
    When Je saisis un identifiant "Rahma"
    And Je saisis le mot de passe "Rahma123"
    And Je tape sur le bouton Login
    Then Je verifie le message d erreur