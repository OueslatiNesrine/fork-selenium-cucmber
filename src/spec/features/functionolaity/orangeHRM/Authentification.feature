@connexion
Feature: Je souhaite tester la page de connexion
  
  En tant que utilisatuer je souhaite verifier la page de connexion

  @login
  Scenario: Je souhaite me connecter sur l application OrangeHRM
    Given Je me connecte sur l application OrangeHRM
    When Je saisis le username "Admin"
    And Je saisis le password "admin123"
    And Je clique sur le bouton Login
    Then Je me redirige vers la page home
