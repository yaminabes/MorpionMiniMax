Feature: Quand jouer ?
L'ordinateur ou le joueurs peuvent jouer lorsque ces conditions sont vérifiées
  Scenario: La grille est vide et c'est au tour de l'autre joueur
    Given la grille est vide
    When tour du joueur
    Then l'ordinateur ne joue pas

  Scenario: La grille est vide et c' est le tour de l'ordinateur
    Given la grille est vide
    When tour de ordinateur
    Then ordianteur joue

  Scenario: La grille est pleine
    Given La grille est pleine
    When tour de ordinateur
    Then l'ordinateur ne joue pas