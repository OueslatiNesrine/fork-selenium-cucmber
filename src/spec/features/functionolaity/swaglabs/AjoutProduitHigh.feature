
@AjoutProduitHigh
Feature: Verifier l ajout d un produit price high dans le panier 
  En tant que utilisateure je souhaite ajouter d un produit price high dans le panier 
  
  Background: 
    Given Je me connecte sur l application SWAGLABS
    When Je saisis un identifiant "standard_user"
    And Je saisis le mot de passe "secret_sauce"
    And Je tape sur le bouton Login
    Then Je me redirige vers la page principale
    When je choisi le choix "PriceLowHigh"
    Then Je me trie produit a partir price low to high

  @AjProdHigh
  Scenario: Verifier l ajout d un produit price high
    When je clique sur le bouton Add de premiere produit affichier
    Then je verifie l'ajout de produit High
    

  
