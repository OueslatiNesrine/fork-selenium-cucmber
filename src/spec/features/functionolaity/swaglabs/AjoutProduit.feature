
@AjoutProduit
Feature: Verifier l ajout d un produit dans le panier à partir du bouton Add to cart
  En tant que utilisateure je souhaite tester bouton Add to cart sur l application SWAGLABS

  Background: 
    Given Je me connecte sur l application SWAGLABS
    When Je saisis un identifiant "standard_user"
    And Je saisis le mot de passe "secret_sauce"
    And Je tape sur le bouton Login
    Then Je me redirige vers la page principale

  @AjProd
  Scenario: Verifier l ajout d un produit
    
    When je clique sur le bouton Add to cart du produit selectionne.
    Then je verifier que l affichage du panier s incrémente par un.


