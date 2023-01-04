@choix-select
Feature: Je souhaite verifier dropDownList de l application SWAGLABS
  En tant que utilisateure je souhaite tester dropDownList sur l application SWAGLABS

  Background: 
    Given Je me connecte sur l application SWAGLABS
    When Je saisis un identifiant "standard_user"
    And Je saisis le mot de passe "secret_sauce"
    And Je tape sur le bouton Login
    Then Je me redirige vers la page principale

  @select
  Scenario: Je verifie dropDownList de l application SWAGLABS
    When je choisi le choix "PriceLowHigh"
    Then Je me trie produit a partir price low to high
