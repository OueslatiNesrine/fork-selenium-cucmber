@swaglabs
Feature: Je souhaite verifier la page de connexion de l application SWAGLABS
  
  En tant que utilisateure je souhaite me connecter sur l application SWAGLABS

  @cnx
  Scenario: Je verifie la page de connexion
    Given Je me connecte sur l application SWAGLABS
    When Je saisis un identifiant "standard_user"
    And Je saisis le mot de passe "secret_sauce"
    And Je tape sur le bouton Login
    Then Je me redirige vers la page principale
