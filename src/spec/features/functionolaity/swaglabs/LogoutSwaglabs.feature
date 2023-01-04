@swaglabs
Feature: Je souhaite verifier la deconnexion de l application SWAGLABS
  
  En tant que utilisateure je souhaite me deconnecter sur l application SWAGLABS

  Background: 
    Given Je me connecte sur l application SWAGLABS
    When Je saisis un identifiant "standard_user"
    And Je saisis le mot de passe "secret_sauce"
    And Je tape sur le bouton Login
    Then Je me redirige vers la page principale

  @logout
  Scenario: Je verifie la page deconnexion
    When Je clique sur le bouton burger
    And Je clique sur le bouton LogOut
    Then Je me retourne vers la page principale
