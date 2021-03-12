Feature: Comment jouer ?
  éviter les lignes ou colonnes deja occupées
  Scenario: La grille est vide
    Given la grille est vide
    When tour de ordinateur
    Then L'ordinateur joue sur la case du milieu

  Scenario: La case du milieu est prise et les autres sont libres
    Given La case du milieu est pleine
    And les autres cases sont vides
    When tour de ordinateur
    Then L'ordinateur joue dans un coin

  Scenario: Deux cases sur la même ligne sont occupées
    Given deux cases sur la même ligne ou cologne ou diagonales sont occupées par le joueur
    When tour de ordinateur
    Then l'ordinateur joue sur la troisieme case

  Scenario: remplir une case polyvalente
    Given la case 0 est a l'ordinateur
    And  la case 5 est a l'ordinateur
    When tour de ordinateur
    And case 3 libre
    Then l'ordinateur joue sur la case 3