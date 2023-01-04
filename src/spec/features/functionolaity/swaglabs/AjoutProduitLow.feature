@AjoutProduitLow
Feature: Verifier l ajout d un produit price lowdans le panier
  En tant que utilisateure je souhaite ajouter d un produit price low dans le panier

  Background: 
    Given Je me connecte sur l application SWAGLABS
    When Je saisis un identifiant "standard_user"
    And Je saisis le mot de passe "secret_sauce"
    And Je tape sur le bouton Login
    Then Je me redirige vers la page principale

  @AjProdLow
  Scenario: Title of your scenario
    When je saisis le choix "PriceLowHigh"
    When je clique sur le bouton Add de premiere produit affichier
    Then je verifie l'ajout de produit High
