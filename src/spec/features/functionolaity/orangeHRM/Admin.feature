@admin
Feature: Je souhaite tester le menu Admin

  @verifAdmin
  Scenario: je verfie la présence d un utlisateur Admin
    Given Je me connecte sur l application OrangeHRM
    When Je saisis le username "Admin"
    And Je saisis le password "admin123"
    And Je clique sur le bouton Login
    Then Je me redirige vers la page home
    
    When Je clique sur le module admin
    And Je saisis "admin" dans le champ Username
    And Je clique sur le bouton Search
    Then Je verifie la presence d un utilisateur dans le tableau
    When Je clique sur Rest
    Then Je me redirige vers le tableau d'affichage de tous les utilasteurs
