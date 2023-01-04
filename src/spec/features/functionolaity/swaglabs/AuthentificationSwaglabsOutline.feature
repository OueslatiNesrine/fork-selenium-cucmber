@swaglabs
Feature: Je souhaite verifier la page de connexion de l application SWAGLABS
  
  En tant que utilisateure je souhaite me connecter sur l application SWAGLABS

  @connexion_outline
  Scenario Outline: Je verifie la page de connexion
    Given Je me connecte sur l application SWAGLABS
    When Je saisis un identifiant "<name>"
    And Je saisis le mot de passe "<password>"
    And Je tape sur le bouton Login
    Then Je me redirige vers la page principale

    Examples: 
      | name                    | password     |
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sce   |
